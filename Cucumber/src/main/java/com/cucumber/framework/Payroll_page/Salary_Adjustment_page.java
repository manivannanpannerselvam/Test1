package com.cucumber.framework.Payroll_page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;

public class Salary_Adjustment_page {
	
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Salary_Adjustment_page.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//a[@id='lnkPageUrl' and @menu-caption='Salary Adjustment']")
	WebElement Salary_Adjustment_icon;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtGlobalSearch']")
	WebElement Search_Adjustment;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_lnkSearch']")
	WebElement search_icon;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_gvEmployees_lnkEditEmployee_0']")
	WebElement Edit_salaryAdjustment_user;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_lnkLock']")
	WebElement Lock_salaryAdjustment_user;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnUpdate']")
	WebElement Update_salaryAdjustment_user;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnCancelpop']")
	WebElement No_Alert_Message;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_lnkUnlock']")
	WebElement Unlock_slaryAdjustment;
	
	public Salary_Adjustment_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	
	public void Salary_Adjustment_icon() throws InterruptedException
	{
		Thread.sleep(9000);
		Salary_Adjustment_icon.click();
	}
	
	public void Search_Adjustment(String Search_Adjustment)
	{
		log.info("entering Search_Adjustment.." + Search_Adjustment);
		this.Search_Adjustment.sendKeys(Search_Adjustment);
	}
	public void search_icon() throws InterruptedException
	{
		Thread.sleep(9000);
		search_icon.click();
	}
	public void Edit_salaryAdjustment_user() throws InterruptedException
	{
		Thread.sleep(7000);
		Edit_salaryAdjustment_user.click();
	}
	public void Lock_salaryAdjustment_user() throws InterruptedException
	{
		Thread.sleep(7000);
		Lock_salaryAdjustment_user.click();
	}
	public void Update_salaryAdjustment_user() throws InterruptedException
	{
		Thread.sleep(7000);
		Update_salaryAdjustment_user.click();
	}
	public void No_Alert_Message() throws InterruptedException
	{
		Thread.sleep(7000);
		No_Alert_Message.click();
	}
	public void Unlock_slaryAdjustment() throws InterruptedException
	{
		Thread.sleep(7000);
		Unlock_slaryAdjustment.click();
	}
}
