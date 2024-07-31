package steps;

import base.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonFunction;
import pages.HomePageVariables;
import pages.ServicesFunctions;


import java.io.IOException;

public class ServicesSteps extends BaseSetup {
    public ServicesSteps() throws IOException {
        homePageVariables = new HomePageVariables();
        commonFunctions = new CommonFunction();
        servicesFunctions = new ServicesFunctions();
    }


    @When("click on services")
    public void ClickOnServices(){
        commonFunctions.clickOnElement(homePageVariables.services,"Services");

    }

    @Then("user will be on services page {string}")
    public void userWillBeOnServicesPage(String servicesLink) throws InterruptedException {

        Thread.sleep(7000);
        Assert.assertTrue(commonFunctions.getCurrentURL(servicesLink),"Actual sames as expected");

    }

    @And("page title displayed as {string}")
    public void pageTitleDisplayedAs(String pageTitle) {
        Assert.assertTrue(servicesFunctions.isPageTitleEqualToServices(pageTitle),"Is wrong title");

    }

    @And("Services page contain tab {string}")
    public void servicesPageContainTab(String tabName) {Assert.assertTrue(servicesFunctions.isTabDisplayed(tabName));
    }
}
