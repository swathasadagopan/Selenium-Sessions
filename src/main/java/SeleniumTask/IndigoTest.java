package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndigoTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://www.goindigo.in/?cid=Search|Google|Brand|Brand_New|Indigowebaddress|01&gclid=CjwKCAiA_MPuBRB5EiwAHTTvMSWyBs-1sjcN5ARCE-tFe8tqcjNAvZL56q_F8IhhCVDhcvfGzyCzMxoCFP0QAvD_BwE");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		Actions action = new Actions(driver);
		WebElement a =driver.findElement(By.xpath("//label[text()='Round Trip']"));
		action.click(a).build().perform();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement b=driver.findElement(By.xpath("//div[@id='bookFlightTab']//form//div[@class='or-tab-content trip-tab-content']//div[@class='autocomplete-wrapper station-wrapper']"));
		action.click(b).build().perform();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		WebElement c = driver.findElement(By.xpath("//div[@data-name='Hyderabad']"));
		action.click(c).build().perform();
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
//		WebDriverWait wait = new WebDriverWait(driver,50);
//		WebElement m1=wait.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("By.xpath(\"//div[@class='autocomplete-result station-result \"\r\n" + 
//				"			+ \"clearfix airport-item pop-dest-stn selected']//div[@class='airport-city']\"\r\n" + 
//				"			+ \"[contains(text(),'Bengaluru, India')]\"));"))));
//		//ml.click();
//		action.click(m1).build().perform();
	
		WebElement e = driver.findElement(By.xpath("//div[@class='autocomplete-result station-result "
			+ "clearfix airport-item pop-dest-stn selected']//div[@class='airport-city']"
			+ "[contains(text(),'Bengaluru, India')]"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		action.click(e).build().perform();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement f = driver.findElement(By.xpath("//input[@name='passenger']"));
		action.click(f).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement g = driver.findElement(By.xpath("//div[@id='bookFlightTab']/form/div[5]/div/div[2]/ul/li/div/button[2]/span"));
		for(int i=1;i<=4;i++)
		{
			action.click(g).build().perform();	
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement g1= driver.findElement(By.xpath("//button[contains(.,'Done')]"));
		action.click(g1).build().perform();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement h = driver.findElement(By.xpath("//select[@class='form-control bw-currency-list']"));
		Select select = new Select(h);
		select.selectByVisibleText("Singapore Dollar");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement i = driver.findElement(By.xpath("//div[@id='bookFlightTab']/form/div[7]/div/label/label"));
		action.click(i).build().perform();
		
				}

}
