package SeleniumTask;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\FinalSeleniumDrivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> h=driver.getWindowHandles();
		Iterator<String> it =h.iterator();
		String pid = it.next();
		System.out.println("ParentId: "+ pid);
		String ch1 = it.next();
		System.out.println("Child1id: " +ch1);
		
		driver.switchTo().window(ch1);
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(pid);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> h1=driver.getWindowHandles();
		Iterator<String> it1 =h1.iterator();
		String pid1 = it1.next();
		System.out.println("ParentId: "+ pid1);
		String ch2 = it1.next();
		System.out.println("Child1id: " +ch2);
		
		driver.switchTo().window(ch2);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
		
		driver.switchTo().window(pid1);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
		
		
	}
}

