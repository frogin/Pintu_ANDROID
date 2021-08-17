package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MoviesPage;
import pages.LivePage;

public class MoviesStep extends BaseUtil {

    @Given("I Go to Movies page")
    public void iGoToMoviesPage() {
        MoviesPage page = new MoviesPage(driver);
        page.gotoMoviesPage();
    }

    @And("I verify all element and user can watch some episode")
    public void iVerifyAllElementAndUserCanWatchSomeEpisode() {
        MoviesPage page = new MoviesPage(driver);
        page.checkMovieDetailPageWithSomeFreeEpisode();
    }

    @Then("I play movie and watching")
    public void iPlayMovieAndWatching() {
    }

    @Then("I verify all element and user can watch all episode")
    public void iVerifyAllElementAndUserCanWatchAllEpisode() {
        MoviesPage page = new MoviesPage(driver);
        page.checkMovieDetailPageWithFreeAll();
    }

    @Then("I verify all element and user can't play paid movie")
    public void iVerifyAllElementAndUserCanTPlayPaidMovie() {
        MoviesPage page = new MoviesPage(driver);
        page.checkPaidMovie();
    }

    @Then("I verify that I can rent movie")
    public void iVerifyThatICanRentMovie() {
        MoviesPage page = new MoviesPage(driver);
        page.checkRentMovie();
    }

    @Then("I verify that I can open random movie")
    public void iVerifyThatICanOpenRandomMovie() {
        MoviesPage page = new MoviesPage(driver);
        page.openRandomMovie();
    }

    @Then("I verify all element and user can watch all episode Staging")
    public void iVerifyAllElementAndUserCanWatchAllEpisodeStaging() {
        MoviesPage page = new MoviesPage(driver);
        page.checkMovieDetailPageWithFreeAllStaging();
    }

    @Then("I verify that I can rent movie staging")
    public void iVerifyThatICanRentMovieStaging() {
        MoviesPage page = new MoviesPage(driver);
        page.checkRentMovieStaging();
    }
}
