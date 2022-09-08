package launchBrowser;


import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefox {

	public static void main(String[] args)throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();//open firefox browser
	Thread.sleep(5000);//delay of 5 sec
	driver.close(); //close the browser
		

	}

}
