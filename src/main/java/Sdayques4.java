import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Sdayques4 {
	private static WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
		driver.get("https://www.tothenew.com/");
		driver.manage().window().maximize();
		//Scroll
		//WebElement d=driver.findElement(By.xpath("//body[@class=\"layout-no-sidebars node-9 eu-cookie-compliance-status-null eu-cookie-compliance-popup-open\"]"));
		//Actions act=new Actions(driver);

	}
	
	@Test(priority=1)
	public void downScroll()
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	@Test(priority=2,dependsOnMethods=("downScroll"))
	public void upScroll() throws InterruptedException
	{
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act1.sendKeys(Keys.PAGE_UP).build().perform();
	}
	
	@AfterMethod
	public void Close()
	{
		//driver.close();
	}
}

