/*Login to vtiger application->click on products link->click on create product lookup image->Enter product name->click on save Btn->verify whether the product is created in product Information page and Logout from the application.*/

package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import ObjectRepository.CreateProductPage;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class CreateProductTest extends BaseClass{

@Test

	public void CreateProductTest() throws Throwable {
//		WebDriver driver = new ChromeDriver();
//
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		wlib.maximizeWindow(driver);
//		wlib.waitPageToLoad(driver);

		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		File_Utility flib = new File_Utility();
//		String URL = flib.getPropertiesData("url");
//		String USERNAME = flib.getPropertiesData("username");
//		String PASSWORD = flib.getPropertiesData("password");

		//		FileInputStream fis = new FileInputStream("C:\\Users\\91756\\OneDrive\\Documents\\DDT VTIGER\\prodata.properties.txt");
		//		Properties pro = new Properties();
		//		pro.load(fis);
		//
		//		String URL = pro.getProperty("url");
		//		String USERNAME = pro.getProperty("username");
		//		String PASSWORD = pro.getProperty("password");
		
//		driver.get(URL);
//
	//LoginPage Login = new LoginPage(driver);
//		Login.getUserTextField().sendKeys(USERNAME);
//		Login.getPassWordTextField().sendKeys(PASSWORD);
//		Login.getLoginButton().click();
		

		
		//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		//      driver.findElement(By.id("submitButton")).click();

HomePage Home = new HomePage(driver);
Home.getProduct().click();
Home.getLookupImageP().click();


//		driver.findElement(By.linkText("Products")).click();
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

Java_Utility jlib = new Java_Utility();
int ranNum=jlib.getRandomNum();

//		Random ran = new Random();
//		int ranNum = ran.nextInt(1000);


		Excel_Utility elib = new Excel_Utility();
		
		String ProName = elib.getExcelData("Product", 0, 0)+ranNum;

		//		FileInputStream fis1 = new FileInputStream("C:\\Users\\91756\\OneDrive\\Documents\\DDT VTIGER\\orgdata1.xlsx.xlsx");
		//
		//		Workbook book = WorkbookFactory.create(fis1);
		//
		//		Sheet sheet = book.getSheet("Product");
		//		Row row = sheet.getRow(0);
		//		Cell cell = row.getCell(0);
		//
		//		String prodata=cell.getStringCellValue()+ranNum; 
			driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(ProName);
		
		CreateProductPage CreateProduct = new CreateProductPage(driver);
		CreateProduct.getSave().click();;
		Thread.sleep(2000);
		CreateProduct.getHoverElement().click();;
//		CreateProduct.getSignOutButton().click();;
		
		
//		
//		driver.findElement(By.xpath("//input[@accesskey=\"S\"][1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
//		driver.findElement(By.linkText("Sign Out")).click();







	}


}
