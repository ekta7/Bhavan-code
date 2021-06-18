package StepDefs;


import Utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks
{

    @Before
    public void before()
    {
        Utils.initDriver();
    }

    @After
    public void after(Scenario scenario)
    {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Utils.closeDriver();
    }

}
