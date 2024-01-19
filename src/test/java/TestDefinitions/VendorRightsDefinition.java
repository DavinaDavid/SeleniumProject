package TestDefinitions;

import Pages.CreateOrderLocators;
import Pages.LoginLocators;
import Pages.VendorAssignmentLocators;
import Pages.VendorRightsLocators;
import WebDriverHooks.WebDriverhooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VendorRightsDefinition {
    private VendorAssignmentLocators adminloc;
    private VendorRightsLocators vendorLoc;
    private LoginLocators loginLocators;
  //  private CreateOrderLocators createOrderLocators;

    private WebDriverhooks driverhooks;
    public VendorRightsDefinition() {
        driverhooks = WebDriverhooks.getInstance();
        adminloc = new VendorAssignmentLocators(driverhooks.getDriver());
        loginLocators = new LoginLocators(driverhooks.getDriver());
        vendorLoc = new VendorRightsLocators(driverhooks.getDriver());
      //  createOrderLocators = new CreateOrderLocators(driverhooks.getDriver());
    }

    @Given("user looks for Assigned Order")
    public void getSearchedOrder(){
        vendorLoc.SearchAssignedOrder();
    }

    @And("Order is Accepted by Vendor")
    public void AcceptOrder(){
        vendorLoc.ChooseAcceptfromAction();
        vendorLoc.FindAcceptBtn();
        System.out.println("Order Accepted");
    }

   @Then("Vendor sets Inspection for Property Investigation")
     public void SetInspection(){
        vendorLoc.SelectInspectionDate();
         System.out.println("Inspection Scheduled");

    }

    @And("Mark Inspection as done")
    public void MarkInspection(){
        vendorLoc.MarkInspectionCompleted();
        System.out.println("Inspected!");
    }

    @And("Vendor attaches Appraisal Report")
    public void SubmitAppraisalReport(){
        vendorLoc.UploadAppraisalReport();
        System.out.println("File Submitted");
    }


}
