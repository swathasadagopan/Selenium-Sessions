package SeleniumTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.saphysiotherapy.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
			
		Actions action = new Actions(driver);
		WebElement d = driver.findElement(By.xpath("//li[@class='dropdown megamenu']/a[contains(.,'Home')]"));
		action.moveToElement(d).build().perform();
		d.click();
		WebElement e = driver.findElement(By.xpath("//div[@class='dropdown']/button[contains(.,'BOOK NOW')]"));
		action.moveToElement(e).build().perform();
		e.click();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("//a[contains(.,'DARLINGTON')]"));
		action.moveToElement(e1).build().perform();
		e1.click();
		Thread.sleep(3000);
		WebElement f = driver.findElement(By.xpath("//button[@class='category-expand-toggle'][1]"));
		f.click();
		Thread.sleep(4000);
		WebElement g = driver.findElement(By.xpath("//ul[@id='collapsable-module-item-1']/li[6]/div/div[2]/button"));
		g.click();
		Thread.sleep(2000);
		WebElement h = driver.findElement(By.xpath("//section[@class='bookings-section--practitioner current']//ul[2]/li/ul/li/div/div[2]/button"));
		h.click();
		Thread.sleep(3000);
		for(int l=0;l<4;l++)
		{
		WebElement p = driver.findElement(By.xpath("//button[@class='button--datepicker-nav forward']"));
		p.click();
		Thread.sleep(2000);
		}
		
		List <WebElement> dates = driver.findElements(By.xpath("//table[@class='datepicker__day']//td"));
		int total = dates.size();
		System.out.println(total);
		
		for(int i=0;i<total;i++)
		{
			String date =dates.get(i).getText();
			System.out.println(date);
			if(date.equalsIgnoreCase("16"))
			{
				dates.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.xpath("//button[text()='3:00pm']"));
		w1.click();
		
		WebElement fn = driver.findElement(By.xpath("//input[@id='booking_patient_first_name']"));
		fn.sendKeys("Swatha");
		WebElement ln = driver.findElement(By.xpath("//input[@id='booking_patient_last_name']"));
		ln.sendKeys("S");
		Select select = new Select(driver.findElement(By.id("booking_date_of_birth_3i")));
		select.selectByVisibleText("7");
		//booking[date_of_birth(2i)]
		Select select1 = new Select(driver.findElement(By.id("booking_date_of_birth_2i")));
		select1.selectByVisibleText("Apr");
		Select select2 = new Select(driver.findElement(By.id("booking_date_of_birth_1i")));
		select2.selectByVisibleText("1992");
		Thread.sleep(2000);
		//booking_patient_email

		WebElement email = driver.findElement(By.id("booking_patient_email"));
		email.sendKeys("swatha007@gmail.com");
		//booking_patient_mobile_number

		WebElement number = driver.findElement(By.id("booking_patient_mobile_number"));
		number.sendKeys("0410094028");
		
		Thread.sleep(2000);
		
		WebElement notes = driver.findElement(By.id("booking_notes"));
		notes.sendKeys("Knee Pain");
		
		
	
}
}