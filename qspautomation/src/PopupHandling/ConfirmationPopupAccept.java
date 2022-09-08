package PopupHandling;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopupAccept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("file:///C:/Users/HP/Desktop/Suraj/comfirmation.html");
            driver.findElement(By.xpath("//button[contains(text(),'Hungry')]")).click();
            
            Alert a1 = driver.switchTo().alert();
            Thread.sleep(2000);
            a1.accept();
	}
}
