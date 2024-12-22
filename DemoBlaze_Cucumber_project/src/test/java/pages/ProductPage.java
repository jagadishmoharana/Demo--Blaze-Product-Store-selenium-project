package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	WebDriver driver ;
	WebDriverWait wait;
	public ProductPage(WebDriver driver){
		this.driver = driver;
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	}
	
	public void addToCart() {
		driver.findElement(By.xpath("//a[text()=\"Add to cart\"]")).click();
	   
	}
}
