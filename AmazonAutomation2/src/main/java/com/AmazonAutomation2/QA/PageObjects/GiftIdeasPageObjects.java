package com.AmazonAutomation2.QA.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;

public class GiftIdeasPageObjects extends BaseClass
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * initializing page elements to WebElements inside constructor
	 * built id:-
	 */
	public GiftIdeasPageObjects()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * declaration of page elements and WebElements 
	 * built id:-
	 */
	@FindBy(xpath="//a[@href='/gcx/-/gfhz/?ref_=nav_cs_giftfinder']//ancestor::div[@id='nav-xshop']//child::a[@href='/gcx/-/gfhz/?ref_=nav_cs_giftfinder' and contains(text(),'Gift Ideas')]")
	WebElement giftIdeasTab;
	@FindBy(xpath="//ancestor::div[@class='b5zgse-0 ktKnEO']//child::a[@data-test='adult-female-bubble']")
	WebElement forWomen;
	@FindBy(xpath="//ancestor::div[@class='sc-1wcpl6x-0 jDLbeW']//child::button[contains(text(),'Birthday')]")
	WebElement birthdaySubCategory;

	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method with functionality of populating gift ideas for women under gifts category
	 * built id:-
	 */
	public void giftIdeasForWomen()
	{
		giftIdeasTab.click();
		forWomen.click();
		birthdaySubCategory.click();
	}

}
