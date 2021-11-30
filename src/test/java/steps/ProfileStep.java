package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ProfilePage;
import pages.SearchPage;

public class ProfileStep extends BaseUtil {


    @Given("I open performer profile page")
    public void iOpenPerformerProfilePage() {
        ProfilePage page = new ProfilePage(driver);
        page.goToPerformerProfile();
    }

    @And("Follow performer to check the functionality")
    public void followPerformerToCheckTheFunctionality() {
        ProfilePage page = new ProfilePage(driver);
        page.checkFollowFunctionality();
    }

    @Then("Unfollow performer to check the functionality")
    public void unfollowPerformerToCheckTheFunctionality() {
        ProfilePage page = new ProfilePage(driver);
        page.checkUnfollowFunctionality();
    }

    @Then("I share performer profile")
    public void iSharePerformerProfile()throws  InterruptedException {
        ProfilePage page = new ProfilePage(driver);
        page.checkShareProfile();
    }

    @Then("I see empty state in Upcoming and Previous event")
    public void iSeeEmptyStateInUpcomingAndPreviousEvent() {
        ProfilePage page = new ProfilePage(driver);
        page.checkEmptyState();
    }


    @Then("I see all upcoming and recorded event")
    public void iSeeAllUpcomingAndRecordedEvent() {
        ProfilePage page = new ProfilePage(driver);
        page.checkUpcomingAndRecordedEvent();
    }
}