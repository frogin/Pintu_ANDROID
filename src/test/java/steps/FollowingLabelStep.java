package steps;

import Base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import pages.FollowingLabelPage;

public class FollowingLabelStep extends BaseUtil{
    FollowingLabelPage pageFollowingLabel = new FollowingLabelPage(driver);

    @Given("I open watch now page")
    public void iOpenWatchNowPage() {
        pageFollowingLabel.OpenWatchNowPage();
    }

    @Given("I open scheduled page")
    public void iOpenScheduledPage() {
        pageFollowingLabel.OpenSchduledPage();
    }

    @And("Follow one of the performers")
    public void followOneOfThePerformers() {
        pageFollowingLabel.followPerformerLive();
        if(pageFollowingLabel.txt_Scheduled.isSelected()){
            pageFollowingLabel.ScrollDown();
        }
        pageFollowingLabel.ScrollDown();
    }

    @When("I see that performer live event card")
    public void iSeeThatPerformerLiveEventCard() {
        pageFollowingLabel.searchLiveEventBanner();
    }

    @When("I see that performer upcoming event card")
    public void iSeeThatPerformerUpcomingEventCard() {
        pageFollowingLabel.searchLiveEventBanner();
    }

    @Then("Following label displayed")
    public void followingLabelDisplayed() {
        pageFollowingLabel.verifyFollowingLabel();
    }
}
