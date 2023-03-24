package com.stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps 
{
	WebDriver driver;
	
	@Given("user is on loginpage")
	public void user_is_on_loginpage() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groww.in");
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		System.out.println("Username");
	    
	}

	@And("click on login button")
	public void click_on_login_button() 
	{
		System.out.println("Login Button");
	    
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() 
	{
		System.out.println("Home page");
	    
	}


}
