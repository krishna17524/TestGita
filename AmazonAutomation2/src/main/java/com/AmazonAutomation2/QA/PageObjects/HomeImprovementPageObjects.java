package com.AmazonAutomation2.QA.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;

public class HomeImprovementPageObjects extends BaseClass
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * initializing page elements to WebElements inside constructor
	 * built id:-
	 */
	public HomeImprovementPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
  
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * declaration of page elements and WebElements 
	 * built id:-
	 */
	@FindBy(xpath="//ancestor::div[@id='nav-xshop-container']//child::div[@id='nav-xshop']//child::a[contains(text(),'Home Improvement')]")
	WebElement homeImprovementTab;
	@FindBy(xpath="//ancestor::div[@id='nav-progressive-subnav']//child::div[@id='nav-subnav']//child::a[@aria-label='Cleaning Supplies']")
	WebElement cleaningAndSuppliesCategory; @FindBy(xpath="//div[@id='nav-iss-attach']//ancestor::div[@class='nav-fill']//child::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
	WebElement searchTextBox;
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//child::input[@id='nav-search-submit-button']")
	WebElement searchButton;
	
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method with functionality of populating data of search under HomeImprovement category, sub-category cleaning and supplies
	 * built id:-
	 */
	public void searchForCleaningAndSupplies()
	{
		homeImprovementTab.click();
		cleaningAndSuppliesCategory.click();
		searchTextBox.sendKeys("tap");
		searchButton.click();
		
	}
	
	
}
