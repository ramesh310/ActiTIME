package Critical;

import org.testng.annotations.Test;

public class CreateProjectTc_01 extends BaseClass
{
@Test
public void testCreateProjectTc_01() 
{
	OpenTaskPage otp=new OpenTaskPage();
	otp.clickonProjectsAndCustomers();
	ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
	apcp.clickOnAddNewProject();
	AddNewProjectPage anpp=new AddNewProjectPage();
	anpp.selectCustomerFromDropDown("royal mech");
	anpp.enterProjectName("vuxyz");
	anpp.clickOnCreateButton();
	String s=apcp.retriveSuccessmsg();
	System.out.println(s);
}
}
