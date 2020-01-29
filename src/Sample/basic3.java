package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basic3
{
 public static void main(String[] args)
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	 ChromeDriver c1=new ChromeDriver();
	 c1.get("file:///D:/anu/p1.html");
	 c1.findElement(By.xpath("//input[@placeholder='name']")).sendKeys("ramesh");
	 c1.findElement(By.xpath("//input[@placeholder='email']")).sendKeys("abc@gmail.com");
	 WebElement w=c1.findElement(By.xpath("//iframe[@src='p2.html']"));
	 c1.switchTo().frame(w);
	 c1.findElement(By.xpath("//input[@placeholder='phone']")).sendKeys("123456655");
	 c1.switchTo().defaultContent();
	 WebElement w1=c1.findElement(By.xpath("//iframe[@src='p4.html']"));
	 c1.switchTo().frame(w1);
	 c1.findElement(By.id("c1")).click();
	 c1.switchTo().defaultContent();
	 WebElement w2=c1.findElement(By.xpath("//iframe[@src='p5.html']"));
     c1.switchTo().frame(w2);
	 WebElement w3=c1.findElement(By.name("skill"));
	 Select s=new Select(w3);
	 s.selectByIndex(2);
 }
}
