package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgrm1
{
 public static void main(String[] args)
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
 }
}
