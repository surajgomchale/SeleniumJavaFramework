package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/Suraj/checkbox.html");
		Thread.sleep(3000);
		
		WebElement automationCheckBox = driver.findElement(By.id("automation"));
		automationCheckBox.click();
		boolean status = automationCheckBox.isSelected();
      System.out.println(status);
	}

}
