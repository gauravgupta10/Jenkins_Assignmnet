
	import java.time.Duration;
import java.util.List;
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
	public class Relativepath {
	
		public static void main (String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			//driver.findElements)
			driver.manage().window().maximize();
		    driver.findElement(By.xpath("//*[contains(text(),\"Cera Sanitaryware L\")]")).click();
		  
		

}
	}
////*[contains(text(),"Cera Sanitaryware L")]
	//click().perform()
	//build().perform()
	//why we store in set of get.windowhandle return
	//hashcode print
	//page object model ,page factory
	//annotations in selenium
	//