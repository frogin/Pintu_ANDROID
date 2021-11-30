package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SearchPage;

public class SearchStep extends BaseUtil {


    @Given("I Go to search page")
    public void iGoToSearchPage() {
        SearchPage page = new SearchPage(driver);
        page.gotoSearch();
    }

    @And("I do functionality search for movies or series")
    public void iDoFunctionalitySearchForMoviesOrSeries() throws InterruptedException {
        SearchPage page = new SearchPage(driver);
        page.checkSearchFunction();
    }

    @And("I clear search history")
    public void iClearSearchHistory() {
        SearchPage page = new SearchPage(driver);
        page.clearAllSearchHistory();

    }

    @Then("Recent search shold be empty")
    public void recentSearchSholdBeEmpty() {
        SearchPage page = new SearchPage(driver);
        page.recentSearchShouldEmpty();
    }

    @Then("I verify all element on Search page")
    public void iVerifyAllElementOnSearchPage() {
        SearchPage page = new SearchPage(driver);
        page.checkSearchElement();
    }

    @Then("I click one of top streamer and verify")
    public void iClickOneOfTopStreamerAndVerify() {
        SearchPage page = new SearchPage(driver);
        page.checkDirectionTopStreamer();
    }

    @Then("I click one of top search and verify")
    public void iClickOneOfTopSearchAndVerify() {
        SearchPage page = new SearchPage(driver);
        page.checkTopSearch();
    }

    @Then("I explore all movies and verify")
    public void iExploreAllMoviesAndVerify() {
        SearchPage page = new SearchPage(driver);
        page.checkAllmovies();
    }

    @Then("I explore all genre and verify")
    public void iExploreAllGenreAndVerify() {
        SearchPage page = new SearchPage(driver);
        page.checkExploreGenre();
    }


    @Then("Recent search should be populated")
    public void recentSearchShouldBePopulated() {
        SearchPage page = new SearchPage(driver);
        page.recentSearchShouldPopulated();
    }

    @And("I type for {string}")
    public void iTypeFor(String name) {
        SearchPage page = new SearchPage(driver);
        page.typePerformerName(name);
    }

    @Then("I should see in Streamer column")
    public void iShouldSeeInStreamerColumn() {
        SearchPage page = new SearchPage(driver);
        page.checkSearchStreamerResult();
    }

    @Then("I should see in Movies column")
    public void iShouldSeeInMoviesColumn() {
        SearchPage page = new SearchPage(driver);
        page.checkSearchMoviesResult();
    }

    @Then("I should see all result")
    public void iShouldSeeAllResult() {
        SearchPage page = new SearchPage(driver);
        page.checkSearchTOPResult();
    }

    @Then("I click to open their profile")
    public void iClickToOpenTheirProfile() {
        SearchPage page = new SearchPage(driver);
        page.checkDirectionToStreamerProfile();
    }

    @Then("I click to open movie detail")
    public void iClickToOpenMovieDetail() {
        SearchPage page = new SearchPage(driver);
        page.checkDirectionToMovieDetail();
    }
}

