package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(1);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("1989");
		
	}

}
