package Revision;

import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

import java.awt.Desktop.Action;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Seleniumrevision {
	public static WebDriver driver;
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 Shadow shadow = new Shadow(driver);
		 shadow.findElementByXPath("//input[@id=\"input\"]").sendKeys("gaurav");
		 
		
	}
//	@Test
//	public void register()
//	{
//		WebElement element=driver.findElement(By.xpath("//img[@alt=\"QKart-icon\"]"));
//		Assert.assertTrue(element.isDisplayed());
//		//
//		WebElement register=driver.findElement(By.xpath("//h2[@class=\"title\"]"));
//		Assert.assertEquals(register.getText(),"Register");
//		//
//		
//	}
//	
//	//@Test
//	//public void Valusername()
//	{
//		WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));
//		Assert.assertTrue(username.isDisplayed());
//	}
//	@Test
//	//public void passWord()
//	{
//		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
//		Assert.assertTrue(password.isDisplayed());
//	}
//	@Test
//	public void button()
//	{
//		WebElement button=driver.findElement(By.xpath("(//button)[2]"));
//		Assert.assertTrue(button.isDisplayed());
//	}
//	@Test
//	public void text()
//	{
//		WebElement displaytext=driver.findElement(By.xpath("//*[contains(text(),\"Already have an account?\")]"));
//		Assert.assertEquals(displaytext.getText(), "Already have an account? Login here");
//		System.out.println(displaytext.getText());
//		
//	}
//	@Test
//	public void Emptyfill() throws InterruptedException
//	{
//		driver.findElement(By.id("username")).sendKeys("Gaurav");
//		WebElement pas=driver.findElement(By.id("password"));
//		driver.findElement(By.id("confirmPassword"));
//		WebElement bt=driver.findElement(By.xpath("(//button)[2]"));
////		Alert at=driver.switchTo().alert();
////		at.getText();
////	//Action class
//
//		Actions builder = new Actions(driver);
//		builder.moveToElement(pas).click().build().perform();
//		Thread.sleep(1000);
//		
//		
//		
//		}
//	
//	@AfterMethod
//	public void close()
//	{
//	//	driver.quit();
//	}
}
