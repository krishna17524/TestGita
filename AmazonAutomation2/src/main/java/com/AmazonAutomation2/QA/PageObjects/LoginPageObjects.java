package com.AmazonAutomation2.QA.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;

public class LoginPageObjects extends BaseClass
{
 
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * initializing page elements to WebElements inside constructor
	 * built id:-
	 */
	public LoginPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * declaration of page elements and WebElements 
	 * built id:-
	 */
	@FindBy(xpath="//div[@id='nav-signin-tooltip']//child::span[@class='nav-action-inner' and text()='Sign in']") 
	WebElement signInButton;
	@FindBy(xpath="//div[@class='a-row a-spacing-base']//child::input[@name='email' and @id='ap_email']")
	WebElement emailIdorMobileNumber;
	@FindBy(xpath="//span[@class='a-button a-button-span12 a-button-primary']//child::span[@class='a-button-inner']//child::input[@id='continue' and @class='a-button-input']") 
	WebElement continueButton;
	@FindBy(xpath="//div[@class='a-section a-spacing-large']//child::input[@id='ap_password' and @name='password']")
	WebElement password;
	@FindBy(xpath="//div[@class='a-section']//child::span[@id='auth-signin-button']//child::span[@class='a-button-inner']//child::input[@id='signInSubmit']")
	WebElement signInSubmit;
	@FindBy(xpath="//div[@class='nav-line-1-container']//child::span[@id='nav-link-accountList-nav-line-1' and contains(text(),'Hello,')]")
	WebElement hoverToLogout;
	@FindBy(xpath="//a[@id='nav-item-switch-account']//following-sibling::a[@id='nav-item-signout']//child::span[@class='nav-text' and contains(text(),'Sign Out')]")
	WebElement signOut;
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method with launching url functionality
	 * built id:-
	 */
	public void launchApplication()
	{
		driver.get(prop.getProperty("istURL"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println();
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method with login with valid credentials functionlaity
	 * built id:-
	 */
	public void loginApplication()
	{
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		signInButton.click();
		emailIdorMobileNumber.sendKeys(prop.getProperty("istUserName"));
		continueButton.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		password.sendKeys(prop.getProperty("istPassword"));
		signInSubmit.click();
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method with signing out functionality form the application
	 * built id:-
	 */
	public void logout()
	{
		Actions action=new Actions(driver);
		action.moveToElement(hoverToLogout).build().perform();
		signOut.click();
	}
}
