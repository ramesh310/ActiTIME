package ramesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomer
{
	@Test
	public void testCreateCustomer()
	{
		 System.setProperty("webdriver.chrome.driver", "C:/drivers/selenium/64bitAutomationSW/chromedriver.exe");
			ChromeDriver c1=new ChromeDriver();
			c1.get("http://laptop-bgv2ca0v:81/login.do");
			c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			c1.findElement(By.name("username")).sendKeys("admin");
			c1.findElement(By.name("pwd")).sendKeys("manager");
			c1.findElement(By.xpath("//input[@valign='absmiddle']")).click();
			c1.findElement(By.linkText("Projects & Customers")).click();
			c1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
			c1.findElement(By.name("name")).sendKeys("rishii");
			c1.findElement(By.name("createCustomerSubmit")).click();
			c1.findElement(By.className("logoutImg")).click();
	 }
}
