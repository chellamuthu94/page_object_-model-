package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/feature/login.feature", glue = "cucumber")
public class runner extends AbstractTestNGCucumberTests {

}
