package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchForElement extends PageObject {
	
	@FindBy(css="#searchButton")
	private WebElementFacade clickOnSearch;
	
	@FindBy(css=".change-text")
	private WebElementFacade clickOnSelectCategory;
	
	@FindBy(css="#searchForm > div > ul > li:nth-child(3) > a")
	private WebElementFacade clickOnBooksMusic;
	
	@FindBy(css="#searchForm > input.form-control")
	private WebElementFacade searchInput;
	
	public void clickOnSearchButton(){
		clickOnSearch.click();
	}
	
	
	public void clickOnSelectCategory(){
		clickOnSelectCategory.click();
	}

	public void clickOnBooksMusic(){
		clickOnBooksMusic.click();
	}
	
	public void sendInputSearch(String text){
		searchInput.sendKeys(text);
		
	}
}
