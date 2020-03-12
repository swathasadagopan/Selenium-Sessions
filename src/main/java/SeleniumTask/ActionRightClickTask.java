package SeleniumTask;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionRightClickTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement e = driver.findElement(By.className("btn-neutral"));
		action.contextClick(e).build().perform();
		WebElement copy =driver.findElement(By.className("context-menu-icon-copy"));
		copy.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		//edit
		WebElement x = driver.findElement(By.className("btn-neutral"));
		action.contextClick(x).build().perform();
		WebElement edit =driver.findElement(By.className("context-menu-icon-edit"));
		edit.click();
		Alert e1 = driver.switchTo().alert();
		e1.accept();
		//cut
		WebElement y = driver.findElement(By.className("btn-neutral"));
		action.contextClick(y).build().perform();
		WebElement cut =driver.findElement(By.className("context-menu-icon-cut"));
		cut.click();
		Alert c1 = driver.switchTo().alert();
		c1.accept();
		
		//paste
		WebElement paste =driver.findElement(By.className("context-menu-icon-paste"));
		paste.click();
		Alert p1 = driver.switchTo().alert();
		p1.accept();
		
		//delete
		WebElement delete =driver.findElement(By.className("context-menu-icon-delete"));
		delete.click();
		Alert d1 = driver.switchTo().alert();
		d1.accept();
		
		
	//quit
		WebElement quit =driver.findElement(By.className("context-menu-icon-quit"));
		quit.click();
		Alert q1 = driver.switchTo().alert();
		q1.accept();
		

	}

}
