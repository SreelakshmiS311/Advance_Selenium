package Generic_Utilities;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Java_Utility {
	
	
	/**
	 * this method is used to avoid Duplicates
	 * @return
	 * @author Sreelakshmi
	 */
	
	public int getRandomNum()
	{
	Random ran = new Random();
	int ranNum = ran.nextInt(1000);
	return ranNum;
	}


	 
	
	 public void mouseHover(WebDriver driver, WebElement hoverElement) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
	
	}
}


