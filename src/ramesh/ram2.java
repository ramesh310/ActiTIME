package ramesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ram2 
{
 public static void main(String[] args)
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	 ChromeDriver c1=new ChromeDriver();
	 c1.get("http://laptop-bgv2ca0v:81/login.do");
	 c1.findElement(By.name("username")).sendKeys("admin");
	c1.findElement(By.name("pwd")).sendKeys("manager");
	c1.findElement(By.xpath("//input[@valign='absmiddle']")).click();
	c1.findElement(By.linkText("Reports")).click();
	WebElement w=c1.findElement(By.name("users"));
	Select s1=new Select(w);
	if(s1.isMultiple())
	{
		System.out.println("dropdown is multiple");
	}
	else
	{
		System.out.println("dropdown is single");
	}
	List<WebElement> a1=s1.getOptions();
	for(int i=0;i<a1.size();i++)
	{
		String s=a1.get(i).getText();
		System.out.println(s);
	}
	int i=s1.getOptions().size();
	System.out.println(i);
	s1.selectByIndex(0);
	s1.selectByIndex(1);
	s1.selectByIndex(2);
	s1.selectByIndex(3);
	s1.selectByIndex(4);
	s1.deselectAll();
	if(i%2==0)
	{
		s1.selectByIndex(i);
	}
	s1.deselectAll();
	for(int i1=0;i1<a1.size();i1++)
	{
		s1.selectByIndex(i1);
	}
	for(int i1=10;i1>0;i1--)
	{
		s1.deselectAll();
	}
	c1.findElement(By.xpath("//img[@alt='Logout']")).click();
	c1.close();
 }
}
