package runner;

import io.cucumber.testng.CucumberOptions;
import pageobjects.BaseClass;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepdefinitions",
        monochrome = true,
        tags = "@smoke",
        publish = true
)
public class CucumberRunner extends BaseClass {

}
