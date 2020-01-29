package Critical;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage 
{
	@FindBy(linkText="Projects & Customers")
   private WebElement ProjectsAndCustomersLink;
	  
	public OpenTaskPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void clickonProjectsAndCustomers()
	{
		ProjectsAndCustomersLink.click();
	}
}
