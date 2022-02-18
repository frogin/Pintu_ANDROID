package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class TokenTopUpPage extends BaseUtil {
    ElementAction action = new ElementAction();

    @AndroidFindBy(id = "btn_topup_token")
    public MobileElement buttonTopup;
    @AndroidFindBy(id = "top_up_title")
    public MobileElement textTopupTitle;
    @AndroidFindBy(id = "tokens_info")
    public MobileElement textTokenAmount;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='5.000']")
    public MobileElement itemTokenSKU;
    @AndroidFindBy(id = "tv_value_text")
    public MobileElement payToken;
    @AndroidFindBy(id = "alert")
    public MobileElement insufficientAlert;
    @AndroidFindBy(id = "ll_button_container")
    public MobileElement insufficientTopupButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Itadakimas!']")
    public MobileElement VGitemMurah;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Teddy']")
    public MobileElement VGitemMahal;

    public TokenTopUpPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void insufficientToken(){
        VGitemMurah.click();
        VGitemMahal.click();
        insufficientAlert.isDisplayed();
        insufficientTopupButton.click();
        textTopupTitle.isDisplayed();
        itemTokenSKU.click();
        payToken.click();
    }
    public void topupTokenFlow(){
        buttonTopup.click();
        textTopupTitle.isDisplayed();
        itemTokenSKU.click();
        payToken.click();
    }

    public void closeGooglePay(){
        driver.navigate().back();
    }
}
