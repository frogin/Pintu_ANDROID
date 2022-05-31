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
    public MobileElement category1;
    @AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
    public MobileElement category3;
    @AndroidFindBy(id = "clear_filter_button")
    public MobileElement clearFilterButton;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Watch now\"]/android.widget.TextView")
    public MobileElement tabWatchNowEN;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Scheduled\"]/android.widget.TextView")
    public MobileElement tabScheduledEN;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Nonton sekarang\"]/android.widget.TextView")
    public MobileElement tabWatchNowID;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Segera\"]/android.widget.TextView")
    public MobileElement tabScheduledID;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='#wcbw']")
    public  MobileElement categoryWCBW;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Music']")
    public  MobileElement categoryMusic;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Chitchat']")
    public  MobileElement categoryChitchat;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Talkshow']")
    public  MobileElement categoryTalkshow;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Food']")
    public  MobileElement categoryFood;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Islam']")
    public  MobileElement categoryIslam;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Kristen']")
    public  MobileElement categoryKristen;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Gaming']")
    public  MobileElement categoryGaming;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Katolik']")
    public  MobileElement categoryKatolik;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Gameshow']")
    public  MobileElement categoryGameshow;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Horror']")
    public  MobileElement categoryHorror;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sports']")
    public  MobileElement categorySports;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Beauty']")
    public  MobileElement categoryBeauty;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='News']")
    public  MobileElement categoryNews;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Comedy']")
    public  MobileElement categoryComedy;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Class']")
    public  MobileElement categoryClass;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Hindu']")
    public  MobileElement categoryHindu;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Webinar']")
    public  MobileElement categoryWebinar;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Audition']")
    public  MobileElement categoryAudition;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Buddha']")
    public  MobileElement categoryBuddha;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Movie']")
    public  MobileElement categoryMovie;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Education']")
    public  MobileElement categoryEducation;

    public CategoryPageURLPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void checkCategoryTalkshow(){
        while (true){
            try{
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                categoryTalkshow.isDisplayed();
                categoryTalkshow.isSelected();
                break;
            }catch (Exception e){
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                action.swipeByElements(category3, category1);
            }
        }
    }

    public void checkCategoryBeauty(){
        while (true){
            try{
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                categoryBeauty.isDisplayed();
                categoryBeauty.isSelected();
                break;
            }catch (Exception e){
                driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                action.swipeByElements(category3, category1);
            }
        }
    }

    public void CategoryPageURLWithoutTag() {
        driver.get("https://goplay.co.id/live?genre=Talkshow,Beauty");
        System.out.println("URL clicked");
    }
    public void CategoryPageURLNow() {
        driver.get("https://goplay.co.id/live?genre=Talkshow,Beauty&tab=now");
        System.out.println("URL clicked");
    }
    public void CategoryPageURLUpcoming() {
        driver.get("https://goplay.co.id/live?genre=Talkshow,Beauty&tab=upcoming");
        System.out.println("URL clicked");
    }

    public void VerifyWatchNowOpened(){
        try {
            assertTrue(tabWatchNowEN.isSelected());
        }catch (Exception e){
            assertTrue(tabWatchNowID.isSelected());
        }
    }
    public void VerifyScheduledOpened(){
        try {
            assertTrue(tabScheduledID.isSelected());
        }catch (Exception e){
            assertTrue(tabScheduledEN.isSelected());
        }
    }

    public void VerifySelectedCategory(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        try {
            assertTrue(clearFilterButton.isDisplayed());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertTrue(clearFilterButton.isDisplayed());
        }
        try {
            assertFalse(categoryWCBW.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryWCBW.isSelected());
        }
        try {
            assertFalse(categoryAudition.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryAudition.isSelected());
        }
        try {
            assertFalse(categoryChitchat.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryChitchat.isSelected());
        }
        try {
            assertTrue(categoryTalkshow.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertTrue(categoryTalkshow.isSelected());
        }
        try {
            assertFalse(categoryMusic.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryMusic.isSelected());
        }
        try {
            assertFalse(categoryFood.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryFood.isSelected());
        }
        try {
            assertFalse(categoryGaming.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryGaming.isSelected());
        }
        try {
            assertFalse(categoryIslam.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryIslam.isSelected());
        }
        try {
            assertFalse(categoryKatolik.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryKatolik.isSelected());
        }
        try {
            assertFalse(categoryKristen.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryKristen.isSelected());
        }
        try {
            assertFalse(categoryHindu.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryHindu.isSelected());
        }
        try {
            assertFalse(categoryBuddha.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryBuddha.isSelected());
        }
        try {
            assertFalse(categoryWebinar.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryWebinar.isSelected());
        }
        try {
            assertFalse(categoryHorror.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryHorror.isSelected());
        }
        try {
            assertFalse(categoryMovie.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryMovie.isSelected());
        }
        try {
            assertFalse(categoryEducation.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryEducation.isSelected());
        }
        try {
            assertFalse(categoryClass.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryClass.isSelected());
        }
        try {
            assertFalse(categoryNews.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryNews.isSelected());
        }
        try {
            assertFalse(categoryComedy.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryComedy.isSelected());
        }
        try {
            assertTrue(categoryBeauty.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertTrue(categoryBeauty.isSelected());
        }
        try {
            assertFalse(categorySports.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categorySports.isSelected());
        }
        try {
            assertFalse(categoryGameshow.isSelected());
        }catch(Exception e){
            action.swipeByElements(category3, category1);
            assertFalse(categoryGameshow.isSelected());
        }
        System.out.println("Category has been selected correctly");
    }
}
