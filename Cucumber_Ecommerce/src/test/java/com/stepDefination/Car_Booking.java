package com.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Car_Booking 
{
	@Given("User want to select a Auto type {string} from OLA Application")
	public void user_want_to_select_a_auto_type_from_ola_application(String string) 
	{
		System.out.println("Step 1");
	    
	}

	@When("User Select a Auto {string} and pick up point {string} and Drop Point {string}")
	public void user_select_a_auto_and_pick_up_point_and_drop_point(String string, String string2, String string3)
	{
		System.out.println("Step 2");
	}

	@Then("Driver Stars a Journy")
	public void driver_stars_a_journy()
	{
		System.out.println("Step 3");
	}

	@Then("Driver Ends the Journy")
	public void driver_ends_the_journy()
	{
		System.out.println("Step 4");
	}

	@Then("User Pay {int} USD")
	public void user_pay_usd(Integer int1)
	{
		System.out.println("Step 5");
	}


}
