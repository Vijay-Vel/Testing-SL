package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\Phase2CucumberDemo\\src\\test\\java\\features\\TagsDemo.feature",
   				 glue= {"steps"},
				dryRun=false,
				plugin={"pretty",
						"html:target/cucumberreport.html"},
				tags="@login"

		)
public class TestRunnerTags {

}
