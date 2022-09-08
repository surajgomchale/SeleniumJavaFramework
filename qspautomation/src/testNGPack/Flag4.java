package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void actiTimeLogin() 
  {
	int i=9/0;
	System.out.println(i);
	 Reporter.log("login successful",true);
  }
  
  
  @Test(dependsOnMethods = "actiTimeLogin")
  public void actiTimeCreateUser() 
  {
	
	 Reporter.log("Create user",true);
  }
  
  @Test(dependsOnMethods = "actiTimeCreateUser")
  public void actiTimeLogout() 
  {
	
	 Reporter.log("Logout successful",true);
  }
}
