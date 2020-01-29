package Finaltest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Ninja 
{

public static void main(String[] args) throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	 ChromeDriver c1=new ChromeDriver();
	 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c1.get("http://tutorialsninja.com/demo/");
	 c1.findElement(By.linkText("My Account")).click();
	 c1.findElement(By.linkText("Register")).click();
	 c1.findElement(By.name("firstname")).sendKeys("mahesh");
	 c1.findElement(By.name("lastname")).sendKeys("reddy");
	 c1.findElement(By.name("email")).sendKeys("reddy52607@gmail.com");
	 c1.findElement(By.name("telephone")).sendKeys("123456789");
	 c1.findElement(By.name("password")).sendKeys("123456");
	 c1.findElement(By.name("confirm")).sendKeys("123456");
	 c1.findElement(By.name("agree")).click();
	 c1.findElement(By.xpath("//input[@value='Continue']")).click();
	 c1.findElement(By.linkText("Continue")).click();
	 WebElement w1=c1.findElement(By.linkText("Desktops"));
	 Actions a=new Actions(c1);
	 a.moveToElement(w1).perform();
	 c1.findElement(By.linkText("Mac (1)")).click();
	 c1.findElement(By.xpath("//button[contains(@onclick,'cart.add')]")).click();
	 c1.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
	 c1.findElement(By.linkText("Checkout")).click();
	 c1.findElement(By.xpath("//a[text()='Estimate Shipping & Taxes ']")).click();
	 Thread.sleep(20000);
	WebElement w=c1.findElement(By.xpath("//select[contains(@id,'input-country')]"));
	Select s1=new Select(w);
	s1.selectByVisibleText("India");
	WebElement w2=c1.findElement(By.xpath("//select[contains(@name,'zone_id')]"));
	Select s2=new Select(w2);
	s2.selectByVisibleText("Telangana");
	c1.findElement(By.name("postcode")).sendKeys("502142");
	c1.findElement(By.id("button-quote")).click();
	c1.findElement(By.name("shipping_method")).click();
	c1.findElement(By.xpath("//input[@value='Apply Shipping']")).click();
	WebElement w3=c1.findElement(By.xpath("//i[contains(@class,'fa fa-times-circle')]"));
	Actions a2=new Actions(c1);
	a2.moveToElement(w3).click().perform();
	WebElement w4=c1.findElement(By.xpath("//input[@class='btn btn-primary']"));
	Actions a3=new Actions(c1);
	a3.moveToElement(w4).click().perform();
	c1.findElement(By.linkText("My Account")).click();
	c1.close();
	 
}
}
