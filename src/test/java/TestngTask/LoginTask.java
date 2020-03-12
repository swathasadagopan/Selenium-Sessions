package TestngTask;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTask {
	WebDriver driver;

	@BeforeTest
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.com.au");
	}
	
	@Test(priority=1)
	
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println("Title :" +title);
		Assert.assertEquals(title,"Amazon.com.au: Shop online for Electronics, Apparel, Toys, Books, DVDs & more");
	}
	@Test(priority=2,enabled=false)
	
	public void getlogin() throws InterruptedException
	{
		Thread.sleep(2000);;
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("nav-action-inner")).click();
		String title1 = driver.getTitle();
		Assert.assertEquals(title1,"Amazon Sign In");
	}
	@AfterTest
	public void getclose()
	{
		driver.close();
	}
}
