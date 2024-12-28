package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {
	WebDriver driver ;
	WebDriverWait wait;
	public SignupPage(WebDriver driver){
		this.driver = driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	}
	
	
	public void visit_signup() {
	     wait.until(ExpectedConditions.elementToBeClickable(By.id("signin2"))).click();
	}
	public void setUsername(String str) {
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));
	     usernameField.sendKeys(str);
	}
	public void setPassword(String str) {
		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-password")));
        passwordField.sendKeys(str);
	}
	public void clickOnSignup() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick=\"register()\"]"))).click();
	}
}
