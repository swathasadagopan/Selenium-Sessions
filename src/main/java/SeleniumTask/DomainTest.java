package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DomainTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.domain.com.au/?gclid=EAIaIQobChMIs5jll_v95gIVDhWPCh3jxgMjEAAYASAAEgKNwfD_BwE");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//button[text()='Rent']"));
		action.click(a).build().perform();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement b = driver.findElement(By.xpath("//section[@class='typeahead is-large']//input[@id='fe-pa-domain-home-typeahead-input']"));
		b.sendKeys("Gladesville");
		WebElement c = driver.findElement(By.xpath("//button[@class='css-i68iad']"));
		c.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,3026)");
		WebElement d = driver.findElement(By.xpath("//li[7]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//img[1]"));
		d.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement e = driver.findElement(By.xpath("//li[@class='listing-details__gallery-toolbar-icon photos']//button[@class='listing-details__gallery-toolbar-btn']"));
		e.click();
		////button[@class='pswp__button css-1koavhz']
		for(int i=0;i<=5;i++)
		{
		WebElement f = driver.findElement(By.xpath("//button[@class='pswp__button css-1koavhz']"));
		f.click();
		}
		WebElement g = driver.findElement(By.xpath("//*[@name='close']"));
		g.click();
		WebElement h = driver.findElement(By.xpath("//span[contains(text(),'Email agent')]"));
		h.click();
	}

}
