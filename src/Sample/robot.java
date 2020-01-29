package Sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class robot 
{
public static void main(String[] args) throws AWTException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\64bitAutomationSW/chromedriver.exe");
	ChromeDriver c1=new ChromeDriver();
	c1.get("https://www.facebook.com/");
	Robot r=new Robot();
	r.mouseMove(100, 100);
	r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
}
}
