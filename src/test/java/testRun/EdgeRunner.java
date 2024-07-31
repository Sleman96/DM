package testRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue="Steps", tags="@edge " )
public class EdgeRunner extends AbstractTestNGCucumberTests {
}
