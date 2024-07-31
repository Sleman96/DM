package testRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features ={"src/test/java/features/LogOut.feature",
        "src/test/java/features/ChangeToArabic.feature",
        "src/test/java/features/LogIn.feature",
        "src/test/java/features/Services.feature",
        "src/test/java/features/Search.feature"},  glue = "steps")
public class RunnerTest extends AbstractTestNGCucumberTests {
}
