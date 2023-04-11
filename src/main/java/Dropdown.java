

	import java.time.Duration;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.ElementClickInterceptedException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class Dropdown {
		public static void main (String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			WebDriverWait w=new WebDriverWait(driver,20);
			
		driver.get("https://demoqa.com/alerts");
			WebElement address= driver.findElement(By.xpath("select[@name=\"country\"]"));
			Select s=new Select(address);
	     	s.selectByVisibleText("INDIA");
////			s.selectByIndex(4);
			//driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		
//			driver.findElement(By.id("confirmButton")).click();
//			
//			Alert a=driver.switchTo().alert();
//			a.dismiss();
//			Thread.sleep(5000);
//			//driver.findElement(By.id("confirmButton")).click();
//			driver.findElement(By.id("alertButton")).click();
//		//	Thread.sleep(5000);
//			a.accept();
//		
//		//	driver.findElements(By.xpath("[@class=\"dataTable\"]/tbody/tr[3]/td[1]");
		}
	}
