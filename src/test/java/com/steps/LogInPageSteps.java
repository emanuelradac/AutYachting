package com.steps;

import com.pages.LogInPage;
import com.pages.NavigateToAUrl;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class LogInPageSteps extends ScenarioSteps{
	
	LogInPage navigation;
	
	@Step
	public void clickOnLogInButton(){
		navigation.clickOnLogInButton();
		
	}
	
	@Step
	public void enterEmail(String email)
	{
		navigation.enterEmail(email);
	}
	
	@Step
	public void enterPassword(String password){
		navigation.enterPassword(password);
	}
	
	@Step
	public void clickLogIns(){
		navigation.clickOnLogInButton();
	}
	

}
