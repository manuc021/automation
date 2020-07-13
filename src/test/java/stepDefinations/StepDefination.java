package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^User is on NetBanking Landing Page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("NetBanking Landing Page");

	}

	@When("^User Login into Application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("User Login into Application with username and password");

	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home page is populated");

	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("Cards are displayed");

	}

}