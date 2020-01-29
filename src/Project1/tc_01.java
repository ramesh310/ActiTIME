package Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tc_01 
{
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:/drivers/selenium/64bitAutomationSW/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement w=driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a=new Actions(driver);
		a.moveToElement(w).perform();
		WebElement w2=driver.findElement(By.xpath("//a[@title='T-shirts']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(w2).click().perform();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Proceed to checkout")).click();
		driver.findElement(By.linkText("Proceed to checkout")).click();
		driver.findElement(By.name("email_create")).sendKeys("vcx018@gmail.com");
		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-validate='isName']")).sendKeys("ramesh");
		driver.findElement(By.id("customer_lastname")).sendKeys("reddy");
		driver.findElement(By.id("passwd")).sendKeys("123456789");
		Thread.sleep(20000);
		driver.findElement(By.name("company")).sendKeys("Indus");
		driver.findElement(By.name("address1")).sendKeys("near kphb");
		driver.findElement(By.name("city")).sendKeys("hyderabad");
		WebElement w6=driver.findElement(By.name("id_state"));
		Select s4=new Select(w6);
		s4.selectByVisibleText("Indiana");
		driver.findElement(By.name("postcode")).sendKeys("00021");
		WebElement w7=driver.findElement(By.name("id_country")); 
		Select s5=new Select(w7);
		s5.selectByIndex(1);
		driver.findElement(By.name("phone_mobile")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id='submitAccount']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		WebElement w10=driver.findElement(By.xpath("//*[@id='cgv']"));
		Actions a3=new Actions(driver);
		a3.moveToElement(w10).click().perform();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span/text()")).click();
		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']")).click();
		driver.findElement(By.xpath("//*[@id='cart_navigation']")).click();
		driver.findElement(By.className("logout")).click();
		driver.close();
 }
}
