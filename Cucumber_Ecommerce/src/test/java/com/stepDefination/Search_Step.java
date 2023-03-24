package com.stepDefination;

import Implemention.Product;
import Implemention.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Search_Step
{
	Product product;
	Search search;
	
	@Given("I have search field on Amazon Page")
	public void i_have_search_field_on_amazon_page() 
	{
		System.out.println("Step 1: I am on serach page");
	    
	}

	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String ProductName, Integer Price)
	{
		System.out.println("Step 2: search the product with name:" + ProductName + " " + "price is-" + Price );
		
		product= new Product(ProductName,Price);
	    
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String ProductName) 
	{
		
		System.out.println("Step 3: product-" + ProductName +  " " + "is displayed");
		search=new Search();
		String name=search.displayProduct(product);
		System.out.println(name);
		Assert.assertEquals(product.getProductName(), name);
	}

}
