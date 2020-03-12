package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement a=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		action.moveToElement(a).build().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);

		WebElement b= driver.findElement(By.cssSelector("#smoothmenu1 > ul > li:nth-child(14) > ul > li:nth-child(2) > a"));
		Thread.sleep(3000);
		action.moveToElement(b).build().perform();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Member Login")).click();
		System.out.println(driver.getTitle());
		
	}

}
