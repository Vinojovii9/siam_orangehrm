package tc_execution;

import org.testng.annotations.Test;

import resources.tc2_apply;

import java.time.Duration;

public class tc2_apply_leave extends base_setup{
	
	public tc2_apply_leave() {
		 super();
	 }
	
	@Test
	void tc2_exececute() throws InterruptedException {
		System.out.println("tc2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		tc2_apply tc2 = new tc2_apply(driver);
		tc2.apply_tab();
		tc2.getTextName();
	}

}
