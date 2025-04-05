package cucumberOptions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue ="stepDefinitions", monochrome=true, tags = "@smoketest or @regression", plugin={"pretty", "html:Reports/test.html","json:Reports/test.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
   
    
}
