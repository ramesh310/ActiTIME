package ramesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ram9 
{
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("https://parabank.parasoft.com/parabank/index.htm");
		 c1.findElement(By.name("username")).sendKeys("abcdef");
		 c1.findElement(By.name("password")).sendKeys("12345678");
		 c1.findElement(By.xpath("//input[@value='Log In']")).click();
		 c1.findElement(By.linkText("Open New Account")).click();
		 WebElement w=c1.findElement(By.id("type"));
		 Select s=new Select(w);
		 s.selectByIndex(1);
		 WebElement w1=c1.findElement(By.id("fromAccountId"));
		 Select s1=new Select(w1);
		 s1.selectByIndex(0);
		 c1.findElement(By.xpath("//input[@value='Open New Account']")).click();
		 c1.findElement(By.linkText("Transfer Funds")).click();
		 c1.findElement(By.id("amount")).sendKeys("1");
		 WebElement w2=c1.findElement(By.id("fromAccountId"));
		 Select s2=new Select(w2);
		 s2.selectByIndex(0);
		 WebElement w3=c1.findElement(By.id("toAccountId"));
		 Select s3=new Select(w3);
		 s3.selectByIndex(0);
		 c1.findElement(By.xpath("//input[@value='Transfer']")).click();
		 
	}
}
