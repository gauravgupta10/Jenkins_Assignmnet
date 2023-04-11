


	import java.util.List;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Action;


	public class Sques1 {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			 driver.manage().window().maximize();
			//-----------------------Ftech popup text------------//
			  driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
			  Alert s=driver.switchTo().alert();
			  System.out.println(s.getText());
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  s.accept();
			  //--------------------Dismiss of alert----------//
			  driver.findElement(By.xpath("//input[@id=\"confirmbtn\"]")).click();
//			  try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			//}
			  s.dismiss();
			  
			  //--------------------Dismiss of alert----------//
			  driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Gaurav Gupta");
			  driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
			  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  s.accept();
			  
			
		}


	}







