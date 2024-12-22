package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	WebDriver driver ;
	WebDriverWait wait;
	public LogoutPage(WebDriver driver){
		this.driver = driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	}
	
	public void clickOnLogout() {
		WebElement pro = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[@id=\"logout2\"]")
		));
		pro.click();
	}
}
