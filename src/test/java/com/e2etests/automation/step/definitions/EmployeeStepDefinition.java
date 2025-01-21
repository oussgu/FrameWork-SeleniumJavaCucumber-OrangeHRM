package com.e2etests.automation.step.definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.e2etests.automation.page_objects.EmployeePage;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Wait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeStepDefinition {

	EmployeePage employeePage;
	// private Wait wait;
	String empid;

	public EmployeeStepDefinition() {

		this.employeePage = new EmployeePage();
		// this.wait = new Wait();
	}

	@When("I click on the PIM button")
	public void iClickOnThePIMButton() {

		employeePage.click(employeePage.getPimBtn());

	}

	@When("I head toword PIM page {string}")
	public void iHeadTowordPIMPage(String pimM) {
		employeePage.verificationMessage(employeePage.getEmployeeInfoPage(), pimM);
	}

	@When("I click on the add button")
	public void iClickOnTheAddButton() {

		employeePage.click(employeePage.getAddBtn());
	}

	@When("I head toword add employee page {string}")
	public void iHeadTowordAddEmployeePage(String addEmP) {
		employeePage.verificationMessage(employeePage.getAddEmployeePage(), addEmP);
	}

	@When("I enter a valid first name {string}")
	public void iEnterAValidFirstName(String firstName) {
		employeePage.fillInput(employeePage.getFirstName(), firstName);
	}

	@When("I enter a valid middle name {string}")
	public void iEnterAValidMiddleName(String middleName) {
		employeePage.fillInput(employeePage.getMiddleName(), middleName);
	}

	@When("I enter a valid last name {string}")
	public void iEnterAValidLastName(String lastName) {
		employeePage.fillInput(employeePage.getLastName(), lastName);
	}

	@When("I click on save button")
	public void iClickOnSaveButton() {

		String empIdd = employeePage.getEmployeId().getAttribute("value");
		empid = empIdd; // Store it in the instance variable
		System.out.println("Generated Employee ID: " + empid);
		employeePage.click(employeePage.getSaveBtn());

	}

	@Then("I head toword the employee detail page {string}")
	public void iHeadTowordTheEmployeeDetailPage(String employeeDlt) {

		employeePage.verificationMessage(employeePage.getPersonalDtlsPage(), employeeDlt);
	}

	@When("I click on employee list button")
	public void iClickOnEmployeeListButton() {
		employeePage.click(employeePage.getEmpListBtn());

	}

	@When("I enter employee name {string}")
	public void iEnterEmployeeName(String name) throws InterruptedException {

		employeePage.fillInput(employeePage.getempNameField(), name);
	}

	@When("I enter employee Id")
	public void iEnterEmployeeId() {

		employeePage.fillInput(employeePage.getEmpIdField(), empid);

	}

	@When("I click on search button")
	public void iClickOnSearchButton(){
		
		employeePage.click(employeePage.getEmpSearchBtn());

	}

	@Then("The employee ID show up in the employee list {string}")
	public void theEmployeeIDShowUpInTheEmployeeList(String EmployeSearch) {
		employeePage.verificationMessage(employeePage.getempListSearchName(), EmployeSearch);

	}

}
