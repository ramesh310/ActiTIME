package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScripit2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://actitime.jmr.co.za/actitime/login.do");
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@valign='absmiddle']")).click();
		String s=c1.getTitle();
		System.out.println(s);
		c1.findElement(By.className("logoutImg")).click();
		c1.close();
		}
}
