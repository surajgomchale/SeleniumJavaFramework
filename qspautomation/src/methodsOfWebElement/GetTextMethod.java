package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.selenium.dev");
		
		WebElement web1 = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
		String textOfweb1 = web1.getText();
		System.out.println(textOfweb1);

	}

}
