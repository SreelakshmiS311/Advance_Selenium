package Organisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCampaignExcel {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91756\\OneDrive\\Documents\\DDT VTIGER\\orgdata1.xlsx.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Campaign");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		
		String url = cell.getStringCellValue();
		
		driver.get(url);
		
		Row row1=sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		String username = cell1.getStringCellValue();
		
		Row row2=sheet.getRow(2);
		Cell cell2 = row2.getCell(1);
		String password = cell2.getStringCellValue();
		
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		
		driver.findElement(By.id("submitButton")).click();
		
		
	}

	
}
