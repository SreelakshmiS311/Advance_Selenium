package Organisation;



import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrgDataNotepad {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./src/test/resources/orgdata.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();	
		driver.findElement(By.cssSelector("[alt=\"Create Organization...\"]")).click();
		
		String name = pro.getProperty("name");
		String phone = pro.getProperty("phone");
		String email = pro.getProperty("email");
		
		driver.findElement(By.name("accountname")).sendKeys(name);
		driver.findElement(By.id("phone")).sendKeys(phone);
		driver.findElement(By.id("email1")).sendKeys(email);

		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		
	
	}
	

}
