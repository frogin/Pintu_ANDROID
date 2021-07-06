package pages;

import Base.BaseUtil;
import Base.ElementAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseUtil {

    ElementAction action = new ElementAction();

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.CLASS_NAME, using = "close")
    public WebElement btnClose;

    @FindBy(how = How.NAME, using = "login")
    public WebElement btnProfile;

    @FindBy(how = How.CLASS_NAME, using = "account__dropdown__link")
    public WebElement txtLogin;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    public void Login(String userName, String password)
    {
        btnClose.click();
        btnProfile.click();
        txtLogin.click();
//        txtUserName.sendKeys(userName);
//        txtPassword.sendKeys(password);
    }

    public void ClickLogin() throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(By.className("search-icon")).click();
//        btnProfile.click();
//        action.hover(btnProfile);
//        btnProfile.click();
//        txtLogin.click();

    }


}
