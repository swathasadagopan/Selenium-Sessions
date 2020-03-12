package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwisnlTask {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		utilTask u = new utilTask(driver);
		u.getedit();
		//cut
		By locator1 = By.className("btn-neutral");
		By locator2 =By.className("context-menu-icon-cut");
		utilTask u1 = new utilTask(driver);
		u1.getcut(driver, locator1, locator2);
		
		By locator3 = By.className("btn-neutral");
		By locator4 =By.className("context-menu-icon-copy");
		//utilTask u2 =new utilTask(driver);
		utilTask.getcopy(driver, locator3, locator4);	
		By locator5 = By.className("btn-neutral");
		By locator6 =By.className("context-menu-icon-paste");
		utilTask.getpaste(driver, locator5, locator6);
		
		By locator7 = By.className("btn-neutral");
		By locator8 =By.className("context-menu-icon-delete");
		
		utilTask.getdelete(driver, locator7, locator8);

	}

}
