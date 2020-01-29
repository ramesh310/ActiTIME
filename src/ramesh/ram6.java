package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ram6 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("https://parabank.parasoft.com/parabank/index.htm");
		 c1.findElement(By.linkText("Register")).click();
		 c1.findElement(By.name("customer.firstName")).sendKeys("ram");
		 c1.findElement(By.name("customer.lastName")).sendKeys("reddy");
		 c1.findElement(By.name("customer.address.street")).sendKeys("1/5-30, srinagar colony");
		 c1.findElement(By.name("customer.address.city")).sendKeys("hyderbad"); 
		 c1.findElement(By.name("customer.address.state")).sendKeys("telangana");
		 c1.findElement(By.name("customer.address.zipCode")).sendKeys("500013");
		 c1.findElement(By.name("customer.phoneNumber")).sendKeys("123456789");
		 c1.findElement(By.name("customer.ssn")).sendKeys("no");
		 c1.findElement(By.name("customer.username")).sendKeys("abcdef");
		 c1.findElement(By.name("customer.password")).sendKeys("12345678");
		 c1.findElement(By.name("repeatedPassword")).sendKeys("12345678");
		 c1.findElement(By.className("button")).click();
		 c1.findElement(By.name("username")).sendKeys("abcdef");
		 c1.findElement(By.name("password")).sendKeys("12345678");
		 c1.findElement(By.xpath("//input[@value='Log In']")).click();
		 c1.findElement(By.linkText("Log Out")).click();
		 c1.close();
	}
}
