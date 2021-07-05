package steps;

import Base.BaseUtil;


//import cucumber.api.PickleStepTestStep;
//import cucumber.api.TestCase;
//import gherkin.pickles.PickleStep;
//import io.cucumber.core.api.Scenario;


import com.aventstack.extentreports.gherkin.model.Feature;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import Base.ExtentReportUtil;

/**
 * Created by Karthik on 31/01/2019.
 */

public class Hook extends BaseUtil{
    ExtentReportUtil extentReportUtil = new ExtentReportUtil();

    public BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {
        System.out.println("HOOK BEFORE");

        extentReportUtil.ExtentReport();

        //ToDo: Feature - Hard coding the feature name
        features = extentReportUtil.extent.createTest(Feature.class, "LoginFeature");
        base.scenarioDef = base.features.createNode(scenario.getName());
        WebDriverManager.chromedriver().setup();
        //Setting system properties of ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "/Users/macbookpro17/Documents/Automation/chromedriver");
//        base.Driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        base.Driver = new ChromeDriver(chromeOptions);
        base.Driver.manage().window().maximize();
    }


    @After
    public void TearDownTest(Scenario scenario) {
        System.out.println("HOOK AFTER");
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
        base.Driver.quit();
    }

    @BeforeStep
    public void BeforeEveryStep(Scenario scenario) {
        System.out.println("Before every step " + scenario.getId());
    }

    @AfterStep
    public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
        //System.out.println("Before every step " + stepTestStep.getId());
    }

}
