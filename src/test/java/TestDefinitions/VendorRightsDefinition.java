package TestDefinitions;

import Pages.LoginLocators;
import Pages.VendorAssignmentLocators;
import Pages.VendorRightsLocators;
import WebDriverHooks.WebDriverhooks;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VendorRightsDefinition {
    private VendorAssignmentLocators adminloc;
    private VendorRightsLocators vendorLoc;
    private LoginLocators loginLocators;

    private WebDriverhooks driverhooks;
    public VendorRightsDefinition() {
        driverhooks = WebDriverhooks.getInstance();
        adminloc = new VendorAssignmentLocators(driverhooks.getDriver());
        loginLocators = new LoginLocators(driverhooks.getDriver());
        vendorLoc = new VendorRightsLocators(driverhooks.getDriver());
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
