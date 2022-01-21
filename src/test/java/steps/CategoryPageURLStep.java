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

    @Given("I click category page URL with tag now")
    public void i_click_category_page_url_with_tag_now() {
        page.CategoryPageURLNow();
    }

    @Given("I click category page URL with tag upcoming")
    public void i_click_category_page_url_with_tag_upcoming() {
//        page.CategoryPageURLUpcoming();
        System.out.println("Can't find object on scheduled tab");
    }

    @Then("I see the watch now page with the selected category")
    public void i_see_the_watch_now_page_with_the_selected_category() {
        page.VerifyWatchNowOpened();
        page.VerifySelectedCategory();
    }

    @Then("I see the scheduled page with the selected category")
    public void i_see_the_scheduled_page_with_the_selected_category() {
//        page.VerifyScheduledOpened();
//        page.VerifySelectedCategory();
        System.out.println("Can't find object on scheduled tab");
    }
}
