import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/Features",
        glue={"org/example/Implementation"}
)
public class TestNgRunner extends AbstractTestNGCucumberTests {
}
