package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.IndiePage;
import pages.MoviesPage;

public class IndieStep extends BaseUtil {

    @Given("I Go to Indie page")
    public void iGoToIndiePage() {
        IndiePage page = new IndiePage(driver);
        page.gotoindiePage();
    }

    @Then("I verify all element and user can watch Indie movie")
    public void iVerifyAllElementAndUserCanWatchIndieMovie() {
        IndiePage page = new IndiePage(driver);
        page.checkIndieMovieDetail();
    }

    @Then("I verify that I can open random Indie movie")
    public void iVerifyThatICanOpenRandomIndieMovie() {
        IndiePage page = new IndiePage(driver);
        page.openRandomIndie();
    }
}
