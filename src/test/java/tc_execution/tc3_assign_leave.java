package tc_execution;
import org.testng.annotations.Test;

import resources.tc3_assign;
import utils.ScreenshotUtil;


public class tc3_assign_leave extends base_setup {
	
	 //WebDriver driver;
	 
	 public tc3_assign_leave() {
		 super();
	 }
	
	@Test
	void assign_leave() throws InterruptedException {
		System.out.println("tc3");
		tc3_assign tc3 = new tc3_assign(driver);
		tc3.assign("ad");
		ScreenshotUtil.takeScreenshot(driver, "after_assign");
		tc3.alertwindow();
		ScreenshotUtil.takeScreenshot(driver, "after_alertwindow");
		tc3.toast();
		ScreenshotUtil.takeScreenshot(driver, "after_toast");
	}
	
}
