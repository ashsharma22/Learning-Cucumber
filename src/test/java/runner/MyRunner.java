package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
	features = "src/test/resources",
	//features = "@rerun:rerun/failed_scenarios.txt",
	glue = {"search", "select", "buy.computer", "cnn"}, 
	plugin = {"html:target/cucumber-reports.html", "rerun:rerun/failed_scenarios.txt"},
	tags = "@BuyCar",
	monochrome = false,
	dryRun = false			
	)
public class MyRunner extends AbstractTestNGCucumberTests {

}
