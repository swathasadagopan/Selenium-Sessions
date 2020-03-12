package SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saphysiotherapy.com/index.html");
		Thread.sleep(3000);
		String t = driver.getTitle();
		System.out.println(t);
		//driver.close();
		//System.out.println(driver.getTitle());

	}

}
