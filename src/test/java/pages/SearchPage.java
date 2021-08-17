package pages;

import Base.BaseUtil;
import Base.ElementAction;
import gherkin.lexer.Th;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class SearchPage extends BaseUtil {

    ElementAction action = new ElementAction();

    public SearchPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "homeSearchFragment")
    public MobileElement pageSearch;

    @AndroidFindBy(id = "homeDownloadsFragment")
    public MobileElement pageDownload;

    @AndroidFindBy(id = "inbox_nav_graph")
    public MobileElement pageInbox;

    @AndroidFindBy(id = "feed_poster_with_badge")
    public MobileElement bannerGeneral;

    @AndroidFindBy(id = "homeProfileFragment")
    public MobileElement pageMyAccount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='All movies']")
    public MobileElement txtAllMovies;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='All series']")
    public MobileElement txtAllSeries;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='All rentals']")
    public MobileElement txtAllRentals;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Action']")
    public MobileElement txtAction;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Romance']")
    public MobileElement txtRomance;

    @AndroidFindBy(id = "search_text")
    public MobileElement inputMovieName;

    @AndroidFindBy(id = "clear_button")
    public MobileElement btnClearSearch;

    @AndroidFindBy(id = "search_history_clear_button")
    public MobileElement btnClearAll;

    @AndroidFindBy(id = "btn_positive")
    public MobileElement btnYesClearAll;

    @AndroidFindBy(id = "back_button")
    public MobileElement btnBack;

    public void gotoSearch() {
        pageSearch.click();
    }
    public void gotoDownload() {
        pageDownload.click();
    }
    public void gotoInbox() {
        pageInbox.click();
    }
    public void gotoMyAccount() {
        pageMyAccount.click();
    }

    public void checkSearchElement() {
        txtAllMovies.isDisplayed();
        action.checkTextCountains("Search movies or series");
        action.checkTextCountains("All movies");
        action.checkTextCountains("All series");
        action.checkTextCountains("All rentals");
        action.checkTextCountains("Explore Genres");
        txtAllMovies.click();
        bannerGeneral.isDisplayed();
        action.androidBack();
        txtAllSeries.click();
        bannerGeneral.isDisplayed();
        action.androidBack();
        txtAllRentals.click();
        bannerGeneral.isDisplayed();
        action.androidBack();
        txtAction.click();
        bannerGeneral.isDisplayed();
        action.androidBack();
        txtRomance.click();
        bannerGeneral.isDisplayed();
        action.androidBack();
    }

    public void checkSearchFunction()throws InterruptedException {
        txtAllMovies.isDisplayed();
        inputMovieName.click();
        inputMovieName.sendKeys("Doctor"+"\n");
        action.pressEnter();
        bannerGeneral.isDisplayed();
        btnClearSearch.click();
        Thread.sleep(1000);
        action.checkTextCountains("Doctor");
    }

    public void clearAllSearch() {
        btnClearAll.click();
        btnYesClearAll.click();
        Assert.assertFalse(action.checkPageElement("Doctor"));
        btnBack.click();
        txtAllMovies.isDisplayed();
    }

    public void recentSearchShouldEmpty() {
        Assert.assertFalse(action.checkPageElement("Doctor"));
        btnBack.click();
        txtAllMovies.isDisplayed();
    }


}
