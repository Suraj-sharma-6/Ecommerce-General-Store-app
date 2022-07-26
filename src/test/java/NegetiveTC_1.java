import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class NegetiveTC_1 extends Base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver=capabilities();
        driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        driver.findElement(By.xpath("//*[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        String errorMessege= driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
        System.err.println(errorMessege);
    }

}
