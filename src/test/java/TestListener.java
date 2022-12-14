import browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class TestListener extends TestListenerAdapter {

    /*
    Method to take a screenshot every time a test fails,
    and print the failed test name in the terminal.
    */

    public void onTestFailure(ITestResult tr) {
        WebDriver driver = Browser.driver;
        System.out.println("######### "+tr.getName() +" #########");
        final String path = "src/main/java/screenshot";
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File(path+tr.getName()+".png");

        try {
            FileUtils.copyFile(screenshot, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
