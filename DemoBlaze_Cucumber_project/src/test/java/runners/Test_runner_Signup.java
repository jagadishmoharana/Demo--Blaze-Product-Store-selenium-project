package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//With TestNG
@CucumberOptions(
		features = "src/test/resources/features/Signup.feature",
		glue="stepdefinitions",
		dryRun=false,
		plugin={"pretty", "html:target/cucumber.reports", "json:target/cucumber.json"},
		monochrome= true,
		publish = true
	)
public class Test_runner_Signup extends AbstractTestNGCucumberTests{
	
}
