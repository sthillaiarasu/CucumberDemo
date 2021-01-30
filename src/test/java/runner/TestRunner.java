package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "Stepdef",
dryRun = false,monochrome = true,
plugin = {"pretty","junit:target/cucumber.junit"})

public class TestRunner {

}
