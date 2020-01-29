package Finaltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;



public class blooper
{
public static void main(String[] args) throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	 ChromeDriver c1=new ChromeDriver();
	 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c1.get("http://tutorialsninja.com/demo/");
     
     
}
}