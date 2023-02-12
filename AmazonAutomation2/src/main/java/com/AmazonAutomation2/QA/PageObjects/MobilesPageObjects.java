package com.AmazonAutomation2.QA.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;

public class MobilesPageObjects extends BaseClass
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * initializing page elements to WebElements inside constructor
	 * built id:-
	 */
	public MobilesPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * declaration of page elements and WebElements 
	 * built id:-
	 */
	@FindBy(xpath="//div[@id='nav-iss-attach']//ancestor::div[@class='nav-fill']//child::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
	WebElement searchTextBox;
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//child::input[@id='nav-search-submit-button']")
	WebElement searchButton;
	@FindBy(xpath="//a[text()='Mobiles' and@ data-csa-c-content-id='nav_cs_mobiles']")
	private WebElement mobilesTab;
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method with performing search under mobiles category 
	 * built id:-
	 */
	public void performSearchMobilesProducts()
	{
		mobilesTab.click();
		searchTextBox.sendKeys(prop.getProperty("searchKeyWord"));
		searchButton.click();
	}
}
