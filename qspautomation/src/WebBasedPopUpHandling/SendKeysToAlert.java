package WebBasedPopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
// org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SendKeysToAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(3000);
      driver.findElement(By.id("prompt")).click();
      Alert a1 = driver.switchTo().alert();
      Thread.sleep(3000);
      a1.sendKeys("automation");
	}

}
