import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver;
        File f = new File("src");
        File fs = new File(f, "General-Store.apk");
//        File fs = new File(f, "PDF Reader.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,15);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5 API 28");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
//         driver=new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),cap);

    }

}
