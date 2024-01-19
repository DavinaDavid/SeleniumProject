package TestDefinitions;

import Pages.LoginLocators;
import WebDriverHooks.WebDriverhooks;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.concurrent.GuardedBy;
import java.time.Duration;

public class LoginDefinition{

private LoginLocators loginloc;
private WebDriverhooks driverhooks;

    public LoginDefinition() {
     driverhooks = WebDriverhooks.getInstance();
     loginloc = new LoginLocators(driverhooks.getDriver());

    }


    @Given("user goes to URL")
    public void openURL(){
       loginloc.GetURL();
    }

    @When("user enters UserName {string}")
    public void EnterUsername(String username){
        loginloc.GetuserName().sendKeys(username);
    }

    @And("user enters Password {string}")
    public void EnterPassword(String password){
        loginloc.GetPassword().sendKeys(password);
    }

    @Then("click Login to lead me to Client Dashboard")
    public void Login(){
        loginloc.GetLoginBtn().click();
        String expectedURL = "https://testazure5.spurams.com/LenderDashboard.aspx";
        String actualURL = driverhooks.getDriver().getCurrentUrl();
       Assert.assertEquals("Successful Login!", expectedURL, actualURL);;
    }



}
