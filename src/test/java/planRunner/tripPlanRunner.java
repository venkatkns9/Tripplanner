package planRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//JUnit annotation that specifies which runner to use to execute
@RunWith(Cucumber.class)
//Annotation that specifies feature, stepdefinition and plugin for test report
@CucumberOptions(
features = "src/test/java/features"
,glue= {"planDefinitions"},
plugin ="com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
monochrome = true
)

public class tripPlanRunner {
	//JUnit annotation which runs after all the tests in the class have been run
	@AfterClass
	public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
}
	
}