package SeleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\FinalSeleniumDrivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.au");
		Thread.sleep(2000);
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links: " +link.size());
		for(int i=0;i<link.size();i++)
		{
			String text=link.get(i).getText();
			if(text.isEmpty()) {
			}
			else
			{
			System.out.println((text));
		}
		}
			}

	}


