package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
	}
	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
		System.out.println(">> User enters valid email address "+email);
	}

	@And("^Enters valid password (.+)$")
	public void enters_valid_password(String password) {
		System.out.println(">> Enters valid password "+password);   
	}

	@When("^Click on login button$")
	public void click_on_login_button() {
		System.out.println(">> Click on login button");
	}
	@Then("^User should login successfully$")
	public void user_should_login_successfully() {
		System.out.println(">> User should login successfully");
	}

	@When("User enters invalid email address \"(.+)\"$")
	public void user_enters_invalid_email_address(String invalidemail) {
		System.out.println(">> User should login successfully "+invalidemail);
	}

	@When("Enters invalid password \"(.+)\"$")
	public void enters_invalid_password(String invalidPass) {
		System.out.println(">> User should login successfully "+invalidPass);
	}
	@Then("^User should get proper warning massage$")
	public void user_should_get_proper_warning_massage() {
		System.out.println(">> User should get proper warning massage");
	}
	@When("^User dont enters any credential$")
	public void user_dont_enters_any_credential() {
		System.out.println(">> User dont enters any credential");

	}


}
