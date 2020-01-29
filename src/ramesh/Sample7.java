package ramesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample7
{
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		 ChromeDriver c1=new ChromeDriver();
		 c1.get("http:\\newtours.demoaut.com");
		 c1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 c1.findElement(By.linkText("REGISTER")).click();
		 c1.findElement(By.name("firstName")).sendKeys("hari");
		 c1.findElement(By.name("lastName")).sendKeys("chowdary");
		 c1.findElement(By.name("phone")).sendKeys("9876543210");
		 c1.findElement(By.id("userName")).sendKeys("chicken@gmail.com");
		 c1.findElement(By.name("address1")).sendKeys("gududru,thallada mandal,khammam dist");
		 c1.findElement(By.name("city")).sendKeys("khammam");
		 c1.findElement(By.name("state")).sendKeys("telangana");
		 c1.findElement(By.name("postalCode")).sendKeys("507167");
		   WebElement w1 = c1.findElement(By.name("country"));
		   Select s1= new Select(w1);
		   s1.selectByIndex(5);
		   c1.findElement(By.name("email")).sendKeys("lahari");
		   c1.findElement(By.name("password")).sendKeys("tttt");
		   c1.findElement(By.name("register")).click();
		   c1.findElement(By.linkText("sign-in")).click();
		   c1.findElement(By.name("userName")).sendKeys("candy");
		   c1.findElement(By.name("password")).sendKeys("tttt");
		   c1.findElement(By.name("login")).click();
		   WebElement w2=c1.findElement(By.name("passCount"));
		   Select s2=new Select(w2);
		   s2.selectByIndex(1);
		   WebElement w3= c1.findElement(By.name("fromPort"));
		   Select s3=new Select(w3);
		   s3.selectByIndex(2);
		   WebElement w4=c1.findElement(By.name("fromMonth"));
		   Select s4=new Select(w4);
		   s4.selectByIndex(11);
		   WebElement w5=c1.findElement(By.name("fromDay"));
		   Select s5=new Select(w5);
		   s5.selectByIndex(22);
		   WebElement w6=c1.findElement(By.name("toPort"));
		   Select s6=new Select(w6);
		   s6.selectByIndex(3);
		   WebElement w7=c1.findElement(By.name("toMonth"));
		   Select s7=new Select(w7);
		   s7.selectByIndex(11);
		   WebElement w8=c1.findElement(By.name("toDay"));
		   Select s8=new Select(w8);
		   s8.selectByIndex(23);
		   c1.findElement(By.cssSelector("input[value= 'Business']")).click();
		   WebElement w9=c1.findElement(By.name("airline"));
		    Select s9=new Select(w9);
		    s9.selectByIndex(1);
		    c1.findElement(By.name("findFlights")).click();
		    c1.findElement(By.name("reverseFlights")).click();
		    c1.findElement(By.name("passFirst0")).sendKeys("Lahari");
		    c1.findElement(By.name("passLast0")).sendKeys("candy");
		    WebElement w10=c1.findElement(By.name("pass.0.meal"));
		    Select s10=new Select(w10);
		    s10.selectByIndex(2);
		    c1.findElement(By.name("passFirst1")).sendKeys("Lahari");
		    c1.findElement(By.name("passLast1")).sendKeys("chowdary");
		    WebElement w11=c1.findElement(By.name("pass.1.meal"));
		    Select s11=new Select(w11);
		    s11.selectByIndex(2);
		    WebElement w12=c1.findElement(By.name("creditCard"));
		    Select s12=new Select(w12);
		    s12.selectByIndex(1);
		    c1.findElement(By.name("creditnumber")).sendKeys("1234567890123456");
		    WebElement w13= c1.findElement(By.name("cc_exp_dt_mn"));
		    Select s13=new Select(w13);
		    s13.selectByIndex(10);
		    WebElement w14=c1.findElement(By.name("cc_exp_dt_yr"));
		    Select s14=new Select(w14);
		    s14.selectByIndex(9);
		    c1.findElement(By.name("cc_first_name")).sendKeys("lahari");
		    c1.findElement(By.name("cc_mid_name")).sendKeys("chowdary");
		    c1.findElement(By.name("cc_last_name")).sendKeys("thondapu");
		    c1.findElement(By.name("billAddress1")).sendKeys("Guduru,thallada mandal");
		    c1.findElement(By.name("billAddress2")).sendKeys("khammam");
		    c1.findElement(By.name("billZip")).sendKeys("507167");
		    WebElement w15=c1.findElement(By.name("billCountry"));
		    Select s15=new Select(w15);
		    s15.selectByVisibleText("INDIA");
		    c1.findElement(By.name("buyFlights")).click();
		    c1.findElement(By.linkText("SIGN-OFF")).click();
		    
		    
		    
		    
		    
		    
		    
		   
		   
		   
		   
		 
	}
}
