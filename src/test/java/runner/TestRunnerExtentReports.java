package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\USER\\eclipse-workspace\\Phase2CucumberDemo\\src\\test\\java\\features\\wikiPage.feature",
	glue = {"steps"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/myreport2.html",
			  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			  "timeline:test-output-thread/"
	}, 
	monochrome = true, 
	tags = "@login"
		
		)
public class TestRunnerExtentReports {

}
