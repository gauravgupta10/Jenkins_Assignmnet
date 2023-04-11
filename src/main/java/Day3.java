import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Day3 {
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
	public void Test1() throws IOException
	{
//	WebElement wbel=driver.findElement();
//		JavascriptExecutor d=(JavascriptExecutor)driver;
//		d.executeScript("argument[0].click();",wbel);
	
	//TakesScreenshot scrShot=(TakesScreenshot)driver;
	// File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	// File DestFile=new File();
	// Files.copy(SrcFile, new File("demo.png"));
	 
	}
	@AfterMethod
	public void browerclose()
	{
		driver.close();
	}
		
	
}


