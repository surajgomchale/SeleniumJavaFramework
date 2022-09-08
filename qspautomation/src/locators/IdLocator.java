package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("file:///C:/Users/HP/Desktop/Suraj/textbox.html");
       
      //how to user id locator
      driver.findElement(By.id("i1")).sendKeys("suraj");
	}

}
