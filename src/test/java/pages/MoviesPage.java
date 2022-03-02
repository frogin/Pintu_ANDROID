package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static org.testng.AssertJUnit.assertFalse;

import pages.LivePage;
import steps.APISupport;

import java.util.concurrent.TimeUnit;


public class MoviesPage extends BaseUtil {

    ElementAction action = new ElementAction();
    LivePage page = new LivePage(driver);

    public MoviesPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "feed_item_image")
    public MobileElement bannerMovie;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies & series']")
    public MobileElement txtMovies;

    @AndroidFindBy(id = "ivDownloadState")
    public static MobileElement btnDownload;

    @AndroidFindBy(id = "iv_avod_banner")
    public static MobileElement infoSubscribe;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Cerita Dari Manggarai']")
    public static MobileElement imgCeritaDariManggarai;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Berkunjung ke Himalaya']")
    public static MobileElement imgMovieHimalaya;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='The Most Beautiful Goodbye']")
    public static MobileElement imgMovieGoodbye;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Parasite']")
    public static MobileElement imgMovieParasite;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Miracle: Letters To The President']")
    public static MobileElement imgMovieMiracle;

    @AndroidFindBy(id = "button_contact_customer_care")
    public static MobileElement btnAddAccess;

    @AndroidFindBy(id = "clear_button")
    public static MobileElement btnCloseSubsPage;

    @AndroidFindBy(id = "restore_button")
    public static MobileElement btnManageSubs;

    @AndroidFindBy(id = "ll_contribute")
    public static MobileElement btnContribute;

    @AndroidFindBy(id = "ll_share_ig")
    public static MobileElement btnShareIG;

    @AndroidFindBy(id = "ll_trailer")
    public static MobileElement btnTrailer;

    @AndroidFindBy(id = "merchant_logo")
    public static MobileElement imgMerchantLogo;

    @AndroidFindBy(id = "tipping_screen_continue_button")
    public static MobileElement btnSupportNow;

    @AndroidFindBy(id = "tipping_screen_skip_button")
    public static MobileElement btnIWillSkip;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout")
    public static MobileElement imageMovie1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/" +
            "android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout")
    public static MobileElement imageMovie3;

    public void gotoMoviesPage() {
        txtMovies.click();
        bannerMovie.isDisplayed();
    }

    public void checkMovieDetailPageWithSomeFreeEpisode() {
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Share to IG");
        LivePage.btnPlayNow.click();
        Assert.assertFalse(action.checkPageSource("Share to IG"));
        action.androidBack();
        LivePage.btnPlayNow.isDisplayed();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void checkMovieDetailPageWithFreeAll() {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"Top K-movies from tvN"+"\").instance(0))");
        imgCeritaDariManggarai.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Share to IG");
        action.checkTextCountains("Cast");
        action.checkTextCountains("Director");
        LivePage.btnPlayNow.click();
        Assert.assertFalse(action.checkPageSource("Share to IG"));
        action.androidBack();
        LivePage.btnPlayNow.isDisplayed();
    }

    public void checkMovieDetailPageWithFreeAllStaging() {
        imgMovieHimalaya.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Share to IG");
        action.checkTextCountains("Cast");
        action.checkTextCountains("Director");
        LivePage.btnPlayNow.click();
        Assert.assertFalse(action.checkPageSource("Share to IG"));
        action.androidBack();
        LivePage.btnPlayNow.isDisplayed();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void checkPaidMovie() {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"Top K-movies from tvN"+"\").instance(0))");
//        action.swipeByElements(imageMovie3,imageMovie1);
        imgMovieMiracle.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Share to IG");
        action.checkTextCountains("Cast");
        action.checkTextCountains("Director");
        LivePage.btnPlayNow.click();
        btnAddAccess.isDisplayed();
        action.checkTextCountains("You don’t have a GoPlay access, yet");
        action.checkTextCountains("To start watching, you will need to purchase a GoPlay access first.");
        btnAddAccess.click();
        btnManageSubs.isDisplayed();
        btnCloseSubsPage.click();
        LivePage.btnPlayNow.isDisplayed();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void checkRentMovie() {
        action.scroToElement("GoPlay rentals");
        LivePage.btnSeeAll.click();
        bannerMovie.isDisplayed();
        action.checkTextCountains("All rentals");
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Start within 30 days, Finish within 48 hours from the time you start. No hurry");
        btnContribute.isDisplayed();
        btnShareIG.isDisplayed();
        LivePage.btnPlayNow.click();
        imgMerchantLogo.isDisplayed();
        action.checkTextCountains("Rp 3,000");
        action.checkTextCountains("Credit/Debit Card");
        action.checkTextCountains("GoPay");
        action.androidBack();
        btnContribute.click();
        btnSupportNow.isDisplayed();
        btnIWillSkip.isDisplayed();
        action.checkTextCountains("Help the filmmaker create more films independently, for themselves and for you.");
        action.checkTextCountains("*This is inclusive of GoPlay and transaction charges.");
        action.androidBack();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void checkRentMovieStaging() {
        action.swipeByElements(imageMovie3,imageMovie1);
        imgMovieGoodbye.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Start within 30 days, Finish within 12 hours from the time you start. No hurry.");
        btnTrailer.isDisplayed();
        btnShareIG.isDisplayed();
        LivePage.btnPlayNow.click();
        imgMerchantLogo.isDisplayed();
        action.checkTextCountains("Rp 10,000");
        action.checkTextCountains("Credit/Debit Card");
        action.checkTextCountains("GoPay");
        action.androidBack();
        btnDownload.isDisplayed();
        btnShareIG.isDisplayed();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void openRandomMovie() {
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
        action.scroToElement("Holidays from home");
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
        action.scroToElement("Based on real events");
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
    }


}
