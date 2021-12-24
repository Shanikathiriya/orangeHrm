package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs
{

     AdminLogin adminLogin=new AdminLogin();
     Homepage homepage=new Homepage();
     PIMPage pimPage=new PIMPage();
     AddEmployee addEmployee=new AddEmployee();
     Logout logout=new Logout();
     LoadProp loadProp=new LoadProp();
     DeleteEmployeeDetails deleteEmployeeDetails=new DeleteEmployeeDetails();
     AlertHandle alertHandle=new AlertHandle();



     @Given("user is home page")
     public void user_is_home_page() {
         adminLogin.adminLogindetails();


     }
     @When("user click on PIM menu")
     public void user_click_on_pim_menu() {
          homepage.clickOnPim();

     }
     @And("select Add Employee")
     public void selectAddEmployee() {
          pimPage.clickOnaddEmploee();

     }
     @When("user enter required details")
     public void user_enter_required_details() {
          addEmployee.addEmployeeDetails();

     }
     @When("click on save button")
     public void click_on_save_button() {

     }
     @Then("click on Logut")
     public void click_on_logut() throws InterruptedException {

         logout.logoutByAdmin();

     }


     @And("login by valid credential user")
     public void loginByValidCredentialUser()
     {
         adminLogin.credentialUserLogin();

     }

     @Then("verify user successfully login")
     public void verifyUserSuccessfullyLogin()
     {

          logout.issuccessfullylogin(loadProp.getProperty("loginurl"));
     }

//Search



     @Given("user is on home page")
     public void userIsOnHomePage()
     {
          adminLogin.adminLogindetails();
     }

     @And("select Employeelist")
     public void selectEmployeelist()
     {

     }

     @And("Enter employee name in text box")
     public void enterEmployeeNameInTextBox()
     {

     }

     @And("click on Serach Button")
     public void clickOnSerachButton()
     {
          deleteEmployeeDetails.selectEmpList();
     }

     @And("select Records form Search result")
     public void selectRecordsFormSearchResult() {
         deleteEmployeeDetails.clickOnSearch();
     }

     @And("click on Delete Button")
     public void clickOnDeleteButton() {
          deleteEmployeeDetails.clickOnDelete();
          alertHandle.acceptAlertBox();

     }

     @Then("verify record delete successfully")
     public void verifyRecordDeleteSuccessfully() {
          deleteEmployeeDetails.verifyDeletesuccessfully();
     }
}
