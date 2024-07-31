package steps;

import base.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import pages.*;

import java.io.IOException;

public class LogInSteps extends BaseSetup {
   public LogInSteps() throws IOException {
    super();
    commonFunctions =new CommonFunction();
    dashboardVariables=new DashBoardVariables();
    dashboardFunctions=new DashBoardFunctions();
    loginVariables=new LogInVariables();
    homePageVariables=new HomePageVariables();


   }

    @Given("user open website DM")
   public void UserOpenWebsiteDM(){
    }

    @When("click on login button from the top right corner")
    public void clickOnLoginButtonFromTheTopRightCorner() {
    commonFunctions.clickOnElement(homePageVariables.loginButton,"LogIn Button" );

    }

    @And("enter DM account {string}")
    public void enterDMAccount(String user) throws InterruptedException {
    commonFunctions.sendTextInputValue(loginVariables.userName,user);
    Thread.sleep(3000);

    }

    @And("enter the password {string}")
    public void enterThePassword(String password) {
    commonFunctions.sendTextInputValue(loginVariables.password,password);

    }

    @And("click on login button")
    public void clickOnLoginButton() {
    commonFunctions.clickOnElement(loginVariables.login, "login Button");

    }

    @Then("user will be on the dashboard {string}")
    public void userWillBeOnTheDashboard(String dashLink) throws InterruptedException {
     Thread.sleep(8000);
     Assert.assertTrue(commonFunctions.getCurrentURL(dashLink), "Actual URL same Expected URL ");

    }

    @And("will see the logged user name displayed as {string}")
    public void willSeeTheLoggedUserNameDisplayedAs(String dashWelcome) {
    commonFunctions.isElementDisplayed(dashboardVariables.welcomeMessage, dashWelcome);

    }

    @And("the dashboard will contain the tab {string}")
    public void theDashboardWillContainTheTab(String tabName) {
     Assert.assertTrue(dashboardFunctions.isTabDisplayed(tabName));

    }

    @And("will see the summary of the request submitted by him")
    public void willSeeTheSummaryOfTheRequestSubmittedByHim() {
    Assert.assertTrue(commonFunctions.isElementDisplayed(dashboardVariables.serviceRequestSummary, "Service Request Summary"));

    }


}
