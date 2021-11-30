package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class IndiePage extends BaseUtil {

    ElementAction action = new ElementAction();
    LivePage page = new LivePage(driver);
    MoviesPage movies = new MoviesPage(driver);

    public IndiePage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "feed_item_image")
    public MobileElement bannerMovie;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='INDIE']")
    public MobileElement txtIndie;

    public void gotoindiePage() {
        txtIndie.click();
        bannerMovie.isDisplayed();
    }

    public void checkIndieMovieDetail() {
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        MoviesPage.infoSubscribe.isDisplayed();
        MoviesPage.btnContribute.isDisplayed();
        MoviesPage.btnShareIG.isDisplayed();
        LivePage.btnPlayNow.click();
        Assert.assertFalse(action.checkPageSource("Share to IG"));
        action.androidBack();
        LivePage.btnPlayNow.isDisplayed();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void openRandomIndie() {
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
        action.scroToElement("Just Added");
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
        action.scroToElement("Docureality");
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
    }


}
