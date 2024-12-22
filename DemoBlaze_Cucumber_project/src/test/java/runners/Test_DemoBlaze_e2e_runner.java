package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//With TestNG
@CucumberOptions(
		features = "src/test/resources/features/DemoBlaze_e2e.feature",
		glue="stepdefinitions",
		dryRun=false,
		plugin={"pretty", "html:target/cucumber.reports", "json:target/cucumber.json"},
		monochrome= true,
		publish = true
	)
public class Test_DemoBlaze_e2e_runner extends AbstractTestNGCucumberTests{
	
}
