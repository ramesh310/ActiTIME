package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6
{
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("http://laptop-bgv2ca0v:81/login.do");
		 c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@valign='absmiddle']")).click();
		c1.findElement(By.linkText("Settings")).click();
		c1.findElement(By.cssSelector("input[ value = 'Add New Billing Type']")).click();
		c1.findElement(By.name("name0")).sendKeys("pink");
		c1.findElement(By.cssSelector("input[ value = 'Create Billing Type(s)']")).click();
		c1.findElement(By.linkText("Projects & Tasks")).click();
		c1.findElement(By.cssSelector("input[value = 'Add New Tasks']")).click();
		c1.findElement(By.name("task[0].billingType")).click();
		try
		{
			c1.findElement(By.className("listtblcolheader")).isDisplayed();
			System.out.println("integration test is pass");
		}
		catch(Exception ref)
		{
			System.out.println("integration test is fail");
			
		}
		
		
		

	}
}