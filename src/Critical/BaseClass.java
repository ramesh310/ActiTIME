package Critical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass
{
	public static WebDriver driver;
	@BeforeTest
   public void OpenBrowser()
   {
	   String browser="chrome";
	   if(browser.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		   driver=new ChromeDriver();
	   }
	   else if(browser.equals("firefox"))
	   {
		   System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/geckodriver.exe");
		   driver=new FirefoxDriver();
	   }
	   driver.get("http://127.0.0.1:81/login.do");
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	@BeforeClass
	public void LoginBrowser()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@AfterClass
	public void LogoutBrowser()
	{
		driver.findElement(By.className("logoutImg")).click();
	}
}
