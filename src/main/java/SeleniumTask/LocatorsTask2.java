package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\FinalSeleniumDrivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.haveyourchoice.com.au/");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.id("search"));
		e.sendKeys("Keychains");
		
	}

}
