package steps;

import Base.BaseUtil;
import com.aventstack.extentreports.GherkinKeyword;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginStep extends BaseUtil{

    private  BaseUtil base;

//    public LoginStep(BaseUtil base) {
//        this.base = base;
//    }

    @DataTableType(replaceWithEmptyString = "[blank]")
    public User convert(Map<String, String> entry){
        return new User(
                entry.get("username"),
                entry.get("password").concat("$$$$$")
        );
    }


    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {

        Assert.assertEquals("Its not displayed", base.driver.findElement(By.id("Initial")).isDisplayed(), true);
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("Navigate Login Page");
        base.driver.navigate().to("https://goplay.co.id/live");
    }


    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        LoginPage page = new LoginPage(base.driver);
        page.ClickLogin();
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(List<User> table) throws Throwable {
        //Create an ArrayList
        //List<User> users =  new ArrayList<User>();
        //Store all the users
        //List<User> users = table.asList(User.class);

        LoginPage page = new LoginPage(base.driver);

        page.Login(table.get(0).username, table.get(0).password);

        //page.Login(users.get(2), users.get(3));

    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
    }

    @Then("^I should see the userform page wrongly$")
    public void iShouldSeeTheUserformPageWrongly() throws Throwable {
        Assert.assertEquals("Its not displayed", base.driver.findElement(By.id("sdfgdsfsd")).isDisplayed(), true);
    }


    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username= userName;
            password = passWord;
        }
    }

}
