package com.steps;

import com.pages.SearchForElement;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SearchForElementSteps extends ScenarioSteps {
	
	SearchForElement search;
	
	@Step
	public void clickOnSearch(){
		search.clickOnSearchButton();
	}
	
	@Step
	public void clickOnSelectCategory(){
		search.clickOnSelectCategory();
	}
	
	@Step
	public void clickOnBooksMusic(){
		search.clickOnBooksMusic();
	}
	
	@Step
	public void sendInputSearch(String text){
		search.sendInputSearch(text);
	}

}
