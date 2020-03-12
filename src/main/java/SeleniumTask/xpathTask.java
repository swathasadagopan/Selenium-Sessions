package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.haveyourchoice.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//WebElement e1 =driver.findElement(By.xpath("//input[@id='search'])[2]"));
		//e1.sendKeys("Bags");
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.xpath("(//input[@id='search'])[2]"));
		textBox.sendKeys("Bags");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	
		WebElement text2= driver.findElement(By.xpath("(//button[@class='sb-search-submit'])[2]"));
		text2.click();
		Thread.sleep(2000);
		WebElement text3 = driver.findElement(By.xpath("//span[contains(text(),'About Us')]"));
		Thread.sleep(1000);
		text3.click();
		WebElement text4 =driver.findElement(By.xpath("//a[contains(text(),'News')]"));
		text4.click();
		Actions action = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//a[@class='menu__moblie']/span[contains(text(),'SHOP')]"));
		action.moveToElement(e).build().perform();
		WebElement f = driver.findElement(By.xpath("//span[contains(text(),'Coconut Shell Accessories')]"));
		//f.click();									//xpath=//span[contains(.,'Coconut Shell Accessories')]
		action.moveToElement(f).build().perform();
		f.click();
	}
		

}

