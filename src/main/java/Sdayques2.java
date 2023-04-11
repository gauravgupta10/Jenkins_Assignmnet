import org.testng.annotations.Test;
import org.testng.Assert;
//import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Sdayques2 {
private static WebDriver driver;
@BeforeMethod
		public void  launch()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(" https://www.tothenew.com/ ");
		driver.manage().window().maximize();
		}
		// TODO Auto-generated method stub
@Test
		public void find() throws InterruptedException
		{
		WebElement service=driver.findElement(By.xpath("(//a[@id='h-Services'])[2]"));
		Actions as=new Actions(driver);
		as.moveToElement(service).perform();
		Thread.sleep(2000);
//
		 String li=driver.findElement(By.xpath("(//*[@id=\"menu\"]/ul/li[2]/ul)[2]")).getText();
		 Thread.sleep(2000);
		 //
		 Assert.assertTrue(li.contains("Digital Engineering"));
		 Assert.assertTrue(li.contains("Cloud & DevOps"));
		 Assert.assertTrue(li.contains("OTT Solutions & Services"));
		 Assert.assertTrue(li.contains("Data & Analytics"));
		 Assert.assertTrue(li.contains("CX, Content & Commerce"));
		 Assert.assertTrue(li.contains("Digital Marketing"));
		 
		 }
@AfterMethod
		public void close()
		{
		driver.quit();
		}

}
