package cucumberOptions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/features",
glue ="src/test/stepDefinitions", monochrome=true)
public class TestNGRunner {
    
}
