package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user navigate to facebook website")
	public void user_navigate_to_facebook_website() {
	    System.out.println("@Given --- user navigate to facebook website");
	   
	}

	@When("user validate the homepage title")
	public void user_validate_the_homepage_title() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("@When -- user validate the homepage title");
	}

	@Then("user enter {string} username")
	public void user_enter_username(String user) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("@Then --user enter "+ user+ " username");
	}

	@And("user enter {string} password")
	public void user_enter_password(String pass) {
	    System.out.println("@And --user enter "+ pass + " password ");
	  
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("@And --user click on login button ");
	   
	}
	
	@Before
	public void setup()
	{
		
	}

}
