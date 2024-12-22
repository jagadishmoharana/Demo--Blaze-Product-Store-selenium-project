package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver ;
	WebDriverWait wait;
	public LoginPage(WebDriver driver){
		this.driver = driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	}
	
	
	public void visit_login() {
		driver.get("https://www.demoblaze.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();
	}
	public void setUsername(String str) {
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
        usernameField.sendKeys(str);
	}
	public void setPassword(String str) {
	  	 WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
         passwordField.sendKeys(str);
	}
	public void clickOnLogin() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick=\"logIn()\"]"))).click();
	}
	
}
