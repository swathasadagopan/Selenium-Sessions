package SeleniumTask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\FinalSeleniumDrivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
		Alert a= driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		driver.close();

	}

}
