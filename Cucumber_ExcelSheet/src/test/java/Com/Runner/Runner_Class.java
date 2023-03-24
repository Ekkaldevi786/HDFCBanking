package Com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Steps.feature",
           glue= {"Com.Steps"}, 
            plugin= {"pretty",
            		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        		   "json:target/MyReports/report.json",
        		   "junit:target/MyReports/report.xml"
        		   },
            monochrome=true
           
)
public class Runner_Class 
{
	

}
 
 