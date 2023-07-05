package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // in failed we just need feature and glue
        features = "target/failed.txt",
        //glue keyword we use to provide the package where step defs are available
        glue = "steps",

        plugin = {"pretty"}
)

public class FailedRunner {
}
