package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("file:///C:/Users/HP/Desktop/Suraj/textbox.html");
	      
	      //how to user tagname locator
	      driver.findElement(By.tagName("input")).sendKeys("Admin");
	}

}
