package steps;

import base.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonFunction;
import pages.DashBoardVariables;
import pages.HomePageVariables;
import pages.LogInVariables;

import java.io.IOException;

public class LogOutSteps extends BaseSetup {
    public LogOutSteps() throws IOException {
   super();
        loginVariables = new LogInVariables();
        homePageVariables = new HomePageVariables();
        commonFunctions = new CommonFunction();
        dashboardVariables = new DashBoardVariables();
    }
  @When("user click on profile")
    public void UserClickOnProfile(){
     commonFunctions.clickOnElement(dashboardVariables.profile,"profile");

  }

    @And("click on logout button")
    public void clickOnLogoutButton() {
        commonFunctions.clickOnElement(dashboardVariables.logout,"logout");
    }

    @Then("user will be on home page")
    public void userWillBeOnHomePage() throws InterruptedException {
     Thread.sleep(8000);
        Assert.assertTrue(commonFunctions.getCurrentURL(prop.getProperty("URL")));
    }

    @And("there will be login option")
    public void thereWillBeLoginOption() {
Assert.assertTrue(commonFunctions.isElementDisplayed(homePageVariables.loginButton,"Login" ));
    }
}
