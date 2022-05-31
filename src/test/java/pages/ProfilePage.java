package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ProfilePage extends BaseUtil {

    ElementAction action = new ElementAction();
    LivePage page = new LivePage(driver);

    public ProfilePage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "homeSearchFragment")
    public MobileElement pageSearch;

    @AndroidFindBy(id = "homeDownloadsFragment")
    public MobileElement pageDownload;

    @AndroidFindBy(id = "anchor_button")
    public MobileElement btnSeeAll;

    @AndroidFindBy(id = "see_all_events_close")
    public MobileElement btnCloseSeeAll;

    @AndroidFindBy(id = "viewer_count_layout")
    public MobileElement txtViewerCount;

    @AndroidFindBy(id = "poster_view")
    public MobileElement posterEvent;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView[1]")
    public MobileElement posterEvent3;

    public void goToPerformerProfile() {
        LivePage.btnProfile.click();
    }

    public void checkFollowFunctionality() {
//        String numberFollowerOld= LivePage.txtProfileNumberFollower.getText();
        LivePage.btnFollow.click();
//        String numberFollowerNew= LivePage.txtProfileNumberFollower.getText();
//        Assert.assertNotEquals(numberFollowerOld,numberFollowerNew);
        action.checkTextCountains("Following");
        LivePage.btnReminder.isDisplayed();
        LivePage.btnReminder.isSelected();
    }

    public void checkUnfollowFunctionality() {
        String numberFollowerOld= LivePage.txtProfileNumberFollower.getText();
        LivePage.btnFollow.click();
        String numberFollowerNew= LivePage.txtProfileNumberFollower.getText();
        //Assert.assertNotEquals(numberFollowerOld,numberFollowerNew);
        action.checkTextCountains("Follow");
    }

    public void checkShareProfile() throws InterruptedException{
        LivePage.btnProfileShare.click();
        Thread.sleep(1500);
        action.checkTextCountains("Suggest this to friends");
        action.checkTextCountains("IG Story");
        action.checkTextCountains("WhatsApp");
        action.checkTextCountains("Twitter");
        action.checkTextCountains("Copy Link");
        LivePage.btnMore.click();
        Thread.sleep(1500);
        action.androidBack();
        LivePage.txtCopyLink.click();
        action.androidBack();
    }

    public void checkEmptyState(){
        LivePage.btnProfileShare.isDisplayed();
        action.checkTextCountains("Upcoming live shows");
        action.checkTextCountains("We can't wait either!");
        action.checkTextCountains("If Aldo planning something big, you'll see it here. Let's keep an eye.");
        action.checkTextCountains("Previous live shows");
        action.checkTextCountains("No recorded shows… yet!");
        action.checkTextCountains("Be sure to follow Aldo so you'll be the first to know once there's a new one.");
    }

    public void checkUpcomingAndRecordedEvent() throws InterruptedException{
        LivePage.btnProfileShare.isDisplayed();
        action.checkTextCountains("Upcoming live shows");
        action.checkTextCountains("Previous live shows");
        posterEvent.isDisplayed();
        btnSeeAll.click();
        LivePage.btnReminder.isDisplayed();
        action.checkTextCountains("Franky Kuncoro's upcoming live shows");
        posterEvent.click();
        LivePage.txtEventDetail.isDisplayed();
        action.checkTextCountains("Franky Kuncoro");
        LivePage.btnCloseEventDetail.click();
        btnCloseSeeAll.click();
        Thread.sleep(1500);
        txtViewerCount.click();
        LivePage.btnFollow.isDisplayed();
        action.androidBack();
    }


}
