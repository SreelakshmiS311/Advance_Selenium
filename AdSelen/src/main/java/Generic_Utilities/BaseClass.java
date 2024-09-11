package Generic_Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.CreateOrganizationPage;
import ObjectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;

	@BeforeSuite
	public void BS()
	{

		System.out.println("Database connection Open");

	}
	@BeforeTest
	public void BT()
	{
		System.out.println("Parallel execution");
	}
	@BeforeClass
	public void BC() throws Throwable
	{
		File_Utility flib = new File_Utility();
		String BROWSER = flib.getPropertiesData("Browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("fireFox"))
		{
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else 

		{
			driver=new ChromeDriver();
		}


		System.out.println("Browser Launched");
	}
	@BeforeMethod
	public void BM() throws Throwable
	{
		WebDriver_Utility wlib = new WebDriver_Utility();
		File_Utility flib = new File_Utility();
		wlib.maximizeWindow(driver);
		wlib.waitPageToLoad(driver);
		String URL = flib.getPropertiesData("url");
		String USERNAME = flib.getPropertiesData("username");
		String PASSWORD = flib.getPropertiesData("password");
		driver.get(URL);
		LoginPage login = new LoginPage(driver);
		login.getUserTextField().sendKeys(USERNAME);
		login.getPassWordTextField().sendKeys(PASSWORD);
		login.getLoginButton().click();
		System.out.println("LogIn to Application");
	}

	@AfterMethod
	public void AM()
	{
		CreateOrganizationPage orgPage = new CreateOrganizationPage(driver);
		orgPage.getSignout().click();
		System.out.println("LogOut from Application");
	}

	@AfterClass
	public void AC()
	{
		System.out.println("close Browser");

	}
	@AfterTest()
	public void AT()
	{
		System.out.println("Parallel execution done");

	}
	@AfterSuite()
	public void AS()
	{
		System.out.println("Close DataBase Connection");
	}

}	


