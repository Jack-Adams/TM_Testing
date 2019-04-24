import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"src/test/java/stepdefs"},
        tags = {"@Everything"}
)
public class TestRunner extends AbstractTestNGCucumberTests {}