package com.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logs_Steps 
{
	@Given("User is on Application Login Page")
	public void user_is_on_application_login_page() 
	{
	    System.out.println("Login page display");
	}

	@When("User Click on Sign In button")
	public void user_click_on_sign_in_button() 
	{
		 System.out.println("sign in button display");
	}

	@Then("User is displayed login Screen")
	public void user_is_displayed_login_screen()
	{
		 System.out.println("Login screen display");
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String string) 
	{
		 System.out.println("Login username display");
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String string)
	{
		 System.out.println("Login password display");
	}

	@When("user clicks sign in button")
	public void user_clicks_sign_in_button()
	{
		 System.out.println("click button display");
	}

	@Then("user get login failed error message")
	public void user_get_login_failed_error_message() 
	{
		 System.out.println("error message display");
	}


}
