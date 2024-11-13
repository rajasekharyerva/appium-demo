import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class AppiumTest {

    public AndroidDriver driver;

    @BeforeMethod(alwaysRun=true)
    public void setUp() throws Exception {
        MutableCapabilities capabilities = new UiAutomator2Options();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554"); // Change to your emulator/device name
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.google.android.deskclock"); // Clock app package
        capabilities.setCapability("appActivity", "com.android.deskclock.DeskClock"); // Main activity
        driver = new AndroidDriver(new URL("http://localhost:4723"),capabilities);
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        if(driver != null)
            driver.quit();
    }
}