package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sa {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.saphysiotherapy.com/index.html");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.id("popup-close")).click();
			WebElement e = driver.findElement(By.xpath("//button[text()='BOOK NOW']"));
			Actions action = new Actions(driver);
			action.moveToElement(e).build().perform();
			WebElement f= driver.findElement(By.xpath("//a[text()='GLENELG']"));
			action.moveToElement(f).build().perform();
			action.click(f).build().perform();
			WebElement g = driver.findElement(By.xpath("/html/body/section/div/div/div/div/a"));
			action.click(g).build().perform();
//			Actions action = new Actions(driver);
//			WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Our Services')]"));
//			action.moveToElement(e).build().perform();
//			//System.out.println("click success");
//			
//			WebElement f =driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));
//			action.click(f).build().perform();
//			//System.out.println("conditions success");
//			

	}

}
