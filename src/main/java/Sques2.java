import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sques2 {
	private static WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get( "https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	}
	@Test
	public void Button()
	{
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		 List<WebElement>li=driver.findElements(By.xpath("//div[@class=\"dropdownDiv\"]/ul/li"));
		 li.get(10).click();
		 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
		 driver.findElement(By.xpath("//*[contains(text(),\"Amritsar\")]")).click();
		
		
		
	}	
	@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}
}
//RObot r=new robot();
//r.keyPress(KeyEvent.VK_DOWN);
//r.keyPress(KeyEvent.VK_ENTER);
