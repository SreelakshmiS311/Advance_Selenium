package Organisation;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCampaign {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
	FileInputStream fis = new FileInputStream("./src/test/resources/camdata.properties.txt");
	Properties pro = new Properties();
	pro.load(fis);
	
	String URL = pro.getProperty("url");
	String username= pro.getProperty("username");
	String pwd=pro.getProperty("password");
	String name=pro.getProperty("name");
	
	
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[src='themes/softed/images/menuDnArrow.gif']")).click();
		driver.findElement(By.linkText("Campaigns")).click();		
		driver.findElement(By.cssSelector("img[src='themes/softed/images/btnL3Add.gif']")).click();
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		String campaignName = name + ranNum;
		driver.findElement(By.name("campaignname")).sendKeys(campaignName);
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();


	}

}
