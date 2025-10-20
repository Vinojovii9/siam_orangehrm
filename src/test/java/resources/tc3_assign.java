package resources;
import java.time.Duration;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc3_assign {
	
	private WebDriver driver;

	public tc3_assign(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	 @FindBy(xpath="//a[normalize-space()='Assign Leave']")
     WebElement assign_tab;
	 
	 @FindBy(xpath="//input[contains(@placeholder,'Type')]")
     WebElement emp_name;
	 
	 @FindBy(xpath="//span[contains(text(),'Radha')]")
	 WebElement name_value;
	 
	 @FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	 WebElement type;
	 
	 @FindBy(xpath="//span[normalize-space()='US - Personal']")
	 WebElement type_val;
	 
	 @FindBy(xpath="//label[text()='From Date']/ancestor::div[contains(@class,'oxd-input-group')]/descendant::i")
	 WebElement from_cal_icon;
	 
	 @FindBy(xpath="//div[contains(text(),'23')]")
	 WebElement from_dt;
	 
	 @FindBy(xpath="//label[text()='To Date']/ancestor::div[contains(@class,'oxd-input-group')]/descendant::i")
	 WebElement end_cal_icon;
	 
	 @FindBy(xpath="//div[contains(text(),'23')]")
	 WebElement end_dt;
	 
	 @FindBy(xpath="//button[normalize-space()='Assign']")
	 WebElement assign_bn;
	 
	 @FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--card-title']")
	 WebElement alert_tit;
	 
	 @FindBy(xpath="//button[normalize-space()='Cancel']")
	 WebElement cancel_bn;
	 
	 @FindBy(xpath="//button[normalize-space()='Ok']")
	 WebElement accept_bn;
	 
	 @FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']")
	 WebElement toast_tit;
	 
	 @FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
	 WebElement toast_msg;

	 public void assign (String name) throws InterruptedException {
		assign_tab.click();
		emp_name.click();
		emp_name.sendKeys(name);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(name_value));
		name_value.click();
		Thread.sleep(2000);
		type.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", type_val);
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(30));
		waits.until(ExpectedConditions.visibilityOf(type_val));
		type_val.click();
		Thread.sleep(2000);
		from_cal_icon.click();
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait3.until(ExpectedConditions.visibilityOf(from_dt));
		from_dt.click();
		Thread.sleep(3000);
		end_cal_icon.click();
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait4.until(ExpectedConditions.visibilityOf(end_dt));
		end_dt.click();
		Thread.sleep(3000);
		assign_bn.click();			
	}
	
	public void alertwindow() throws InterruptedException {
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait4.until(ExpectedConditions.visibilityOf(alert_tit));
		//Alert alwin = driver.switchTo().alert();
		String altit = alert_tit.getText();
		String ok = accept_bn.getText();
		System.out.println(altit + "Clicked: "+ok);
		accept_bn.click();
		Thread.sleep(2000);
	}
	
	public void toast() {
		WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait5.until(ExpectedConditions.visibilityOf(toast_tit));
		String tit = toast_tit.getText();
		String msg = toast_msg.getText();
		System.out.println(tit + ": "+msg);
	}

}