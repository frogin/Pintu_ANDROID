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
    public void iDoFunctionalitySearchForMoviesOrSeries()throws InterruptedException {
        SearchPage page = new SearchPage(driver);
        page.checkSearchFunction();
    }

    @And("I clear search history")
    public void iClearSearchHistory() {
        SearchPage page = new SearchPage(driver);
        page.clearAllSearch();

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
}
