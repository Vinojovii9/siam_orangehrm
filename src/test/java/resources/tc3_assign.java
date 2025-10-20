package resources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc3_assign {

	public tc3_assign(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	 @FindBy(xpath="//a[normalize-space()='Apply']")
     WebElement apply;
	 
	 @FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']")
     WebElement capture_text;

	public void apply_tab() {
		apply.click();		
	}
	
	public void getTextName() {
		String text = capture_text.getText();
		System.out.println("TC2: "+text);
	}

}