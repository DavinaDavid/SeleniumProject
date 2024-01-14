package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateOrderLocators {
    public WebDriver driver;
    public CreateOrderLocators(WebDriver driver){
        this.driver = driver;

    }

    public void LoadDashboard(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("body")));
        element.click();
    }


    public WebElement GetCreateBtnFromDashboard(){
        WebElement Createbtn = driver.findElement(By.cssSelector("#ctl00_cphBody_divCreateOrderDD button"));
        return Createbtn;
    }

    public WebElement SelectApppraisalFromDropdown(){
        WebElement appraisalOT = driver.findElement(By.linkText("Appraisal"));
        return appraisalOT;

    }

    public WebElement SelectResidentialOT(){
        WebElement selectAppraisalOT = driver.findElement(By.xpath("//label[text()='Residential']"));
    return  selectAppraisalOT;
    }

    public WebElement SelectClientBranch(){
        WebElement clickBranchField = driver.findElement(By.id("ctl00_cphBody_drpLenderBranch"));
        clickBranchField.click();
        WebElement selectBranch = driver.findElement(By.cssSelector("Option[value='2121']"));
           return selectBranch;
    }

    public WebElement SelectTransaction(){
        WebElement selectTransactionField = driver.findElement(By.id("ctl00_cphBody_drpTransactionType"));
        selectTransactionField.click();
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
      //  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selectTransactionField));
        //element.click();
        WebElement selectedTransaction = driver.findElement(By.cssSelector("#ctl00_cphBody_drpTransactionType Option[value='18']"));
        return selectedTransaction;
    }

    public WebElement SelectLoanType(){
        WebElement selectLoan = driver.findElement(By.id("ctl00_cphBody_drpLoanType"));
        selectLoan.click();
        WebElement selectedLoan = driver.findElement(By.cssSelector("#ctl00_cphBody_drpLoanType Option[value='1']"));
        return selectedLoan;
    }


//    public void ProvideCreateOrderData(String branch){
//        //Selecting Client Branch
//        WebElement clickBranchField = driver.findElement(By.id("ctl00_cphBody_drpLenderBranch"));
//        clickBranchField.click();
//        WebElement selectBranch = driver.findElement(By.cssSelector("Option[value='2121']"));
//        selectBranch.click();
//
//    }

}
