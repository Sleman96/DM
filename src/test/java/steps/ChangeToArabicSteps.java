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

public class ChangeToArabicSteps extends BaseSetup {
    public ChangeToArabicSteps() throws IOException {
        super();
        homePageFunctions=new HomePageFunction();
        commonFunctions=new CommonFunction();

    }

    @Then("default language will be english")
    public void DefaultLanguageWillBeEnglish(){
        Assert.assertTrue(homePageFunctions.isEnglishLanguage());


    }

    @When("click on arabic button")
    public void clickOnArabicButton() {
        commonFunctions.clickOnElement(homePageVariables.arabicLanguageButton,"Arabic ");

    }

    @Then("website will be translated to arabic")
    public void websiteWillBeTranslatedToArabic() {
        Assert.assertTrue(homePageFunctions.isArabicLanguage());
    }

    @And("arabic button will be replaced to english")
    public void arabicButtonWillBeReplacedToEnglish() {
        Assert.assertEquals(commonFunctions.getElementText(homePageVariables.englishLanguageButton).toLowerCase(),"english");

    }
}
