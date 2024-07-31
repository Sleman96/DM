package pages;

import base.BaseSetup;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import java.io.IOException;

public class CommonFunction extends BaseSetup {
    public CommonFunction() throws IOException {
    }

    public void clickOnElement(WebElement e, String attributeName) {
        try {
            if (isElementDisplayed(e, attributeName)) {
                e.click();
                isCommonActionDone = true;

            } else {
                isCommonActionDone = false;

            }
        } catch (Exception e1) {
            isCommonActionDone = false;

            e1.printStackTrace();
        }
    }

    public boolean isElementDisplayed(WebElement e, String attribute) {
        try {
            if (e.isDisplayed()) {
                System.out.println("Element " + attribute + " Located");
                return true;
            } else {
                System.out.println("Element not Located");
                return false;
            }
        } catch (Exception e1) {
            isCommonActionDone = false;
            System.out.println("exception " + attribute);
            e1.printStackTrace();
            return false;
        }
    }

    public void sendTextInputValue(WebElement e, String value) {
        try {
            e.sendKeys(value);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public Boolean getCurrentURL(String url) {
        try {
            if (driver.getCurrentUrl().toLowerCase().contains(url.toLowerCase())) {
                return true;
            } else {

                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public String getWebLangauge() {
        return homePageVariables.webLanguage.getAttribute("lang");
    }

    public String getElementText(WebElement e) {

        try {
            if (isElementDisplayed(e, e.getText())) {
                return e.getText();
            }
        } catch (Exception e1) {
            isCommonActionDone = false;
            e1.printStackTrace();
            return null;
        }
        return null;
    }


    public String getPageTitle() {

        try {
            System.out.println(driver.getTitle());
            return driver.getTitle();

        }catch(Exception e1) {

            e1.printStackTrace();
            return null;
        }
    }


}








