package TestDefinitions;

import Pages.CreateOrderLocators;
import Pages.LoginLocators;
import WebDriverHooks.WebDriverhooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOrderDefinition {
    private CreateOrderLocators createOrderloc;
    private WebDriverhooks driverhooks;


    public CreateOrderDefinition() {
        driverhooks = WebDriverhooks.getInstance();
        createOrderloc = new CreateOrderLocators(driverhooks.getDriver());
    }

   @Given("Client Dashboard items are loaded")
    public void ClickDashboardLoginBtn() {
        createOrderloc.LoadDashboard();
    }

   @And("Client clicks login button from Dashboard")
    public void ClickLoginFromDashboard(){
       createOrderloc.GetCreateBtnFromDashboard().click();
       //Select Appraisal OrderType
        createOrderloc.SelectApppraisalFromDropdown().click();
    }


    @When("Select Residential as Order Type")
    public void SelectResidentialOT(){
       createOrderloc.SelectResidentialOT().click();
        System.out.println("Residential OT selected");
    }



    @And("client selects its branch")
    public void SelectClientBranch(){
        createOrderloc.SelectClientBranch().click();
    }


    @And("client selects transaction type")
    public void SelectTransactions(){
        createOrderloc.SelectTransaction().click();
        System.out.println("Transaction Selected");
    }


}
