package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Car.feature",glue= {"com.stepDefination"},tags="@Smoke and not   @Prod", plugin= {"pretty"})


public class RunCar {

}
