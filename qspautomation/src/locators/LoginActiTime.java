package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://desktop-1k4b853/login.do");
	      //to.login
	      driver.findElement(By.name("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      Thread.sleep(3000);
	      driver.findElement(By.id("loginButton")).click();
	}

}
