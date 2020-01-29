package Sample3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateCustomer
{
	@Test
	public void testCreateCustomer()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String s = driver.getTitle();
		System.out.println(s);
	}
}
