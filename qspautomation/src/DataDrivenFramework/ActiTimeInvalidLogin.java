package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://desktop-1k4b853/login.do");
	
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/ActiTimeValidTestData.xlsx","invalidcreds");
		for(int i=1;i<=rc;i++)
		{
		String username =flib.readExcelData("./data/ActiTimeValidTestData.xlsx","invalidcreds",i,0);
		String password =flib.readExcelData("./data/ActiTimeValidTestData.xlsx","invalidcreds",i,1);
		
		System.out.println(i);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(4000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.name("username")).clear();
		}
	}

	}
