package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib extends BaseTest {
   public void verifyPageTitle(String expectedTitle ,String pageName)
{

	String actualTitle = driver.getTitle();
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("The title is matched for "+pageName);
	}
	else
	{
		System.out.println("The title is not matched "+pageName);
	}
}
   
   public String getTitleOfWebpage(String pageName)
   {
	   String titleOfpage = driver.getTitle();
	   return titleOfpage;
   }
   
   //overloaded method
    public void switchToFrame(int index)
    {
    	driver.switchTo().frame(index);
    }
    
    public void switchToFrame(String nameOrId)
    {
    	driver.switchTo().frame(nameOrId);
    }
    
    public void switchToFrame(WebElement frameElement)
    {
    	driver.switchTo().frame(frameElement);
    }
    
    
    public void maximizeTheBrowser()
    {
    	driver.manage().window().maximize();
    }
    
    
    //method overloading
    public void selectOptionOfDropdown(WebElement element,int index)
    {
    	Select sel = new Select(element);
    	sel.selectByIndex(index);
    }
    
    public void selectOptionOfDropdown(WebElement element,String value)
    {
    	Select sel = new Select(element);
    	sel.selectByValue(value);
    }
    
    public void selectOptionOfDropdown(String visibleText,WebElement element)
    {
    	Select sel = new Select(element);
    	sel.selectByVisibleText(visibleText);
    }
    
    public void acceptAlertPopup()
    {
    	Alert a1 = driver.switchTo().alert();
    	a1.accept();
    }
    
    public void accepConfirmationpopuptAlertPopup()
    {
    	Alert a1 = driver.switchTo().alert();
    	a1.accept();
    }
    
    public void dismissConfirmationPopup()
    {
    	Alert a1 = driver.switchTo().alert();
    	a1.dismiss();
    }
    
    public void rightClick(WebElement target)
    {
    	Actions act = new Actions(driver);
    	act.contextClick(target).perform();
    }
    public void doubleClick(WebElement target)
    {
    	Actions act = new Actions(driver);
    	act.doubleClick(target).perform();
    }
    public void mouseHover(WebElement target)
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(target).perform();
    }
    public void dragAndDropFeature(WebElement source,WebElement destination)
    {
    	Actions act = new Actions(driver);
    	act.dragAndDrop(source, destination).perform();
    }
    
    public void hitTheButton() throws AWTException
    {
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    }
    
    public void copyTheText() throws AWTException 
    {
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_C);
    	
    	robot.keyRelease(KeyEvent.VK_C);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    
    public void pasteTheText() throws AWTException 
    {
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    public void scrollDown(int pixelCount)
    {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,"+pixelCount+")");
    }
    
    public void scrollUp(int pixelCount)
    {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,"+(-pixelCount)+")");
    }
    public void scrollLeft(int pixelCount)
    {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy("+pixelCount+",0)");
    }
    public void scrollRight(int pixelCount)
    {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy("+pixelCount+",0)");
    }
    public void scrollTillAPerticularWebElement(WebElement target)
    {
    	Point loc = target.getLocation();
    	int xaxis = loc.getX();
    	int yaxis = loc.getY();
    	
    	
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
    }
    
    public void getAllOptionOfDropdown(WebElement element)
    {
    	Select sel = new Select(element);
    	List<WebElement> allops = sel.getOptions();
    	
    	for(WebElement op:allops)
    	{
          String text = op.getText();
    		System.out.println(text);
    	}
    }
    
    
    
}