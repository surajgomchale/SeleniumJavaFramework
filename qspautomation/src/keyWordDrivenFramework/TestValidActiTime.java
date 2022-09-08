package keyWordDrivenFramework;



import java.io.IOException;

import org.openqa.selenium.By;

public class TestValidActiTime extends BaseTest {

	public static void main(String[] args) throws  IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		
		String username = flib.readPropertyData(PROP_PATH,"username");
		String password = flib.readPropertyData(PROP_PATH,"password");
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);
		 driver.findElement(By.id("loginButton")).click();
		 
		 Thread.sleep(4000);
         bt.closeBrowser(); //close all browsers
	}

}
