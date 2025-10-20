package tc_execution;
import org.testng.annotations.Test;

import resources.tc1_login;


public class tc1_login_leave extends base_setup {
	
	 //WebDriver driver;
	 
	 public tc1_login_leave() {
		 super();
	 }
	
	@Test
	void tc_execute() throws InterruptedException {
		System.out.println("tc1");
		tc1_login tc1 = new tc1_login(driver);
		tc1.orangehrm_lauch();
		tc1.creds();
		tc1.login_button();
		tc1.leave_menu();

		
	}
	
}
