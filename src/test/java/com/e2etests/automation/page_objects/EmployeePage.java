package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Wait;

public class EmployeePage {

	private SeleniumUtils utils;
	private Wait wait;

	// @FindBy

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='PIM']")
	private WebElement pimBtn;

	@FindBy(how = How.XPATH, using = "//h5[normalize-space()='Employee Information']")
	private WebElement employeeInfoPage;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Employee')]")
	private WebElement addBtn;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Add Employee']")
	private WebElement addEmployeePage;

	@FindBy(how = How.NAME, using = "firstName")
	private WebElement firstName;

	@FindBy(how = How.NAME, using = "middleName")
	private WebElement middleName;

	@FindBy(how = How.NAME, using = "lastName")
	private WebElement lastName;

	@FindBy(how = How.CSS, using = "div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
	private WebElement employeId;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement saveBtn;

	@FindBy(how = How.XPATH, using = "//h6[text()='Personal Details']")
	private WebElement personalDtlsPage;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Employee List')]")
	private WebElement empListBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
	private WebElement empNameField;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement empIdField;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private WebElement empSearchBtn;

	@FindBy(how = How.XPATH, using = "//div[@role='rowgroup']//div[1]//div[1]//div[4]")
	private WebElement empListSearchName;

	// Getter

	public WebElement getPimBtn() {
		return pimBtn;
	}

	public WebElement getEmployeeInfoPage() {
		return employeeInfoPage;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getAddEmployeePage() {
		return addEmployeePage;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmployeId() {
		return employeId;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getPersonalDtlsPage() {
		return personalDtlsPage;
	}

	public WebElement getEmpListBtn() {
		return empListBtn;
	}

	public WebElement getempNameField() {
		return empNameField;
	}

	public WebElement getEmpIdField() {
		return empIdField;
	}

	public WebElement getEmpSearchBtn() {
		return empSearchBtn;
	}

	public WebElement getempListSearchName() {
		return empListSearchName;
	}

	public EmployeePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.utils = new SeleniumUtils();
		this.wait = new Wait();

	}

	// Methods

	public void fillInput(WebElement field, String data) {
		utils.waitForElementToBeClickable(field);
		utils.writeText(field, data);
	}

	public void click(WebElement btn) {

		utils.waitForElementToBeClickable(btn);
		btn.click();

	}

	public void verificationMessage(WebElement message, String text) {
		// utils.waitForElementToBeClickable(message);
		wait.forElementToBeDisplayed(Duration.ofSeconds(3000), message);
		utils.assertEquals(message, text);

	}

}
