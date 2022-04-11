package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import pages.LivePage;
import pages.SearchPage;
import pages.SwipeUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SwipeUpStep extends BaseUtil {
    SwipeUpPage pageSwipe = new SwipeUpPage();
    LivePage pageLive = new LivePage(driver);
    SearchPage pageSearch = new SearchPage(driver);

    @Given("I open live event from watch now page")
    public void i_open_live_event_from_watch_now_page() throws InterruptedException {
        pageLive.openLiveEvent();
        Thread.sleep(5000);
        pageSwipe.eventNameLive1();
    }
    @Given("I open recorded event from watch now page")
    public void i_open_recorded_event_from_watch_now_page() throws InterruptedException {
        pageLive.openTopWatchedShow();
        Thread.sleep(5000);
        pageSwipe.eventNameRecorded1();
    }
    @Given("I open scheduled event from scheduled page")
    public void i_open_scheduled_event_from_scheduled_page() throws InterruptedException {
        pageLive.goToScheduledTab();
        pageLive.openTodayLiveEvent();
        Thread.sleep(5000);
        pageSwipe.eventNameScheduled1();
    }
    @Given("I open perfomer profile page from watch now")
    public void i_open_perfomer_profile_page_from_watch_now(){
        pageSwipe.openProfileFromWatchNow();
    }
    @Given("I open perfomer profile page from search")
    public void iOpenPerfomerProfilePageFromSearch() {
        pageSearch.gotoSearch();
        pageSearch.typePerformerName("GoPlay");
        pageSearch.checkDirectionToStreamerProfile();
    }

    @And("Open live event from that performer")
    public void openLiveEventFromThatPerformer() throws InterruptedException {
        pageSwipe.openLiveFromProfileImage();
        Thread.sleep(5000);
        pageSwipe.eventNameLive1();
        pageSwipe.performerNameLive1();
    }
    @And("Open scheduled event from that performer")
    public void openScheduledEventFromThatPerformer() throws InterruptedException {
        pageSwipe.openScheduledEventFromProfile();
        Thread.sleep(5000);
        pageSwipe.eventNameScheduled1();
        pageSwipe.performerNameScheduled1();
    }

    @When("I swipe up on the swipe area")
    public void i_swipe_up_on_the_swipe_area() {
        pageSwipe.swipeUp();
    }
    @When("I swipe down on the swipe area")
    public void i_swipe_down_on_the_swipe_area() {
        // pre-condition
        pageSwipe.swipeUp();
        pageSwipe.eventNameLive2();

        pageSwipe.swipeDown();
    }

    @Then("The next event is opened")
    public void the_next_event_is_opened() throws InterruptedException {
        Thread.sleep(5000);
        pageSwipe.eventNameLive2();
        pageSwipe.compareDifferentLiveEvent();
    }
    @Then("The previous event is opened")
    public void the_previous_event_is_opened() throws InterruptedException {
        Thread.sleep(5000);
        pageSwipe.eventNameLive3();
        pageSwipe.compareSameLiveEvent();
    }
    @Then("Live event is opened after recorded event")
    public void live_event_is_opened_after_recorded_event() throws InterruptedException {
        Thread.sleep(5000);
        pageSwipe.eventNameLive1();
        pageSwipe.compareRecordedAndLiveEvent();
    }
    @Then("Live event is opened after scheduled event")
    public void live_event_is_opened_after_scheduled_event() throws InterruptedException {
        Thread.sleep(5000);
        pageSwipe.eventNameLive1();
        pageSwipe.compareScheduledAndLiveEvent();
    }
    @Then("Recorded event from that performer is opened")
    public void recordedEventFromThatPerformerIsOpened() throws InterruptedException {
        Thread.sleep(5000);
        pageSwipe.eventNameRecorded1();
        pageSwipe.performerNameRecorded1();
        pageSwipe.compareScheduledAndLiveEvent();
        pageSwipe.comparePerformerLiveAndRecorded();
    }
    @Then("The next recorded event from that performer is opened")
    public void theNextRecordedEventFromThatPerformerIsOpened() throws InterruptedException {
        Thread.sleep(5000);
        pageSwipe.eventNameRecorded1();
        pageSwipe.performerNameRecorded1();
        pageSwipe.compareScheduledAndRecordedEvent();
        pageSwipe.comparePerformerScheduledAndRecorded();
    }
}
