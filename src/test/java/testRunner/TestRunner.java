package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "html:Report1.html"},
		dryRun = false,
		monochrome = true,
		tags = "@P1"
		)

public class TestRunner {

}
