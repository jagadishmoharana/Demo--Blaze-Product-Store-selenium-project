package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver ;
	WebDriverWait wait;
	public HomePage(WebDriver driver){
		this.driver = driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	}
	
	public void clickonProduct(String str) {
		WebElement pro = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[text()='" + str + "']")
		));
		pro.click();
	   
	}
	
}
