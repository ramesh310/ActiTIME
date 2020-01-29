package Critical;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomersPage
{
	@FindBy(xpath="//input[@value='Add New Customer']")
  private WebElement AddNewCustomerLink;
	@FindBy(className="successmsg")
	private WebElement retriveSuccessMessage;
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement addNewProjectButton;
	public ActiveProjectsAndCustomersPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void clickOnAddNewButton()
	{
		 AddNewCustomerLink.click();
	}
	public String retriveSuccessmsg()
	{
		String s = retriveSuccessMessage.getText();
		return s;
	}
	public void clickOnAddNewProject()
	{
		addNewProjectButton.click();
	}
	
	
}
