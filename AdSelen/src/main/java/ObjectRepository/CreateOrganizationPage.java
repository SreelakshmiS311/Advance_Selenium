package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	//initialization
	
	public CreateOrganizationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//declaration
	
	@FindAll({@FindBy(name="accountname"), @FindBy(xpath = "//input[@name='accountname']")})
	private WebElement OrganizationName;
	
	@FindBy(id="phone")
	private WebElement phnNum;
	
	@FindBy(id="email1")
	private WebElement emailId;
	
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement save;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signout;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement hoverElement;
	
	//getter methods
	

	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public WebElement getPhnNum() {
		return phnNum;
	}

	public WebElement getEmail1() {
		return emailId;
	}
	

	public WebElement getSave() {
		return save;
	}
	
	public WebElement getHoverElement() {
		return hoverElement;
	}

	public WebElement getSignout() {
		return signout;
	}

	
	
	
	//business logics
	
	
	public void setSignout(WebElement signout) {
		this.signout = signout;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public void enterOrgData(String OrgName,String phoneNum,String mailId)
	{
		OrganizationName.sendKeys(OrgName);
		phnNum.sendKeys(phoneNum);
		emailId.sendKeys(mailId);
		
	}
	
}
