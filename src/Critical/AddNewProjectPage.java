package Critical;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectPage 
{
	@FindBy(name="customerId")
  private WebElement customerDropDown;
	@FindBy(name="name")
	private WebElement ProjectNameTextField;
	@FindBy(xpath="//input[@value='Create Project']")
	private WebElement createProjectButton;
	public AddNewProjectPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void selectCustomerFromDropDown(String customerName)
	{
		Select s1= new Select(customerDropDown);
		s1.selectByVisibleText(customerName);
	}
	public void enterProjectName(String ProjectName)
	{
		ProjectNameTextField.sendKeys(ProjectName);
	}
	public void clickOnCreateButton()
	{
		createProjectButton.click();
	}
}
