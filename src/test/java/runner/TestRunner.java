package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/java/features/"},
        tags= ("@Live or @Search or @Profile or @Movies or @Setting or @Indie or @CategoryPageURL or @TokenTopUp or @SwipeUp or @FollowingLabel or @PopularStreamer" ),
        glue= {"steps"},
        plugin = { "json:target/cucumber.json","pretty" }


)
public class TestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider
    //@DataProvider (parallel = true) -- For parallel execution support (which is not going to work for our code)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
