import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sques4 {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
	//driver.findElements)
	driver.manage().window().maximize();
	//
	Actions action=new Actions(driver);
	WebElement from =driver.findElement(By.id("draggable"));
	WebElement to=driver.findElement(By.id("droppable"));
	System.out.println(to);
	//WebElement key=driver.findElement(By.className("row"));
	//action.keyDown("driver.findElement(By.className(\"row\"));").perform();
	action.dragAndDrop(from, to).perform();
	action.keyDown(Keys.CONTROL).build().perform();
	Thread.sleep(5000);
	driver.close();
//	String str=new String("gaurav");
	//String str1=new String("gaurav");
//	System.out.println(str.hashCode());
	
}
}
