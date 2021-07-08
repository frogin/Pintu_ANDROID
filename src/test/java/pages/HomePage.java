package pages;

import Base.BaseData;
import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseUtil {

    ElementAction action = new ElementAction();

    public HomePage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.goplay.android:id/btn_login")
    public MobileElement btnLogin;

    @AndroidFindBy(id = "com.goplay.android:id/img_country_picker")
    public MobileElement btnCountryFlag;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bahasa Indonesia']")
    public MobileElement txtBahasa;

    public void Check(String userName, String password)
    {
        btnLogin.click();

//        txtUserName.sendKeys(userName);
//        txtPassword.sendKeys(password);
    }

    public void CheckElementHomepage() throws InterruptedException {
        action.waitForEl(By.id("com.goplay.android:id/btn_login"));
        action.checkTextCountains(BaseData.HomePage.WelcomeTitle_ENG);
        action.checkTextCountains(BaseData.HomePage.WelcomeTitleBody_ENG);
        action.checkTextCountains(BaseData.HomePage.ButtonLogin_ENG);
        action.checkTextCountains(BaseData.HomePage.Footer_ENG);
        btnCountryFlag.click();
        action.waitForEl(By.xpath("//android.widget.TextView[@text='Bahasa Indonesia']"));
        action.checkTextCountains(BaseData.HomePage.ChangeLanguage_ENG);
        action.checkTextCountains(BaseData.HomePage.ChangeLanguage2_ENG);
        txtBahasa.click();
        action.waitForEl(By.id("com.goplay.android:id/btn_login"));
        action.checkTextCountains(BaseData.HomePage.WelcomeTitle_ID);
        action.checkTextCountains(BaseData.HomePage.WelcomeTitleBody_ID);
        action.checkTextCountains(BaseData.HomePage.ButtonLogin_ID);
        action.checkTextCountains(BaseData.HomePage.Footer_ID);
    }

    public void ClickButtonLogin() throws InterruptedException {
        btnLogin.click();
        Thread.sleep(2000);
        action.androidBack();
    }

}
