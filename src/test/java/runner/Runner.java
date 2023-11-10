package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\CucumberSureFireDemo\\src\\test\\java\\features\\login.feature",
   				 glue= {"steps"},
				dryRun=false,
				plugin={"pretty",
						"html:target/cucumberreport.html"}
		)
public class Runner {

}
