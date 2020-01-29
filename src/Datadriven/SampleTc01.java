package Datadriven;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTc01 extends BaseClass
{
	public static WebDriver driver;
	public static Logger log;
  
  public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://127.0.0.1:81/login.do");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.linkText("Users")).click();
	  driver.findElement(By.xpath("//input[@value='Add New User']")).click();
	  driver.findElements(By.xpath("//input[@type='text']"));
	  for(int i=1;i<getRowCount("Sheet1");i++)
	  {
	  for(int j=0;j<getCellCount("Sheet1", 1);j++)
	  {
	  List<WebElement> a1 = driver.findElements(By.xpath("//input[@type='text']"));
	  a1.get(j).sendKeys(BaseClass.readData("Sheet1", i, j));
	  }
	  driver.findElement(By.name("passwordText")).sendKeys("12345678");
	  driver.findElement(By.name("passwordTextRetype")).sendKeys("12345678");
	  driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	  driver.findElement(By.xpath(" //input[@value='Add New User']")).click();
}
	  driver.findElement(By.className("logoutImg")).click();
	  driver.close();
	  
}}