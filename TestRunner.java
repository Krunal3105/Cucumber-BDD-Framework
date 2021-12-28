package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\aviik\\IdeaProjects\\CucumberBddFramework\\src\\test\\java\\Feature\\Register.feature",
glue = {"StepDefinition"}
)

public class TestRunner {
}
