package Pages;

import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VendorAssignmentLocators {
    public WebDriver driver;
    CreateOrderLocators myCreateOrderData;


    public VendorAssignmentLocators(WebDriver driver){
        myCreateOrderData = new CreateOrderLocators(driver);
        this.driver = driver;
    }


    public void SearchClientOrder(){
        WebElement clickOrdersFromActionBar = driver.findElement(By.cssSelector("ul > li:nth-child(2)"));
        clickOrdersFromActionBar.click();
        WebElement findSearchBar = driver.findElement(By.linkText("Search Orders"));
        findSearchBar.click();
        myCreateOrderData.Scrolldown();
        WebElement findOrder = driver.findElement(By.id("ctl00_cphBody_grdResults_ctl00_ctl04_lnkAppraisalNumber"));
        findOrder.click();

    }


    public void SelectAction(){
        WebElement selectAction = driver.findElement(By.linkText("Actions"));
        selectAction.click();
        WebElement chooseAssignAMC = driver.findElement(By.linkText("Assign To AMC"));
        chooseAssignAMC.click();
    }

    public void SelectVendor() {
     myCreateOrderData.LargeScrolling();

        WebElement selectAMC = driver.findElement(By.cssSelector("input#ctl00_cphBody_grdResults_ctl08_btnSelect"));
        Actions actions = new Actions(driver);
        actions.doubleClick(selectAMC).perform();

   //Wait till SelectAMC is populated against Assign Vendor label
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Bid AMC 2']")));
        System.out.println("Waiting");
    }

    public void AssignAMC(){
            WebElement assignAMC = driver.findElement(By.cssSelector("input#ctl00_cphBody_btnSubmit"));
            assignAMC.click();
    }

    public void GoBackToViewPage(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.urlContains("ViewAppraisal.aspx"));
        String myOrderURL = driver.getCurrentUrl();
        System.out.println("my URL is: "+ myOrderURL);
        driver.get(myOrderURL);
    }
}
