import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue={"org/example/Implementation"},
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class CucumberRunner{
}
