package steps;

//import Base.BaseUtil;
import Base.BaseUtil;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class HomeStep extends BaseUtil {

    private  BaseUtil base;

    @Given("I navigate to the Home page")
    public void iNavigateToTheHomePage(){
        System.out.println("Navigate Home Page");
    }

    @And("I check homepage element")
    public void iCheckHomepageElement() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.banner();
        //page.CheckElementHomepage();
    }
}
