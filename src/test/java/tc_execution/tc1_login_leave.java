package tc_execution;
import org.testng.annotations.Test;

import resources.tc1_login;
import utils.ScreenshotUtil;


public class tc1_login_leave extends base_setup {
	
	 //WebDriver driver;
	 
	 public tc1_login_leave() {
		 super();
	 }
	
	@Test
	void login_leave_menu() throws InterruptedException {
		System.out.println("tc1");
		tc1_login tc1 = new tc1_login(driver);
		tc1.orangehrm_lauch();
		tc1.creds();
		ScreenshotUtil.takeScreenshot(driver, "after_creds");
		tc1.login_button();
		ScreenshotUtil.takeScreenshot(driver, "after_login_button");
		tc1.leave_menu();

		
	}
	
}
