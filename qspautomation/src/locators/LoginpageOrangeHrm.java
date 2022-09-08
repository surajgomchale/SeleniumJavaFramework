package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageOrangeHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rt4.orangehrm.com/");
	      
	      //to login
	      driver.findElement(By.name("user")).sendKeys("Admin");
	      driver.findElement(By.name("pass")).sendKeys("admin123");
	      
	      driver.findElement(By.id("login")).click();

	}

}
