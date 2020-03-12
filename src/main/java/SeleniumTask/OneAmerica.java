package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneAmerica {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.oneamerica.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.xpath("//a[@id='loginBtnId']"));
		a.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement b = driver.findElement(By.xpath("//button[text()='Register for a new account']"));
		b.click();

	}

}
