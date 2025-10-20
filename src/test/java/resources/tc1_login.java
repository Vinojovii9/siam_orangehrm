package resources;

import org.testng.asserts.SoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SharedData;


public class tc1_login {
	
	private WebDriver driver;
	
	public tc1_login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void orangehrm_lauch() {
		
		String actual_page_title = "OrangeHRM";
		String pagetitle = driver.getTitle();
    	SharedData.pagetitle = pagetitle;
    	
    	SoftAssert	st=new SoftAssert();
    	st.assertEquals(actual_page_title, pagetitle);
    	st.assertAll();
    	
    	if(pagetitle.equals(actual_page_title)) {
    		System.out.println("Page title: "+ SharedData.pagetitle);
    	} else {
    		System.out.println("OrangeHRM has not loaded");
    	}
	}
	
	public void creds() throws InterruptedException {
		String username = driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']")).getText().split(":")[1].trim();
        SharedData.username = username;
        String password = driver.findElement(By.xpath("//p[normalize-space()='Password : admin123']")).getText().split(":")[1].trim();
        SharedData.password = password;

        System.out.println("Username: " + SharedData.username);
        System.out.println("Password: " + SharedData.password);

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
	}
	
	 @FindBy(xpath="//button[@type='submit']")
     WebElement loginBtn;
     
     public void login_button() throws InterruptedException {
         loginBtn.click();
         Thread.sleep(2000);
     }
	
	public void leave_menu() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']")).click();
		Thread.sleep(2000);
		
		boolean apply = driver.findElement(By.xpath("//div[@class='oxd-topbar-body']//li[1]")).isEnabled();
		boolean assign = driver.findElement(By.xpath("//a[normalize-space()='Assign Leave']")).isEnabled();
		
		if(apply == true && assign == true) {
			System.out.println("Apply leave and Assign leave options are visible");
		}
	}	
}
