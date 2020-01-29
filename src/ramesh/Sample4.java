package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4
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
		c1.findElement(By.cssSelector("input[value = 'Add New Customer']")).click();
		c1.findElement(By.name("name")).sendKeys("lahari");
		c1.findElement(By.linkText("Open Tasks")).click();
	   String s=c1.findElement(By.id("DiscardChangesButton")).getAttribute("value");
		System.out.println(s);
		String s1=c1.findElement(By.id("RemainOnThePageButton")).getAttribute("value");
		System.out.println(s1);
		 c1.findElement(By.cssSelector("input[value = 'Cancel Customer Creation and Proceed']")).click();
		 c1.findElement(By.className("logoutImg")).click();
		 c1.close();
		   
	   
	}

}
