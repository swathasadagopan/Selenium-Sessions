package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HycTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.haveyourchoice.com.au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement shop = driver.findElement(By.xpath("//span[contains(text(),'SHOP')]"));
		action.moveToElement(shop).build().perform();
		WebElement keyhold = driver.findElement(By.xpath("//span[contains(text(),'Key Holders')]"));
		keyhold.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,960)");
		WebElement keyselect = driver.findElement(By.xpath("//a[@id='key-holders-1']//i[contains(text(),'Quick View')]"));
		action.moveToElement(keyselect).build().perform();
		keyselect.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement extrakey = driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//form//div//div[contains(text(),'+')]"));
		extrakey.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement addcart = driver.findElement(By.xpath("//html//body//div//div//div//div//div//div//form//div//button[contains(text(),'Add to Cart')]"));
		addcart.click();
		WebElement continueshop = driver.findElement(By.xpath("//button[@class='btn continue-shopping']"));
		continueshop.click();
		js.executeScript("window.scrollBy(0,-960)");
		WebElement policy = driver.findElement(By.xpath("//span[text()='Our Policies']"));
		//action.moveToElement(policy).build().perform();
		action.click(policy).build().perform();
		//policy.click();
//		WebElement shop1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]"));
//		shop1.click();
//		//WebElement wall = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[5]/a[1]/span[1]"));
//		WebElement wall = driver.findElement(By.xpath("//div[@id='shopify-section-navigation']/div/div/nav/div/div/div/ul/li[2]/ul/li[5]/a/span"));
//		wall.click();

	}

}
