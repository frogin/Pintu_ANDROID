package steps;

import Base.BaseUtil;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import java.util.Map;

public class LoginStep extends BaseUtil {

    private  BaseUtil base;

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        HomePage page = new HomePage(driver);
        page.ClickButtonLogin();
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("UserName is : " + userName);
        System.out.println("Password is : " + password);
    }

    @Then("I should see login form")
    public void iShouldSeeLoginForm() throws InterruptedException {
        LoginPage page = new LoginPage(driver);
        page.CheckElementLoginPage();
    }

    @And("I input wrong phone number")
    public void iInputWrongPhoneNumber() throws Throwable {
        LoginPage page = new LoginPage(driver);
        page.InputWrongNumber();
    }

    @Then("I should see modal alert to register")
    public void iShouldSeeModalAlertToRegister() throws InterruptedException {
        LoginPage page = new LoginPage(driver);
        page.CheckModalRegister();
    }

    @And("I login using India number")
    public void iLoginUsingIndiaNumber() throws InterruptedException{
        LoginPage page = new LoginPage(driver);
        page.loginWithIndiaNumber();
    }

    @Given("User do login")
    public void userDoLogin() throws InterruptedException{
        LoginPage page = new LoginPage(driver);
        page.userDoLogin();
    }

}
