package Sample5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login
{
public static WebDriver driver;
@BeforeTest
public void openbrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@Test(dataProvider="testdata")
public void testLogin(String un,String psd)
{
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("pwd")).clear();
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(psd);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	if(driver.getTitle().contains("Open Tasks"))
	{
		driver.findElement(By.xpath("//img[@alt='Logout']")).click();
	}
}
@AfterTest
public void closebrowser()
{
	driver.close();
}
@DataProvider(name="testdata")
public Object [][] getdata()
{
	return new Object[][] {{"admin","manager"},{"admin1","manager"},{"admin","manager1"}};
}
}
