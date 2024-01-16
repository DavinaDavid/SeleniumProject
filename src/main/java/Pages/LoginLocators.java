package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLocators {
    public WebDriver driver;

    public LoginLocators(WebDriver driver){

        this.driver = driver;
    }

    public void GetURL(){
        driver.get("https://testazure5.spurams.com");
      //  driver.manage().window().maximize();
    }

    public WebElement GetuserName(){
      WebElement userName =  driver.findElement(By.id("ctl00_cphBody_Login1_UserName"));
      return userName;

    }

    public WebElement GetPassword(){
        WebElement userPassword =  driver.findElement(By.id("ctl00_cphBody_Login1_Password"));
        return userPassword;

    }

    public WebElement GetLoginBtn(){
        WebElement loginbtn = driver.findElement(By.id("ctl00_cphBody_Login1_LoginButton"));
        return loginbtn;
    }


}
