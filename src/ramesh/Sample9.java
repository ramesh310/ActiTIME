package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("https://parabank.parasoft.com/parabank/index.htm");
		 c1.findElement(By.name("username")).sendKeys("admin");
		 c1.findElement(By.name("password")).sendKeys("manager");
		 c1.findElement(By.className("button")).click();
	}
}
