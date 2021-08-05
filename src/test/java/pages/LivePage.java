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
    public static MobileElement bannerLive;
    public static String liveBanner="com.goplay.android:id/feed_item_image";

    @AndroidFindBy(id = "com.goplay.android:id/feed_poster_with_badge")
    public MobileElement bannerRecordedShow;

    @AndroidFindBy(id = "android:id/button_once")
    public static MobileElement btnOnce;

    @AndroidFindBy(id = "com.goplay.android:id/tv_display_description_text")
    public MobileElement txtEventDetail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Back to chat']")
    public MobileElement txtBackToChat;

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
    public static String EventInfo="com.goplay.android:id/event_info_container";

    @AndroidFindBy(id = "com.goplay.android:id/lay_viewer")
    public MobileElement txtLiveInfo;

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_orientation")
    public MobileElement btnRotate;
    String Rotate="com.goplay.android:id/btn_action_orientation";

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_settings")
    public MobileElement btnLiveSetting;

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_share")
    public MobileElement btnShare;

    @AndroidFindBy(id = "com.goplay.android:id/btn_action_gift")
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
    public static MobileElement btnSeeAll;

    @AndroidFindBy(id = "com.goplay.android:id/marketing_banner_root")
    public MobileElement bannerMarketing;

    @AndroidFindBy(id = "com.goplay.android:id/live_reminder_icon")
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

    @AndroidFindBy(id = "com.goplay.android:id/schedule_title")
    public MobileElement txtEventTitle;
    String EventTitle="com.goplay.android:id/schedule_title";

    @AndroidFindBy(id = "com.goplay.android:id/event_details_page_share_btn_toolbar")
    public MobileElement btnShareMarketing;

    @AndroidFindBy(id = "com.goplay.android:id/btn_add_reminder")
    public MobileElement btnRemindMeMarketing;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    public MobileElement btnMore;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Copy Link']")
    public MobileElement txtCopyLink;

    @AndroidFindBy(id = "com.goplay.android:id/tokens_info")
    public MobileElement txtTokenInfo;

    @AndroidFindBy(id = "com.goplay.android:id/balance_field")
    public MobileElement txtTokenBalance;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='All']")
    public MobileElement txtGifAll;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Shout']")
    public MobileElement txtGiftShout;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Food']")
    public MobileElement txtGiftFood;

    @AndroidFindBy(id = "com.goplay.android:id/tv_text")
    public MobileElement btnNext;

    @AndroidFindBy(id = "com.goplay.android:id/gift_item_price")
    public MobileElement txTokenPrice;

    @AndroidFindBy(id = "com.goplay.android:id/btn_gift_details_back")
    public MobileElement btnGiftBack;

    @AndroidFindBy(id = "com.goplay.android:id/dialog_card_dismiss")
    public MobileElement btnDismissCardGift;

    @AndroidFindBy(id = "com.goplay.android:id/btn_join")
    public MobileElement btnJoinGroup;

    @AndroidFindBy(id = "com.goplay.android:id/btn_create")
    public MobileElement btnCreateGroup;

    @AndroidFindBy(id = "com.goplay.android:id/et_room_name")
    public MobileElement inputGroupName;

    @AndroidFindBy(id = "com.goplay.android:id/btn_ok")
    public MobileElement btnSubmitJoinGroup;

    @AndroidFindBy(id = "com.goplay.android:id/btn_close")
    public MobileElement btnCloseGroup;

    @AndroidFindBy(id = "com.goplay.android:id/btnPlay")
    public static MobileElement btnPlayNow;

    @AndroidFindBy(id = "com.goplay.android:id/toolbar_title")
    public MobileElement titleRecordedEvent;
    String RecordedEvent= "com.goplay.android:id/toolbar_title";

    @AndroidFindBy(id = "com.goplay.android:id/bc_video_view")
    public MobileElement frameVideoPlay;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.LinearLayout[3]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.FrameLayout")
    public MobileElement txtEventTicketed;




    public void openLiveEvent() {
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scroToElement("Live Now");
        bannerLive.click();
        btnOnce.click();
        action.waitUntiElementPresent(By.id(EventInfo));
    }

    public void openMarketingEvent() {
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scroToElement("Ticketed Shows");
        txtEventTicketed.click();
        btnOnce.click();
        action.waitUntiElementPresent(By.id(EventTitle));
    }

    public void openTodayLiveEvent() {
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scroToElement("Tomorrow's Events");
        bannerLive.click();
        btnOnce.click();
        action.waitUntiElementPresent(By.id(EventTitle));
    }

    public void openTopWatchedShow() {
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scroToElement("Top Watched Shows");
        btnSeeAll.click();
        action.waitUntiElementPresent(By.id(RecordedEvent));
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
        Thread.sleep(2000);
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
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        bannerRecommendation.click();
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        bannerRecommendation3.click();
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        bannerRecommendation2.click();
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
    }

    public void checkHeartsNumber(){
        String oldNumber= txtLikesNumber.getText();
        txtLikesNumber.click();
        String newNumber= txtLikesNumber.getText();
//        Assert.assertNotEquals(oldNumber,newNumber);
    }

    public void checkSendMessage()throws InterruptedException{
        inputMessage.click();
        inputChat.sendKeys("Keren");
        btnSendMessage.click();
        Thread.sleep(1500);
        action.checkTextCountains("Keren");
        action.androidBack();
    }

    public void checkSendShout()throws InterruptedException{
        btnShout.click();
        inputChat.sendKeys("Keren");
        btnSendMessage.click();
        Thread.sleep(1000);
        action.checkTextCountains("Shout sent");
    }

    public void checkSendGift()throws InterruptedException{
        btnGift.click();
        Thread.sleep(1000);
        action.checkTextCountains("Choose a virtual gift");
        action.checkTextCountains("All");
        action.checkTextCountains("Shout");
        action.checkTextCountains("Food");
        action.checkTextCountains("Next");
        txtTokenInfo.click();
        action.androidBack();
        String tokenLitPrice= txTokenPrice.getText();
        action.checkTextCountains("You're lit");
        btnNext.click();
        String tokenLitPrice2= txTokenPrice.getText();
        Assert.assertEquals(tokenLitPrice,tokenLitPrice2);
        action.checkTextCountains("Add a personal note?");
        action.checkTextCountains("Good words to go with the gift...");
        btnGiftBack.click();
        txtGiftShout.click();
        String tokenLovingItPrice= txTokenPrice.getText();
        action.checkTextCountains("Loving it");
        btnNext.click();
        String tokenLovingItPrice2= txTokenPrice.getText();
        Assert.assertEquals(tokenLovingItPrice,tokenLovingItPrice2);
        action.checkTextCountains("Add a personal note?");
        action.checkTextCountains("Good words to go with the gift...");
        btnGiftBack.click();
        txtGiftFood.click();
        String tokenCilokPrice= txTokenPrice.getText();
        action.checkTextCountains("Cilok");
        btnNext.click();
        String tokenCilokPrice2= txTokenPrice.getText();
        Assert.assertEquals(tokenCilokPrice,tokenCilokPrice2);
        action.checkTextCountains("Add a personal note?");
        action.checkTextCountains("Good words to go with the gift...");
        btnGiftBack.click();
        btnDismissCardGift.click();
    }

    public void checkMarketingEvent()throws InterruptedException{
        btnShareMarketing.isDisplayed();
        btnRemindMeMarketing.isDisplayed();
        String EventTitle= txtEventTitle.getText();
        Assert.assertFalse(action.checkPageElement("Leaderboard"));
        Assert.assertFalse(action.checkPageElement("Gift History"));
        txtEventDetail.click();
        Thread.sleep(1500);
        action.checkTextCountains("About event");
        action.checkTextCountains("How to join this event");
        action.checkTextCountains("I already have a ticket");
        action.checkTextCountains("I don't have a ticket");
        txtBackToChat.click();
        txtEventDetail.isDisplayed();
        btnShareMarketing.click();
        Thread.sleep(1500);
        action.checkTextCountains("Suggest this to friends");
        action.checkTextCountains("IG Story");
        action.checkTextCountains("WhatsApp");
        action.checkTextCountains("Twitter");
        action.checkTextCountains("Copy Link");
        btnMore.click();
        Thread.sleep(1500);
        action.checkTextCountains(EventTitle);
        action.androidBack();
        txtCopyLink.click();
        Thread.sleep(1000);
        action.checkTextCountains("Link copied.");
        action.androidBack();
        btnRemindMeMarketing.click();
        Thread.sleep(1000);
        action.checkTextCountains("Reminder On");
        btnRemindMeMarketing.click();
        Thread.sleep(1000);
        action.checkTextCountains("Remind Me");
    }

    public void checkReminderFunction()throws InterruptedException{
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scroToElement("Today's Live Events");
        btnReminder.click();
        Thread.sleep(1000);
        Assert.assertTrue(btnReminder.isSelected());
        btnReminder.click();
        Assert.assertFalse(btnReminder.isSelected());
//        action.scroToElement("Tomorrow's Events");
//        btnReminder.click();
//        Thread.sleep(1000);
//        Assert.assertTrue(btnReminder.isSelected());
//        btnReminder.click();
//        Assert.assertFalse(btnReminder.isSelected());
//        action.scroToElement("GoPlay Exclusive");
//        btnReminder.click();
//        Thread.sleep(1000);
//        Assert.assertTrue(btnReminder.isSelected());
//        btnReminder.click();
//        Assert.assertFalse(btnReminder.isSelected());
        action.scroToElement("Add to Your Calendar");
        btnReminder.click();
        Thread.sleep(1000);
        Assert.assertTrue(btnReminder.isSelected());
        btnReminder.click();
        Assert.assertFalse(btnReminder.isSelected());
    }

    public void checkTodayLiveEvent()throws InterruptedException{
        btnShareMarketing.isDisplayed();
        btnRemindMeMarketing.isDisplayed();
        String EventTitle= txtEventTitle.getText();
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
        inputChat.isDisplayed();
        btnGift.isDisplayed();
        txtEventDetail.click();
        Thread.sleep(1000);
        action.checkTextCountains("About event");
        txtBackToChat.click();
        btnGift.isDisplayed();
        btnShareMarketing.click();
        action.checkTextCountains("Suggest this to friends");
        action.checkTextCountains("IG Story");
        action.checkTextCountains("WhatsApp");
        action.checkTextCountains("Twitter");
        action.checkTextCountains("Copy Link");
        btnMore.click();
        Thread.sleep(1000);
        action.checkTextCountains(EventTitle);
        action.androidBack();
        txtCopyLink.click();
        Thread.sleep(1000);
        action.checkTextCountains("Link copied.");
        action.androidBack();
        btnRemindMeMarketing.click();
        Thread.sleep(1000);
        action.checkTextCountains("Reminder On");
        btnRemindMeMarketing.click();
        Thread.sleep(1000);
        action.checkTextCountains("Remind Me");
        btnGift.click();
        Thread.sleep(1000);
        action.checkTextCountains("Choose a virtual gift");
        action.androidBack();
    }

    public void checkSwitchGroup() throws InterruptedException{
        action.checkTextCountains("Chat in public..");
        btnSwitchGroup.click();
        action.checkTextCountains("Chat in group..");
        action.checkTextCountains("Create a room to chat privately");
        Assert.assertFalse(action.checkPageElement("Leaderboard"));
        Assert.assertFalse(action.checkPageElement("Gift History"));
        btnJoinGroup.click();
        inputGroupName.sendKeys("TestingGroup");
        btnSubmitJoinGroup.click();
        action.checkTextCountains("Group not Found");
        btnCloseGroup.click();
        btnCreateGroup.click();
        Thread.sleep(1500);
        action.checkTextCountains("Create group");
        btnCloseGroup.click();
        btnSwitchGroup.click();
        action.checkTextCountains("Chat in public..");
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
    }

    public void checkRecordedEvent() throws InterruptedException{
        action.checkTextCountains("Recorded Live Shows");
        bannerRecordedShow.click();
        btnPlayNow.isDisplayed();
        action.checkTextCountains("Share to IG");
        action.checkTextCountains("Cast");
        action.checkTextCountains("Director");
        action.checkTextCountains("Writer");
        action.checkTextCountains("GoPlay");
        btnPlayNow.click();
        frameVideoPlay.isDisplayed();
        action.androidBack();
        btnPlayNow.isDisplayed();
    }

}
