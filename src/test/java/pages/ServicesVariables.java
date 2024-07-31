package pages;

import base.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ServicesVariables extends BaseSetup {

    public ServicesVariables() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Individual Services')]")
    public WebElement individualServicesTab;
    @FindBy(xpath = "//h3[contains(text(),'Business Services')]")
    public WebElement businessServicesTab;
    @FindBy(xpath = "//h3[contains(text(),'Government Services')]")
    public WebElement governmentServicesTab;
    @FindBy(xpath = "//h3[contains(text(),'Emirati')]")
    public WebElement emiratiTab;
}
