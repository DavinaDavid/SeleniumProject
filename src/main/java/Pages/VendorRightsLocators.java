package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        WebElement selectAction = driver.findElement(By.linkText("Actions"));
        selectAction.click();
        WebElement chooseAccept = driver.findElement(By.linkText("Accept Order"));
        chooseAccept.click();
    }

    public void FindAcceptBtn(){
        myCreateOrderData.LargeScrolling();
        WebElement clickAccept = driver.findElement(By.cssSelector("input#ctl00_cphBody_btnSubmit"));
        clickAccept.click();

    }
}
