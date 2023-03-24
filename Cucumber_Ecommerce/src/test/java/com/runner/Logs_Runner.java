package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Log.feature",
           glue= {"com.stepDefination"}, 
           
           plugin= {"pretty",
        		   "json:target/MyReports/report.json",
        		   "junit:target/MyReports/report.xml"
        		   },
           monochrome=true)
public class Logs_Runner {

}
