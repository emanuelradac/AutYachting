package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterViaCreateNewAccountPage extends PageObject {
	
	@FindBy(css="#main > div > div > div > a:nth-child(3)")
	private WebElementFacade createNewAccount;

	public void clickOnCreateNewAccount(){
		createNewAccount.click();
	}
}
