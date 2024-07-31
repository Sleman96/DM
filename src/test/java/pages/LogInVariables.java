package pages;

import base.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LogInVariables extends BaseSetup {
    public LogInVariables() throws IOException {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "loginForm:username")
    public WebElement userName;

    @FindBy(id = "loginForm:password")
    public WebElement password;

    @FindBy(id = "Button_cust")
    public WebElement login;

}
