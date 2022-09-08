package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Thread.sleep(3000);
		 driver.findElement(By.id("btnLogin")).click();
		 
		 driver.findElement(By.id("menu_pim_viewPimModule")).click();
		 driver.findElement(By.id("menu_pim_addEmployee")).click();
		 
		  WebElement fileUploadButton = driver.findElement(By.id("photofile"));
		  
		Actions act = new Actions(driver);
		act.doubleClick(fileUploadButton).perform(); 
		 


	}

}
