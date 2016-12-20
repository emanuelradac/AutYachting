package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UserRegisterPage extends PageObject{
	
	@FindBy(css="#header > nav > div > div.nav-right > ul > li:nth-child(4) > a")
	private WebElementFacade clickOnRegister;
	
	@FindBy(css="#email")
	private WebElementFacade fillEmail;
	
	@FindBy(css="#password")
	private WebElementFacade fillPassword;
	
	@FindBy(css="#confirm_password")
	private WebElementFacade confirmPassword;
	
	@FindBy(css="div.user-account>form>:nth-child(4)>input")
	private WebElementFacade fillFirstName;
	
	@FindBy(css="div.user-account>form>:nth-child(5)>input")
	private WebElementFacade fillLastName;
	
	@FindBy(css="#phone")
	private WebElementFacade fillPhone;
	
	@FindBy(css="#address")
	private WebElementFacade fillAddress;
	
	@FindBy(css="#state")
	private WebElementFacade fillState;
	
	@FindBy(css="#city")
	private WebElementFacade fillCity;
	
	@FindBy(css="#zip")
	private WebElementFacade fillZipCode;
	
	@FindBy(css="#main > div > div > div > div > form > button")
	private WebElementFacade clickOnRegistration;
	
	public void clickOnRegister(){
		clickOnRegister.click();
	}
	
	public void fillEmail(String text){
		fillEmail.sendKeys(text);
	}
	
	public void fillPassword(String text){
		fillPassword.sendKeys(text);
	}
	
	public void confirmPassword(String text){
		confirmPassword.sendKeys(text);
	}
	
	public void fillFirstName(String text){
		fillFirstName.sendKeys(text);
	}
	
	public void fillLastName(String text){
		fillLastName.sendKeys(text);
	}
	
	public void fillPhone(String text){
		fillPhone.sendKeys(text);
	}
	
	public void fillAddress(String text){
		fillAddress.sendKeys(text);
	}
	
	public void fillState(String text){
		fillState.sendKeys(text);
	}
	
	public void fillCity(String text){
		fillCity.sendKeys(text);
	}
	
	public void fillZipCode(String text){
		fillZipCode.sendKeys(text);
	}
	
	public void clickOnRegistration(){
		clickOnRegistration.click();;
	}
	
}
