package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class MyAccountPage extends BaseUtil {

    ElementAction action = new ElementAction();

    public MyAccountPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "homeProfileFragment")
    public MobileElement pageMyAccount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GoPlay Access']")
    public static MobileElement txtGoplayAccess;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Enter access code']")
    public static MobileElement txtEnterAccessCode;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tokens']")
    public static MobileElement txtTokens;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Change language']")
    public static MobileElement txtChangeLanguage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Download via wi-fi]")
    public static MobileElement txtDownloadViaWifi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms of Service']")
    public static MobileElement txtTnC;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FAQ']")
    public static MobileElement txtFAQ;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy Policy']")
    public static MobileElement txtPrivacyPolicy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Report Issue']")
    public static MobileElement txtReporIssue;

    @AndroidFindBy(id = "button_contact_customer_care")
    public MobileElement btnGetAccess;

    @AndroidFindBy(id = "subscribe_button")
    public MobileElement btnChoose;

    @AndroidFindBy(id = "clear_button")
    public MobileElement btnCloseSubs;

    @AndroidFindBy(id = "restore_button")
    public MobileElement btnManageSubs;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GoPlay access (besides 1-month)']")
    public static MobileElement txtPaymentOptionOne;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Watch on GoPlay and get vouchers!']")
    public static MobileElement txtPaymentOptionTwo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1-month subscription (GoPlay)']")
    public static MobileElement txtPaymentOptionThree;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Choose']")
    public static MobileElement txtChoose;

    @AndroidFindBy(id = "com.gojek.app:id/boarding_illustration")
    public MobileElement frameGojek;

    @AndroidFindBy(id = "com.android.vending:id/0_resource_name_obfuscated")
    public MobileElement txtGooglePlay;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public static MobileElement btnOK;

    @AndroidFindBy(xpath = "//android.view.View[@text='Langganan 1 bulan']")
    public static MobileElement txtLangganan1Bulan;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Hubungkan']")
    public static MobileElement txtHubungkan;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='1-month subscription']")
    public static MobileElement txtMonthSubs;

    @AndroidFindBy(id = "button_continue")
    public MobileElement btnApply;

    @AndroidFindBy(id = "promo_code_input")
    public MobileElement inputPromoCode;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/" +
            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView[2]")
    public MobileElement txtTokenValueMyAccount;

    @AndroidFindBy(id = "balance_field")
    public MobileElement txtTokenValue;

    @AndroidFindBy(id = "token_balance_label")
    public MobileElement txtCurrentBalance;

    @AndroidFindBy(id = "offset_button")
    public MobileElement btnHowGetToken;

    @AndroidFindBy(xpath = "//android.view.View[@text='How to earn more token']")
    public static MobileElement txtEarnMoreToken;

    @AndroidFindBy(id = "btnSwitch")
    public MobileElement toogleDownload;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GOPLAY-DEV']")
    public static MobileElement txtGoplayDEV;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    public static MobileElement btnNavigateBack;

    @AndroidFindBy(id = "button_once")
    public MobileElement btnOnce;

    @AndroidFindBy(id = "com.goplay.android:id/web_view")
    public MobileElement txtWebview;



    public void gotoMyAccount() {
        pageMyAccount.click();
        txtGoplayAccess.isDisplayed();
    }

    public void checkGoplayAccess() {
        txtGoplayAccess.click();
        btnGetAccess.click();
        btnChoose.isDisplayed();
        btnManageSubs.isDisplayed();
        action.checkTextCountains("Popular offers");
        //action.checkTextCountains("Subscribe GoPlay");
        btnChoose.click();
        txtLangganan1Bulan.isDisplayed();
        action.checkTextCountains("Choose an access to start watching on GoPlay");
        action.checkTextCountains("Langganan 1 bulan");
        action.checkTextCountains("Diperpanjang secara otomatis");
        action.checkTextCountains("Rp45.000");
        txtChoose.click();
        txtHubungkan.isDisplayed();
        action.checkTextCountains("Mau bayar pakai apa?");
        action.checkTextCountains("Hubungkan");
        action.checkTextCountains("Kartu Kredit");
        action.checkTextCountains("Pulsa");
        action.androidBack();
        action.androidBack();
        txtPaymentOptionTwo.click();
        btnChoose.click();
        frameGojek.isDisplayed();
        action.checkTextCountains("Welcome to Gojek!");
        action.androidBack();
//        txtPaymentOptionThree.click();
//        btnChoose.click();
//        txtMonthSubs.isDisplayed();
//        action.androidBack();
//        btnOK.click();
    }

    public void checkGoplayAccessStaging() {
        txtGoplayAccess.click();
        btnGetAccess.click();
        btnChoose.isDisplayed();
        btnManageSubs.isDisplayed();
        txtPaymentOptionTwo.click();
        btnChoose.click();
        frameGojek.isDisplayed();
        action.checkTextCountains("Welcome to Gojek!");
        action.androidBack();
    }

    public void checkEnterAccessCode()throws InterruptedException {
        txtEnterAccessCode.click();
        btnApply.isDisplayed();
        Thread.sleep(1500);
        action.checkTextCountains("Type your GoPlay promo code here");
        inputPromoCode.sendKeys("4444");
        btnApply.click();
        Thread.sleep(1500);
        action.checkTextCountains("Sorry. This code is either fully redeemed or invalid.");
    }

    public void checkTokens() {
        String token_Value1= txtTokenValueMyAccount.getText();
        txtTokens.click();
        txtCurrentBalance.isDisplayed();
        String token_Value2= txtTokenValue.getText();
        Assert.assertEquals(token_Value1,token_Value2);
        action.checkTextCountains("Current balance");
        action.checkTextCountains("History");
        btnHowGetToken.click();
//        btnNavigateBack.isDisplayed();
//        action.androidBack();
//        action.androidBack();
    }


}
