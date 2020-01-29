package Sample5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class prgm1 
{
	public static WebDriver driver;
@Test(dataProvider="testdata")
public void testprgm(String un,String psd)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(psd);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	if(driver.getTitle().contains("Open Task"))
	{
		driver.findElement(By.className("logoutImg")).click();
	}
}
@DataProvider(name="testdata")
public Object [][] getdata()
{
	Object [][] rv=new Object[3][2];
	rv[0][0]="admin";
	rv[0][1]="manager";
	rv[1][0]="admin1";
	rv[1][1]="manager";
	rv[2][0]="admin";
	rv[2][1]="manager1";
	return rv;
	
}

}
