package com.steps;

import com.pages.RegisterViaCreateNewAccountPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class RegisterViaCreateNewAccountSteps extends ScenarioSteps{
	
	RegisterViaCreateNewAccountPage clickOnCreate;
	
	@Step
	public void clickOnCreateNewAccount(){
		clickOnCreate.clickOnCreateNewAccount();
	}

}
