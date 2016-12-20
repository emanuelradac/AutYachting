package com.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LogInPageSteps;
import com.steps.NavigationSteps;
import com.steps.RegisterViaCreateNewAccountSteps;
import com.steps.UserRegisterPageSteps;


@RunWith(SerenityRunner.class)
public class RegisterViaCreateNewAccountTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public NavigationSteps navigationSteps;
	
	@Steps
	public LogInPageSteps logInSteps;
	
	@Steps
	public RegisterViaCreateNewAccountSteps createNewAccount;
	
	@Steps
	public UserRegisterPageSteps userRegister;
	
	String url = "http://web.yt.ltsdevelopment.com";
	String email = "cojanudenisa@yahoo.com";
	String password = "denisa";
	String confirmPassword = "denisa";
	String firstName = "Denisa";
	String lastName = "Cojanu";
	String phone = "0753990312";
	String address = "Aurel Vlaicu";
	String state = "Romania";
	String city = "Cluj";
	String zipCode = "1234";
	
	@Test
	public void testRegisterViaNewAccount(){
		navigationSteps.openYachtingTraderWebsite(url);
		logInSteps.clickOnLogInButton();
		createNewAccount.clickOnCreateNewAccount();
		userRegister.fillEmail(email);
		userRegister.fillPassword(password);
		userRegister.confirmPassword(confirmPassword);
		userRegister.fillFirstName(firstName);
		userRegister.fillLastName(lastName);
		userRegister.fillPhone(phone);
		userRegister.fillAddress(address);
		userRegister.fillState(state);
		userRegister.fillCity(city);
		userRegister.fillZipCode(zipCode);
		userRegister.clickOnRegistration();
		
	}
}
