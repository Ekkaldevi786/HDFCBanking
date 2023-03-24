package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/order.feature",
           glue= {"com.stepDefination","My_Hooks"}, 
           tags= "@All",
           plugin= {"pretty",
        		   "json:target/MyReports/report.json",
        		   "junit:target/MyReports/report.xml"
        		   },
           monochrome=false,
           dryRun=true
          
)


public class RunnerOrder 
{
	

}
