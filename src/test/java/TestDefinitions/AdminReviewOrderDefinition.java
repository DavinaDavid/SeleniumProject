package TestDefinitions;

import Pages.AdminReviewOrderLocators;
import Pages.LoginLocators;
import Pages.VendorAssignmentLocators;
import Pages.VendorRightsLocators;
import WebDriverHooks.WebDriverhooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminReviewOrderDefinition {

  //  private VendorAssignmentLocators adminloc;
    private VendorRightsLocators vendorLoc;
 //   private LoginLocators loginLocators;
    //  private CreateOrderLocators createOrderLocators;
    private AdminReviewOrderLocators adminReviewOrderLoc;

    private WebDriverhooks driverhooks;
    public AdminReviewOrderDefinition() {
        driverhooks = WebDriverhooks.getInstance();
    //    adminloc = new VendorAssignmentLocators(driverhooks.getDriver());
       // loginLocators = new LoginLocators(driverhooks.getDriver());
        vendorLoc = new VendorRightsLocators(driverhooks.getDriver());
        adminReviewOrderLoc = new AdminReviewOrderLocators(driverhooks.getDriver());

        //  createOrderLocators = new CreateOrderLocators(driverhooks.getDriver());
    }


    @When("Admin Reviews Order")
    public void ReviewOrder(){
        adminReviewOrderLoc.ChooseReviewReportfromAction();

    }

}
