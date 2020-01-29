package Sample2;

import org.testng.annotations.Test;

public class TC_02
{
	@Test(groups="func")
	public void FunctionalTesting()
	{
		System.out.println("functional testing class2");
	}
    @Test(groups="int")
    public void IntegrationTesting()
    {
    	System.out.println("integration testing class2");
    }
    @Test(groups="sys")
    public void SystemTesting()
    {
    	System.out.println("System testing class2");
    }
}
