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

public class ClinicHomepage {
	WebDriver driver;

	@BeforeTest
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://www.saphysiotherapy.com/index.html");
	}
	
	@Test(priority=1)
	
	public void getservice() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement e= driver.findElement(By.className("dropdown-toggle"));
		Thread.sleep(3000);
		action.moveToElement(e).build().perform();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//div[@class='col-md-6 mg-col']//li/a[contains(text(),'Services')]"));
		Thread.sleep(3000);
		e1.click();
		Thread.sleep(2000);
		WebElement e3= driver.findElement(By.className("dropdown-toggle"));
		Thread.sleep(3000);
		action.moveToElement(e3).build().perform();
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("//div[@class='col-md-6 mg-col']//li/a[contains(text(),'Conditions')]"));
		e2.click();
		Thread.sleep(3000);
		WebElement e4= driver.findElement(By.className("dropdown-toggle"));
		action.moveToElement(e4).build().perform();
		Thread.sleep(2000);
		WebElement e5 = driver.findElement(By.xpath("//div[@class='col-md-6 mg-col']//li/a[contains(text(),'Modalities')]"));
		e5.click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	
	public void getteam() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("//li[@class='dropdown megamenu']/a[contains(text(),'Our Team')]"));
		a.click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	
	public void getlocation() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement b =driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(.,'Our Locations')]"));
		b.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void getblog() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement c =driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(),'Blog')]"));
		c.click();
		Thread.sleep(2000);
	}
	//
	
	@Test(priority=5)
	public void gethome() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement d =driver.findElement(By.xpath("//li[@class='nav-item']/a[contains(text(),'Home')]"));
		d.click();
		Thread.sleep(2000);
	}
		
	@Test(priority=6)
	public void getstaff() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(),'Staff Login')]"));
		e.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority=7)
	public void getcontact() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(),'Contact Us')]"));
		e.click();
		Thread.sleep(2000);
	}
	@Test(priority=8)
	public void getbook() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement d = driver.findElement(By.xpath("//li[@class='dropdown megamenu']/a[contains(.,'Home')]"));
		action.moveToElement(d).build().perform();
		d.click();
		WebElement e = driver.findElement(By.xpath("//div[@class='dropdown']/button[contains(.,'BOOK NOW')]"));
		action.moveToElement(e).build().perform();
		e.click();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//a[contains(.,'DARLINGTON')]"));
		action.moveToElement(e1).build().perform();
		e1.click();
		Thread.sleep(3000);
		WebElement f = driver.findElement(By.xpath("//button[@class='category-expand-toggle'][1]"));
		f.click();
		Thread.sleep(4000);
		WebElement g = driver.findElement(By.xpath("//ul[@id='collapsable-module-item-1']/li[6]/div/div[2]/button"));
		g.click();
		Thread.sleep(2000);
		WebElement h = driver.findElement(By.xpath("//section[@class='bookings-section--practitioner current']//ul[2]/li/ul/li/div/div[2]/button"));
		h.click();
		Thread.sleep(3000);
		//xpath=//ul[2]/li/ul/li/div/div[2]/button
		//
		WebElement i = driver.findElement(By.xpath("//ul[2]/li/ul/li/div/div[2]/button"));
		action.moveToElement(i).build().perform();
		i.click();
		Thread.sleep(3000);
	}
	@AfterTest
	public void getclose()
	{
	driver.quit();
	}
}


