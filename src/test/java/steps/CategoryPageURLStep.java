package steps;

import Base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CategoryPageURLPage;


public class CategoryPageURLStep extends BaseUtil {
    CategoryPageURLPage page = new CategoryPageURLPage(driver);

    @Given("I click category page URL without tag")
    public void i_click_category_page_url_without_tag() {
        page.CategoryPageURLWithoutTag();
    }

    @Then("I see the watch now page with the selected category")
    public void i_see_the_watch_now_page_with_the_selected_category() {
        page.CategoryPageURLWithoutTag();
    }

}
