package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import steps.APISupport;

public class LoginPage extends BaseUtil {

    ElementAction action = new ElementAction();
    APISupport API = new APISupport();

    public LoginPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.goplay.android:id/input_field")
    public MobileElement inputPhoneNumber;

    @AndroidFindBy(id = "com.goplay.android:id/button_continue")
    public MobileElement btnContinue;

    @AndroidFindBy(id = "com.goplay.android:id/button_register")
    public MobileElement btnDownload;

    @AndroidFindBy(id = "com.goplay.android:id/iv_dialog_dismiss")
    public MobileElement btnCloseDialog;

    By by_inputNumber = By.id("com.goplay.android:id/input_field");
    By by_btnDownload = By.id("com.goplay.android:id/button_register");

    public void CheckElementLoginPage() throws InterruptedException {
        action.waitForEl(by_inputNumber);
        inputPhoneNumber.isDisplayed();
        btnContinue.isDisplayed();;
    }

    public void InputWrongNumber() throws Throwable {
        API.iPerformPOSTOperationForWithBody2("/assembly/engine/v4/hello");
        String otp= APISupport.token;
        inputPhoneNumber.sendKeys(otp);
        btnContinue.click();
    }

    public void CheckModalRegister() throws InterruptedException {
        action.waitForEl(by_btnDownload);
        action.checkTextCountains("Let’s get you a Gojek account");
        btnDownload.isDisplayed();
        btnCloseDialog.click();
    }

}
