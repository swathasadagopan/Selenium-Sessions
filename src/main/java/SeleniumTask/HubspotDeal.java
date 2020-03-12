package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubspotDeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login?_ga=2.55893291.1450662833.1572570501-1936519085.1572570501");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String t = driver.getTitle();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("ramanarayanan.bagavathi@gmail.com");
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("Mithran1207");
		WebElement loginclick = driver.findElement(By.id("loginBtn"));
		loginclick.click();
		Thread.sleep(2000);
		try
		{
		WebElement salesbtn = driver.findElement(By.xpath("//nav[@id='navbar']/div/div/div/div/div/ul/li[5]/a"));
		Actions action = new Actions(driver);
		
		action.click(salesbtn).build().perform();
		}
			catch(Exception e) {
				System.out.println("error in sales action");
		}
//		WebElement dealbtn = driver.findElement(By.id("nav-secondary-deals"));
//		action.click(dealbtn).build().perform();
//		WebElement createdeal = driver.findElement(By.xpath("//button/span/span[text()='Create deal']"));
//		action.click(createdeal).build().perform();
//		WebElement dateval = driver.findElement(By.id("UIFormControl-67"));
		
		//Actions action = new Actions(driver);
		
		
		//action.click(loginclick).build().perform();
		
		
		
	}

}
