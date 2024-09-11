package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {

	//initialization
	
		public CreateCampaignPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
			
		}
		
		//declaration
		@FindBy(css = "img[src='themes/softed/images/btnL3Add.gif']")
		private WebElement LookUpC;
		
		@FindBy(name ="campaignname")
		private WebElement CampaignName;
		
		@FindBy(css= "input[title='Save [Alt+S]']")
		private WebElement CampSave;
		 
		@FindBy(css="img[src='themes/softed/images/user.PNG']")
		private WebElement SignOutImg;
		
		@FindBy(linkText="Sign Out")
		private WebElement SignOutButton;
		
		//getter methods

		public WebElement getLookUpC() {
			return LookUpC;
		}
		
		//using businesss logics
		
		public void CampNameSavesignOut(String CampName)
		{
			CampaignName.sendKeys(CampName);
			CampSave.click();
			SignOutImg.click();
			SignOutButton.click();
		}
	
}
