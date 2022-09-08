package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way4{

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ola.com/");
		
		EventFiringWebDriver suraj = new EventFiringWebDriver(driver);
	File src= suraj.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot3.png");
	   Files.copy(src, dest);
	}

}
