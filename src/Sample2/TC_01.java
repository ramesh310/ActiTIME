package Sample2;

import org.testng.annotations.Test;

public class TC_01 
{

		@Test(groups="func")
		public void FunctionalTesting()
		{
			System.out.println("functional testing class1");
		}
	    @Test(groups="int")
	    public void IntegrationTesting()
	    {
	    	System.out.println("integration testing class1");
	    }
	    @Test(groups="sys")
	    public void SystemTesting()
	    {
	    	System.out.println("System testing class1");
	    }
	}
