package pagepackage;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {

		//declaration
		@FindBy(name="username")private WebElement usn;
		@FindBy(name="pwd")private WebElement pass;
		@FindBy(id="loginButton")private WebElement loginbutton;
		@FindBy(id="keepLoggedInCheckBox")private WebElement checkbox;
		@FindBy(xpath="//a[contains(text(),'Actimind Inc.')]")private WebElement linkActime;
		@FindBy(id="licenseLink")private WebElement lincencse;
		
		//intialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		public WebElement getUsn() {
			return usn;
		}
		
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLoginbutton() {
			return loginbutton;
		}
		public WebElement getCheckbox() {
			return checkbox;
		}
		public WebElement getLinkActime() {
			return linkActime;
		}
		public WebElement getLincencse() {
			return lincencse;
		}
		
		
		//operational method
		
		public void validLoginActiTime(String validusername,String validpassword) {
			
			usn.sendKeys(validusername);
			pass.sendKeys(validpassword);
			loginbutton.click();
		}
		public void invalidLoginActiTime(String invalidusername,String invalidpassword) throws InterruptedException {
			
			usn.sendKeys(invalidusername);
			pass.sendKeys(invalidpassword);
			loginbutton.click();
			Thread.sleep(3000);
			usn.clear();
		}
	}


