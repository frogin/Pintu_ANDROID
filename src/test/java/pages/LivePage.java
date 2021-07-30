package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LivePage extends BaseUtil {

    ElementAction action = new ElementAction();

    public LivePage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.goplay.android:id/btn_login")
    public MobileElement btnLogin;

    @AndroidFindBy(id = "com.goplay.android:id/live_card")
    public MobileElement bannerLive;
    String liveBanner="com.goplay.android:id/feed_item_image";

    @AndroidFindBy(id = "android:id/button_once")
    public MobileElement btnOnce;

    @AndroidFindBy(id = "com.goplay.android:id/tv_display_description_text")
    public MobileElement txtEventDetail;

    @AndroidFindBy(id = "com.goplay.android:id/btn_close")
    public MobileElement btnCloseLive;
    String CloseLive="com.goplay.android:id/btn_close";

    @AndroidFindBy(id = "com.goplay.android:id/tooltip_guide_view")
    public MobileElement btnGuideTooltip;

    @AndroidFindBy(id = "com.goplay.android:id/dialog_positive_button")
    public MobileElement btnDialogYES;

    @AndroidFindBy(id = "com.goplay.android:id/dialog_negative_button")
    public MobileElement btnDialogNO;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Gift History']")
    public MobileElement txtGiftHistory;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Leaderboard']")
    public MobileElement txtLeaderboard;

    @AndroidFindBy(id = "com.goplay.android:id/event_info_container")
    public MobileElement txtEventInfo;
    String EventInfo="com.goplay.android:id/event_info_container";

    @AndroidFindBy(id = "com.goplay.android:id/lay_viewer")
    public MobileElement txtLiveInfo;
    String LiveInfo="com.goplay.android:id/lay_viewer";

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_orientation")
    public MobileElement btnRotate;
    String Rotate="com.goplay.android:id/btn_action_orientation";

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_settings")
    public MobileElement btnLiveSetting;

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_share")
    public MobileElement btnShare;

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_gift_badge_wrapper")
    public MobileElement btnGift;

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_page_switcher")
    public MobileElement btnSwitchGroup;

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_shout")
    public MobileElement btnShout;

    @AndroidFindBy(id = "com.goplay.android:id/lay_switcher_message")
    public MobileElement inputMessage;

    @AndroidFindBy(id = "com.goplay.android:id/et_message")
    public MobileElement inputChat;

    @AndroidFindBy(id = "com.goplay.android:id/btn_send")
    public MobileElement btnSendMessage;

    @AndroidFindBy(id = "com.goplay.android:id/free_like_button")
    public MobileElement btnLike;

    @AndroidFindBy(id = "com.goplay.android:id/lbl_likes_num")
    public MobileElement txtLikesNumber;

    @AndroidFindBy(id = "com.goplay.android:id/anchor_button")
    public MobileElement btnSeeAll;

    @AndroidFindBy(id = "com.goplay.android:id/marketing_banner_root")
    public MobileElement bannerMarketing;

    @AndroidFindBy(id = "com.goplay.android:id/live_reminder_icon_container")
    public MobileElement btnReminder;

    @AndroidFindBy(id = "com.goplay.android:id/cv_feed_item_landscape_parent")
    public MobileElement bannerLandscape;

    @AndroidFindBy(id = "com.goplay.android:id/event_poster_fg")
    public MobileElement imageProfile;

    @AndroidFindBy(id = "com.goplay.android:id/event_performer_name")
    public MobileElement txtProfileNameEvent;

    @AndroidFindBy(id = "com.goplay.android:id/streamer_profile_name")
    public MobileElement txtProfileNameProfile;

    @AndroidFindBy(id = "com.goplay.android:id/recommendation_image_container")
    public MobileElement bannerRecommendation;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/" +
            "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout")
    public MobileElement bannerRecommendation2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup[2]/" +
            "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout")
    public MobileElement bannerRecommendation3;

    public void openLiveEvent() {
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scroToElement("Live Now");
        bannerLive.click();
        btnOnce.click();
        action.waitUntiElementPresent(By.id(EventInfo));
    }

    public void checkEventDetails() throws InterruptedException {
        action.waitUntiElementPresent(By.id(EventInfo));
        btnCloseLive.isDisplayed();
        btnGuideTooltip.isDisplayed();
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
        txtEventInfo.isDisplayed();
        txtLiveInfo.isDisplayed();
        btnLiveSetting.isDisplayed();
        btnShare.isDisplayed();
        btnGift.isDisplayed();
        btnSwitchGroup.isDisplayed();
        btnShout.isDisplayed();
        inputMessage.isDisplayed();
        btnLike.isDisplayed();
        txtLikesNumber.isDisplayed();
        Thread.sleep(2000);
    }

    public void checkCleanModeScren() throws InterruptedException {
        action.waitUntiElementPresent(By.id(EventInfo));
        System.out.println("MASUK IF ELSE");
        if (driver.getPageSource().contains(Rotate)){
            System.out.println("FOUND");
            btnRotate.click();
            Thread.sleep(2000);
            Assert.assertFalse(action.checkPageElement("Leaderboard"));
            Assert.assertFalse(action.checkPageElement("Gift History"));
            btnGuideTooltip.click();
            btnCloseLive.isDisplayed();
            txtEventInfo.isDisplayed();
            inputMessage.isDisplayed();
            btnShare.isDisplayed();
            btnLike.isDisplayed();
        } else {
            System.out.println("NOT FOUND!");
            btnCloseLive.isDisplayed();
            txtEventInfo.isDisplayed();
            inputMessage.isDisplayed();
            btnShare.isDisplayed();
            btnLike.isDisplayed();
            btnGuideTooltip.click();
            Assert.assertFalse(action.checkPageElement("Leaderboard"));
            Assert.assertFalse(action.checkPageElement("Gift History"));

        }
    }

    public void closeLiveEvent()  {
        //btnCloseLive.click();
        action.androidBack();
        btnDialogYES.click();
        bannerLive.isDisplayed();
    }

    public void checkPerformerProfile() {
        txtEventInfo.click();
        String txtProfileEvent = txtProfileNameEvent.getText();
        action.checkTextCountains("Upcoming Events");
        imageProfile.click();
        btnOnce.click();
        String txtProfile = txtProfileNameProfile.getText();
        Assert.assertEquals(txtProfileEvent,txtProfile);
        action.checkTextCountains("Upcoming Events");
    }

    public void openLiveEventFromProfile(){
        bannerLive.click();
        txtEventInfo.isDisplayed();
        txtLiveInfo.isDisplayed();
        txtGiftHistory.isDisplayed();
        btnGift.isDisplayed();
    }

    public void checkRecommendation() throws InterruptedException{
        action.waitUntiElementPresent(By.id(EventInfo));
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        bannerRecommendation.click();
        Thread.sleep(2000);
        txtEventInfo.isDisplayed();
        txtGiftHistory.isDisplayed();
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        Thread.sleep(2000);
        bannerRecommendation3.click();
        txtEventInfo.isDisplayed();
        txtGiftHistory.isDisplayed();
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        Thread.sleep(2000);
        bannerRecommendation2.click();
        txtEventInfo.isDisplayed();
        txtGiftHistory.isDisplayed();
    }

    public void checkHeartsNumber(){
        String oldNumber= txtLikesNumber.getText();
        txtLikesNumber.click();
        String newNumber= txtLikesNumber.getText();
        Assert.assertNotEquals(oldNumber,newNumber);
    }

    public void checkSendMessage()throws InterruptedException{
        inputMessage.click();
        inputChat.sendKeys("Keren");
        btnSendMessage.click();
        Thread.sleep(1500);
        action.checkTextCountains("Keren");
    }

    public void checkSendShout()throws InterruptedException{
        btnShout.click();
        inputChat.sendKeys("Keren");
        btnSendMessage.click();
        Thread.sleep(1500);
        action.checkTextCountains("Shout sent");
    }



}
