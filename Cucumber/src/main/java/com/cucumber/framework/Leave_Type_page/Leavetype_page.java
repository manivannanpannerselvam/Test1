package com.cucumber.framework.Leave_Type_page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;





public class Leavetype_page {
	
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Leavetype_page.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//a[@id='lnkPageUrl' and @menu-caption='Leave Type / Leave Group']")
	WebElement leavetype_and_leavegroup;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_tabContainer_tabLeaveType_UCLeaveReasonSetting_lnkManage']")
	WebElement new_button_leavetype;
	
	
	public Leavetype_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	public void leavetype_and_leavegroup() throws InterruptedException
	{
		leavetype_and_leavegroup.click();
	}
	public void new_button_leavetype() throws InterruptedException
	{
		new_button_leavetype.click();
	}
}
