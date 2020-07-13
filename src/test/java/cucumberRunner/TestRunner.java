package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="C:\\Users\\Manu Chauhan\\eclipse-workspace\\Automation\\src\\test\\java\\features",
			glue="stepDefinations"
		)


public class TestRunner {

}
