package ramesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ram4
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("http://laptop-bgv2ca0v:81/login.do");
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@valign='absmiddle']")).click();
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.linkText("ravi3")).click();
		c1.findElement(By.xpath("//input[@tabindex='20']")).click();
		c1.switchTo().alert().dismiss();
		c1.findElement(By.xpath("//input[@value='Archive This Customer']")).click();
		String s1=c1.switchTo().alert().getText();
		System.out.println(s1);
		c1.switchTo().alert().accept();
		c1.findElement(By.xpath("//img[@alt='Logout']")).click();
		c1.close();
	}
}
