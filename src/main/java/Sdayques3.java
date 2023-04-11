import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Sdayques3 {
	public static void main(String args[]) throws AWTException, InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.findElement(By.id("form-field-travel_from")).sendKeys("Indira Gandhi International Airport");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("form-field-travel_to")).sendKeys("Chandigarh Airport");
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		//travel day
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		//Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		//
		driver.findElement(By.id("form-field-travel_comp_date_between")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		//
		driver.findElement(By.id("form-field-travel_comp_airline")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		//
		driver.findElement(By.id("form-field-travel_comp_language")).click();
		for(int i=0;i<=3;i++)
		{
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		//Search
		driver.findElement(By.xpath("//button[@class=\"elementor-button elementor-size-sm\"]")).submit();
		//Screenshot
		TakesScreenshot scrShot=(TakesScreenshot)driver;
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 Thread.sleep(5000);
		 Files.copy(SrcFile, new File("demo1.png"));
		
		
		
	}

}
