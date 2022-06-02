package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PopularStreamerPage;

public class PopularStreamerStep extends BaseUtil {
    PopularStreamerPage pagePopularStreamer = new PopularStreamerPage(driver);

    @Given("I open watch now tab")
    public void iOpenWatchNowTab() {
        pagePopularStreamer.OpenWatchNowPage();
    }

    @Given("I open scheduled tab")
    public void iOpenScheduledTab() {
        pagePopularStreamer.OpenSchduledPage();
    }

    @When("I see popular streamer carousel displayed")
    public void iSeePopularStreamerCarouselDisplayed() {
        pagePopularStreamer.ScrollToPopularStreamer();
        pagePopularStreamer.SwipeCarousel();
    }

    @And("Tap one of the popular streamers")
    public void tapOneOfThePopularStreamers() throws InterruptedException {
        pagePopularStreamer.OpenProfilePage();
    }

    @Then("That performer profile page opened")
    public void thatPerformerProfilePageOpened() {
        pagePopularStreamer.VerifyPerformerProfile();
    }
}
