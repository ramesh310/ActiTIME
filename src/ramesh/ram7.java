package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ram7
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("https://parabank.parasoft.com/parabank/index.htm");
		 c1.findElement(By.name("username")).sendKeys("abcdef");
		 c1.findElement(By.name("password")).sendKeys("12345678");
		 c1.findElement(By.xpath("//input[@value='Log In']")).click();
		 c1.findElement(By.linkText("Update Contact Info")).click();
		 c1.findElement(By.name("customer.firstName")).sendKeys("mahi");
		 c1.findElement(By.name("customer.lastName")).sendKeys("reddi");
		 c1.findElement(By.name("customer.address.street")).sendKeys("1/5-300, srinagar colony");
		 c1.findElement(By.name("customer.address.city")).sendKeys("hyderbadi"); 
		 c1.findElement(By.name("customer.address.state")).sendKeys("andhra");
		 c1.findElement(By.name("customer.address.zipCode")).sendKeys("500014");
		 c1.findElement(By.name("customer.phoneNumber")).sendKeys("12345678");
		 c1.findElement(By.xpath("//input[@value='Update Profile']")).click();
		 c1.findElement(By.linkText("Log Out")).click();
		 c1.close();
	}
}
