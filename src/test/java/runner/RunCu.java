package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"}, glue = {"steps"}, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, tags = "@datatable" )
public class RunCu  extends AbstractTestNGCucumberTests{
	
	

}
