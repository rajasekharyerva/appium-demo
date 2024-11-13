import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy.ByAccessibilityId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class FirstTest extends AppiumTest {

    @Test
    public void test() throws Exception {
        // Explicit wait: Wait for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on the "Alarm" tab (assuming it is the first tab in the UI)
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Alarm"))).click();

        // Click on "Add Alarm" button (use resource-id, text, or accessibility ID)
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.deskclock:id/fab"))).click();

        // Set the alarm time (example: 6:30 AM)
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("6 o'clock"))).click(); // Select hour 6 o'clock

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("30 minutes"))).click(); // Select minutes

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.CompoundButton[@text='AM']"))).click(); // Select AM/PM

        // Confirm the alarm setup
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text='OK']"))).click();

        // Verify the alarm was set
        System.out.println("Alarm set successfully!");

    }
}