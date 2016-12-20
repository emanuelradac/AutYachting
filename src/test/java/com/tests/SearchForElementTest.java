package com.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.NavigationSteps;
import com.steps.SearchForElementSteps;

@RunWith(SerenityRunner.class)
public class SearchForElementTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public NavigationSteps navigationSteps;
	
	@Steps
	public SearchForElementSteps search;
	
	
	String url = "http://web.yt.ltsdevelopment.com";
	String inputSearch = "Jhshw";
	
	@Test
	public void searchForElement(){
		navigationSteps.openYachtingTraderWebsite(url);
		search.clickOnSearch();
		navigationSteps.clickOnLogo();
		search.clickOnSelectCategory();
		search.clickOnBooksMusic();
		search.clickOnSearch();
		navigationSteps.clickOnLogo();
		search.clickOnSelectCategory();
		search.clickOnBooksMusic();
		search.sendInputSearch(inputSearch);
		search.clickOnSearch();
	}
	
}
