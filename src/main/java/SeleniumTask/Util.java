package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
	WebDriver driver;
	
	public Util(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement dosendkeys(By Locator)
	{
	WebElement e = null;
	try
	{
		WebElement e1 = driver.findElement(By.id(""));
	}catch(Exception c)
	{
		System.out.println("Error");
	}
	{
		return e;
		
	}

	}}
