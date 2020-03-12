package SeleniumTask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClinicTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saphysiotherapy.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("popup-close")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		//Thread.sleep(3000);
		//utilTask u1 = new utilTask(driver);
		//u1.getclinicutil();
			

	}

}
