package TestDefinitions;

import Pages.CreateOrderLocators;
import WebDriverHooks.WebDriverhooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;


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
    public void ClickLoginFromDashboard() {
        createOrderloc.GetCreateBtnFromDashboard().click();
        //Select Appraisal OrderType
        createOrderloc.SelectApppraisalFromDropdown().click();
    }


    @When("Select Residential as Order Type")
    public void SelectResidentialOT() {
        createOrderloc.SelectResidentialOT().click();
        System.out.println("Residential OT selected");
    }


    @And("client selects its branch")
    public void SelectClientBranch() {
        createOrderloc.SelectClientBranch().click();
    }


    @And("client selects transaction type")
    public void SelectTransactions() {
        createOrderloc.SelectTransaction().click();
        System.out.println("Transaction Selected");
    }

    @And("client selects loan Type")
    public void SelectLoanType() {
        createOrderloc.SelectLoanType().click();
        System.out.println("LoanType Selected");
    }


    @And("client enters loan Number {string}")
    public void EnterLoanNumber(String LoanNo) {
        WebElement myLoanNo = createOrderloc.AddLoanNumber();
        myLoanNo.sendKeys(LoanNo);
        System.out.println("LoanNumber Entered");
        createOrderloc.Scrolldown();
    }

    @And("Client provides Borrower Info {string}, {string}")
    public void EnterBorrowerInfo(String BorrowerName, String BorrowerEmail) {
        //  createOrderloc.Scrolldown();
        createOrderloc.getBorrowerInfo(BorrowerName, BorrowerEmail);
        System.out.println("Borrower Information Provided");
        createOrderloc.Scrolldown();

    }

    @And("Client selects PropertyType")
    public void SelectPropertyType() {
        createOrderloc.getPropertyType().click();
        System.out.println("Property Selected");
        createOrderloc.Scrolldown();

    }

    @And("Client Enters Complete Property Address {string}, {string}, {string}, {string}")
    public void EnterPropertyAddress(String street, String city, String state, String zipcode) {
        //  createOrderloc.Scrolldown();
        createOrderloc.PropertyAddress(street, city, state, zipcode);
        System.out.println("Complete Address Added");
        createOrderloc.Scrolldown();
    }

    @And("Client selects the Product")
    public void SelectProduct() {
        createOrderloc.LargeScrolling();
        createOrderloc.getProducts().click();
        System.out.println("Product Selected");
    }

    @And("Client appends its comment with the default message {string}")
    public void AddClientComments(String appendedText){
        createOrderloc.LargeScrolling();
        createOrderloc.SelectClientComment(appendedText);
        System.out.println("Client Comments Appended");

    }


    @And("Select any Supporting Document")
    public void SupportingDocSelection() {
       // createOrderloc.LargeScrolling();
        createOrderloc.selectSupportingDoc();
        System.out.println("Supporting Document Selection");
    }


    @And("Client selects Continue Button")
    public void SelectContinueBtn() {
        createOrderloc.chooseContinue();
        System.out.println("Continue Button Selected");
    }


    @And("clients selects Payment Method")
    public void SelectedPayment() {
     //   createOrderloc.Scrolldown();
       // createOrderloc.LargeScrolling();
        createOrderloc.selectPaymentMethod();
        System.out.println("Payment Selected");
    }

    @And("Client confirms Order Creation")
    public void CreateOrder(){
        createOrderloc.getConfirmOrder();
        System.out.println("Yahoo! Order Created Successfully");
        System.out.println(driverhooks.getDriver().getCurrentUrl());
    }

    @Then("Get Client Order Number")
    public void GetMyOrderNo(){
        createOrderloc.getAppraisalNumber();
    }

    @And("User logs Out")
    public void logout(){
        createOrderloc.SignOut();
        System.out.println("User Logged Out");
    }


}
