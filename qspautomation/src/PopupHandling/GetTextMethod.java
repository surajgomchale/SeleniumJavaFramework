package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("file:///C:/Users/HP/Desktop/Suraj/comfirmation.html");
        driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
        Thread.sleep(4000);
       Alert a1 = driver.switchTo().alert();
       
      a1.accept();
       String text = a1.getText();
       System.out.println(text);
	}

}
