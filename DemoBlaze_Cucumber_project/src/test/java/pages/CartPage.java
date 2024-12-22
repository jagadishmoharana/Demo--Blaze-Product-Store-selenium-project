package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver ;
	WebDriverWait wait;
	public CartPage(WebDriver driver){
		this.driver = driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	}
	
	public void ClickOnPlaceOrder() {
		driver.findElement(By.xpath("//button[.=\"Place Order\"]")).click();
	   
	}
	public void fillPlaceOrederForm(String string, String string2, String string3, String string4, String string5, String string6) {
		WebElement pro = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@id=\"name\"]")
		));
		pro.sendKeys(string);
	   driver.findElement(By.id("country")).sendKeys(string2);
	   driver.findElement(By.id("city")).sendKeys(string3);
	   driver.findElement(By.id("card")).sendKeys(string4);
	   driver.findElement(By.id("month")).sendKeys(string5);
	   driver.findElement(By.id("year")).sendKeys(string6);
	}
	
	public void clickOnPurchase() {
		WebElement purchase = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[normalize-space()='Purchase']")
		));
		purchase.click();
	}
}
