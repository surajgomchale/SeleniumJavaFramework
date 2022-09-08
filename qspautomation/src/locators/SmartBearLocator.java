package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBearLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.get("https://my.smartbear.com/login.asp?returnUrl=/index.asp");
	      Thread.sleep(3000);
	      driver.findElement(By.id("email")).sendKeys("admin");
	      driver.findElement(By.id("password")).sendKeys("manager");
	      driver.findElements(By.id("submit"));
	}

}