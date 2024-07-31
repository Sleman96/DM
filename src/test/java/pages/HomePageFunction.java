package pages;

import base.BaseSetup;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class HomePageFunction extends BaseSetup {
    public HomePageFunction() throws IOException {
        PageFactory.initElements(driver,this);
    }

    public boolean isEnglishLanguage(){
        if(commonFunctions.getWebLangauge().contains("English") || commonFunctions.getWebLangauge().contains("en")){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isArabicLanguage(){
        if(commonFunctions.getWebLangauge()!= null &&  commonFunctions.getWebLangauge().toLowerCase().contains("ar")){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isSearchResultsRelated(List<WebElement> searchResults , String searchKeyword){

        return commonFunctions.getElementText(searchResults.get(0)).toLowerCase().contains(searchKeyword.toLowerCase());

    }

}



