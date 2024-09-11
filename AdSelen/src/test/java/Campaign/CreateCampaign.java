/*  3. Login to vtiger application->mouseOverOn more Link->click on campaigns->click on create campaign lookup image->Enter campaignName->click on save Btn->verify whether the campaign is created in campaign Information page and Logout from the application.  */


//pullling
package Campaign;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
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
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import ObjectRepository.CreateCampaignPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class CreateCampaign {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();

		Java_Utility jlib = new Java_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();
		Excel_Utility elib = new Excel_Utility();
		File_Utility flib = new File_Utility();
		
		wlib.maximizeWindow(driver);
        wlib.waitPageToLoad(driver);
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       String URL=flib.getPropertiesData("url");
       String USERNAME= flib.getPropertiesData("username");
       String PASSWORD=flib.getPropertiesData("password");
		
        
        
//        FileInputStream fis = new FileInputStream("C:\\Users\\91756\\OneDrive\\Documents\\DDT VTIGER\\prodata.properties.txt");
//		Properties pro = new Properties();
//		pro.load(fis);

//		String URL = pro.getProperty("url");
//		String USERNAME = pro.getProperty("username");
//		String PASSWORD = pro.getProperty("password");


		driver.get(URL);
		
		LoginPage Login = new LoginPage(driver);
		Login.getUserTextField().sendKeys(USERNAME);
		Login.getPassWordTextField().sendKeys(PASSWORD);
		Login.getLoginButton().click();
		
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
 
		HomePage Home = new HomePage(driver);
		Home.getMoreoption().click();
		Home.getCampaignsLink().click();


//		driver.findElement(By.cssSelector("img[src='themes/softed/images/menuDnArrow.gif']")).click();
//		driver.findElement(By.linkText("Campaigns")).click();		
		
		
		CreateCampaignPage crcamp = new CreateCampaignPage(driver);
		crcamp.getLookUpC().click();
		
		
		//driver.findElement(By.cssSelector("img[src='themes/softed/images/btnL3Add.gif']")).click();
		
		int ranNum=jlib.getRandomNum();
		String CampName = elib.getExcelData("Campaign", 0, 0)+ranNum;
//		Random ran = new Random();
//		int ranNum = ran.nextInt(1000);

//		FileInputStream fis1 = new FileInputStream("C:\\Users\\91756\\OneDrive\\Documents\\DDT VTIGER\\orgdata1.xlsx.xlsx");
//
//		Workbook book = WorkbookFactory.create(fis1);
//
//		Sheet sheet = book.getSheet("Campaign");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//
//		String name=cell.getStringCellValue()+ranNum; 


//		String campaignName = name + ranNum;
		
		//using business logics
		
		CreateCampaignPage createCampaignPage = new CreateCampaignPage(driver);
		createCampaignPage.CampNameSavesignOut(CampName);
		
//		
//		driver.findElement(By.name("campaignname")).sendKeys(CampName);
//		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
//		driver.findElement(By.linkText("Sign Out")).click();





	}

}
