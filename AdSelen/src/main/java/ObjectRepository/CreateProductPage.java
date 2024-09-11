package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	
	public CreateProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//input[@accesskey=\"S\"][1]")
	private WebElement Save;
	
	
	@FindBy(css = "img[src='themes/softed/images/user.PNG']")
	private WebElement HoverElement;
	
	@FindBy(linkText= "Sign Out")
	private WebElement SignOutButton;

	public WebElement getSave() {
		return Save;
	}

	public WebElement getHoverElement() {
		return HoverElement;
	}

	public WebElement getSignOutButton() {
		return SignOutButton;
	}
	
}
