package Critical;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage
{
	@FindBy(name="name")
   private WebElement CustomerNameTextField;
	@FindBy(name="createCustomerSubmit")
	private WebElement CreateCustomerButton;
	public AddNewCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void EnterCustomerName(String customerName)
	{
		CustomerNameTextField.sendKeys(customerName);
	}
	public void clickOnCreateCustomerButton()
	{
		CreateCustomerButton.click();
	}
	
}
