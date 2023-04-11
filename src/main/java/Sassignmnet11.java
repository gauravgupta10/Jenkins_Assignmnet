import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sassignmnet11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Gaurav");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Gupta");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Noida Sector 40");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("gaurav123@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("6393932746");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("firstpassword")).sendKeys("gaurav@123");
		driver.findElement(By.id("secondpassword")).sendKeys("gaurav@123");
		
		WebElement Skills =driver.findElement(By.xpath("//select[@ng-model=\"Skill\"]"));
		Select s=new Select(Skills);
		s.selectByVisibleText("Android");
		//s.se
		//
		
		//
		WebElement Country=driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select s1=new Select(Country);
		s1.selectByVisibleText("India");
		//
		WebElement Languages=driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
		Languages.click();
		
		WebElement englishLanguageOption=driver.findElement(By.xpath("//a[text()=\"English\"]"));
		englishLanguageOption.click();
		
		//
		WebElement Year=driver.findElement(By.xpath("//select[@ng-model=\"yearbox\"]"));
		Select s2=new Select(Year);
		s2.selectByVisibleText("2001");
		//
		WebElement Month =driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		Select s3=new Select(Month);
		s3.selectByVisibleText("August");
		//
		WebElement Day =driver.findElement(By.xpath("//select[@ng-model=\"daybox\"]"));
		Select s4=new Select(Day);
		s4.selectByVisibleText("10");
		//
		driver.findElement(By.id("submitbtn")).click();
		
		//Thread.sleep(2000);
		//driver.findElement(By.id("Button1")).click();
		if(driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected())
				{
				System.out.println("True");
				}
		if(driver.findElement(By.tagName("h1")).getText().equals("Automation Demo Site"))
		{
			System.out.println("valid header");
		}
		if(driver.getTitle().equals("Register"))
		{
			System.out.println("Valid title");
		}
		
		


	}

}
