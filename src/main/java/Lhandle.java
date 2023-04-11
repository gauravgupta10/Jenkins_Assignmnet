import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lhandle {
	private static WebDriver driver;
		@BeforeMethod
		public void launch()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://demoqa.com/browser-windows");
			driver.manage().window().maximize();
		
		}
		@Test
		public void newTab()
		{
			driver.findElement(By.id("tabButton")).click();
			String whandles=driver.getWindowHandle();
			System.out.print(whandles);
			Set<String> allhandles=driver.getWindowHandles();
			System.out.println(allhandles);
			
			driver.switchTo().window(allhandles.stream().toList().get(1));
			String w=driver.findElement(By.id("sampleHeading")).getText();
			AssertJUnit.assertEquals(w,"This is a sample page");
		}
		@Test
		public void window() throws IOException
		{
			driver.findElement(By.id("windowButton")).click();
			String whandles=driver.getWindowHandle();
			//System.out.print(whandles);
			Set<String> allhandles=driver.getWindowHandles();
			//System.out.println(allhandles);
			
		 	driver.switchTo().window(allhandles.stream().toList().get(1));
			String s=driver.findElement(By.id("sampleHeading")).getText();
			AssertJUnit.assertEquals(s,"This is a sample page");
			TakesScreenshot src=((TakesScreenshot)driver);
			File srcfile=src.getScreenshotAs(OutputType.FILE);
			Files.copy(srcfile, new File("demo.png"));
			//
			TakesScreenshot src=((TakesScreenshot)driver);
			File srcfile=src.getScreenshotAs(OutputType.FILE)
			Files.copy(srcfile,new File("demo.pmng"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			
		}
		@Test
		public void iframe()
		{
			driver.findElement(By.id("aw0")).click();
		//	String iframe=driver.get
		}
		
		@AfterMethod
			public void closeBrowser()
			{
				driver.quit();
			}
		}
		


driver