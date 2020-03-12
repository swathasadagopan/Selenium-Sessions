package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.id("u_0_b"));
		a.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement b = driver.findElement(By.id("email"));
		b.sendKeys("swatha007@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement c = driver.findElement(By.id("pass"));
		c.sendKeys("Animation7");
		//u_0_c
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement d = driver.findElement(By.xpath("//div//button[@id='loginbutton']"));
		d.click();
		
	}

}
