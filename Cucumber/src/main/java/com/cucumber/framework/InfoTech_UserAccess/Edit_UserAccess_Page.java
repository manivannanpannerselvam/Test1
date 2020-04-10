package com.cucumber.framework.InfoTech_UserAccess;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Edit_UserAccess_Page 
{
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Edit_UserAccess_Page.class);
	WaitHelper waitHelper;
	
	
	@FindBy(xpath=".//div[@id='ContentPlaceHolder1_tabUsers']//following::a[@id='ContentPlaceHolder1_tabUsers_tabActiveUsers_gvUserManagement_lnkEditUser_0']")
	WebElement EditUser;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_Main_txtDisplayName' and @type='text']")
	WebElement EditDisplayName;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnUpdate' and @value='Update']")
	WebElement Update_Button;
	
	@FindBy(xpath=".//span[contains(text(),'ABCdd')]")
	WebElement updatename;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_Main_txtEmail' and @type='text']")
	WebElement UpdateEmail;
	
	@FindBy(xpath=".//span[contains(text(),'test512345678@gmail.com')]")
	WebElement VerifyEmail;
	
	@FindBy(xpath=".//input[@id='txtMobileNo' and @type='text']")
	WebElement UpdatePhoneNumber;
	
	@FindBy(xpath=".//span[contains(text(),'65-98678555')]")
	WebElement UpdatephoneNumber;
	
	@FindBy(xpath=".//span[@class='combocheckitem']//following::input[@name='ctl00$ContentPlaceHolder1$tabUsers$tabActiveUsers$gvUserManagement$ctl02$chkInActive']")
	WebElement Deactive;
	
	@FindBy(xpath=".//a[@id='__tab_ContentPlaceHolder1_tabUsers_tabInActiveUsers']")
	WebElement InActivebutton;
	
	@FindBy(xpath=".//span[contains(text(),'test5666@gmail.com')]")
	WebElement verifyActiveUser;
	
	@FindBy(xpath=".//div[@id='ContentPlaceHolder1_tabUsers_tabActiveUsers_pnlScroll']//following::span[@id='ContentPlaceHolder1_tabUsers_tabActiveUsers_gvUserManagement_lblEmail_0']")
	WebElement VerifyActiveUsergridlist;
	
	@FindBy(xpath=".//button[contains(text(),'Close')]")
	WebElement closebutton;
	
	public Edit_UserAccess_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	public void closebutton() throws InterruptedException
	{
		Thread.sleep(5000);
		closebutton.click();
	}

	public void EditUser() throws InterruptedException
	{
		Thread.sleep(9000);
		EditUser.click();
	}
	public void EditDisplayName(String EditDisplayName)
	{
		log.info("entering EditDisplayName.." + EditDisplayName);
		this.EditDisplayName.sendKeys(EditDisplayName);
	}
	public void Update_Button() throws InterruptedException
	{
		Thread.sleep(3000);
		Update_Button.click();
	}

	public boolean updatename()
	{
		return new GenericHelper().isDisplayed(updatename);	
	}
	public void Update_Email_clear() throws InterruptedException
	{
		UpdateEmail.clear();
	}
	public void UpdateEmail(String UpdateEmail)
	{
		log.info("entering UpdateEmail.." + UpdateEmail);
		this.UpdateEmail.sendKeys(UpdateEmail);
	}
	
	public boolean VerifyEmail() throws InterruptedException
	{
		
		return new GenericHelper().isDisplayed(VerifyEmail);	
	}
	public void UpdatePhoneNumber_clear() throws InterruptedException
	{
		UpdatePhoneNumber.clear();
	}
	public void UpdatePhoneNumber(String UpdatePhoneNumber)
	{
		log.info("entering UpdatePhoneNumber.." + UpdatePhoneNumber);
		this.UpdatePhoneNumber.sendKeys(UpdatePhoneNumber);
	}
	public boolean VerifyPhoneNumber()
	{
		return new GenericHelper().isDisplayed(UpdatephoneNumber);	
	}
	
	public void Deactive() throws InterruptedException
	{
		Thread.sleep(12000);
		Deactive.click();
	}
	public void InActivebutton() throws InterruptedException
	{
		Thread.sleep(8000);
		InActivebutton.click();
		System.out.println("pass");
	}
	public boolean verifyActiveUser()
	{
		return new GenericHelper().isDisplayed(verifyActiveUser);	
	}
	
	public boolean VerifyActiveUsergridlist() throws InterruptedException
	{
		
		return new GenericHelper().isDisplayed(VerifyActiveUsergridlist);
	}
	
}
