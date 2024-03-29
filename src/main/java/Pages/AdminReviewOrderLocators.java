package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminReviewOrderLocators {
    public WebDriver driver;
    CreateOrderLocators myCreateOrderData;
    public AdminReviewOrderLocators(WebDriver driver){
        myCreateOrderData = new CreateOrderLocators(driver);
        this.driver = driver;
    }

    public void ChooseReviewReportfromAction(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("ViewAppraisal.aspx"));
        WebElement reviewOrderAction = driver.findElement(By.linkText("Actions"));
        reviewOrderAction.click();
        WebElement reviewOrderActionItem = driver.findElement(By.linkText("Review Appraisal Report(s)"));
        reviewOrderActionItem.click();

        myCreateOrderData.LargeScrolling();

        //Press Yes to Accept Report
        WebElement yesAcceptReport = driver.findElement(By.cssSelector("input#ctl00_cphBody_rdoLstAcceptReject_0"));
        yesAcceptReport.click();


        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
       WebElement checkMarkComplete =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_cphBody_chkMarkComplete']")));
        checkMarkComplete.click();

        myCreateOrderData.LargeScrolling();

        WebElement CompleteOrder = driver.findElement(By.cssSelector("input#ctl00_cphBody_btnSubmit"));
        CompleteOrder.click();
        System.out.println("Your Order is Successfully Completed");
    }
}
