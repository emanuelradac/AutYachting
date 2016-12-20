package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;

public class NavigateToAUrl extends PageObject{
	
	@FindBy(css="#header > nav > div > div.navbar-header > a > img")
	private WebElementFacade clickOnLogo;
	
	@FindBy(css="#header > nav > div > div.nav-right > ul > li:nth-child(1) > a")
	private WebElementFacade clickOnHelp;
	
	@FindBy (css="#main > div > div.ad-profile.section > ul > li:nth-child(2) > a")
	private WebElementFacade clickMyItem;
	
	public void clickOnHelp(){
		clickOnHelp.click();
	}
	
	public void clickOnLogo(){
		clickOnLogo.click();
	}
	
	
//	public void clickMyItem(){
//		clickMyItem.click();
//		
//	}
}
