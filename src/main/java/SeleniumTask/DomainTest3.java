package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DomainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		WebElement c = driver.findElement(By.xpath("//button[@class='css-1yqt5io']"));
		c.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement d = driver.findElement(By.xpath("//span[@class='css-1hcb9zy']//*[@class='domain-icon css-jeyium']"));
		d.click();
		
		//WebElement e = driver.findElement(By.xpath("/tal-tether-closed-element horizontal-tether-closed-enabled horizontal-tether-closed-pinned horizontal-tether-closed-pinned-left horizontal-tether-closed-out-of-bounds horizontal-tether-closed-out-of-bounds-bottom horizontal-tether-closed-element-attached-top horizontal-tether-closed-target-attached-bottom horizontal-tether-open-element horizontal-tether-open-pinned horizontal-tether-open-pinned-left horizontal-tether-open-out-of-bounds horizontal-tether-open-out-of-bounds-bottom horizontal-tether-open-element-attached-top horizontal-tether-open-target-attached-bottom horizontal-tether-open-enabled']/div/div[@class='css-1xhj18k']/div[@class='css-19s26p8']/div[@class='css-h5onbk']/div[@class='css-17hjdc4']/div/div[5]/div[1]"));
		WebElement e = driver.findElement(By.xpath("//div[5]/div/div/label/div"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",e);
//		e.click();
		//js.executeScript("window.scrollBy(0,300);");
		
		WebElement f = driver.findElement(By.xpath("//div[text()='Pets allowed']"));
		js.executeScript("arguments[0].scrollIntoView(true);", f);
		
		f.click();
		//js.executeScript("window.scrollBy(0,500);");
		
		////div[text()='Dishwasher']
		
		WebElement g = driver.findElement(By.xpath("//div[text()='Dishwasher']"));
		js.executeScript("arguments[0].scrollIntoView(true);", g);
		
		g.click();
		
		
		//EventFiringWebDriver eventfire = new EventFiringWebDriver(driver);
		//eventfire.executeScript("document.querySelector('body:nth-child(2) div.horizontal-tether-closed-element.horizontal-tether-closed-pinned.horizontal-tether-closed-pinned-left.horizontal-tether-closed-out-of-bounds.horizontal-tether-closed-out-of-bounds-bottom.horizontal-tether-closed-element-attached-top.horizontal-tether-closed-target-attached-bottom.horizontal-tether-open-element.horizontal-tether-open-pinned.horizontal-tether-open-pinned-left.horizontal-tether-open-out-of-bounds.horizontal-tether-open-out-of-bounds-bottom.horizontal-tether-closed-enabled.horizontal-tether-open-pinned-right.horizontal-tether-open-enabled.horizontal-tether-open-element-attached-top.horizontal-tether-open-target-attached-bottom:nth-child(12) div:nth-child(1) div.css-1xhj18k > div.css-19s26p8').scrollTop=500");
		//eventfire.executeScript("document.querySelector('div[@class=\"css-h5onbk\"]//div[@class=\"css-17hjdc4\"]').scrollTop=500");
		//eventfire.executeScript("document.evaluate('//div[contains(@class,\"css-1rqtw73\")]//div[contains(@class,\"css-17hjdc4\")]').scrollTop =500");
		
		
		//WebElement e = driver.findElement(By.xpath("//div[@class='css-h5onbk']//div[@class='css-17hjdc4']"));
		//d.sendKeys(Keys.PAGE_DOWN);
//		Coordinates cor =((Locatable)e).getCoordinates();
//		cor.inViewPort();
	}

}
