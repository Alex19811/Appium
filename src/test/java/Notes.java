import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class Notes {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");

        desiredCapabilities.setCapability("deviceName", "Xiaomi 5A");

        desiredCapabilities.setCapability("appPackage", "com.miui.notes");

        desiredCapabilities.setCapability("appActivity", "com.miui.notes.ui.NotesListActivity");

        //if set app capability application will be reinstalled each run

        desiredCapabilities.setCapability("app", "/path/to/android/app.apk");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AppiumDriver driver = new AppiumDriver(url, desiredCapabilities);

        String sessionId = driver.getSessionId().toString();


        driver.findElementsBy = (By.id(com.miui.notes:id/preview));

        WebElement title = driver.findElement(By.id(com.miui.notes:id/preview);
        title.getText();

        List<WebElement> titles = driver.findElements(By.id(com.miui.notes:id/preview));



//        for (WebElement title : titles) {
  //          System.out.println(title.getText());
        }
    }

}

