package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//With TestNG
@CucumberOptions(
		features = "src/test/resources/features/Login.feature",
		glue={"stepdefinitions","hooks"},
		dryRun=false,
		plugin={"pretty", "html:target/cucumber.reports", "json:target/cucumber.json"},
		monochrome= true,
		publish = true
	)
public class Test_runner_Login extends AbstractTestNGCucumberTests{
	
}
