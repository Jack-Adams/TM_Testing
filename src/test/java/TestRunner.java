import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinitions"}
)

@Test
public class TestRunner extends AbstractTestNGCucumberTests {}