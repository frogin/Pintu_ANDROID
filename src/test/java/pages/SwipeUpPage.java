package pages;

import Base.BaseUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class SwipeUpPage extends BaseUtil {
    public SwipeUpPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    String eventName1, eventName2, eventName3, eventNameRecorded1, eventNameScheduled1, performerNameLive1, performerNameRecorded1, performerNameScheduled1;

    @AndroidFindBy(id = "event_info")
    public MobileElement eventNameLive;

    @AndroidFindBy(id = "event_info_performer_name")
    public MobileElement performerNameLiveAndRecorded;

    @AndroidFindBy(id = "event_title")
    public MobileElement eventNameRecorded;

    @AndroidFindBy(id = "schedule_title")
    public MobileElement eventNameScheduled;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")
    public MobileElement performerNameScheduled;

    @AndroidFindBy(id = "performer_name_field")
    public MobileElement infoPerformerName;

    @AndroidFindBy(id = "streamer_profile_image")
    public MobileElement streamerProfileImage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[1]")
    public MobileElement firstScheduledEvent;

    public void openProfileFromWatchNow(){
        infoPerformerName.click();
        streamerProfileImage.isDisplayed();
    }

    public void openLiveFromProfileImage(){
        streamerProfileImage.click();
    }

    public void openScheduledEventFromProfile(){
        try{
            firstScheduledEvent.click();
        }catch (Exception e){
          System.out.println("Performer has no scheduled events");
        }

    }

    public String eventNameLive1(){
        eventName1 = eventNameLive.getText();
        System.out.println("Live event name 1 : "+eventName1);
        return eventName1;
    }

    public String eventNameLive2(){
        eventName2 = eventNameLive.getText();
        System.out.println("Live event name 2 : "+eventName2);
        return eventName2;
    }

    public String eventNameLive3(){
        eventName3 = eventNameLive.getText();
        System.out.println("Live event name 3 : "+eventName3);
        return eventName3;
    }

    public String eventNameRecorded1(){
        eventNameRecorded1 = eventNameRecorded.getText();
        System.out.println("Recorded event name 1 : "+eventNameRecorded1);
        return eventNameRecorded1;
    }

    public String eventNameScheduled1(){
        eventNameScheduled1 = eventNameScheduled.getText();
        System.out.println("Scheduled event name 1 : "+eventNameScheduled1);
        return eventNameScheduled1;
    }

    public String performerNameLive1(){
        performerNameLive1 = performerNameLiveAndRecorded.getText();
        System.out.println("Live event performer name 1 : "+performerNameLive1);
        return performerNameLive1;
    }

    public String performerNameRecorded1(){
        performerNameRecorded1 = performerNameLiveAndRecorded.getText();
        System.out.println("Recorded event performer name 1 : "+performerNameRecorded1);
        return performerNameRecorded1;
    }

    public String performerNameScheduled1(){
        performerNameScheduled1 = performerNameScheduled.getText();
        System.out.println("Scheduled event performer name 1 : "+performerNameScheduled1);
        return performerNameScheduled1;
    }

    public void swipeUp() {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * 0.5);
        int startPoint = (int) (size.height * 0.3);
        int endPoint = (int) (size.height * 0.1);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    public void swipeDown(){
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * 0.5);
        int startPoint = (int) (size.height * 0.1);
        int endPoint = (int) (size.height * 0.3);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    public void compareDifferentLiveEvent(){
        Assert.assertNotEquals(eventName1,eventName2);
    }

    public void compareSameLiveEvent(){
        Assert.assertEquals(eventName1,eventName3);
    }

    public void compareRecordedAndLiveEvent(){
        Assert.assertNotEquals(eventNameRecorded1,eventName1);
    }

    public void compareScheduledAndLiveEvent(){
        Assert.assertNotEquals(eventNameScheduled1,eventName1);
    }

    public void compareScheduledAndRecordedEvent(){
        Assert.assertNotEquals(eventNameScheduled1,eventNameRecorded1);
    }

    public void comparePerformerLiveAndRecorded(){
        Assert.assertEquals(performerNameLive1, performerNameRecorded1);
    }

    public void comparePerformerScheduledAndRecorded(){
        Assert.assertEquals(performerNameScheduled1, performerNameRecorded1);
    }
}
