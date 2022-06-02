package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class PopularStreamerPage extends BaseUtil {

    public PopularStreamerPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    String txt_PerformerName4Value;

    ElementAction action = new ElementAction();

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Watch now\"]/android.widget.TextView")
    public MobileElement txt_WatchNow;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Scheduled\"]/android.widget.TextView")
    public MobileElement txt_Scheduled;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public MobileElement img_WatchNowPerformerPic1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    public MobileElement img_WatchNowPerformerPic3;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    public MobileElement img_WatchNowPerformerPic4;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView")
    public MobileElement txt_WatchNowPerformerName4;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public MobileElement img_ScheduledPerformerPic1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    public MobileElement img_ScheduledPerformerPic3;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")
    public MobileElement img_ScheduledPerformerPic4;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView")
    public MobileElement txt_ScheduledPerformerName4;

    @AndroidFindBy(id = "com.goplay.android:id/streamer_profile_name")
    public MobileElement txt_PerformerNameOnPage;

    public void OpenWatchNowPage(){
        txt_WatchNow.click();
    }

    public void OpenSchduledPage(){
        txt_Scheduled.click();
    }

    public void ScrollToPopularStreamer(){
        action.scroToElement("Popular streamer");
        if(txt_WatchNow.isSelected()){
            img_WatchNowPerformerPic1.isDisplayed();
            img_WatchNowPerformerPic3.isDisplayed();
        }else{
            img_ScheduledPerformerPic1.isDisplayed();
            img_ScheduledPerformerPic3.isDisplayed();
        }
    }

    public String SwipeCarousel(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        if(txt_WatchNow.isSelected()){
            while (true) {
                try {
                    img_WatchNowPerformerPic4.isDisplayed();
                    txt_WatchNowPerformerName4.isDisplayed();
                    txt_PerformerName4Value = txt_WatchNowPerformerName4.getText();
                    break;
                } catch (Exception e) {
                    action.swipeByElements(img_WatchNowPerformerPic3, img_WatchNowPerformerPic1);
                }
            }
        }else{
                while (true){
                    try{
                        img_ScheduledPerformerPic4.isDisplayed();
                        txt_ScheduledPerformerName4.isDisplayed();
                        txt_PerformerName4Value = txt_ScheduledPerformerName4.getText();
                        break;
                    }catch (Exception e){
                        action.swipeByElements(img_ScheduledPerformerPic3, img_ScheduledPerformerPic1);
                    }
                }
        } return txt_PerformerName4Value;
    }

    public void OpenProfilePage() throws InterruptedException {
        if(txt_WatchNow.isSelected()){
            img_WatchNowPerformerPic4.click();
        }else{
            img_ScheduledPerformerPic4.click();
        }
        Thread.sleep(2000);
    }

    public void VerifyPerformerProfile(){
        Assert.assertEquals(txt_PerformerNameOnPage.getText(), txt_PerformerName4Value);
        action.checkTextCountains("Upcoming live shows");
        action.checkTextCountains("Previous live shows");
    }
}
