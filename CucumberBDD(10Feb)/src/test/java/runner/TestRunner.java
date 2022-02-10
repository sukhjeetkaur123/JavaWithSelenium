package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		     
		features = {"C:\\Users\\SukhjeetKaur\\eclipse-workspace\\CucumberBDD\\src\\test\\java\\featureFiles\\addTimeSheet.feature"},
		glue = {"stepDefinition"},
//		dryRun = true,
		monochrome = true,
		plugin = {"pretty","json:report/Cucumber.json"
				}
//	 tags = {"@SmokeTests"}
		
		)
public class TestRunner {
	
	

}
