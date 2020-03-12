package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.id("txtUsername"));
		a.sendKeys("opensourcecms");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement b = driver.findElement(By.id("txtPassword"));
		b.sendKeys("opensourcecms");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement c = driver.findElement(By.id("btnLogin"));
		c.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement c1 = driver.findElement(By.xpath("//a//span[text()='PIM']"));
		Actions action = new Actions(driver);
		action.moveToElement(c1).build().perform();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement c2 = driver.findElement(By.xpath("//a//span[text()='Add Employee']"));
		//action.moveToElement(c2).build().perform();
		c2.click();
//		driver.switchTo().frame(0);
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//		WebElement c0 = driver.findElement(By.id("btnAdd"));
//		c0.click();
//		WebElement d = driver.findElement(By.xpath("//div[@id='formcontent']//input[@id='empsearch_employee_name_empName']"));
//		d.sendKeys("Mithran");
//		WebElement e = driver.findElement(By.id("empsearch_supervisor_name"));
//		e.sendKeys("Sathyan");
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		WebElement f = driver.findElement(By.id("empsearch_id"));
//		f.sendKeys("101");
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		WebElement g = driver.findElement(By.id("empsearch_termination"));
//		Select select = new Select(g);
//		select.selectByVisibleText("Current and Past Employees");
		
	}

}
