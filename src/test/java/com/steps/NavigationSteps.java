package com.steps;

import net.thucydides.core.annotations.Step;

import com.pages.NavigateToAUrl;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class NavigationSteps extends ScenarioSteps {
	
	NavigateToAUrl navigation;
	
	@Step
	public void openYachtingTraderWebsite(String url) {
		navigation.getDriver().get(url);

	}
	
	@Step
	public void clickOnHepl(){
		navigation.clickOnHelp();
	}
	

	@Step
	public void clickOnLogo(){
		navigation.clickOnLogo();
	}
	
//	@Step
//	public void clickMyItem(){
//		navigation.clickMyItem();
//	}

}
