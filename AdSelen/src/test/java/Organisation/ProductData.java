package Organisation;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductData {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./src/test/resources/prodata.properties.txt");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL= pro.getProperty("url");
		String username=pro.getProperty("username");
		String pwd=pro.getProperty("password");
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		String proname = pro.getProperty("name");
		
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(proname);
		driver.findElement(By.xpath("//input[@accesskey=\"S\"][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();



	}



}
