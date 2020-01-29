package Logs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ramesh.Loginlogout;

public class Listeners extends TestListenerAdapter
{
	public void onTestStart(ITestResult rv)
	{
		prgm1.log.info("----------test is started----------");
	}
	public void onTestSuccess(ITestResult rv)
	{
		prgm1.log.info("----------------test is success---------");
	}
	public void onTestFailure(ITestResult rv)
	{
		prgm1.log.fatal("------------test is failed---------");
	String date=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());	
	String s=rv.getName();
	EventFiringWebDriver efw=new EventFiringWebDriver(Loginlogout.driver);
	File f1=efw.getScreenshotAs(OutputType.FILE);
	File f2=new File(System.getProperty("user.dir")+"/Screenshot/"+s+date+".jpg");
	prgm1.log.info("-----------Screenshot taken-----------");
	try {
		FileUtils.moveFile(f1, f2);
		prgm1.log.info("----------Screenshot stored----------");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("Test is failed");
	}
	public void onTestSkipped(ITestResult rv)
	{
		prgm1.log.info("------------test is skipped-----------");
	}
}
