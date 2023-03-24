package com.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class order_steps
{
	@Given("A registered user exists")
	public void a_registered_user_exists() 
	{
	   System.out.println("Regisered User");
	}

	@Given("user is on amazon login Page")
	public void user_is_on_amazon_login_page() 
	{
		System.out.println("Login Page");
	}

	@When("user enters username")
	public void user_enters_username() 
	{
		System.out.println("Username");
	    
	}

	@When("user enters password")
	public void user_enters_password() 
	{
		
	    System.out.println("Password");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		System.out.println("Login Button");
	}

	@Then("user navigate to order page")
	public void user_navigate_to_order_page() 
	{
		System.out.println(" User order page");
	}

	@When("user clicks on Privious order Link")
	public void user_clicks_on_privious_order_link() 
	{
		System.out.println("Privious order page");
	}

	@Then("user checks the prievious order details")
	public void user_checks_the_prievious_order_details() 
	{
		System.out.println("Perivious order details");
	}

	@When("user clicks on open order Link")
	public void user_clicks_on_open_order_link() 
	{
		System.out.println("open order");
	}

	@Then("user checks the open order details")
	public void user_checks_the_open_order_details()
	{
		System.out.println("open order details");
	}

	@When("user clicks on Cancelled order Link")
	public void user_clicks_on_cancelled_order_link() 
	{
		System.out.println("cancelled order link");
	}

	@Then("user checks the cancelled order details")
	public void user_checks_the_cancelled_order_details()
	{
		System.out.println("Cancelled order details");
	}


}
