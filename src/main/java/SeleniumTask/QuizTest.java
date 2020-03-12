package SeleniumTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuizTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://playquiz2win.com/quiz/gk-for-kids/general_knowledge_for_kids.html
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://playquiz2win.com/quiz/gk-for-kids/general_knowledge_for_kids.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		 js.executeScript("window.scrollTo(0,536)");
		WebElement a = driver.findElement(By.xpath("//a[contains(text(),'General Knowledge SET - 1')]"));
		//a.click();
		action.click(a).build().perform();
		 js.executeScript("window.scrollTo(0,436)");
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 //QUESTION - 1
		 WebElement b = driver.findElement(By.xpath("//section[@id='content']/div/div/div/div/div/form/p/input[2]"));
		 b.click();
		 ////form//input[@name='answer[2]'][2]
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 //QUESTION - 2
		 WebElement c = driver.findElement(By.xpath("//form//input[@name='answer[2]'][2]"));
		 c.click();
		 js.executeScript("window.scrollTo(0,936)");
		 WebElement d = driver.findElement(By.xpath("//form//input[@name='answer[3]'][4]"));
		 d.click();	
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 WebElement e = driver.findElement(By.xpath("//form//input[@name='answer[4]']"));
		 e.click();
		 
		 WebElement f = driver.findElement(By.xpath("//form//input[@name='answer[5]'][3]"));
		 f.click();
		 js.executeScript("window.scrollTo(0,936)");
		 WebElement g = driver.findElement(By.xpath("//form//input[@name='answer[6]']"));
		 g.click();
		 
		
		 WebElement h = driver.findElement(By.xpath("//form//input[@name='answer[7]'][4]"));
		 h.click();
		 
		 WebElement i = driver.findElement(By.xpath("//form//input[@name='answer[8]'][3]"));
		 i.click();
		 
		 WebElement j = driver.findElement(By.xpath("//form//input[@name='answer[9]'][2]"));
		 j.click();
		 //js.executeScript("window.scrollTo(0,936)");
		 WebElement k = driver.findElement(By.xpath("//form//input[@name='answer[10]'][3]"));
		 k.click();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 js.executeScript("window.scrollTo(0,936)");
		
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 js.executeScript("window.scrollTo(0,936)");
		 WebElement l = driver.findElement(By.xpath("//button[@name='checkResult']"));
		 l.click();
	}

}
