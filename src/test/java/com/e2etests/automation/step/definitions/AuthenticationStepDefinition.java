package com.e2etests.automation.step.definitions;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {

		this.authenticationPage = new AuthenticationPage();

	}

	@Given("I connect to the orangeHRM application")
	public void iConnectToTheOrangeHRMApplication() {
		authenticationPage.goToURL();
	}

	@When("I enter valid data for the username field {string}")
	public void iEnterValidDataForTheUsernameField(String username)  {
		
		authenticationPage.fillInput(authenticationPage.getUserNameInput(), username);
	}

	@When("I enter valid data for the password field {string}")
	public void iEnterValidDataForThePasswordField(String password) {
		authenticationPage.fillInput(authenticationPage.getPasswordInput(), password);
	}

	@When("I click on the login button")
	public void iClickOnTheLoginButton() {
		authenticationPage.click(authenticationPage.getLoginButton());
	}

	@Then("I head to the home page {string}")
	public void iHeadToTheHomePage(String homePageM) {
		authenticationPage.verificationMessage(authenticationPage.getSuccessLoginMessage(), homePageM);
	}

}
