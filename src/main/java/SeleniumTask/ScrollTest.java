package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.shutterstock.com");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2200)");
		WebElement a = driver.findElement(By.xpath("//div[@class='v_i_i v_i_l']//div[2]//a[1]//div[2]//div[1]"));
		//js.executeScript("aruguments[0].scrollIntoView(true)",a);
		action.click(a).build().perform();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,800)");
		WebElement b = driver.findElement(By.xpath("//div[7]//div[1]//a[1]//img[1]"));
		action.click(b).build().perform();
		js.executeScript("window.scrollBy(0,800)");
		WebElement c = driver.findElement(By.xpath("//div[4]//div[1]//div[2]//div[1]//div[3]//div[1]//a[1]//img[1]"));
		action.click(c).build().perform();
		////div[4]//div[1]//div[2]//div[1]//div[4]//div[1]//a[1]//img[1]
		js.executeScript("window.scrollBy(0,800)");
		WebElement d = driver.findElement(By.xpath("//div[4]//div[1]//div[2]//div[1]//div[4]//div[1]//a[1]//img[1]"));
		action.click(d).build().perform();
		////a[@class='o_button_theme_toggle o_button_theme_button oc_z_b b_A_a b_A_I b_A_J o_button_theme_neutral b_A_b oc_z_c b_A_j oc_z_e b_A_f']
		WebElement e = driver.findElement(By.xpath("//a[@class='o_button_theme_toggle o_button_theme_button oc_z_b b_A_a b_A_I b_A_J o_button_theme_neutral b_A_b oc_z_c b_A_j oc_z_e b_A_f']"));
		action.click(e).build().perform();
		
	}
	

}
