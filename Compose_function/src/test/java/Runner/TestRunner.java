package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\DELL\\eclipse-workspace\\Compose_function\\Feature\\Login_test.feature"
		,glue={"stepDefinition"}
		,monochrome=true
		
		,plugin={"pretty","html:Report","json:Report/cucumber.json"}
		
		)

public class TestRunner {
	
}
