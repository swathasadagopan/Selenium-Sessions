package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/select[1]"));
		Select select = new Select(a);
		select.selectByVisibleText("30");
		EventFiringWebDriver eventfire = new EventFiringWebDriver(driver);
		eventfire.executeScript("document.querySelector('div[role=\"rowgroup\"][class*=\"ui-grid-viewport\"]').scrollTop=500");
		
//.css-1yqt5io
	}
	
}
