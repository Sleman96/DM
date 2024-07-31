package steps;

import base.BaseSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks extends BaseSetup {
    public Hooks() throws IOException {
    }
    @Before("@firefox")
    public void setUpFirefox(Scenario scenario) throws IOException {
        init("firefox");}
    @Before("@edge")
    public void setUpEdge(Scenario scenario) throws IOException { init("edge");}


    @BeforeAll
    public static void initiate() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\Config.properties");
        prop.load(fis);}

   @After("@firefox or @edge")
    public void tearDown(Scenario scenario)
   { driver.quit();}

}
