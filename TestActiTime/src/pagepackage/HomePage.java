package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration
	@FindBy(xpath = "//select[contains(@name,'Selector')]") private WebElement enterTimeTrckDropDown;
	@FindBy(xpath = "//a[.='Create new tasks']") private WebElement  createNewTaskLink;
	@FindBy(id = "SubmitTTButton") private WebElement saveLeaveTimeButton;
	@FindBy(xpath = "//span[.='Help & Support']") private WebElement helpAndSupportLink;
	@FindBy(xpath = "//span[contains(text(),'iPhone')]") private WebElement actiTimeForIPhone;
	@FindBy(xpath = "//a[.='Logout']") private WebElement logOutLink;
	
	//initialization
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	//utilization
	

	public WebElement getEnterTimeTrckDropDown() {
		return enterTimeTrckDropDown;
	}
	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}
	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}
	public WebElement getHelpAndSupportLink() {
		return helpAndSupportLink;
	}
	public WebElement getActiTimeForIPhone() {
		return actiTimeForIPhone;
	}
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	//operational method
	public void logoutActiTimetime()
	{
		logOutLink.click();
	}
	}

