package Logs;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class prgm1
{
	public static WebDriver driver;
	public static Logger log;
@BeforeTest
public void openBrowser() throws IOException
{

	log =Logger.getLogger(prgm1.class);
	PropertyConfigurator.configure("Log4j.properties");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	log.info("-------Browser Opened----------");
	driver.get("http://127.0.0.1:81/login.do");
	log.info("-------url entered------------");
	driver.findElement(By.name("username")).sendKeys("admin");
	log.info("----------username entered-----------");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	log.info("---------password entered--------");
}
@AfterTest
public void closeBrowser()
{
	driver.close();
	log.info("----------Browser closed-------");
}
}
