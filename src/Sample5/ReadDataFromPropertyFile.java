package Sample5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile
{
  public static void main(String[] args) throws IOException
  {
	  FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/ram.properties");
	  Properties p1=new Properties();
	  p1.load(fis);
	  String url=p1.getProperty("url");
	  String un=p1.getProperty("username");
	  String psd=p1.getProperty("password");
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.get(url);
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("pwd")).sendKeys(psd);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
  }
}
