import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class Sassignment1 {
	public static void main(String args[])
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver wd=new ChromeDriver();
//		//wd.get("https://www.tothenew.com/contact-us");
//		wd.get("https://www.tothenew.com/");
//		wd.manage().window().maximize();
//		//wd.findElement(By.xpath("//a[@id=\"h-contact-us\"]")).click();
//		//wd.findElement(By.id("h-contact-us")).click();
//		//Another step
//		wd.navigate().to("https://www.tothenew.com/contact-us");
//		System.out.println(wd.getCurrentUrl());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("chrome://new-tab-page");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 Shadow shadow = new Shadow(driver);
		 shadow.findElementByXPath("//input[@id=\"input\"]").sendKeys("gaurav");
		 
		
	}

}