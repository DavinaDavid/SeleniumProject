package Pages;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.*;
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

    public void HomePage(){
        WebElement homeBtn = driver.findElement(By.cssSelector("a#home"));
        homeBtn.click();
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
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        WebElement selectTransactionField = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_cphBody_drpTransactionType")));
//        selectTransactionField.click();
        WebElement selectedTransaction = driver.findElement(By.cssSelector("#ctl00_cphBody_drpTransactionType Option[value='18']"));
        return selectedTransaction;
    }

    public WebElement SelectLoanType(){
        WebElement selectLoanType = driver.findElement(By.id("ctl00_cphBody_drpLoanType"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        WebElement selectLoanType = wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_cphBody_drpLoanType")));
        selectLoanType.click();
      //  WebElement selectLoanType = driver.findElement(By.id("ctl00_cphBody_drpLoanType"));
      //  selectLoanType.click();
        WebElement selectedLoan = driver.findElement(By.cssSelector("#ctl00_cphBody_drpLoanType Option[value='7']"));
        return selectedLoan;
    }


    public WebElement AddLoanNumber(){
        WebElement selectLoanNo = driver.findElement(By.id("ctl00_cphBody_txtLoanNumber"));
        return selectLoanNo;
    }

    public void Scrolldown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600);");
       // System.out.println("Scrolled");
    }

    public void LargeScrolling(){
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 1000);");
    }

    public void getBorrowerInfo(String borrowName, String borrowEmail){
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
      WebElement getBorrower =   wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#ctl00_cphBody_txtBorrowerName")));
     // WebElement getBorrower = driver.findElement(By.cssSelector("input#ctl00_cphBody_txtBorrowerName"));
        getBorrower.sendKeys(borrowName);
        WebElement getBorrowerEmail = driver.findElement(By.cssSelector("input#ctl00_cphBody_txtBorrowerEmail"));
        getBorrowerEmail.sendKeys(borrowEmail);
    }


    public void getPropertyType(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement propertyType =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select#ctl00_cphBody_drpPropertyType")));
        WebElement propertyType = driver.findElement(By.cssSelector("select#ctl00_cphBody_drpPropertyType"));
        propertyType.click();
        WebElement selectProperty = driver.findElement(By.cssSelector("#ctl00_cphBody_drpPropertyType Option[value='2']"));
        selectProperty.click();

    }

    public void PropertyAddress(String street, String city, String state, String zip){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
       WebElement propertyStreet =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ctl00_cphBody_txtPropertyAddress")));

    //   WebElement propertyStreet = driver.findElement(By.cssSelector("#ctl00_cphBody_txtPropertyAddress"));
        //street
        propertyStreet.sendKeys(street);
        //city
        WebElement propertycity = driver.findElement(By.id("ctl00_cphBody_txtPropertyCity"));
        propertycity.sendKeys(city);
        //state
        WebElement propertyState = driver.findElement(By.id("ctl00_cphBody_drpPropertyState"));
        propertyState.sendKeys(state);
        propertyState.sendKeys(Keys.ENTER);
        //zip
        WebElement propertyZip = driver.findElement(By.id("ctl00_cphBody_txtPropertyZip"));
        propertyZip.sendKeys(zip);
    }

    public WebElement getProducts(){
        WebElement getProd = driver.findElement(By.id("ctl00_cphBody_drpAppraisalType"));
        getProd.click();
        WebElement productSelected = driver.findElement(By.cssSelector("#ctl00_cphBody_drpAppraisalType Option[value='86']"));
        return productSelected;
    }


    public void selectSupportingDoc(){
        WebElement selectDoc = driver.findElement(By.cssSelector("input#ctl00_cphBody_rdoLstSupportingDocuments_1[value='NO']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectDoc);
        selectDoc.click();
    }

    public WebElement chooseContinue(){
        WebElement chooseCont = driver.findElement(By.cssSelector("input#ctl00_cphBody_btnContinue[value='Continue']"));
        return chooseCont;

    }

    public void selectPaymentMethod(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("body")));
        WebElement selectPayment = driver.findElement(By.xpath("//label[text()='Invoice']"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectPayment);
        selectPayment.click();

    }

    public void getConfirmOrder(){
        WebElement confirmOrder = driver.findElement(By.id("ctl00_cphBody_btnConfirm"));
        confirmOrder.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.urlContains("ViewAppraisal.aspx"));

        // Get the URL of Created Order
       String myOrderURL = driver.getCurrentUrl();
        System.out.println("my URL is: "+ myOrderURL);
        driver.get(myOrderURL);
    }

    public void getAppraisalNumber(){
        WebElement ApprNumber = driver.findElement(By.cssSelector("span#ctl00_cphBody_lblAppraisalNumber"));
        String myOrderNumber =  ApprNumber.getText();
       System.out.println("AppraisalNumber is: "+ myOrderNumber);
    }


    public void SignOut(){
       WebElement clickSettingBtn = driver.findElement(By.cssSelector("li.settingpos"));
        clickSettingBtn.click();
        WebElement pressSignout = driver.findElement(By.linkText("Sign out"));
        pressSignout.click();

    }


}
