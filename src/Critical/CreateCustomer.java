package Critical;

import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass
{
	@Test
	public void testCreateCustomer()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickonProjectsAndCustomers();
		ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
		apcp.clickOnAddNewButton();
		AddNewCustomerPage ancp=new AddNewCustomerPage();
		ancp.EnterCustomerName("dxc");
		ancp.clickOnCreateCustomerButton();
		String s=apcp.retriveSuccessmsg();
		System.out.println(s);
	}
}
