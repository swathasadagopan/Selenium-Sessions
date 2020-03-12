package SeleniumTask;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GygTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.guzmanygomez.com.au/the-food/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//WebElement a = driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-11935 fusion-last-menu-item']//a[@class='fusion-top-level-link fusion-bar-highlight']//span[text()='ORDER NOW']"));
		WebElement a = driver.findElement(By.xpath("//li[@id='menu-item-11935']/a/span"));
		a.click();
		WebElement b = driver.findElement(By.xpath("//div//input[@id='search-input-field']"));
		b.sendKeys("glades");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		List<WebElement> c = driver.findElements(By.xpath("//ul[@role='listbox']//li[text()='Gladesville NSW, Australia']"));
		System.out.println(c.size());
		for(int i=0;i<c.size();i++)
		{
			String name=c.get(i).getText();
			if(name.contains("Gladesville NSW, Australia"))
			{
				c.get(i).click();
			}
		}
		WebElement d = driver.findElement(By.xpath("//li[@class='store-item ng-scope ng-isolate-scope selected']//button[@class='ng-scope'][contains(text(),'Order Now')] "));
		d.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement e = driver.findElement(By.xpath("//div[@class='menu-photo']//img[@src='https://apac03-mcui-prod.mfapdc.com/GYG_PROD/UIServices/Cache/183_Category_Small_Image_en-AU.jpg']"));
		e.click();
		WebElement f1 = driver.findElement(By.xpath("//form[@id='product-267']//a[text()='customise']"));
		f1.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement f2 = driver.findElement(By.xpath("//div[@class='col-12 extras-panel active']//label[text()='Add Guacamole $2.00']"));
		f2.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement f3 = driver.findElement(By.xpath("//div[@class='col-12 extras-panel active']//label[text()='Add Coriander']"));
		f3.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement f4 = driver.findElement(By.xpath("//form[@id='product-267']/div[5]/div/div/label[11]"));
		f4.click();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		
//		WebElement f = driver.findElement(By.xpath("//form[@id='product-1332']//div[@class='row']//div[@class='select-container select-quantity ng-scope']//select[@class='ng-pristine ng-valid']//option[@label='3']"));
//		f.click();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		WebElement g = driver.findElement(By.xpath("//form[@id='product-1332']//div[@class='col-12']//button[text()='Add to order'][1]"));
//		g.click();
//		WebElement g1 = driver.findElement(By.xpath("//form[@id='product-1808']//div[@class='col-12']//button[text()='Add to order'][1]"));
//		g1.click();
//		Actions action = new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//		WebElement h = driver.findElement(By.xpath("//a[contains(text(),'Checkout')]"));
//		//WebElement h = driver.findElement(By.xpath("//div[@id='homepage']/div[2]/div[4]/div/ng-include/div/a"));
//		//h.click();
//		action.moveToElement(h).click().build().perform();
//	
//		
	}
	
	

}
