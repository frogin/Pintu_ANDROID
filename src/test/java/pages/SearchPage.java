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
    LivePage page = new LivePage(driver);

    String searchName= "";

    public SearchPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "search")
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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='All indie movies']")
    public MobileElement txtAllIndieMovies;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Action']")
    public MobileElement txtAction;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Comedy']")
    public MobileElement txtComedy;

    @AndroidFindBy(id = "search_text")
    public MobileElement inputMovieName;

    @AndroidFindBy(id = "clear_button")
    public MobileElement btnClearSearch;

    @AndroidFindBy(id = "btn_positive")
    public MobileElement btnYesClearAll;

    @AndroidFindBy(id = "back_button")
    public MobileElement btnBack;

    // Element for v2

    @AndroidFindBy(id = "search_text")
    public MobileElement inputSearchBox;

    @AndroidFindBy(id = "performer_item_ava")
    public MobileElement imgTopPerformer;

    @AndroidFindBy(id = "most_search_item_label")
    public MobileElement btnTopSearch;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TOP']")
    public static MobileElement txtSearchTop;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='STREAMER']")
    public static MobileElement txtSearchStreamer;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LIVE SHOWS']")
    public static MobileElement txtSearchLiveShows;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='MOVIES & SERIES']")
    public static MobileElement txtSearchMoviesSeries;

    @AndroidFindBy(id = "list_search_info")
    public MobileElement listSearchInfo;

    @AndroidFindBy(id = "event_name")
    public MobileElement infoSearchEventName;

    @AndroidFindBy(id = "event_image")
    public MobileElement InfoSearchEventImg;

    @AndroidFindBy(id = "event_performer_name")
    public MobileElement infoSearchPerformerName;

    @AndroidFindBy(id = "performer_display_name")
    public MobileElement infoSearchStreamerName;

    @AndroidFindBy(id = "performer_username")
    public MobileElement infoSearchStreamerUserName;

    @AndroidFindBy(id = "performer_extras_chip_view")
    public MobileElement infoSearchStreamerAddOn;

    @AndroidFindBy(id = "event_extras_chip_view")
    public MobileElement InfoSearchAddon;

    @AndroidFindBy(id = "vod_title")
    public MobileElement InfoSearchVodTitle;

    @AndroidFindBy(id = "vod_cast")
    public MobileElement InfoSearchVodCast;

    @AndroidFindBy(id = "vod_extras_chip_view")
    public MobileElement InfoSearchVodAddOn;

    @AndroidFindBy(id = "titleSearchHistory")
    public MobileElement txtRecentSearch;

    @AndroidFindBy(id = "titleClearHistory")
    public MobileElement btnClearAll;

    @AndroidFindBy(id = "vod_image")
    public MobileElement imgVOD;

    @AndroidFindBy(id = "btnPlay")
    public MobileElement btnPlay;

    @AndroidFindBy(id = "search_history_item_label")
    public MobileElement infoSearchHistory;

    @AndroidFindBy(id = "search_history_empty_text")
    public MobileElement infoSearchHistoryEmpty;



    public void gotoSearch() {

        pageSearch.click();
    }

    public void checkSearchElement() {
        inputSearchBox.isDisplayed();
        imgTopPerformer.isDisplayed();
        btnTopSearch.isDisplayed();
        txtAllMovies.isDisplayed();
        txtAllSeries.isDisplayed();
        txtAllIndieMovies.isDisplayed();
        txtComedy.isDisplayed();
        txtAction.isDisplayed();
        action.checkTextCountains("Find streamer, live shows, or movies");
        action.checkTextCountains("Top Streamer");
        action.checkTextCountains("Top search");
        action.checkTextCountains("All movies");
        action.checkTextCountains("All series");
        action.checkTextCountains("All indie movies");
        action.checkTextCountains("Explore genre");
    }

    public void checkDirectionTopStreamer() {
        imgTopPerformer.click();
        LivePage.btnFollow.isDisplayed();
        action.androidBack();
        checkSearchElement();
    }

    public void checkTopSearch() {
        String streamerNameOld= btnTopSearch.getText();
        btnTopSearch.click();
        txtSearchTop.isDisplayed();
        txtSearchStreamer.isDisplayed();
        txtSearchLiveShows.isDisplayed();
        txtSearchMoviesSeries.isDisplayed();
        String streamerNameNew= inputSearchBox.getText();
        Assert.assertEquals(streamerNameOld,streamerNameOld);
        listSearchInfo.isDisplayed();
        InfoSearchEventImg.isDisplayed();
        infoSearchEventName.isDisplayed();
        infoSearchPerformerName.isDisplayed();
        InfoSearchAddon.isDisplayed();
        action.androidBack();
        txtRecentSearch.isDisplayed();
        btnClearAll.isDisplayed();
    }

    public void checkAllmovies() {
        txtAllMovies.click();
        imgVOD.click();
        btnPlay.isDisplayed();
        action.androidBack();
        action.androidBack();
        txtAllSeries.click();
        imgVOD.click();
        btnPlay.isDisplayed();
        action.androidBack();
        action.androidBack();
        txtAllIndieMovies.click();
        imgVOD.click();
        btnPlay.isDisplayed();
        action.androidBack();
        action.androidBack();
    }

    public void checkExploreGenre() {
        txtAction.click();
        imgVOD.click();
        btnPlay.isDisplayed();
        action.androidBack();
        action.androidBack();
        txtComedy.click();
        imgVOD.click();
        btnPlay.isDisplayed();
        action.androidBack();
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


    public void typePerformerName(String name) {
        inputSearchBox.sendKeys(name);
        action.pressEnter();
        System.out.println(name);
        searchName=name;

    }

    public void recentSearchShouldPopulated() {
        action.androidBack();
        infoSearchHistory.isDisplayed();
        action.checkTextCountains(searchName);
    }

    public void clearAllSearchHistory() {
        btnClearAll.click();
        infoSearchHistoryEmpty.isDisplayed();
        action.checkTextCountains("Your recent searches will appear here");
    }

    public void checkSearchStreamerResult() {
        txtSearchStreamer.click();
        infoSearchStreamerName.isDisplayed();
        infoSearchStreamerUserName.isDisplayed();
        infoSearchStreamerAddOn.isDisplayed();
        action.checkTextCountains(searchName);
    }

    public void checkSearchMoviesResult() {
        txtSearchMoviesSeries.click();
        InfoSearchVodTitle.isDisplayed();
        InfoSearchVodCast.isDisplayed();
        InfoSearchVodAddOn.isDisplayed();
        action.checkTextCountains(searchName);
    }

    public void checkSearchTOPResult() {
        infoSearchStreamerName.isDisplayed();
        infoSearchEventName.isDisplayed();
        infoSearchPerformerName.isDisplayed();
        infoSearchStreamerUserName.isDisplayed();
    }

    public void checkDirectionToStreamerProfile() {
        infoSearchStreamerName.click();
        LivePage.btnFollow.isDisplayed();
        action.checkTextCountains(searchName);
    }

    public void checkDirectionToMovieDetail() {
        InfoSearchVodTitle.click();
        btnPlay.isDisplayed();
        action.checkTextCountains(searchName);
    }

    public void recentSearchShouldEmpty() {
        Assert.assertFalse(action.checkPageElement("Doctor"));
        btnBack.click();
        txtAllMovies.isDisplayed();
    }




}
