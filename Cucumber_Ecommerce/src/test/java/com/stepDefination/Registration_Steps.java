package com.stepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_Steps 
{
	@Given("User is on Registration page")
	public void user_is_on_registration_page() 
	{
		System.out.println("Registration Page is Open");
	    
	}

	@When("User Enters Following User Details")
	public void user_enters_following_user_details(DataTable dataTable) 
	{
	    List<List<String>> userList = dataTable.asLists(String.class);
	    for(List<String> e: userList)
	    {
	    	System.out.println(e);
	    }
	}

	@Then("User Registration Should Be Successful")
	public void user_registration_should_be_successful() 
	{
	    System.out.println("registration Sucessful");
	}


}
