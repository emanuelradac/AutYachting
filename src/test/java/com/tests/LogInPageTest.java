package com.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LogInPageSteps;
import com.steps.NavigationSteps;

@RunWith(SerenityRunner.class)
public class LogInPageTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public LogInPageSteps logInSteps;
	
	@Steps
	public NavigationSteps navigationSteps;
	
	String url = "http://web.yt.ltsdevelopment.com";
	String email = "denisan.cojanu@gmail.com";
	String password = "denisa";
	
	@Test
	public void testLogInPage(){
		navigationSteps.openYachtingTraderWebsite(url);
		logInSteps.clickOnLogInButton();
		logInSteps.enterEmail(email);
		logInSteps.enterPassword(password);
		logInSteps.clickLogIns();
	}
}
