package tc_execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class base_setup {
	
	public static WebDriver driver;
	
	public base_setup() {
			PageFactory.initElements(driver, this);
		}
	
	@BeforeSuite
    public void setUpSuite() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println("Browser launched successfully.");
    }

    @AfterSuite
    public void tearDownSuite() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}