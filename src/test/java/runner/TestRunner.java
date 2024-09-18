package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resource/features",
		glue={"stepdefinations","hooks"},
		tags="@all",
		plugin = {"pretty",
				"html:target/CucumberReports/cucumberReport.html",	        
	            "json:target/CucumberReports/jsonReport.json",
	            "junit:target/CucumberReports/xmlrReport.xml"}

		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
