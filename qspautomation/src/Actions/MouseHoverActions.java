package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:www.bluestone.com");

		driver.findElement(By.xpath("//span[.='Allow']")).click();
	      WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ' and @title='Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		 driver.findElement(By.id("//span[.='Kadas']")).click();
	}

}
