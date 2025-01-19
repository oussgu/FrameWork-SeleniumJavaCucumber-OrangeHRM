package com.e2etests.automation.page_objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;

public class AuthenticationPage {

	private ConfigFileReader configFileReader;

	private SeleniumUtils utils;

	// @FindBy

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	private WebElement userNameInput;
	
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	private WebElement passwordInput;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//h6[text()='Dashboard']")
	private WebElement SuccessLoginMessage;

	public AuthenticationPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();

		this.utils = new SeleniumUtils();

	}
	// Getter
	
	
	
	public WebElement getUserNameInput() {
		return userNameInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getSuccessLoginMessage() {
		
		return SuccessLoginMessage;
	}
	// methods



	public void goToURL() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
		
		
	}

	public void fillInput(WebElement field, String data) {
        utils.waitForElementToBeClickable(field);
		utils.writeText(field, data);
	}

	public void click(WebElement btn) {
		utils.waitForElementToBeClickable(btn);
		btn.click();

	}

	public void verificationMessage(WebElement message, String text) {
       utils.waitForElementToBeClickable(message);
		utils.assertEquals(message, text);

	}

}
