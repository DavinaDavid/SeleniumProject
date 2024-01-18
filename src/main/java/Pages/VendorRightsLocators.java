package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;
import java.time.Duration;

public class VendorRightsLocators {
    public WebDriver driver;
    CreateOrderLocators myCreateOrderData;


    public VendorRightsLocators(WebDriver driver){
        myCreateOrderData = new CreateOrderLocators(driver);
        this.driver = driver;
    }


    public void SearchAssignedOrder(){
        WebElement clickOrdersFromActionBar = driver.findElement(By.cssSelector("ul > li:nth-child(2)"));
        clickOrdersFromActionBar.click();
        myCreateOrderData.Scrolldown();
        WebElement findOrder = driver.findElement(By.id("ctl00_cphBody_grdResults_ctl00_ctl04_lnkAppraisalNumber"));
        findOrder.click();
    }

    public void ChooseAcceptfromAction(){
        WebElement acceptOrderAction = driver.findElement(By.linkText("Actions"));
        acceptOrderAction.click();
        WebElement chooseAccept = driver.findElement(By.linkText("Accept Order"));
        chooseAccept.click();
    }


    public void FindAcceptBtn(){
        myCreateOrderData.LargeScrolling();
        WebElement clickAccept = driver.findElement(By.cssSelector("input#ctl00_cphBody_btnSubmit"));
        clickAccept.click();

    }

    public void SelectInspectionDate(){
        WebElement setInspectionAction = driver.findElement(By.linkText("Actions"));
        setInspectionAction.click();
        WebElement selectInspectionFromAction = driver.findElement(By.cssSelector("a#ctl00_cphBody_lnkSetInspDate"));
        selectInspectionFromAction.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("SetInspectionDate.aspx"));

        //Pick Inspection Date and Time
        WebElement datePicker = driver.findElement(By.cssSelector("input#ctl00_cphBody_txtInspectionDate"));
        datePicker.sendKeys("1/27/2024");
        datePicker.sendKeys(Keys.ENTER);

        WebElement selectTime = driver.findElement(By.id("ctl00_cphBody_drpInspectionTime"));
        selectTime.sendKeys("08:30 AM");

        myCreateOrderData.Scrolldown();

        WebElement btnSetAppointment = driver.findElement(By.cssSelector("input[type='submit']"));
        btnSetAppointment.click();

    }

    public void MarkInspectionCompleted(){
        WebElement completeInspectionAction= driver.findElement(By.linkText("Actions"));
        completeInspectionAction.click();
        WebElement selectMarkInspection = driver.findElement(By.linkText("Mark Inspection Completed"));
        selectMarkInspection.click();

        //finding Element inside of Pop-up
        WebElement markInpectionBtn = driver.findElement(By.cssSelector("#ctl00_cphBody_popUpDivInspectionComplete #ctl00_cphBody_btnSubmitInspection"));
        markInpectionBtn.click();
    }


    public void UploadAppraisalReport(){
        WebElement submitReportAction= driver.findElement(By.linkText("Actions"));
        submitReportAction.click();
        WebElement submitReportActionItem = driver.findElement(By.linkText("Submit Appraisal Report(s)"));
        submitReportActionItem.click();

        //Wait till Page is redirected to SubmitAppraisal.aspx
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("SubmitAppraisal.aspx"));

        //Set Path of XML Report
        String reportlocation = "src/main/resources/SampleDocuments/SampleReport.xml";
        WebElement uploadFile = driver.findElement(By.id("ctl00_cphBody_fuAppraisalXMLFile"));
       // uploadFile.click();
        String filePath = Paths.get(reportlocation).toAbsolutePath().toString();
        uploadFile.sendKeys(filePath);
        System.out.println("File Selected");

        myCreateOrderData.LargeScrolling();

        //Select Upload File Button
        WebElement uploadReport = driver.findElement(By.cssSelector("input#ctl00_cphBody_btnUpload"));
        uploadReport.click();

    }

}
