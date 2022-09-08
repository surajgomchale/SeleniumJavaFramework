package pageObjectModel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException  {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
		
		
		bt.closeBrowser();
	}

}
