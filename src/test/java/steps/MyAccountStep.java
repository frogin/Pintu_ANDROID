package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MyAccountPage;
import pages.SearchPage;

public class MyAccountStep extends BaseUtil {

    @Given("I Go to MyAccount page")
    public void iGoToMyAccountPage() {
        MyAccountPage page = new MyAccountPage(driver);
        page.gotoMyAccount();
    }

    @Then("I verify user can pay Goplay access")
    public void iVerifyUserCanPayGoplayAccess() {
        MyAccountPage page = new MyAccountPage(driver);
        page.checkGoplayAccess();
    }

    @Then("I verify user can input promo code")
    public void iVerifyUserCanInputPromoCode()throws InterruptedException {
        MyAccountPage page = new MyAccountPage(driver);
        page.checkEnterAccessCode();
    }

    @Then("I verify user can access token info")
    public void iVerifyUserCanAccessTokenInfo()throws InterruptedException {
        MyAccountPage page = new MyAccountPage(driver);
        page.checkTokens();
    }
}
