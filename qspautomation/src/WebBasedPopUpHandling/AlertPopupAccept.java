package WebBasedPopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupAccept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("file:///C:/Users/HP/Desktop/Suraj/alert.html");
        driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
        
       Alert a1 = driver.switchTo().alert();
       Thread.sleep(2000);
      a1.accept();
	}

}
