package com.cucumber.framework.Payroll_page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Payroll_initialize_50_page 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Payroll_initialize_50_page.class);
	WaitHelper waitHelper;
	
	Actions actions ;
	
	@FindBy(xpath=".//label[contains(text(),'All Employees [50]')]")
	WebElement AllEmployee_50;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_gvEmpList_chkAll' and @type='checkbox']")
	WebElement All_Employee_checkbox;
	
	@FindBy(xpath=".//span[@id='ContentPlaceHolder1_lblSuccessMsg']")
	WebElement verify_Initailize_Alert_message;
	
	@FindBy(xpath=".//label[contains(text(),'Initialized Employees [50]')]")
	WebElement verify_InitailizeEmployee_50;
	
	@FindBy(xpath=".//select[@id='ddlYear']")
	WebElement verify_login_year;
	
	@FindBy(xpath=".//select[@id='ddlMonth']")
	WebElement verify_login_month;
	
	@FindBy(xpath=".//select[@id='ddlPayType']")
	WebElement Select_Type;
	
	@FindBy(xpath=".//input[@id='txtTerminationDate']")
	WebElement TerminationDate;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_rbAllEmployees' and @type='radio']")
	WebElement AllEmployee_Radiobutton;
	
	@FindBy(xpath=".//input[@id='txtTerminationDate']")
	WebElement Edit_TerminationDate;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnDBBackup']")
	WebElement BackupDatebase;
	
	@FindBy(xpath=".//span[@id='ContentPlaceHolder1_lblSuccessMsg']")
	WebElement Verify_BackupDatebase;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnInitialize']")
	WebElement Double_Payroll_initialize;
	
	@FindBy(xpath=".//a[@id='lnkContinue']")
	WebElement Ignore_and_continue;
	
	@FindBy(xpath=".//a[@id='lnkPageUrl' and @menu-caption='Lock / UnLock Payroll Record']")
	WebElement Lock_and_Unlock;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnLock']")
	WebElement Lock_button;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnCancelpop']")
	WebElement Lock_Alert_message_NO;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnOK']")
	WebElement Lock_Alert_message_YES;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnUnlock']")
	WebElement Unlock_Initialize_button;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_gvLockUnlock_chkEmpLock_0' and @type='checkbox']")
	WebElement Unlocked_checkbox;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnUnLock']")
	WebElement Unlock_button;
	
	@FindBy(xpath=".//span[@id='ContentPlaceHolder1_lblSuccessMsg']")
	WebElement Verify_Unlock_button_Alert_message;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnUlYes']")
	WebElement click_Yes_Unlock_button;
	
	
	@FindBy(xpath=".//div[contains(text(),'PAYINITIALIZE is queueds ')]")
	WebElement Notification_Queue;
	
	@FindBy(xpath=".//div[@id='notificationIcon']")
	WebElement Bell_icon;
	
	@FindBy(xpath=".//span[contains(text(),'Total: 50')]")
	WebElement Total_count_salary_Adjustment;
	
	public Payroll_initialize_50_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	
	public boolean AllEmployee_50() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(AllEmployee_50);
	}
	
	public void All_Employee_checkbox() throws InterruptedException
	{
		Thread.sleep(4000);
		All_Employee_checkbox.click();
	}
	
	public boolean verify_Initailize_Alert_message() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(verify_Initailize_Alert_message);
	}
	public boolean verify_InitailizeEmployee_50() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(verify_InitailizeEmployee_50);
	}
	
	public void verify_login_year(String verify_login_year) throws InterruptedException {
		Thread.sleep(9000);
		log.info("entering verify_login_year.." + verify_login_year);
		new Select(this.verify_login_year).selectByVisibleText(verify_login_year);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public void verify_login_month(String verify_login_month) throws InterruptedException {
		Thread.sleep(12000);
		log.info("entering verify_login_month.." + verify_login_month);
		new Select(this.verify_login_month).selectByVisibleText(verify_login_month);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void Select_Type(String Select_Type) throws InterruptedException {
		Thread.sleep(12000);
		log.info("entering verify_login_month.." + Select_Type);
		new Select(this.Select_Type).selectByVisibleText(Select_Type);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void TerminationDate(String TerminationDate)
	{
		log.info("entering TerminationDate.." + TerminationDate);
		this.TerminationDate.sendKeys(TerminationDate);
		
	}
	
	public void AllEmployee_Radiobutton() throws InterruptedException
	{
		Thread.sleep(4000);
		AllEmployee_Radiobutton.click();
	}
	
	public void Edit_TerminationDate_clear() throws InterruptedException
	{
		Thread.sleep(4000);
		Edit_TerminationDate.clear();
	}
	public void Edit_TerminationDate(String Edit_TerminationDate)
	{
		log.info("entering Edit_TerminationDate.." + Edit_TerminationDate);
		this.Edit_TerminationDate.sendKeys(Edit_TerminationDate);
		
	}
	public void BackupDatebase() throws InterruptedException
	{
		Thread.sleep(8000);
		BackupDatebase.click();
	}
	
	public boolean Verify_BackupDatebase() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(Verify_BackupDatebase);
	}
	
	public void Double_Payroll_initialize() throws InterruptedException
	{
		Thread.sleep(8000);
		actions= new Actions(driver);
		actions.doubleClick(Double_Payroll_initialize).perform();
	
	}
	public void Ignore_and_continue() throws InterruptedException
	{
		Thread.sleep(5000);
		Ignore_and_continue.click();
	}
	public void Lock_and_Unlock() throws InterruptedException
	{
		Thread.sleep(5000);
		Lock_and_Unlock.click();
	}
	public void Lock_button() throws InterruptedException
	{
		Thread.sleep(8000);
		Lock_button.click();
	}
	public void Lock_Alert_message_NO() throws InterruptedException
	{
		Thread.sleep(9000);
		Lock_Alert_message_NO.click();
	}
	public void Lock_Alert_message_YES() throws InterruptedException
	{
		Thread.sleep(9000);
		Lock_Alert_message_YES.click();
	}
	
	public void Unlock_Initialize_button() throws InterruptedException
	{
		Thread.sleep(9000);
		Unlock_Initialize_button.click();
	}
	public void Unlocked_checkbox() throws InterruptedException
	{
		Thread.sleep(9000);
		Unlocked_checkbox.click();
	}
	public void Unlock_button() throws InterruptedException
	{
		Thread.sleep(9000);
		Unlock_button.click();
	}
	public boolean Verify_Unlock_button_Alert_message() throws InterruptedException
	{
		Thread.sleep(7000);
		return new GenericHelper().isDisplayed(Verify_Unlock_button_Alert_message);
	}
	public void click_Yes_Unlock_button() throws InterruptedException
	{
		Thread.sleep(7000);
		click_Yes_Unlock_button.click();
	}
	public boolean Notification_Queue() throws InterruptedException
	{
		Thread.sleep(7000);
		return new GenericHelper().isDisplayed(Notification_Queue);
	}
	
	public void Bell_icon() throws InterruptedException
	{
		Thread.sleep(7000);
		Bell_icon.click();
	}
	public boolean Total_count_salary_Adjustment() throws InterruptedException
	{
		Thread.sleep(7000);
		return new GenericHelper().isDisplayed(Total_count_salary_Adjustment);
	}
}
