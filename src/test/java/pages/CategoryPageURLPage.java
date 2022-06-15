package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CategoryPageURLPage extends BaseUtil {
    ElementAction action = new ElementAction();

    @AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
    public MobileElement category;


    public CategoryPageURLPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void CategoryPageURLWithoutTag() {
        driver.get("https://goplay.co.id/live?genre=Talkshow,Beauty");
        System.out.println("URL clicked");
        category.click();
    }

}
