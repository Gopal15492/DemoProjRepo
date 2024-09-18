package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class Search {
	
	
	
	@Given("^User opened the application$")
	public void user_opened_the_application() {
		System.out.println(">> User opened the application");
	}

	@When("User entered valid product in search field")
	public void user_entered_valid_product_in_search_field() {
		System.out.println(">> User entered valid product in search field");
	}

	@And("User clicks on search button")
	public void user_clicks_on_search_button() {
		System.out.println(">> User click on search button");
	
	    };

	@Then("valid product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
		System.out.println(">> valid product should get displayed in search results");
	}
	

	@When("User entered invalid product in search field")
	public void user_entered_invalid_product_in_search_field() {
		System.out.println(">> User entered invalid product in search field");
	}

	@Then("^massage is displayed as There is no product that matches the search criteria should get displayed.$")
	public void massage_is_displayed_as_there_is_no_product_that_matches_the_search_criteria_should_get_displayed() {
	}

	@When("User dont entered any text in search field")
	public void user_dont_entered_any_text_in_search_field() {
		System.out.println(">> User dont entered any text in search field");
	
	}

}
