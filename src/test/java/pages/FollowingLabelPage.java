package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class FollowingLabelPage extends BaseUtil {

    String performerNameText, totalLikesText;

    ElementAction action = new ElementAction();

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Watch now\"]/android.widget.TextView")
    public MobileElement txt_WatchNow;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Scheduled\"]/android.widget.TextView")
    public MobileElement txt_Scheduled;

    @AndroidFindBy(id = "com.goplay.android:id/avatar_view")
    public MobileElement img_performerAvatar;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public MobileElement firstLiveEventGroupView;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[3]")
    public MobileElement img_firstLiveEventAvatar;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[4]")
    public MobileElement img_firstUpcomingEventAvatar;

    @AndroidFindBy(id = "com.goplay.android:id/streamer_profile_name")
    public MobileElement txt_performerName;

    @AndroidFindBy(id = "com.goplay.android:id/streamer_profile_likes_count")
    public MobileElement txt_totalLikes;

    @AndroidFindBy(id = "com.goplay.android:id/btn_follow")
    public MobileElement btn_Follow;

    @AndroidFindBy(id = "com.goplay.android:id/performer_name_field")
    public MobileElement txt_performerNameHome;

    @AndroidFindBy(id = "com.goplay.android:id/performer_detail_field")
    public MobileElement txt_performerDetailHome;

    public FollowingLabelPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void OpenWatchNowPage(){
        txt_WatchNow.click();
    }

    public void OpenSchduledPage(){
        txt_Scheduled.click();
    }

    public String followPerformerLive(){
        if(txt_WatchNow.isSelected()){
            img_firstLiveEventAvatar.click();
        }else{
            ScrollUp();
            img_firstUpcomingEventAvatar.click();
        }

        performerNameText = txt_performerName.getText();
        totalLikes();
        String followStatus = btn_Follow.getText();
        if(followStatus.equals("Follow")){
            btn_Follow.click();
            action.androidBack();
        }
        else {
            action.androidBack();
        }
        return performerNameText;
    }

    public String totalLikes(){
        totalLikesText = txt_totalLikes.getText();
        return totalLikesText;
    }

    public void ScrollUp(){
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * 0.5);
        int startPoint = (int) (size.height * 0.7);
        int endPoint = (int) (size.height * 0.4);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    public void ScrollDown(){
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * 0.5);
        int startPoint = (int) (size.height * 0.4);
        int endPoint = (int) (size.height * 0.7);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    public void searchLiveEventBanner(){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+performerNameText+"\").instance(0))");
        Assert.assertEquals(performerNameText, txt_performerNameHome.getText());
    }

    public void verifyFollowingLabel(){
        Assert.assertEquals(totalLikesText.toUpperCase()+" LIKES ● FOLLOWING", txt_performerDetailHome.getText());
    }
}
