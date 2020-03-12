package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShutterStock {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.shutterstock.com/?kw=photo%20website&gclid=EAIaIQobChMI7oCyvceh5gIVQXZgCh27vAK2EAAYASAAEgIvPfD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//a[text()='Images']"));
		action.moveToElement(a).build().perform();
		WebElement b = driver.findElement(By.xpath("//li//span[text()='All categories'][1]"));
		b.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement c = driver.findElement(By.xpath("//div[@class='o_card_theme_card oc_r_z b_j_u v_B_g v_i_a v_t_a oc_r_O b_j_r oc_r_aa b_j_t'][14]"));
		c.click();
		WebElement d = driver.findElement(By.xpath("//div[@class='o_card_theme_card oc_r_z b_j_u v_B_g v_t_a P_c_a oc_r_O b_j_r oc_r_aa b_j_t'][3]"));
		d.click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		 js.executeScript("window.scrollTo(0,1080)");
//		 js.executeScript("window.scrollTo(0,2416)");
//		 js.executeScript("window.scrollTo(0,2783)");
//		 js.executeScript("window.scrollTo(0,3517)");
		//WebElement e = driver.findElement(By.xpath("//a[contains(.,'Back to school vector characters background template with funny education cartoon mascots like pencil and book and white space for text. Vector illustration.')]"));
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Cartoon faces expressions vector set')]"));	
		 //	+ "//a[contains(@href, 'https://www.shutterstock.com/image-vector/back-school-vector-characters-background-template-1086095453')])[2]"));
		//action.moveToElement(e,80, 50).perform();
		action.click(e).build().perform();
		WebElement f = driver.findElement(By.xpath("//button[text()='Log in']"));
		f.click();
	}

}
