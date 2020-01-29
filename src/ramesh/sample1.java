package ramesh;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/drivers/selenium/64bitAutomationSW/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://laptop-bgv2ca0v:81/login.do");
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.cssSelector("input[valign='absmiddle']")).click();
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.cssSelector("input[value='Add New Project']")).click();
		WebElement w1= c1.findElement(By.name("customerId"));
		 Select s1=new Select(w1);
		 s1.selectByVisibleText("ravi1");
		 c1.findElement(By.name("name")).sendKeys("ass");
		 c1.findElement(By.name("description")).sendKeys("hii,This is ANUSHA");
		 c1.findElement(By.name("createProjectSubmit")).click();
		String s= c1.findElement(By.className("sucessmsg")).getText();
		System.out.println(s);
		c1.findElement(By.className("logoutImg")).click();
		c1.close();
		
	
	}

}
