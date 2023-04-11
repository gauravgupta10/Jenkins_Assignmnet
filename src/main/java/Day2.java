import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Day2 {
	private static WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	
	}
	@Test
	public void run()
	{
//		WebElement e1=driver.findElement(By.tagName("h2"));
//		System.out.println();
//		String text=e1.getText();
//		
//		Assert.assertEquals(text,"Register");
//		System.out.println(e1.getText());
//		WebElement e2=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
//		e2.isDisplayed();
//		WebElement e3=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
//		e3.isDisplayed();
//		WebElement e4=driver.findElement(By.xpath("//input[@placeholder=\"\"]"));
//		e4.isDisplayed();
		//driver.findElement(By.xpath().sendKeys("Gaurav");
		
		//driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Gaurav");
		//WebElement  e1=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		//String firstname=e1.getTagName();
		//driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Gupta");
		//WebElement ln=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		//String lastname=ln.getTagName();
		//Assert.assertEquals(firstname,"Gaurav","firstname not matched");
		//Assert.assertEquals(lastname,"Gupta","last name not matched");
		
	}
	@Test
	public void run1()
	{
		
	}
	@AfterMethod
	public void closeBrowser()
	{
	 //driver.close();	
	}
	

	
}
