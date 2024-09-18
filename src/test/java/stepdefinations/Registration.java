package stepdefinations;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	
	@Given("^User navigate to Registration page$")
	public void User_navigate_to_Registration_page() {
		System.out.println(">> user navigate to Registration page");
	}
	@When("User enters below details into the field")
	public void User_enters_below_details_into_the_field(DataTable datatable) {
		
		Map<String, String> map = datatable.asMap(String.class,String.class);
		System.out.println(">> user has entered firstname as "+map.get("firstname"));
		System.out.println(">> user has entered lastname as "+map.get("lastname"));
		System.out.println(">> user has entered email as "+map.get("email"));
		System.out.println(">> user has entered telephone as "+map.get("telephone"));
		System.out.println(">> user has entered password as "+map.get("password"));
	}
	@When("User click yes to newsletter")
	public void user_click_yes_to_newsletter() {
		System.out.println(">> User click yes to newsletter");
	}
	@When("User select privacy policy field")
	public void user_select_privacy_policy_field() {
		System.out.println(">> User click yes to newsletter");
}
	@When("User click on continue button")
	public void user_click_on_continue_button() {
		System.out.println(">> User click yes to newsletter");
		}
	@Then("User account should get sucsessfully created")
	public void user_account_should_get_sucsessfully_created() {
		System.out.println(">> User account should get sucsessfully created");
	}
	@When("User dont enter details into the field")
	public void user_dont_enter_details_into_the_field() {
		System.out.println(">> User dont enter details into the field");
	}
	@Then("User account should get proper warning massage")
	public void user_account_should_get_proper_warning_massage() {
		System.out.println(">> ser account should get proper warning massage");
	}
}
