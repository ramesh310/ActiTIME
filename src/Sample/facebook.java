package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebook
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		c1.get("https://www.instagram.com/");
		WebElement w1=c1.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		Actions a1=new Actions(c1);
		a1.moveToElement(w1).click().perform();
		c1.findElement(By.name("email")).sendKeys("rameshreddy957352@gmail.com");
		c1.findElement(By.name("pass")).sendKeys("mahi@143");
		c1.findElement(By.id("loginbutton")).click();
		Thread.sleep(10000);
		WebElement w2=c1.findElement(By.xpath("//button[contains(@class,'aOOlW  bIiDR  ')]"));
		Actions a2=new Actions(c1);
		a2.moveToElement(w2).click().perform();
		Alert alert=c1.switchTo().alert();
		alert.accept();
	}
}
