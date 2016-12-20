package com.steps;

import com.pages.UserRegisterPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class UserRegisterPageSteps extends ScenarioSteps{
	
	UserRegisterPage userRegisterPage;
	
	@Step
	public void clickOnRegister(){
		userRegisterPage.clickOnRegister();
	}
	
	@Step
	public void fillEmail(String text){
		userRegisterPage.fillEmail(text);
	}
	
	@Step
	public void fillPassword(String text){
		userRegisterPage.fillPassword(text);
	}
	
	@Step
	public void confirmPassword(String text){
		userRegisterPage.confirmPassword(text);
	}
	
	@Step
	public void fillFirstName(String text){
		userRegisterPage.fillFirstName(text);
	}
	
	@Step
	public void fillLastName(String text){
		userRegisterPage.fillLastName(text);
	}
	
	@Step
	public void fillPhone(String text){
		userRegisterPage.fillPhone(text);
	}
	
	@Step
	public void fillAddress(String text){
		userRegisterPage.fillAddress(text);
	}
	
	@Step
	public void fillState(String text){
		userRegisterPage.fillState(text);
	}
	
	@Step
	public void fillCity(String text){
		userRegisterPage.fillCity(text);
	}
	
	@Step
	public void fillZipCode(String text){
		userRegisterPage.fillZipCode(text);
	}
	
	@Step
	public void clickOnRegistration(){
		userRegisterPage.clickOnRegistration();
	}
	

}
