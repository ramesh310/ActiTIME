package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScripit3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.instagram.com/");
		c1.findElement(By.name("emailOrPhone")).sendKeys("ajnvvvbnbvgg");
}
}
