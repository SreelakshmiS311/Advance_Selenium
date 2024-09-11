
package Generic_Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriver_Utility {
	
	/**
	 * This method is used to maximize the window/webpage
	 * @param driver
	 * @author Sreelakshmi
	 */

	public void maximizeWindow(WebDriver driver) 
	{

		driver.manage().window().maximize();
	}
	/**
	 * This method is used to minimize the window/webpage
	 * @param driver
	 * @author Sreelakshmi
	 */


	public void minimizeWindow(WebDriver driver)
	
	
	{

		driver.manage().window().minimize();
	}

/**
 * This method is used to make window fullscreen
 * @param driver
 * @author Sreelakshmi
 */
	public void FullScreenWindow(WebDriver driver)

	{

		driver.manage().window().fullscreen();
	}

/**
 * This method is used  to set an implicit wait for the WebDriver instance
 * @param driver
 * @author Sreelakshmi
 */
	public void waitPageToLoad(WebDriver driver)

	{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
