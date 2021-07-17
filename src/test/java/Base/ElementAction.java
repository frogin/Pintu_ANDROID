package Base;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

public class ElementAction extends BaseUtil {

    private  BaseUtil base;

    public void hover(MobileElement element) {
        MobileElement elems= element;
        Actions builder = new Actions(driver);
        Actions hoverOverRegistrar = builder.moveToElement(elems);
        hoverOverRegistrar.perform();

    }

    public String getText(By element) {
        String text = driver.findElement(element).getText();
        return text;

    }

    public void androidBack() {

        driver.navigate().back();
    }
    public void openNotification() {

        driver.openNotifications();
    }

    public void checkerEqual(By element, String expected) {
        Assert.assertEquals(driver.findElement(element).getText(), expected);
    }

    public void checkerStringNotEqual(String actual, String expected) {
        Assert.assertNotEquals(actual,expected);
    }

    public void checkerDisabled(By element) {

        Assert.assertFalse(driver.findElement(element).isEnabled());
    }

    public void checkerEnabled(By element) {

        Assert.assertTrue(driver.findElement(element).isEnabled());
    }

    public void checkTextCountains(String text) {
        if(driver.getPageSource().contains(text))
        {
            System.out.println("Text found");
        }
        else
        {
            Assert.fail("Text doesn't found");
        }
    }

    public boolean waitUntiElementPresent(By element) {
        try{
            WebElement myDynamicElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.presenceOfElementLocated(element));
        }
        catch(TimeoutException exception) {
            return false;
        }
        return true;
    }

    public void scrollAndClick(String text) {
        String uiSelector = "new UiSelector().textMatches(\"" + text
                + "\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                + uiSelector + ");";
        driver.findElementByAndroidUIAutomator(command).click();
    }

    public static void waitForEl(By byEl){
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(byEl));
    }

}

