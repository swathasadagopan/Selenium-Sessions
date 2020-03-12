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

public class IrctcTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement from = driver.findElement(By.xpath("//p-autocomplete[@id='origin']/span/input"));
		from.sendKeys("TIRUCHCHIRAPALI - TPJ");
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		action.moveToElement(from).build().perform();
		
		WebElement to = driver.findElement(By.xpath("//p-autocomplete[@id='destination']/span/input"));
		to.sendKeys("COIMBATORE JN - CBE");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		action.moveToElement(to).build().perform();
		////button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c14-6 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement date1 = driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c14-6 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']"));
		date1.click();
//		List <WebElement> dates = driver.findElements(By.xpath("//table[@class='datepicker__day']//td"));
//		int total = dates.size();
//		System.out.println(total);
//		
//		for(int i=0;i<total;i++)
//		{
//			String date =dates.get(i).getText();
//			System.out.println(date);
//			if(date.equalsIgnoreCase("16"))
//			{
//				dates.get(i).click();
//				break;
//			}
//		}
		
		
//		List<WebElement> date2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c14-6 ng-star-inserted']//tbody"));
//		int total = date2.size();
//		System.out.println("total:"+total);
//		
//		for(int i=0;i<total;i++)
//		{
//			String date =date2.get(i).getText();
//			System.out.println(date);
//			if(date.equalsIgnoreCase("26"))
//			{
//				date2.get(i).click();
//				break;
//			}
//		}
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement g = driver.findElement(By.xpath("//input[@class='ng-tns-c14-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
		g.sendKeys(Keys.CONTROL + "a");
		g.sendKeys(Keys.DELETE);
		g.sendKeys("25-12-2019");
		g.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		WebElement date3 = driver.findElement(By.xpath("//div[@class='ng-tns-c13-19 ui-dropdown ui-widget ui-state-default ui-corner-all ui-helper-clearfix']//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right']"));
		//date3.click();
		action.click(date3).build().perform();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement date4 =driver.findElement(By.xpath("//li[@class='ng-tns-c13-19 ui-dropdown-item ui-corner-all ng-star-inserted']/span[text()='2']"));
		action.click(date4).build().perform();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Select select1 = new Select(driver.findElement(By.xpath("//form/select")));
		select1.selectByVisibleText("Second Sitting (2S)");
		
		
	}
	
	
	

}
