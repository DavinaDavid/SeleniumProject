package TestDefinitions;

import Pages.CreateOrderLocators;
import WebDriverHooks.WebDriverhooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;


public class CreateOrderDefinition {
    private CreateOrderLocators createOrderloc;
    private WebDriverhooks driverhooks;


    public CreateOrderDefinition() {
        driverhooks = WebDriverhooks.getInstance();
        createOrderloc = new CreateOrderLocators(driverhooks.getDriver());
    }

    @When("Client Dashboard items are loaded")
    public void ClickDashboardLoginBtn() {
        createOrderloc.LoadDashboard();
    }

    @Then("Client choose to Create Order from Dashboard")
    public void ClickLoginFromDashboard() {
        createOrderloc.GetCreateBtnFromDashboard().click();
        //Select Appraisal OrderType
        createOrderloc.SelectApppraisalFromDropdown().click();
    }


    @Given("Residential Order Type is selected")
    public void SelectResidentialOT() {
        createOrderloc.SelectResidentialOT().click();
        System.out.println("Residential OT selected");
    }


    @When("client selects it Branch")
    public void SelectClientBranch() {
        createOrderloc.SelectClientBranch().click();
    }


    @And("Transaction type is selected")
    public void SelectTransactions() {
        createOrderloc.SelectTransaction().click();
        System.out.println("Transaction Selected");

//        createOrderloc.SelectLoanType().click();
//        System.out.println("LoanType Selected");

    }

    @And("Loan type is selected")
    public void SelectLoanType(){
        createOrderloc.SelectLoanType().click();
        System.out.println("LoanType Selected");

    }

    @And("Loan number is provided {string}")
    public void EnterLoanNumber(String LoanNo) {
        WebElement myLoanNo = createOrderloc.AddLoanNumber();
        myLoanNo.sendKeys(LoanNo);
        System.out.println("LoanNumber Entered");
      // createOrderloc.Scrolldown();
    }

    @And("Borrower Information added {string}, {string}")
    public void EnterBorrowerInfo(String BorrowerName, String BorrowerEmail) {
        createOrderloc.Scrolldown();
        createOrderloc.getBorrowerInfo(BorrowerName, BorrowerEmail);
        System.out.println("Borrower Information Provided");
        createOrderloc.Scrolldown();

    }

    @And("Property Type is chosen")
    public void SelectPropertyType() {
        createOrderloc.getPropertyType();
        System.out.println("Property Selected");
    //    createOrderloc.Scrolldown();

    }

    @And("Property Address Details are Provided as {string}, {string}, {string}, {string}")
    public void EnterPropertyAddress(String street, String city, String state, String zipcode) {
       // createOrderloc.Scrolldown();
        createOrderloc.PropertyAddress(street, city, state, zipcode);
        System.out.println("Complete Address Added");
        createOrderloc.Scrolldown();
    }

    @And("Product is chosen")
    public void SelectProduct() {
        createOrderloc.LargeScrolling();
        createOrderloc.getProducts().click();
        System.out.println("Product Selected");
    }

    @And("select any Supporting Document")
    public void SupportingDocSelection() {
       // createOrderloc.LargeScrolling();
        createOrderloc.selectSupportingDoc();
        System.out.println("Supporting Document Selection");
    }


    @Then("client selects Continue Button")
    public void SelectContinueBtn() {

        createOrderloc.chooseContinue().click();

        WebElement PageHeading = driverhooks.getDriver().findElement(By.className("container-top-heading"));
        String expectedHeading = "CONFIRM NEW APPRAISAL DETAILS";

        assertEquals("Order Creation Processing", expectedHeading, PageHeading.getText());
    }

    @Given("Back to Home Page")
    public void MyHomePage(){
        createOrderloc.HomePage();
            }


    @And("client makes Payment")
    public void SelectedPayment() {
        createOrderloc.selectPaymentMethod();
        System.out.println("Payment Selected");
    }

    @And("Order Confirmation is made")
    public void CreateOrder(){
        createOrderloc.getConfirmOrder();
        System.out.println("Yahoo! Order Created Successfully");
        System.out.println(driverhooks.getDriver().getCurrentUrl());
    }

    @And("Order is Created and Viewed")
    public void GetMyOrderNo(){
        createOrderloc.getAppraisalNumber();
    }

    @And("User logs Out")
    public void logout(){
        createOrderloc.SignOut();
        System.out.println("User Logged Out");
    }


}
