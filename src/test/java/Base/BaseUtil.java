package Base;
import Base.AndroidCapabilityType;
import Base.BaseData;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import steps.LoginStep;

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
                    capabilities.setCapability(MobileCapabilityType.APP, apk_Path);
                    driver = new AndroidDriver <MobileElement>(url, capabilities);

                    break;

                /* Use Cloud Server */
                case "cloudURL":
                    // Set your access credentials
                    capabilities.setCapability("browserstack.user", "pramod228");
                    capabilities.setCapability("browserstack.key", "uHVi2pss6A7AZuLsjwnA");

                    // Set URL of the application under test
                    capabilities.setCapability("app", "bs://20790b7661bb499f96afae5dba529a52be716634");

                    // Specify device and os_version for testing
                    capabilities.setCapability("device", "Google Pixel 3a XL");
                    capabilities.setCapability("os_version", "9.0");

                    // Set other BrowserStack capabilities
                    capabilities.setCapability("project", "CUCUMBER STAGING");
                    capabilities.setCapability("build", "Java Android");
                    capabilities.setCapability("name", "Go_Cucumber");
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

    public void getPackage() throws InterruptedException {
        LoginPage page = new LoginPage(driver);

        //driver.closeApp();
        String getPackage = driver.getCurrentPackage();
        System.out.println(getPackage);
        packageName = getPackage+":id";
        System.out.println(packageName);
        if(getPackage.equals("com.goplay.android.dev")){
            page.userDoLogin();
        }
        else{
            System.out.println("RUNNING IN PROD");
        }
    }

    public void uninstallApp() {

        driver.removeApp(BaseData.ApplicationInformation.ANDROID_APPLICATION_PACKAGE);
    }
}