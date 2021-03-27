package RunnerPackage;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\moses\\IdeaProjects\\RestAPIAutomation\\src\\test\\java\\cucumber\\RESTAPI.feature",
        glue = {"stepDef"},
        tags = {"@SmokeTest_01"},
        dryRun = false
)
public class RunnerClass {
}
