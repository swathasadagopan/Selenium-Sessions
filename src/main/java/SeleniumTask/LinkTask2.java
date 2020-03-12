package SeleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTask2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\FinalSeleniumDrivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		List<WebElement>l=driver.findElements(By.tagName("img"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			String text =l.get(i).getAttribute("src");
			System.out.println(text);
		}
		
	}

}
