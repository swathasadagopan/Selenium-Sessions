package SeleniumTask;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilTask {
	 WebDriver driver;	
	public utilTask(WebDriver driver) {
		this.driver=driver;
		}
	public void getLink() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement a=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		action.moveToElement(a).build().perform();
		System.out.println(driver.getTitle());
		Actions action1 = new Actions(driver);
		WebElement b= driver.findElement(By.cssSelector("#smoothmenu1 > ul > li:nth-child(14) > ul > li:nth-child(2) > a"));
		action1.moveToElement(b).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,50);
		WebElement ml=wait.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Member Login"))));
		ml.click();
		System.out.println(driver.getTitle());
	}
	public void getedit() {
		Actions action = new Actions(driver);
		WebElement x = driver.findElement(By.className("btn-neutral"));
		action.contextClick(x).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,70);
		WebElement edit =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("context-menu-icon-edit")));
		edit.click();
		Alert e1 = driver.switchTo().alert();
		e1.accept();
		System.out.println("edit : " +driver.getTitle());
		
	}
	public WebElement getcut(WebDriver driver,By locator1,By locator2) {
		Actions action = new Actions(driver);
		//WebElement x = driver.findElement(By.className("btn-neutral"));
		WebElement x = driver.findElement(locator1);

		action.contextClick(x).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,120);
		WebElement cut =wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
		cut.click();
		Alert e1 = driver.switchTo().alert();
		e1.accept();
		System.out.println("cut : " +driver.getTitle());
		return cut;
		
	}
	public static WebElement getcopy(WebDriver driver,By locator1,By locator2) {
		Actions action = new Actions(driver);
		WebElement x = driver.findElement(locator1);
		action.contextClick(x).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,100);
		WebElement copy =wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
		copy.click();
		Alert e1 = driver.switchTo().alert();
		e1.accept();
		System.out.println("copy : " +driver.getTitle());
		return copy;
		}
	public static WebElement getpaste(WebDriver driver,By locator1,By locator2) {
		Actions action = new Actions(driver);
		WebElement x = driver.findElement(locator1);
		action.contextClick(x).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,100);
		WebElement paste =wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
		paste.click();
		Alert e1 = driver.switchTo().alert();
		e1.accept();
		System.out.println("paste : "+driver.getTitle());
		return paste;
	}
	public static WebElement getdelete(WebDriver driver,By locator1,By locator2) {
		Actions action = new Actions(driver);
		WebElement x = driver.findElement(locator1);
		action.contextClick(x).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,100);
		WebElement delete =wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
		delete.click();
		Alert e1 = driver.switchTo().alert();
		e1.accept();
		System.out.println("Delete : "+driver.getTitle());
		return delete;
	}
	
	public String getwicket(String contact) {
		String w1=driver.findElement(By.xpath("//a[contains(text(),'"+contact+"')]//parent::div//following-sibling::"
				+ "div[@class='cell commentary']")).getText();
		return w1;
		
	}
		
	public List<WebElement> getscore(String player) {
		List<WebElement> scorelist = driver.findElements(By.xpath("//a[contains(text(),'"+player+"')]"
				+ "//parent::div//following-sibling::div[@class='cell runs']"));
		for(int i=0;i<scorelist.size();i++)
		{
		 String s=scorelist.get(i).getText();
		 System.out.print(s);
	
		 	}
		return scorelist;

	}
	public void getfullscore() {
		List<WebElement> score = driver.findElements(By.xpath("//div[@class='scorecard-section batsmen']//a[@name='&lpos=cricket:game:scorecard:player']"));
		for(int i=0;i<score.size();i++)
		{
			//String s =score.get(i).getText();
			System.out.println();
			getscoreboard(driver,score.get(i).getText());
		}
		
	}
	public void getscoreboard(WebDriver driver,String player1) {
		List<WebElement> scorelist = driver.findElements(By.xpath("//a[contains(text(),'"+player1+"')]"
				+ "//parent::div//following-sibling::div[@class='cell runs']"));
		if(player1.length() <= 8)
		{
			System.out.print(player1 + "\t" + "\t");
			}
		else
		{
			System.out.print(player1 + "\t");
		}
		for(int i=0;i<scorelist.size();i++)
		{
		 System.out.print(scorelist.get(i).getText() + "\t");
		}
		
			}
	public void getclinicutil()
	{
		Actions action = new Actions(driver);
		WebElement e =driver.findElement(By.className("dropdown-toggle"));
		action.moveToElement(e).build().perform();
		WebElement e1 = driver.findElement(By.linkText("Services"));
		action.moveToElement(e1).build().perform();
		
	}
		
	}
	

