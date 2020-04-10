package com.cucumber.framework.InfoTech;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class forgot_page 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(forgot_page.class);
	WaitHelper waitHelper;
	
	
	@FindBy(xpath=".//a[@id='lnkFrgtPwd']")
	WebElement forgotpassword;
	
	@FindBy(xpath=".//input[@name='txtEmail']")
	WebElement forgotemailid;
	
	@FindBy(xpath=".//input[@type='submit' and @value='Send']")
	WebElement sendbutton;
	
	@FindBy(xpath=".//span[@id='lblStatus']")
	WebElement forgotalertmessage;
	
	@FindBy(xpath=".//input[@name='btnLogin' or @value='LOGIN']")
	WebElement blockedmessage;
	
	@FindBy(xpath=".//span[contains(text(),'Administration')]")
	WebElement Administration;
	
	@FindBy(xpath=".//a[@menu-caption='Email & 2FA Settings']")
	WebElement EmailSettings;
	
	@FindBy(xpath=".//a[@menu-caption='Email & 2FA Settings']")
	WebElement Allowmobilenumber;
	
	
	public forgot_page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	
	public void forgotpassword() throws InterruptedException
	{
		forgotpassword.click();
	}
	public void forgotemailid(String forgotemailid)
	{
		log.info("entering password.." + forgotemailid);
		this.forgotemailid.sendKeys(forgotemailid);
	}
	public void sendbutton() throws InterruptedException
	{
		sendbutton.click();
	}
	public boolean forgotalertmessage()
	{
		return new GenericHelper().isDisplayed(forgotalertmessage);
	}

	public boolean blockedalertmessage()
	{
		return new GenericHelper().isDisplayed(blockedmessage);
	}
	
	public void Administration() throws InterruptedException
	{
		Administration.click();
	}
	public void EmailSettings() throws InterruptedException
	{
		EmailSettings.click();
	}
	
	public void Allowmobilenumber() throws InterruptedException
	{
		Allowmobilenumber.click();
	}
	
}
