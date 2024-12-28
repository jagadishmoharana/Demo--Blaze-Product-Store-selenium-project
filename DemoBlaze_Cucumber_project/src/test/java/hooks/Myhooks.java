package hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Myhooks {
	WebDriver driver;
	 @Before
	 public void setup() {
		DriverFactory.initializeBrowser("chrome");
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	 }
	 @After
	 public void teardown() {
	    	driver.quit();
	 }
}
