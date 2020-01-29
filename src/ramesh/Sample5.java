package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample5
{

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("http://laptop-bgv2ca0v:81/login.do");
		 c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@valign='absmiddle']")).click();
		c1.findElement(By.cssSelector("input[value = 'Add New Tasks']")).click();
		 WebElement w1=c1.findElement(By.name("customerId"));
			Select s1= new Select(w1);
			s1.selectByIndex(2);
			WebElement w2= c1.findElement(By.name("projectId"));
			Select s2= new Select(w2);
			s2.selectByIndex(1);
			c1.findElement(By.name("task[0].name")).sendKeys("Automation");
			WebElement w3=c1.findElement(By.name("task[0].billingType"));
			Select s3= new Select(w3);
			s3.selectByIndex(1);
			c1.findElement(By.cssSelector("input[value='Create Tasks']")).click();
			c1.findElement(By.className("logoutImg")).click();
			c1.close();
			
		
	}
}
