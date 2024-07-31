package pages;

import base.BaseSetup;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ServicesFunctions extends BaseSetup {

    public ServicesFunctions() throws IOException {
        super();
        PageFactory.initElements(driver,this);
         servicesVariables = new ServicesVariables();
    }



    public boolean isPageTitleEqualToServices(String pageTitle){
        if(commonFunctions.getPageTitle().equalsIgnoreCase(pageTitle)){
            return true;
        }
         else{
            return false;
        }
    }
    public boolean isTabDisplayed(String tabName){
        try {
            if (tabName.equalsIgnoreCase(servicesVariables.individualServicesTab.getText())) {
                return commonFunctions.isElementDisplayed(servicesVariables.individualServicesTab, tabName);

            } else if (tabName.equalsIgnoreCase(servicesVariables.businessServicesTab.getText())) {
                return commonFunctions.isElementDisplayed(servicesVariables.businessServicesTab, tabName);

            } else if (tabName.equalsIgnoreCase(servicesVariables.governmentServicesTab.getText())) {
                return commonFunctions.isElementDisplayed(servicesVariables.governmentServicesTab, tabName);

            } else if (tabName.equalsIgnoreCase(servicesVariables.emiratiTab.getText())) {
                return commonFunctions.isElementDisplayed(servicesVariables.emiratiTab, tabName);

            }
        }catch (Exception e1){
            e1.printStackTrace();
            return false;
        }
        return false;
    }





}
