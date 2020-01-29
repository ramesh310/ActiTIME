package ram;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomer
{
   @Test
   public void testLogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
 	             String url = ExcelOperation.readData("Sheet1", 1, 0);
 	             String un = ExcelOperation.readData("Sheet1", 1, 1);
 	             String pw = ExcelOperation.readData("Sheet1", 1, 2);
 	             String exp = ExcelOperation.readData("Sheet1", 1, 3);
 	             System.out.println(exp);
 	            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	        	 ChromeDriver c1=new ChromeDriver();
	        	
	        	 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        	 c1.get(url);
	        	 c1.findElement(By.name("username")).sendKeys(un);
	        	 c1.findElement(By.name("pwd")).sendKeys(pw);
	        	 c1.findElement(By.xpath("//input[@type='submit']")).click();
	        	 c1.findElement(By.linkText("Projects & Customers")).click();
	        	 c1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
	        	 c1.findElement(By.name("name")).sendKeys("zxcv");
	        	 c1.findElement(By.xpath("//input[@value='Create Customer']")).click();
	        	    String act= c1.findElement(By.className("successmsg")).getText();
	        	    System.out.println(act);
	        	    ExcelOperation.writeData("Sheet1", 1, 4, act);
		        	 if(exp.equals(act))
		        	 {
		        		 ExcelOperation.writeData("Sheet1", 1, 5, "pass");
		        	 }
		        	else
		        	 {
		        		 ExcelOperation.writeData("Sheet1", 1, 5, "fail");
		        	 }
   }
}
