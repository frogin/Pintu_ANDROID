package steps;

import Base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TokenTopUpPage;
import pages.MyAccountPage;
import pages.LivePage;

public class TokenTopUpStep extends BaseUtil {
    TokenTopUpPage page = new TokenTopUpPage(driver);
    MyAccountPage page2 = new MyAccountPage(driver);
    LivePage page3 = new LivePage(driver);

    @Given("I open token topup bottom sheet from homepage")
    public void i_open_token_topup_bottom_sheet_from_homepage(){
        System.out.println("Nothing to do");
    }

    @Given("I open token topup bottom sheet from profile page")
    public void i_open_token_topup_bottom_sheet_from_profile_page() {
        page2.gotoMyAccount();
        page2.txtTokens.click();
    }

    @Given("I open token topup bottom sheet from live event")
    public void i_open_token_topup_bottom_sheet_from_live_event() {
        page3.openLiveEvent();
        page3.btnGift.click();
    }

    @Given("I get insufficient token alert")
    public void i_get_insufficient_token_alert() throws InterruptedException {
        page3.openLiveEvent();
        page3.btnGift.click();
        Thread.sleep(3000);
    }

    @Then("I open token topup bottom sheet from insufficient token alert and pay")
    public void i_open_token_topup_bottom_sheet_from_insufficient_token_alert_and_pay() throws InterruptedException{
        page.insufficientToken();
        Thread.sleep(3000);
        page.closeGooglePay();
    }

    @Then("pay the token")
    public void pay_the_token() throws InterruptedException {
        page.topupTokenFlow();
        Thread.sleep(3000);
        page.closeGooglePay();
    }
}
