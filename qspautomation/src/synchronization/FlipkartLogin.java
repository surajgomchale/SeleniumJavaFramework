package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.flipkart.com");
        

        driver.findElement(By.xpath("//button[.='X']")).click();
        driver.findElement(By.xpath("//span[.='wish']")).click();
        driver.findElement(By.xpath("//span[.='Login']")).click();

	}

}
