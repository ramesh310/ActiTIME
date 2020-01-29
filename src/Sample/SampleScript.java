package Sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScript 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://actitime.jmr.co.za/actitime/login.do");
		String s1=c1.getCurrentUrl();
		System.out.println("s1="+s1);
		c1.close();
	}

}
