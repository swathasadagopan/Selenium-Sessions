package TestngTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndigoTest1 {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.goindigo.in");
	}
	
	@Test(priority=1)
	public void roundtrip() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement a =driver.findElement(By.xpath("//label[text()='Round Trip']"));
		action.click(a).build().perform();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println("Title :" +title);
		Assert.assertEquals(title,"Online Flight Booking for Domestic & International Destinations | IndiGo");

	}
	
	@Test(priority=2)
	public void fromto() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement b=driver.findElement(By.xpath("//div[@id='bookFlightTab']//form//div[@class='or-tab-content trip-tab-content']//div[@class='autocomplete-wrapper station-wrapper']"));
		action.click(b).build().perform();
		
		WebElement c = driver.findElement(By.xpath("//div[@data-name='Hyderabad']"));
		action.click(c).build().perform();
		
		Thread.sleep(1000);
		
		WebElement e = driver.findElement(By.xpath("//div[@class='autocomplete-result station-result "
				+ "clearfix airport-item pop-dest-stn selected']//div[@class='airport-city']"
				+ "[contains(text(),'Bengaluru, India')]"));
		e.click();
		
		
		String title = driver.getTitle();
		System.out.println("Title :" +title);
		Assert.assertEquals(title,"Online Flight Booking for Domestic & International Destinations | IndiGo");

	}
	
	@Test(priority=3)
	public void datetest()
	{
		Actions action = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//div[@class='ig-input-group field-float cal-focus']"
				+ "//input[@placeholder='Departure Date']"));
		action.click(a).build().perform();
		WebElement b=driver.findElement(By.xpath("//input[@class='form-control or-depart igInitCalendar focus']"));
		action.click(b).build().perform();
		String title = driver.getTitle();
		System.out.println("Title :" +title);
		Assert.assertEquals(title,"Online Flight Booking for Domestic & International Destinations | IndiGo");
	}
	
	
	@AfterTest
	public void getclose()
	{
		driver.close();
	}
}



