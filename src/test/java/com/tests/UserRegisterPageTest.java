package com.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.NavigationSteps;
import com.steps.UserRegisterPageSteps;


@RunWith(SerenityRunner.class)
public class UserRegisterPageTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public NavigationSteps navigationSteps;
	
	@Steps
	public UserRegisterPageSteps userRegisterPage;
	
	String url = "http://web.yt.ltsdevelopment.com";
	String email = "cojanu_denisa@yahoo.com";
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
	public void testUserRegistration(){
		navigationSteps.openYachtingTraderWebsite(url);
		userRegisterPage.clickOnRegister();
		userRegisterPage.fillEmail(email);
		userRegisterPage.fillPassword(password);
		userRegisterPage.confirmPassword(confirmPassword);
		userRegisterPage.fillFirstName(firstName);
		userRegisterPage.fillLastName(lastName);
		userRegisterPage.fillPhone(phone);
		userRegisterPage.fillAddress(address);
		userRegisterPage.fillState(state);
		userRegisterPage.fillCity(city);
		userRegisterPage.fillZipCode(zipCode);
		userRegisterPage.clickOnRegistration();
		
	}
}
