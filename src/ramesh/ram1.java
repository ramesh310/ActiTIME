package ramesh;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ram1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/drivers/selenium/64bitAutomationSW/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://laptop-bgv2ca0v:81/login.do");
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		c1.findElement(By.name("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		c1.findElement(By.xpath("//input[@valign='absmiddle']")).click();
		c1.findElement(By.linkText("Users")).click();
		c1.findElement(By.xpath("//input[@value='Add New User']")).click();
		c1.findElement(By.name("username")).sendKeys("Harsha");
		c1.findElement(By.name("passwordText")).sendKeys("ramesh");
		c1.findElement(By.name("passwordTextRetype")).sendKeys("ramesh");
		c1.findElement(By.name("firstName")).sendKeys("Harsha");
		c1.findElement(By.name("lastName")).sendKeys("Reddy");
		c1.findElement(By.name("email")).sendKeys("a@gmail.com");
		c1.findElement(By.name("phone")).sendKeys("8848028389");
		c1.findElement(By.name("mobile")).sendKeys("24251136553");
		c1.findElement(By.xpath("//input[@type='submit']")).click();
		String s=c1.findElement(By.className("successmsg")).getText();
		System.out.println(s);
		c1.findElement(By.xpath("//img[@alt='Logout']")).click();
		c1.close();
	}
}

