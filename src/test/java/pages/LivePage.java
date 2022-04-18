package pages;

import Base.BaseUtil;
import Base.ElementAction;
import gherkin.lexer.Th;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class LivePage extends BaseUtil {
//test aja

    ElementAction action = new ElementAction();

    public LivePage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btn_login")
    public MobileElement btnLogin;

    @AndroidFindBy(id = "live_card")
    public static MobileElement bannerLive;
    public static String liveBanner="search";

    @AndroidFindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/" +
            "android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout")
    public static MobileElement bannerLivStaging;

    @AndroidFindBy(id = "poster_view")
    public static MobileElement bannerPromoted;

    @AndroidFindBy(id = "feed_poster_with_badge")
    public MobileElement bannerRecordedShow;

    @AndroidFindBy(id = "android:id/button_once")
    public static MobileElement btnOnce;

    @AndroidFindBy(id = "tv_display_description_text")
    public static MobileElement txtEventDetail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Back to chat']")
    public MobileElement txtBackToChat;

    @AndroidFindBy(id = "btn_close")
    public MobileElement btnCloseLive;
    String CloseLive="btn_close";

    @AndroidFindBy(id = "tooltip_guide_view")
    public MobileElement btnGuideTooltip;

    @AndroidFindBy(id = "dialog_positive_button")
    public MobileElement btnDialogYES;

    @AndroidFindBy(id = "dialog_negative_button")
    public MobileElement btnDialogNO;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Gift History']")
    public MobileElement txtGiftHistory;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Leaderboard']")
    public MobileElement txtLeaderboard;

    @AndroidFindBy(id = "event_info_container")
    public MobileElement txtEventInfo;
    public static String EventInfo="event_info_container";

    @AndroidFindBy(id = "lay_viewer")
    public MobileElement txtLiveInfo;

    @AndroidFindBy(id = "btn_action_orientation")
    public MobileElement btnRotate;
    String Rotate="btn_action_orientation";

    @AndroidFindBy(id = "btn_action_settings")
    public MobileElement btnLiveSetting;

    @AndroidFindBy(id = "btn_action_share")
    public MobileElement btnShare;

    @AndroidFindBy(id = "btn_action_gift")
    public MobileElement btnGift;

    @AndroidFindBy(id = "btn_action_page_switcher")
    public MobileElement btnSwitchGroup;

    @AndroidFindBy(id = "btn_action_shout")
    public MobileElement btnShout;

    @AndroidFindBy(id = "lay_switcher_message")
    public MobileElement inputMessage;

    @AndroidFindBy(id = "et_message")
    public MobileElement inputChat;

    @AndroidFindBy(id = "btn_send")
    public MobileElement btnSendMessage;

    @AndroidFindBy(id = "free_like_button")
    public MobileElement btnLike;

    @AndroidFindBy(id = "lbl_likes_num")
    public MobileElement txtLikesNumber;

    @AndroidFindBy(id = "anchor_button")
    public static MobileElement btnSeeAll;

    @AndroidFindBy(id = "marketing_banner_root")
    public MobileElement bannerMarketing;

    @AndroidFindBy(id = "live_reminder_icon_common")
    public static MobileElement btnReminder;

    @AndroidFindBy(id = "cv_feed_item_landscape_parent")
    public MobileElement bannerLandscape;

    @AndroidFindBy(id = "event_poster_fg")
    public MobileElement imageProfile;

    @AndroidFindBy(id = "event_performer_name")
    public MobileElement txtProfileNameEvent;

    @AndroidFindBy(id = "streamer_profile_name")
    public MobileElement txtProfileNameProfile;

    @AndroidFindBy(id = "recommendation_image_container")
    public MobileElement bannerRecommendation;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]")
    public MobileElement bannerRecommendation2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]")
    public MobileElement bannerRecommendation3;

    @AndroidFindBy(id = "schedule_title")
    public MobileElement txtEventTitle;
    String EventTitle="schedule_title";

    @AndroidFindBy(id = "event_details_page_share_btn_toolbar")
    public MobileElement btnShareMarketing;

    @AndroidFindBy(id = "btn_add_reminder")
    public MobileElement btnRemindMeMarketing;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/" +
            "android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    public static MobileElement btnMore;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Copy Link']")
    public static MobileElement txtCopyLink;

    @AndroidFindBy(id = "tokens_info")
    public MobileElement txtTokenInfo;

    @AndroidFindBy(id = "balance_field")
    public MobileElement txtTokenBalance;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='All']")
    public MobileElement txtGifAll;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='You're lit']")
    public MobileElement txtGiftLit;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Shout']")
    public MobileElement txtGiftShout;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Food']")
    public MobileElement txtGiftFood;

    @AndroidFindBy(id = "tv_text")
    public MobileElement btnNext;

    @AndroidFindBy(id = "btn_pay_token")
    public MobileElement btnPayToken;

    @AndroidFindBy(id = "btn_confirm")
    public MobileElement btnConfirmGift;

    @AndroidFindBy(id = "gift_item_price")
    public MobileElement txTokenPrice;

    @AndroidFindBy(id = "btn_gift_details_back")
    public MobileElement btnGiftBack;

    @AndroidFindBy(id = "dialog_card_dismiss")
    public MobileElement btnDismissCardGift;

    @AndroidFindBy(id = "btn_join")
    public MobileElement btnJoinGroup;

    @AndroidFindBy(id = "btn_create")
    public MobileElement btnCreateGroup;

    @AndroidFindBy(id = "et_room_name")
    public MobileElement inputGroupName;

    @AndroidFindBy(id = "btn_ok")
    public MobileElement btnSubmitJoinGroup;

    @AndroidFindBy(id = "btn_close")
    public MobileElement btnCloseGroup;

    @AndroidFindBy(id = "btnPlay")
    public static MobileElement btnPlayNow;

    @AndroidFindBy(id = "toolbar_title")
    public MobileElement titleRecordedEvent;
    String RecordedEvent= "event_info_performer_name";

    @AndroidFindBy(id = "bc_video_view")
    public MobileElement frameVideoPlay;

    @AndroidFindBy(id = "aloha_tooltip_action")
    public MobileElement btnDismissSwipe;

    @AndroidFindBy(id = "public_chat_empty_textview")
    public MobileElement imgChatBeforeStartEvent;

    @AndroidFindBy(id = "alert_button")
    public MobileElement btnOkay;

    @AndroidFindBy(id = "com.goplay.android:id/interstitial_image_relative_layout")
    public MobileElement bannerPopUp;
    String PopUpBanner ="com.goplay.android:id/interstitial_image_relative_layout";

    // ELement of V2

    @AndroidFindBy(id = "live_indicator_view")
    public MobileElement txtLive;

    @AndroidFindBy(id = "live_indicator")
    public MobileElement txtLiveProfile;

    @AndroidFindBy(id = "genre_layout")
    public MobileElement infoGenre;

    @AndroidFindBy(id = "event_name_field")
    public MobileElement infoTitle;

    @AndroidFindBy(id = "viewer_count_layout")
    public MobileElement infoCCU;

    @AndroidFindBy(id = "profile_clickable")
    public static MobileElement btnProfile;

    @AndroidFindBy(id = "avatar_view")
    public MobileElement btnAvatar;

    @AndroidFindBy(id = "performer_name_field")
    public MobileElement infoPerformerName;

    @AndroidFindBy(id = "performer_detail_field")
    public MobileElement infoAmountLikes;

    @AndroidFindBy(id = "btn_follow")
    public static MobileElement btnFollow;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]")
    public MobileElement bannerTodayEvent;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup" +
            "/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement bannerProfileTwo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SCHEDULED']")
    public MobileElement txtScheduled;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Food']")
    public MobileElement txtGenreFood;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Music']")
    public MobileElement txtGenreMusic;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Gaming']")
    public MobileElement txtGenreGaming;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Chitchat']")
    public MobileElement txtGenreChitChat;

    @AndroidFindBy(id = "btnPlayPause")
    public MobileElement btnPlayPause;

    @AndroidFindBy(id = "seek_bar")
    public MobileElement btnSeekBar;

    @AndroidFindBy(id = "btnSeekLeft")
    public MobileElement btnSeekLeft;

    @AndroidFindBy(id = "btnSeekRight")
    public MobileElement btnSeekRight;

    @AndroidFindBy(id = "tv_category")
    public MobileElement infoRecordedGenre;

    @AndroidFindBy(id = "event_time")
    public MobileElement infoRecordedDate;

    @AndroidFindBy(id = "event_title")
    public MobileElement infoRecordedTitle;

    @AndroidFindBy(id = "event_about")
    public MobileElement infoRecordedDesc;

    @AndroidFindBy(id = "stream_viewer_count")
    public MobileElement infoRecordedStreamerCOunt;

    @AndroidFindBy(id = "event_info_performer_name")
    public MobileElement infoRecordedStreamerName;

    @AndroidFindBy(id = "event_details_page_close_btn")
    public static MobileElement btnCloseEventDetail;

    @AndroidFindBy(id = "streamer_profile_fragment_back_button")
    public MobileElement btnBackProfilePage;

    @AndroidFindBy(id = "clear_filter_button")
    public MobileElement btnClearFilter;

    @AndroidFindBy(id = "layout_notification")
    public MobileElement btnNotification;

    @AndroidFindBy(id = "search")
    public MobileElement btnSearch;

    @AndroidFindBy(id = "token_container")
    public MobileElement btnTokenLive;

    @AndroidFindBy(id = "search_text")
    public MobileElement inputSearchText;

    @AndroidFindBy(id = "streamer_profile_followers_count")
    public static MobileElement txtProfileNumberFollower;

    @AndroidFindBy(id = "streamer_profile_username")
    public MobileElement txtProfileUsername;

    @AndroidFindBy(id = "streamer_profile_fragment_share_button")
    public static MobileElement btnProfileShare;

    @AndroidFindBy(id = "streamer_profile_image")
    public MobileElement imgProfile;

    @AndroidFindBy(id = "streamer_profile_likes_count")
    public MobileElement txtProfileLikesCount;

    @AndroidFindBy(id = "was_live_indicator")
    public MobileElement txtWasLiveIndicator;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WAS LIVE']")
    public MobileElement txtRassyaKuliner;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GoPlay Mask']")
    public MobileElement txtGoplayMask;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Itadakimas!']")
    public MobileElement txtItadakimas;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Agreeeeeee']")
    public MobileElement txtAgree;

    @AndroidFindBy(id = "ll_button_container")
    public MobileElement btnPayCash;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GoPay']")
    public MobileElement txtPaymentGopay;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit/Debit Card']")
    public MobileElement txtPaymentCreditCard;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Install Gojek App from Play Store']")
    public MobileElement txtNoGojekInstall;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WhatsApp']")
    public MobileElement txtSosmedWhatsapp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WhatsApp LLC']")
    public MobileElement txtWhatsappPlayStore;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='| For You']")
    public MobileElement txtForYou;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Indonesia']")
    public MobileElement txtIndonsia;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Japan']")
    public MobileElement txtJapan;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Food']")
    public MobileElement txtFood;

    @AndroidFindBy(id = "com.goplay.android:id/button_primary")
    public MobileElement btnPayGopay;

    @AndroidFindBy(id = "com.gojek.app:id/pw_widget_payment_method_container")
    public MobileElement txtTitlePayGojek;

    @AndroidFindBy(id = "btn_action_settings")
    public MobileElement btnActionSetting;

    @AndroidFindBy(id = "btn_clean_mode")
    public MobileElement btnCleanMode;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='720p']")
    public MobileElement txtResolution720;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='360p']")
    public MobileElement txtResolution360;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='240p']")
    public MobileElement txtResolution240;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WhatsApp']")
    public MobileElement txtOpenWhatsapp;

    @AndroidFindBy(id = "com.whatsapp:id/toolbar")
    public MobileElement infoContainerWhatsapp;

    @AndroidFindBy(id = "btn_follow")
    public MobileElement btnFollowModal;

    @AndroidFindBy(id = "tv_title")
    public MobileElement btnSendVG;

    @AndroidFindBy(id = "vw_gradient_top")
    public MobileElement gradientTop;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
    public MobileElement category1;
    @AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
    public MobileElement category3;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Popular\"]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement VGcategory1;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Music\"]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement VGcategory4;

    public void checkBannerPopUp() {
        if (driver.getPageSource().contains(PopUpBanner)){
            System.out.println("POPUP FOUND");
            action.androidBack();
        } else {
            System.out.println("POPUP NOT FOUND!");
        }
    }

    public void openLiveEvent() {
//        checkBannerPopUp();
        action.waitUntiElementPresent(By.id(liveBanner));
//        txtForYou.click();
        txtLive.click();
        action.waitUntiElementPresent(By.id(EventInfo));
    }

    public void openLiveEventStaging() {
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scroToElement("AUTO curation Live Now");
        bannerLive.click();
        btnDismissSwipe.click();
        //btnOnce.click();
        action.waitUntiElementPresent(By.id(EventInfo));
    }

    public void openMarketingEvent() {
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scroToElement("Ticketed Shows");
        //txtEventTicketed.click();
        //btnOnce.click();
        action.waitUntiElementPresent(By.id(EventTitle));
    }

    public void openTodayLiveEvent() {
        //checkBannerPopUp();
        action.waitUntiElementPresent(By.id(liveBanner));
        txtScheduled.click();
        bannerTodayEvent.click();
        action.waitUntiElementPresent(By.id(EventTitle));
    }

    public void openTodayLiveEventStaging() {
        action.waitUntiElementPresent(By.id(liveBanner));
        action.scrollAndClick("AUTO curation after tomorrow...");
        bannerLivStaging.click();
        btnOkay.click();
        btnDismissSwipe.click();
        //btnOnce.click();
        action.waitUntiElementPresent(By.id(EventTitle));


    }

    public void openPromotedEvent() {
        action.waitUntiElementPresent(By.id(liveBanner));
        txtScheduled.click();
        bannerPromoted.click();
        action.waitUntiElementPresent(By.id(EventTitle));
    }

    public void openTopWatchedShow() {
        action.waitUntiElementPresent(By.id(liveBanner));
        //txtGenreMusic.click();
        action.scroToElement("WAS LIVE");
        txtWasLiveIndicator.click();
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
            Assert.assertFalse(action.checkPageSource("Chat in public.."));
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
            Assert.assertFalse(action.checkPageSource("Chat in public.."));

        }
    }

    public void closeLiveEvent()  {
        //btnCloseLive.click();
        action.androidBack();
//        After implement swipe up changes, no need exit confirmation to exit
//        btnDialogYES.click();
//        btnProfile.isDisplayed();
    }

    public void checkPerformerProfileFromLive() {
        txtEventInfo.click();
        String txtProfileEvent = txtProfileNameEvent.getText();
        imageProfile.click();
        //btnOnce.click();
        String txtProfile = txtProfileNameProfile.getText();
        Assert.assertEquals(txtProfileEvent,txtProfile);
        btnFollow.isDisplayed();
        txtLive.isDisplayed();
        action.checkTextCountains("Upcoming live shows");
    }

    public void openLiveEventFromProfile(){
        txtLive.click();
        txtEventInfo.isDisplayed();
        txtLiveInfo.isDisplayed();
        txtGiftHistory.isDisplayed();
        btnGift.isDisplayed();
    }

    public void checkRecommendation() throws InterruptedException{
        Thread.sleep(2000);
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        bannerRecommendation.click();
        Thread.sleep(2000);
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        bannerRecommendation2.click();
        Thread.sleep(2000);
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
        action.swipeByElements(btnGuideTooltip,txtGiftHistory);
        bannerRecommendation3.click();
        Thread.sleep(2000);
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
        boolean a=true;
        String performerName= infoRecordedStreamerName.getText();
        btnGift.click();
        Thread.sleep(1000);
        action.checkTextCountains("Send virtual gift");
        while (a==true){
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
            try {
                action.checkTextCountains("Popular");
                action.checkTextCountains("New");
                action.checkTextCountains("Japan");
                action.checkTextCountains("Music");
                action.checkTextCountains("AZ Run");
                txtFood.isDisplayed();
                break;
            } catch (Exception e) {
                action.swipeByElements(VGcategory4, VGcategory1);
                a = false;
            }
        }
        action.checkTextCountains("Support " +performerName+ " by sending virtual gift to encourage them creating more content like this!");
        txtFood.click();
        txtItadakimas.click();
        btnSendVG.click();
//        btnConfirmGift.isDisplayed();
//        Thread.sleep(1000);
//        action.checkTextCountains("9 Tokens");
//        btnDismissCardGift.click();
        Thread.sleep(1000);
        action.checkTextCountains("sent Itadakimas!");
    }

    public void checkSendGiftWithGopay()throws InterruptedException{
        btnGift.click();
        Thread.sleep(1000);
        txtAgree.click();
        btnNext.click();
        btnPayCash.click();
        txtPaymentCreditCard.isDisplayed();
        txtPaymentGopay.isDisplayed();
        txtPaymentGopay.click();
        btnPayGopay.click();
        txtTitlePayGojek.isDisplayed();
    }

    public void checkSendGiftWithCreditCard()throws InterruptedException{
        btnGift.click();
        Thread.sleep(1000);
        txtAgree.click();
        btnNext.click();
        btnPayCash.click();
        txtPaymentCreditCard.isDisplayed();
        txtPaymentGopay.isDisplayed();
        txtPaymentCreditCard.click();
        Thread.sleep(1000);
        Assert.assertTrue(action.checkPageElement("Total Amount"));
    }

    public void checkSendGiftStaging()throws InterruptedException{
        btnGift.click();
        Thread.sleep(1000);
        action.checkTextCountains("Choose a virtual gift");
        action.checkTextCountains("All");
        action.checkTextCountains("Shout");
        action.checkTextCountains("Food");
        action.checkTextCountains("Next");
        txtTokenInfo.click();
        Thread.sleep(1000);
        action.androidBack();
        String tokenLitPrice= txTokenPrice.getText();
        action.checkTextCountains("Come On Joko Tingkir!");
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
        txtGifAll.click();
        //txtGiftLit.click();
        btnNext.click();
        btnPayToken.click();
        btnConfirmGift.isDisplayed();
        Thread.sleep(1000);
        action.checkTextCountains("10 Tokens");
        btnDismissCardGift.click();
        Thread.sleep(1000);
        action.checkTextCountains("sent a Spooktober Fest.");
    }

    public void checkMarketingEvent()throws InterruptedException{
        btnShareMarketing.isDisplayed();
        btnRemindMeMarketing.isDisplayed();
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
        txtScheduled.click();
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
    }

    public void checkTodayLiveEvent()throws InterruptedException{
        btnShareMarketing.isDisplayed();
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
        Thread.sleep(1000);
        action.checkTextCountains("Suggest this to friends");
        action.checkTextCountains("IG Story");
        action.checkTextCountains("WhatsApp");
        action.checkTextCountains("Twitter");
        action.checkTextCountains("Copy Link");
        btnMore.click();
        Thread.sleep(1000);
        //action.checkTextCountains(EventTitle);
        action.androidBack();
        txtCopyLink.click();
        action.androidBack();
        btnGift.click();
        Thread.sleep(1000);
        action.checkTextCountains("Send virtual gift");
        action.androidBack();
    }

    public void shareEventtoWhatsapp()throws InterruptedException{
        btnShareMarketing.click();
        Thread.sleep(1000);
        action.checkTextCountains("Suggest this to friends");
        action.checkTextCountains("IG Story");
        action.checkTextCountains("WhatsApp");
        action.checkTextCountains("Twitter");
        action.checkTextCountains("Copy Link");
        txtSosmedWhatsapp.click();
        Thread.sleep(1000);
        infoContainerWhatsapp.isDisplayed();
        action.androidBack();
    }

    public void checkSwitchGroup() throws InterruptedException{
        action.checkTextCountains("Chat in public..");
        btnSwitchGroup.click();
        action.checkTextCountains("Chat in group..");
        action.checkTextCountains("Create a room to chat privately");
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
        Thread.sleep(1000);
        action.checkTextCountains("Chat in public..");
        txtGiftHistory.isDisplayed();
        txtLeaderboard.isDisplayed();
    }

    public void checkRecordedEvent() throws InterruptedException{
        Thread.sleep(1500);
        btnPlayPause.click();
        infoRecordedStreamerName.isDisplayed();
        infoRecordedStreamerCOunt.isDisplayed();
        infoRecordedGenre.isDisplayed();
        infoRecordedDate.isDisplayed();
        infoRecordedTitle.isDisplayed();
        infoRecordedDesc.isDisplayed();
        btnSeekBar.isDisplayed();
        btnSeekLeft.isDisplayed();
        btnSeekRight.isDisplayed();
        btnPlayPause.isDisplayed();
    }

    public void checkPerformerProfileFromRecorded() throws InterruptedException {
        infoRecordedStreamerName.click();
        Thread.sleep(2000);
        btnFollow.isDisplayed();
        action.checkTextCountains("Upcoming live shows");
//        bannerProfileTwo.click();
//        btnCloseEventDetail.click();
        btnFollow.isDisplayed();
        btnBackProfilePage.click();
        txtScheduled.isDisplayed();
    }

    public void checkFilterEvent() throws InterruptedException {
        action.waitUntiElementPresent(By.id(liveBanner));
        txtForYou.click();
        Thread.sleep(2000);
        String title1 = infoTitle.getText();
        while (true){
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
            try{
                txtGenreChitChat.isDisplayed();
                break;
            }catch (Exception e){
                action.swipeByElements(category3, category1);
            }
        }
        txtGenreChitChat.click();
        Thread.sleep(2000);
        String title2 = infoTitle.getText();
        Assert.assertNotEquals(title1,title2);
        //txtGenreMusic.isSelected();
    }

    public void checkRemoveFilter() {
        action.waitUntiElementPresent(By.id(liveBanner));
        String title1 = infoTitle.getText();
        btnClearFilter.click();
        String title2 = infoTitle.getText();
        Assert.assertNotEquals(title1,title2);
    }

    public void checkFilterandRemoveInScheduled() {
        txtScheduled.click();
        action.waitUntiElementPresent(By.id(liveBanner));
        txtGenreMusic.click();
        txtGenreMusic.isSelected();
        btnClearFilter.click();
    }

    public void checkFilterGaming() {
        action.waitUntiElementPresent(By.id(liveBanner));
        txtGenreChitChat.click();
        String title1 = infoTitle.getText();
        txtGenreMusic.click();
        String title2 = infoTitle.getText();
//        Assert.assertNotEquals(title1,title2);
        txtGenreMusic.isSelected();
        txtGenreChitChat.click();
    }

    public void scrollToBottom()throws InterruptedException {
        String title1 = infoTitle.getText();
        action.scrollAndClick("Back to top");
        Thread.sleep(1500);
        String title2 = infoTitle.getText();
        Assert.assertEquals(title1,title2);
    }

    public void goToScheduledTab() {
        txtScheduled.click();
    }

    public void goToPerformerProfileAndVerify() throws InterruptedException {
        Thread.sleep(1500);
        while (true){
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
            try{
                txtGenreChitChat.isDisplayed();
                break;
            }catch (Exception e){
                action.swipeByElements(category3, category1);
            }
        }
        txtGenreChitChat.click();
        txtGenreChitChat.click();
//        btnClearFilter.click();
//        txtGenreGaming.click();
        String PerformerName1= infoPerformerName.getText();
        infoPerformerName.click();
        String PerformerName2= txtProfileNameProfile.getText();
        Assert.assertEquals(PerformerName1,PerformerName2);
        btnProfileShare.isDisplayed();
        imgProfile.isDisplayed();
        txtProfileLikesCount.isDisplayed();
        txtProfileUsername.isDisplayed();
        txtProfileNumberFollower.isDisplayed();
        btnFollow.isDisplayed();
        action.checkTextCountains("Upcoming live shows");
        action.androidBack();
    }

    public void checkPosterComponent() {
        action.waitUntiElementPresent(By.id(liveBanner));
        infoGenre.isDisplayed();
        infoTitle.isDisplayed();
        btnProfile.isDisplayed();
        infoPerformerName.isDisplayed();
        infoAmountLikes.isDisplayed();
    }

    public void checkDirectionHeaderLive()throws InterruptedException {
        action.waitUntiElementPresent(By.id(liveBanner));
//        btnNotification.click();
//        Thread.sleep(1000);
//        action.checkTextCountains("Inbox");
//        action.androidBack();
        btnSearch.click();
        inputSearchText.isDisplayed();
        action.androidBack();
        btnTokenLive.click();
        txtTokenBalance.isDisplayed();
        action.androidBack();

    }

    public void changeResolution(){
        btnActionSetting.click();
        txtResolution240.click();
        btnActionSetting.click();
        txtResolution360.click();
        btnActionSetting.click();
        txtResolution720.click();
    }

    public void checkFollowUnfollowEventDetail()throws InterruptedException {
        Thread.sleep(3000);
        btnFollow.click();
        Thread.sleep(2000);
        String PerformerName;
        PerformerName = infoRecordedStreamerName.getText();
        action.checkTextCountains("just followed " +PerformerName);
        Thread.sleep(1000);
        String followText= btnFollow.getText();
        infoRecordedStreamerName.click();
        String followText2= btnFollowModal.getText();
        Assert.assertEquals(followText,followText2);
        btnFollowModal.click();
        Thread.sleep(1000);
        String followTextNEW2= btnFollowModal.getText();
        Thread.sleep(2000);
        try {
            btnDismissCardGift.click();
        }catch(Exception e){
            gradientTop.click();
        }
        String followTextNEW = btnFollow.getText();
        Assert.assertEquals(followTextNEW,followTextNEW2);
    }

    public void checkFollowUnfollowRecordedEvent()throws InterruptedException {
        btnFollow.click();
        Thread.sleep(1000);
        action.checkTextCountains("Following");
        btnCloseLive.click();
        txtWasLiveIndicator.click();
        btnFollow.isDisplayed();
        action.checkTextCountains("Following");
        btnFollow.click();
        Thread.sleep(1000);
        action.checkTextCountains("Follow");
        btnCloseLive.click();
        txtWasLiveIndicator.click();
        btnFollow.isDisplayed();
        action.checkTextCountains("Follow");
    }

    public void openLiveFromProfilePict() {
        txtLiveProfile.isDisplayed();
        imgProfile.click();
    }


}
