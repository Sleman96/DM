package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {

    public static WebDriver driver;
    public static Properties prop;
    public static boolean isCommonActionDone;
    public static HomePageVariables homePageVariables;
    public static HomePageFunction homePageFunctions;
    public static LogInVariables loginVariables;
    public static CommonFunction commonFunctions;
    public static DashBoardVariables dashboardVariables;
    public static DashBoardFunctions dashboardFunctions;
    public static ServicesFunctions servicesFunctions;
    public static ServicesVariables servicesVariables;


public BaseSetup() throws IOException{
    prop = new Properties();
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\config\\Config.properties");
    prop.load(fis);
}


    public static void init(String browser) throws FileNotFoundException, IOException {
        switch (browser) {
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            default -> {
                System.out.println("This Browser NotAvailable");
            }
        }

        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



}}
