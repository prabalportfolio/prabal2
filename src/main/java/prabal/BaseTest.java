package prabal;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
protected AndroidDriver driver;

protected void setUp() throws MalformedURLException {
    File f = new File("src");
    File fs = new File(f, "theScore_ Sports News & Scores_23.1.0_Apkpure.apk");
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ScoreTest");
    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    // Wait for app load
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

protected void tearDown() {
    driver.quit();
}

}
