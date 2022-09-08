package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ways4Syntax2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver,chrome.driver", "./drivers/chromedriver,exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");


	}

}
