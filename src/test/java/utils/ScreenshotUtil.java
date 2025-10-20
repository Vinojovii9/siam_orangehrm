package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String fileName) {
    	String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS").format(new Date());
    	String fileNames = "screenshot_" + timestamp + ".png";
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir") + "/screenshots/" + fileNames);

        try {
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
