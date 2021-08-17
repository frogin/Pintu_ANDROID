package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LivePage;

public class LiveStep extends BaseUtil {

    @Given("I open live event")
    public void iOpenLiveEvent() throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.openLiveEvent();
    }

    @Given("I open live event staging")
    public void iOpenLiveEventStaging() throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.openLiveEventStaging();
    }

    @And("`I check event detail element")
    public void iCheckEventDetailElement() throws InterruptedException{
        LivePage page = new LivePage(driver);
        page.checkEventDetails();
    }

    @And("`I check clean mode screen")
    public void iCheckCleanModeScreen()  throws InterruptedException{
        LivePage page = new LivePage(driver);
        page.checkCleanModeScren();
    }

    @Then("`I ended live should go back to homepage")
    public void iEndedLiveShouldGoBackToHomepage() throws InterruptedException{
        LivePage page = new LivePage(driver);
        page.closeLiveEvent();
    }

    @And("I open performer profile to check all element")
    public void iOpenPerformerProfileToCheckAllElement() {
        LivePage page = new LivePage(driver);
        page.checkPerformerProfile();
    }

    @And("I tap live event from profile to goback")
    public void iTapLiveEventFromProfileToGoback() {
        LivePage page = new LivePage(driver);
        page.openLiveEventFromProfile();
    }

    @And("I open another live recommendation")
    public void iOpenAnotherLiveRecommendation() throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkRecommendation();
    }

    @And("I check Hearts functiionality")
    public void iCheckHeartsFunctiionality() {
        LivePage page = new LivePage(driver);
        page.checkHeartsNumber();
    }

    @And("I send message to performer")
    public void iSendMessageToPerformer()throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkSendMessage();
    }

    @And("I send shout to performer")
    public void iSendShoutToPerformer()throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkSendShout();
    }


    @And("I send gift to performer staging")
    public void iSendGiftToPerformerStaging()throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkSendGiftStaging();
    }

    @Given("I open Marketing event")
    public void iOpenMarketingEvent() {
        LivePage page = new LivePage(driver);
        page.openMarketingEvent();
    }

    @And("I verify all element on marketing page")
    public void iVerifyAllElementOnMarketingPage() throws InterruptedException{
        LivePage page = new LivePage(driver);
        page.checkMarketingEvent();
    }

    @Given("I Verify reminder function in All section")
    public void iVerifyReminderFunctionInAllSection()throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkReminderFunction();
    }

    @Given("I open Today live event")
    public void iOpenTodayLiveEvent() {
        LivePage page = new LivePage(driver);
        page.openTodayLiveEvent();
    }


    @Given("I open Today live event staging")
    public void iOpenTodayLiveEventStaging() {
        LivePage page = new LivePage(driver);
        page.openTodayLiveEventStaging();
    }

    @And("I verify all element on today live event page")
    public void iVerifyAllElementOnTodayLiveEventPage()throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkTodayLiveEvent();
    }

    @And("I send gift to performer")
    public void iSendGiftToPerformer()throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkSendGift();
    }

    @Then("I check group functionality")
    public void iCheckGroupFunctionality()throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkSwitchGroup();
    }

    @Given("I open top watched event")
    public void iOpenTopWatchedEvent() {
        LivePage page = new LivePage(driver);
        page.openTopWatchedShow();
    }

    @Then("I verify all element on recorded event")
    public void iVerifyAllElementOnRecordedEvent()throws InterruptedException {
        LivePage page = new LivePage(driver);
        page.checkRecordedEvent();
    }

    @Given("I open Promoted event")
    public void iOpenPromotedEvent() {
        LivePage page = new LivePage(driver);
        page.openPromotedEvent();
    }

    @And("I verify all element on promoted event page")
    public void iVerifyAllElementOnPromotedEventPage()throws InterruptedException  {
        LivePage page = new LivePage(driver);
        page.checkTodayLiveEvent();
    }


}
