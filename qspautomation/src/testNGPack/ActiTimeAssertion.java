package testNGPack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class ActiTimeAssertion
{
	WebDriver driver;
 
  @BeforeMethod
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://desktop-1k4b853/login.do");  
  }
  @Test
  public void f() throws InterruptedException
  {
	String loginPageTitle = driver.getTitle();  
	SoftAssert softassert = new SoftAssert();
	
	//softassert
	softassert.assertEquals(loginPageTitle, "actiTime-Login");
	Reporter.log("login Page title is verified",true);
	
	//hard assert
	boolean statusOfusernameTextBox = driver.findElement(By.name("username")).isDisplayed();
	Assert.assertEquals(statusOfusernameTextBox,true);
	Reporter.log("password text box is displayed",true);
	driver.findElement(By.name("username")).sendKeys("admin");
	//.........................................................
	//hard assert
		boolean statusOfpasswordTextBox = driver.findElement(By.name("pwd")).isDisplayed();
		Assert.assertEquals(statusOfusernameTextBox,true);
		Reporter.log("password text box is displayed",true);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//.............................................................
		
		//hard assert
		boolean statusOfLoginButton= driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertEquals(statusOfusernameTextBox,true);
		Reporter.log("password text box is displayed",true);
		driver.findElement(By.id("loginButton")).click();
		//..........................................................
		
		Thread.sleep(4000);
		String homePageTitle = driver.getTitle();
		softassert.assertEquals(homePageTitle, "actiTime-Enter Time-Track");
		Reporter.log("Home Page title is verified",true);
		
		Reporter.log("create user",true);
		Reporter.log("create reports",true);
		softassert.assertAll();
	
  }
  
  

  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
  }

}
