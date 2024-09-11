package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//initialization
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//declaration
	
	@FindBy (linkText="Products")
	private WebElement ProductLink;
	
	


	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement LookupImagePro;
	
	@FindBy(css="img[src='themes/softed/images/menuDnArrow.gif']")
	private WebElement moreoption;
	
	
	@FindBy(linkText="Campaigns")
	private WebElement CampaignsLink;
	
	

	public void setCampaignsLink(WebElement campaignsLink) {
		CampaignsLink = campaignsLink;
	}

	public WebElement getProductLink() {
		return ProductLink;
	}

	public WebElement getLookupImagePro() {
		return LookupImagePro;
	}

	public WebElement getMoreoption() {
		return moreoption;
	}

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}
	
	
	//Getter methods
	
	public WebElement getProduct() {
		return ProductLink;
	}
	
	public WebElement getLookupImageP() {
		return LookupImagePro;
	}

	
}
