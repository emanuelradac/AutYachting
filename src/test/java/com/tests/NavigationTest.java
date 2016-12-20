package com.tests;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.NavigationSteps;


@RunWith(SerenityRunner.class)
public class NavigationTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public NavigationSteps navigationSteps;
	
	
	String url = "http://web.yt.ltsdevelopment.com";
	
	@Test
	public void navigateToAUrl(){
		navigationSteps.openYachtingTraderWebsite(url);
		navigationSteps.clickOnHepl();
		navigationSteps.clickOnLogo();
		
		//navigationSteps.clickMyItem();
		
	}


	}
	
	
