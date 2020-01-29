package Sample7;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 
{
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("file:///D:/anu/pgrm1.html");
		 driver.findElement(By.xpath("//input[@placeholder='firstname']")).sendKeys("ram");
		 driver.findElement(By.xpath("//input[@placeholder='lastname']")).sendKeys("reddy");
		 driver.findElement(By.linkText("actiTIME")).click();
		  ArrayList<String> a1 =new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(a1.get(1));
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.switchTo().window(a1.get(0));
		 driver.findElement(By.xpath("//input[@placeholder='mobile']")).sendKeys("123456");
		 driver.switchTo().window(a1.get(1));
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
	}
}
