package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//login
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
	}

}
