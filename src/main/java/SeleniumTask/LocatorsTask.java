package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\FinalSeleniumDrivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login?");
		Thread.sleep(5000);
		
		//LinkText
		WebElement e = driver.findElement(By.linkText("Sign up"));
		e.click();
		
		//Id
		WebElement e1 = driver.findElement(By.id("uid-firstName-6"));
		e1.sendKeys("Swatha");
		
		//xpath
		WebElement e2 =driver.findElement(By.xpath("//*[@id=\"uid-lastName-7\"]"));
		e2.sendKeys("Sadagopan");
		
		//id
		
		WebElement e3 = driver.findElement(By.id("uid-email-9"));
		e3.sendKeys("swatha007@gmail.com");
		
		//Class
		
		WebElement e4 = driver.findElement(By.className("layout-submit-button"));
		Thread.sleep(3000);
		e4.click();
	

	}

}
