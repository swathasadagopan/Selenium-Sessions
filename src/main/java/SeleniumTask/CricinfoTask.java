package SeleniumTask;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19430/scorecard/1187009/india-vs-south-africa-3rd-test-icc-world-test-championship-2019-2021");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//utilTask u = new utilTask(driver);
		//String wicket =u.getwicket("R Ashwin");
		//System.out.println("Wicket :"+wicket);
		
		//utilTask u1 = new utilTask(driver);
		//List<WebElement> score=u1.getscore("R Ashwin");
		//System.out.println("Scores : "+score);
		
		//utilTask u2 = new utilTask(driver);
		//u2.getfullscore();
	
	
		List<WebElement> score = driver.findElements(By.xpath("//div[@class='scorecard-section batsmen']//a[@name='&lpos=cricket:game:scorecard:player']"));
		System.out.println(score.size());
		for(int i=0;i<score.size();i++)
		{
			System.out.println(score);
			utilTask u3 = new utilTask(driver);
			u3.getscoreboard(driver,score.get(i).getText());
		}
	}
}
