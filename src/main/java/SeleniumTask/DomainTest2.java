package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DomainTest2 {

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
		////div[@class='css-1rqtw73']//div[@class='css-17hjdc4']
		
		WebElement d = driver.findElement(By.xpath("//span[@class='css-1hcb9zy']//*[@class='domain-icon css-jeyium']"));
		d.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0,926)");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement z = driver.findElement(By.xpath("//div[contains(@class,'css-19s26p8')]")); 
		js.executeScript("window.scrollBy(0,500)");
		
		//EventFiringWebDriver eventfire = new EventFiringWebDriver(driver);
		//eventfire.executeScript(
			//	"document.querySelector('body:nth-child(2) div.horizontal-tether-closed-element.horizontal-tether-closed-pinned.horizontal-tether-closed-pinned-left.horizontal-tether-closed-out-of-bounds.horizontal-tether-closed-out-of-bounds-bottom.horizontal-tether-closed-element-attached-top.horizontal-tether-closed-target-attached-bottom.horizontal-tether-open-element.horizontal-tether-open-pinned.horizontal-tether-open-pinned-left.horizontal-tether-open-out-of-bounds.horizontal-tether-open-out-of-bounds-bottom.horizontal-tether-closed-enabled.horizontal-tether-open-element-attached-top.horizontal-tether-open-target-attached-bottom.horizontal-tether-open-enabled:nth-child(12) div:nth-child(1) div.css-1xhj18k > div.css-19s26p8').scrollTop=500");
		WebElement e = driver.findElement(By.xpath("//div[@class='css-1xhj18k']//div[@class='dynamic-filters-property-types__options-checkbox']//span[text()='Apartment']"));
		//WebElement e = driver.findElement(By.xpath("//body/div[@class='horizontal-tether-closed-element horizontal-tether-closed-enabled horizontal-tether-closed-pinned horizontal-tether-closed-pinned-left horizontal-tether-closed-out-of-bounds horizontal-tether-closed-out-of-bounds-bottom horizontal-tether-closed-element-attached-top horizontal-tether-closed-target-attached-bottom horizontal-tether-open-element horizontal-tether-open-enabled horizontal-tether-open-pinned horizontal-tether-open-pinned-left horizontal-tether-open-out-of-bounds horizontal-tether-open-out-of-bounds-bottom horizontal-tether-open-element-attached-top horizontal-tether-open-target-attached-bottom']/div/div[@class='css-1xhj18k']/div[@class='css-19s26p8']/div[@class='css-h5onbk']/div[@class='css-17hjdc4']/div/div[@class='dynamic-search-filters__filter-wrapper']/div[@class='dynamic-filters-property-types__options-checkbox']/div[2]/div[1]/label[1]/div[1]"));
		e.click();
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,560)");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//Actions action = new Actions(driver);
		WebElement f = driver.findElement(By.xpath("//div[@class='horizontal-tether-closed-element horizontal-tether-closed-enabled horizontal-tether-closed-pinned horizontal-tether-closed-pinned-left horizontal-tether-closed-out-of-bounds horizontal-tether-closed-out-of-bounds-bottom horizontal-tether-closed-element-attached-top horizontal-tether-closed-target-attached-bottom horizontal-tether-open-element horizontal-tether-open-pinned horizontal-tether-open-pinned-left horizontal-tether-open-out-of-bounds horizontal-tether-open-out-of-bounds-bottom horizontal-tether-open-element-attached-top horizontal-tether-open-target-attached-bottom horizontal-tether-open-enabled']//div[@class='search-filters__price-container']//div[1]//div[1]//button[1]"));
		//f.click();
		action.click(f).build().perform();
		js.executeScript("window.scrollBy(0,560)");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement g = driver.findElement(By.xpath("//div[@id='search-filters-price-range-item-7']"));
		g.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement h = driver.findElement(By.xpath("//div[@class='horizontal-tether-closed-element horizontal-tether-closed-enabled horizontal-tether-closed-pinned horizontal-tether-closed-pinned-left horizontal-tether-closed-out-of-bounds horizontal-tether-closed-out-of-bounds-bottom horizontal-tether-closed-element-attached-top horizontal-tether-closed-target-attached-bottom horizontal-tether-open-element horizontal-tether-open-pinned horizontal-tether-open-pinned-left horizontal-tether-open-out-of-bounds horizontal-tether-open-out-of-bounds-bottom horizontal-tether-open-element-attached-top horizontal-tether-open-target-attached-bottom horizontal-tether-open-enabled']//div[@class='search-filters__price-container']//div[2]//div[1]//button[1]"));
		action.click(h).build().perform();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,560)");
		WebElement i1 = driver.findElement(By.xpath("//div[@id='search-filters-max-price-item-11']"));
		i1.click();
		js.executeScript("window.scrollBy(0,560)");
		WebElement j = driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div/div/div/input"));
		action.click(j).build().perform();
		js.executeScript("window.scrollBy(0,560)");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		j.sendKeys("28/01/2020");
		driver.switchTo().frame("_hjRemoteVarsFrame");
		js.executeScript("window.scrollBy(0,2000)");
		//WebElement j2 = driver.findElement(By.xpath("//li[@class='range-selector__item  is-selected is-last-selected']//input[@id='filter-Bedrooms-2']"));
		//j2.click();
		WebElement k = driver.findElement(By.xpath("//div[contains(text(),'See Results')]"));
		action.click(k).build().perform();
		js.executeScript("window.scrollBy(0,1000)");
		}

}
