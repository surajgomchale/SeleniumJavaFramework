package PopupHandling;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("file:///C:/Users/HP/Desktop/Suraj/alert.html");
        driver.findElement(By.xpath("//button[.='Try it']")).click();
        Thread.sleep(4000);
       Alert a1 = driver.switchTo().alert();
       
      a1.accept();
	}

	

}
