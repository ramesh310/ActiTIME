package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ram3
{
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("http://laptop-bgv2ca0v:81/login.do");
		 c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@valign='absmiddle']")).click();
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).click();
		String s=c1.switchTo().alert().getText();
		System.out.println(s);
		c1.switchTo().alert().accept();
		
	}
}
