import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demoselenium {
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,60);
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//driver.findElement(By.id("firstName")).sendKeys("Gaurav");
		//System.out.println(driver.getTitle());
		//driver.findElement(By.className("practice-form-wrapper"));
		//driver.findElement(By.cssSelector("input#firstName[type=\"text\"]")).sendKeys("Gaurav");
		WebElement fname=driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		w.until(ExpectedConditions.visibilityOf(fname));
		fname.sendKeys("Gaurav");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("gupta");
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("gaurav.gupta7@tothenew.com");
		driver.findElement(By.xpath("//label[@ for=\"gender-radio-1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("6393932756");
		driver.findElement(By.xpath("//label[@ for=\"hobbies-checkbox-2\"]")).click();
	//	Wait wait =new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(5,TimeUnit.SECONDS).ignoring(ElementClickInterceptedException.class);
		
		//Thread.sleep(5000);
		//driver.close();
		
		
		
		
	}

}
