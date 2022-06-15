package Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseUtil {

    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;
    public static TouchAction touchAction;
    public WebDriverWait wait;
    public static String packageName = "";


    public void setupAppium(String urlServer) throws MalformedURLException, IOException {

        System.out.println("instance " + this.getClass().getSimpleName());
        //    PCloudyAppiumSession pCloudySession;
        Properties configFile = new Properties();
        configFile.load(BaseUtil.class.getClassLoader().getResourceAsStream("config.properties"));
        String apk_Path = System.getProperty("user.dir")
                + configFile.getProperty("androidAppLocation");
        DesiredCapabilities caps = new DesiredCapabilities();
        capabilities = new DesiredCapabilities();
        try {
            url = new URL(configFile.getProperty(urlServer));
            switch (urlServer) {
                /* Use Local Server */
                case "localURL":
                    capabilities.setCapability(MobileCapabilityType.UDID, configFile.getProperty("udid"));
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, configFile.getProperty("androidPlatformName"));
                    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, configFile.getProperty("androidPlatformVersion"));
                    capabilities.setCapability(AndroidCapabilityType.APP_PACKAGE, configFile.getProperty("androidAppPackage"));
                    capabilities.setCapability(AndroidCapabilityType.APP_ACTIVITY, configFile.getProperty("androidAppActivity"));
                    capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
                    capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
                    capabilities.setCapability(AndroidCapabilityType.AUTO_GRANT_PERMISSION, "true");
                    //capabilities.setCapability(MobileCapabilityType.APP, apk_Path);
                    driver = new AndroidDriver <MobileElement>(url, capabilities);

                    break;

                /* Use Cloud Server */
                case "cloudURL":
                    // Set your access credentials
                    capabilities.setCapability("browserstack.user", "rahmatzailani_nNORfs");
                    capabilities.setCapability("browserstack.key", "vssz8kgHJaxekx695RNS");

                    // Set URL of the application under test
                    capabilities.setCapability("app", "bs://97ed92bf3f142df76b49eed0f9ecfdcd3d538d12");

                    // Specify device and os_version for testing
                    capabilities.setCapability("device", "Google Pixel 3a XL");
                    capabilities.setCapability("os_version", "9.0");

                    // Set other BrowserStack capabilities
                    capabilities.setCapability("project", "");
                    capabilities.setCapability("build", " ");
                    capabilities.setCapability("name", "");
                    driver = new AndroidDriver<MobileElement>(
                            new URL("http://hub.browserstack.com/wd/hub"), capabilities);

                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

 //       driver = new AndroidDriver <MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.hideKeyboard();
        wait = new WebDriverWait(driver, 15);

//        //Populating the properties file
        configFile.setProperty("Device Name", "udid");
        configFile.setProperty("Android Version", "androidPlatformVersion");
        File file = new File("target\\allure-results");
        FileOutputStream fileOut = new FileOutputStream(file);
        configFile.store(fileOut, "Device Info");
        fileOut.close();
    }

}