package Sample3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInLogOut 
{
@Test
public void testLogInLogOut()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	String s = driver.getTitle();
	System.out.println(s);
}
}
