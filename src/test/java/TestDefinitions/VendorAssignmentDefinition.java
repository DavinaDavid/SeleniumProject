package TestDefinitions;

import Pages.CreateOrderLocators;
import Pages.LoginLocators;
import Pages.VendorAssignmentLocators;
import WebDriverHooks.WebDriverhooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VendorAssignmentDefinition {

    private VendorAssignmentLocators adminloc;
    private LoginLocators loginLocators;
    private CreateOrderLocators createOrderLocators;

    private WebDriverhooks driverhooks;
   // private String AppraisalNumber;
    public VendorAssignmentDefinition() {
        driverhooks = WebDriverhooks.getInstance();
        adminloc = new VendorAssignmentLocators(driverhooks.getDriver());
        loginLocators = new LoginLocators(driverhooks.getDriver());
        createOrderLocators = new CreateOrderLocators(driverhooks.getDriver());

    }
    @Then("click Login to access user Dashboard")
    public void Login(){
        loginLocators.GetLoginBtn().click();
        WebDriverWait wait = new WebDriverWait(driverhooks.getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("Dashboard.aspx"));
        System.out.println("I am on URL: "+ driverhooks.getDriver().getCurrentUrl());
    }

    @Given("Search Client Order")
    public void SearchOrder(){
       adminloc.SearchClientOrder();
       System.out.println("Order Found");
    }


    @When("Select Assign to AMC via Actions")
    public void FromActionsAssignAMC(){
        adminloc.SelectAction();
    }


    @And("AMC is Selected")
    public void SelectingAMC(){
        adminloc.SelectVendor();
        System.out.println("Admin Selected Vendor");
    }

   @Then("AMC is Assigned")
    public void AssigningAMC(){
        adminloc.AssignAMC();
        System.out.println("Admin Successfully Assigned Order to Vendor");
    }

    @And("Go Back to View Order Page")
    public void BackToViewPg(){
        adminloc.GoBackToViewPage();
    }


}
