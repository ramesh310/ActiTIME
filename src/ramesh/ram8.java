package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ram8
{
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c=new ChromeDriver();
		 c.get("http://laptop-bgv2ca0v:81/login.do");
		c.findElement(By.name("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//input[@valign='absmiddle']")).click();
		String s=c.getTitle();
		System.out.println(s);
	}
}
