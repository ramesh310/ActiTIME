package ramesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateProject
{
	public static WebDriver driver;

	@Test
	public void testCreateProject()
	{
		 System.setProperty("webdriver.chrome.driver", "C:/drivers/selenium/64bitAutomationSW/chromedriver.exe");
		 	driver=new ChromeDriver();
			driver.get("http://laptop-bgv2ca0v:81/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//input[@valign='absmiddle']")).click();
			driver.findElement(By.linkText("Projects & Customers")).click();
			driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
			WebElement w1=driver.findElement(By.name("customerId"));
			Select s=new Select(w1);
			s.selectByIndex(0);
			driver.findElement(By.name("name")).sendKeys("zxc12");
			driver.findElement(By.name("createProjectSubmit")).click();
			driver.findElement(By.className("logoutImg")).click();
			
	 }
}
