package pages;

import Base.BaseUtil;
import pages.HomePage;
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
    HomePage home = new HomePage(driver);

    public LoginPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "input_field")
    public MobileElement inputPhoneNumber;

    @AndroidFindBy(id = "button_continue")
    public MobileElement btnContinue;

    @AndroidFindBy(id = "button_register")
    public MobileElement btnDownload;

    @AndroidFindBy(id = "iv_dialog_dismiss")
    public MobileElement btnCloseDialog;

    @AndroidFindBy(id = "country_picker_image")
    public MobileElement btnChangeCountry;

    @AndroidFindBy(id = "input_search")
    public MobileElement inputCountryName;

    @AndroidFindBy(id = "authui_otp_edit_text")
    public MobileElement inputOTP;

    @AndroidFindBy(id = "layout_country_picker_item")
    public MobileElement btnSelectCountry;

    @AndroidFindBy(id = "interstitial_image")
    public MobileElement imgTokenFree;

    @AndroidFindBy(id = "ll_button_container")
    public MobileElement btnOkay;

    By by_inputNumber = By.id("input_field");
    By by_btnDownload = By.id("button_register");

    public void CheckElementLoginPage() throws InterruptedException {
        action.waitUntiElementPresent(by_inputNumber);
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
        action.waitUntiElementPresent(by_btnDownload);
        action.checkTextCountains("Let’s get you a Gojek account");
        btnDownload.isDisplayed();
        btnCloseDialog.click();
    }

    public void loginWithIndiaNumber() throws InterruptedException {
        btnChangeCountry.click();
        inputCountryName.sendKeys("India");
        btnSelectCountry.isDisplayed();
        btnSelectCountry.click();
        inputPhoneNumber.sendKeys("7998755888");
        btnContinue.click();
        inputOTP.sendKeys("1234");
        btnOkay.isDisplayed();
//        imgTokenFree.isDisplayed();
//        action.androidBack();
        btnOkay.click();
    }

    public void userDoLogin() throws InterruptedException {
        home.ClickButtonLogin();
        loginWithIndiaNumber();


    }

}
