package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/Features"
		,glue={"StepDefinations"},
		plugin = {"html:target/cucumber.html"},
		monochrome = true,
		dryRun =false
		)

public class TestRunner {
	

}
