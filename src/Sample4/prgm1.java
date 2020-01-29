package Sample4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class prgm1
{
	@Parameters({"t1","t2"})
  @Test
  public void testprgm1(String un,String psd)
  {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
  }
}
