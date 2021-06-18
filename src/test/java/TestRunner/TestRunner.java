package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/editorial.feature"},
        glue = {"StepDefs"},
        plugin={"html:target/cucumber-report.html"}
)

public class TestRunner
{

}
