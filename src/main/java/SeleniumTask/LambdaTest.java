package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://accounts.lambdatest.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		WebElement a = driver.findElement(By.xpath("//input[@placeholder='Full Name*']"));
//		a.sendKeys("swatha");
		WebElement b = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		b.sendKeys("swatha007@gmail.com");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement c = driver.findElement(By.id("userpassword"));
		c.sendKeys("MithuMridhu123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//Phone (+1 555 555 5555)*
//		WebElement d = driver.findElement(By.xpath("//input[@placeholder='Phone (+1 555 555 5555)*']"));
//		d.sendKeys("9486015686");
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		WebElement e =driver.findElement(By.xpath("//button[text()='Free Sign Up']"));
//		e.click();
	}

}
