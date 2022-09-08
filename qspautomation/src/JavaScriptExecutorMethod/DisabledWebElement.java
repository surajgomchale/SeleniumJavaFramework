package JavaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/HP/Desktop/Suraj/textbox.html");
		
		JavascriptExecutor ise = (JavascriptExecutor)driver;
		ise.executeScript("document.getElementById('i1').value='admin'");
	}

}
