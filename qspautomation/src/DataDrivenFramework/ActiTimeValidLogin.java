package DataDrivenFramework;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://desktop-1k4b853/login.do");
	
		Flib flib = new Flib();
		
		String username =flib.readExcelData("./data/ActiTimeValidTestData.xlsx","validcrds",1,0);
		String password =flib.readExcelData("./data/ActiTimeValidTestData.xlsx","validcrds",1,1);
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		//Thread.sleep(3000);
		 driver.findElement(By.id("loginButton")).click();
		 

	}

}
