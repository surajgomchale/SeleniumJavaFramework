package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(invocationCount = 3000)
  public void f() {
	  Reporter.log("create and delete user", true);
  }
}
