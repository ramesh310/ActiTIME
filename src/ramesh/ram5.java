package ramesh;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ram5
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
	 c1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
	 c1.findElement(By.name("name")).sendKeys("rakesh");
	 c1.findElement(By.linkText("Open Tasks")).click();
	 String s=c1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).getAttribute("value");
	 System.out.println(s);
	 String s1=c1.findElement(By.xpath("//input[@value='Remain on the Page']")).getAttribute("value");
	 System.out.println(s1);
	 c1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).click();
	 c1.findElement(By.xpath("//img[@alt='Logout']")).click();
	 c1.close();
 }
}
