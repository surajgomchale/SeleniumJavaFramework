package JavaScriptExecutorMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		
		//scrollDown
		JavascriptExecutor ise = (JavascriptExecutor)driver;
		ise.executeScript("window.scrollBy(0,1000)");
		
		//scrollUp
		Thread.sleep(4000);
		ise.executeScript("window.scrollBy(0,-1000)");
	}

}
