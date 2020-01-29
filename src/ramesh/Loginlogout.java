package ramesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginlogout 
{
	public static WebDriver driver;
	@Test
 public void testLoginlogout()
 {
	 System.setProperty("webdriver.chrome.driver", "C:/drivers/selenium/64bitAutomationSW/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://laptop-bgv2ca0v:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@valign='absmiddle']")).click();
		driver.findElement(By.xpath("//img[@alt='Logout']")).click();
		Assert.assertTrue(false);
 }
}
