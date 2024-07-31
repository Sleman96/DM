package steps;

import base.BaseSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CommonFunction;
import pages.HomePageFunction;
import pages.HomePageVariables;

import java.io.IOException;

public class SearchSteps extends BaseSetup {
    public SearchSteps() throws IOException {
        super();
    homePageVariables=new HomePageVariables();
    commonFunctions=new CommonFunction();
    homePageFunctions=new HomePageFunction();
    }


    @And("click on search")
    public void clickOnSearch() {
    commonFunctions.clickOnElement(homePageVariables.searchButton, "on click search");
    }

    @Then("all services related to the keyword will be displayed for the user {string}")
    public void allServicesRelatedToTheKeywordWillBeDisplayedForTheUser(String search) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(homePageFunctions.isSearchResultsRelated(homePageVariables.searchResults, search));

    }

    @When("user type keyword related to service like {string}")
    public void userTypeKeywordRelatedToServiceLike(String search) {
        commonFunctions.clickOnElement(homePageVariables.searchField, "Search");
        commonFunctions.sendTextInputValue(homePageVariables.searchField, search);
    }
}
