package com.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculate_steps 
{
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	   
	}

	@When("user enters billing amount {int}")
	public void user_enters_billing_amount(Integer int1) {
	    
	}

	@When("user enters tax amount {int}")
	public void user_enters_tax_amount(Integer int1) {
	    
	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {
	    
	}

	@Then("it gives the final amount {int}")
	public void it_gives_the_final_amount(Integer int1) {
	    
	}

	@When("user enters tax amount {double}")
	public void user_enters_tax_amount(Double double1) {
	   
	}

	@Then("it gives the final amount {double}")
	public void it_gives_the_final_amount(Double double1) {
	    
	}

}
