package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogInPage extends PageObject {

	@FindBy(css = "div.nav-right>.sign-in>li:nth-child(3)>a")
	private WebElementFacade clickOnLogInButton;

	@FindBy(css = "#email")
	private WebElementFacade enterEmail;

	@FindBy(css = "#password")
	private WebElementFacade enterPassword;

	@FindBy(css = "button.btn:nth-child(3)")
	private WebElementFacade clickLogins;

	public void clickOnLogInButton() {
		clickOnLogInButton.click();

	}

	public void enterEmail(String email) {
		enterEmail.sendKeys(email);
	}

	public void enterPassword(String password) {
		enterPassword.sendKeys(password);
	}

	public void clickLogIns() {
		clickLogins.waitUntilVisible().click();
	}

}
