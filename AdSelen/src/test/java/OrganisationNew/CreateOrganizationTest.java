
/*1. Login to vtiger application->click on organizations link->click on create organization lookup image->Enter organisation name,phone number and email->click on save Btn->verify whether the organization is created in Organization Information page and Logout from the application.*/



package OrganisationNew;

//import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import ObjectRepository.CreateOrganizationPage;
import ObjectRepository.LoginPage;

public class CreateOrganizationTest extends BaseClass {
    @Test
	public void CreateOrganizationTest() throws Throwable {


		
//		File_Utility flib = new File_Utility();
		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		WebDriver driver;
//		 String BROWSER = flib.getPropertiesData("Browser");
//		 if(BROWSER.equalsIgnoreCase("chrome"))
//		 {
//			  driver=new ChromeDriver();
//		 }
//		 else if(BROWSER.equalsIgnoreCase("fireFox"))
//		 {
//			 driver=new FirefoxDriver();
//		 }
//		 else if(BROWSER.equalsIgnoreCase("edge"))
//		 {
//			 driver=new EdgeDriver();
//		 }
//		 else 
//			 
//		 {
//			 driver=new ChromeDriver();
//		 }
//
//		
		
		
//		wlib.maximizeWindow(driver);
//		wlib.waitPageToLoad(driver);

		//	driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//reading data from properties file		
		//		step1:-get the java representation object of the physical file
		//	FileInputStream fis = new FileInputStream("./src/test/resources/orgdata.properties.txt");

		//step2:-create an object to property class to load all the keys
		//    Properties pro = new Properties();
		//  pro.load(fis);

		//step3:-read the value using getProperty()
		//String URL = pro.getProperty("url");
		//String USERNAME = pro.getProperty("username");
		//String PASSWORD = pro.getProperty("password");


		
//		String URL = flib.getPropertiesData("url");
//		String USERNAME = flib.getPropertiesData("username");
//		String PASSWORD = flib.getPropertiesData("password");
//
//
//
//		driver.get(URL);
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
		
		//using getter methods
		
	LoginPage login = new LoginPage(driver);
//		login.getUserTextField().sendKeys(USERNAME);
//		login.getPassWordTextField().sendKeys(PASSWORD);
		//login.getLoginButton().click();
		
		//using business logiccs
		//LoginPage login = new LoginPage(driver);
		//login.loginToApp(PASSWORD, PASSWORD);
		
Thread.sleep(2000);
		//click on organization link
		driver.findElement(By.linkText("Organizations")).click();

		//click on lookup img
		driver.findElement(By.cssSelector("[alt=\"Create Organization...\"]")).click();

		//TO avoid Duplicates
		//Random ran = new Random();
		//int ranNum = ran.nextInt(1000);

		
		int ranNum = jlib.getRandomNum();

		//FileInputStream fes = new FileInputStream("C:\\Users\\91756\\OneDrive\\Documents\\DDT VTIGER\\orgdata1.xlsx.xlsx");
		//step2:-keep excel file in read mode
		//Workbook book = WorkbookFactory.create(fes);

		//step3:-taking Control of the excel sheet
		//Sheet sheet = book.getSheet("Organization");

		//step4:-taking Control of the rows
		//Row row = sheet.getRow(0);

		//step5:-taking Control of the cell
		//Cell cel = row.getCell(0);

		//String OrgName = cel.getStringCellValue()+ranNum;


		
		  String OrgName = elib.getExcelData("OrgName", 0, 0) + ranNum;
			String phnNum = elib.getExcelDataUsingFormatter("OrgName", 1, 0);
			String mailId = elib.getExcelDataUsingFormatter("OrgName", 2, 0);
					
		System.out.println(OrgName);
		//create organization data
//		driver.findElement(By.name("accountname")).sendKeys(OrgName);
//		driver.findElement(By.id("phone")).sendKeys("654654684");
//		driver.findElement(By.id("email1")).sendKeys("jnfij@gmail.com");
		
		CreateOrganizationPage orgPage = new CreateOrganizationPage(driver);
		orgPage.enterOrgData(OrgName, phnNum, mailId);
		

		//to click on save button
	//	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		orgPage.getSave().click();

		//To logout from Application
		Thread.sleep(2000);
		
		
		//mouse hover
		
		//WebElement hoverElement = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		//Actions actions = new Actions(driver);
		//actions.moveToElement(hoverElement).perform();
		
		
		
		jlib.mouseHover(driver, orgPage.getHoverElement()); 
		
		// driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
		
		
		//driver.findElement(By.linkText("Sign Out")).click();
//		orgPage.getSignout().click();
	}
}
