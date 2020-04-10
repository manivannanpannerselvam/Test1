package com.cucumber.framework.InfoTech_UserAccess;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.framework.InfoTech.InfoTech_Page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

import cucumber.api.java.en.Then;

public class UserAccess_Page 
{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(UserAccess_Page.class);
	WaitHelper waitHelper;
	
	
	@FindBy(xpath=".//a[@id='lnkPageUrl' and @menu-caption='User Creation']")
	WebElement usercreation;

	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_Main_txtDisplayName']")
	WebElement DisplayName;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_Main_txtEmail']")
	WebElement PrimaryEmail;
	
	@FindBy(xpath=".//input[@id='txtMobileNo']")
	WebElement MobileNumber;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_tabUsers_tabActiveUsers_lnkManage' or @data-value='Add']")
	WebElement NewButton;
	
	@FindBy(xpath=".//span[contains(text(),'App Access')]")
	WebElement AppAccess;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlETMSAccess']")
	WebElement ETMS;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlELeaveAccess']")
	WebElement ELeave;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlEPayrollAccess']")
	WebElement EpayRoll;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlMobileAttendanceAccess']")
	WebElement MobileAttendance;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_TabContainer1_TabPanel_AppRights_dlEClaimAccess']")
	WebElement EclaimAttendance;
	
	@FindBy(xpath=".//span[contains(text(),'Company Access')]")
	WebElement companyAccess;
	
	@FindBy(xpath=".//span[contains(text(),'User Creation')]")
	WebElement UserCancel;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_CompanyRights_gvCompany_chkCompany_0' and @type='checkbox']")
	WebElement companycheckbox;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_CompanyRights_gvCompany_chkCompany_1' and @type='checkbox']")
	WebElement companycheckbox2;
	
	@FindBy(xpath=".//span[contains(text(),'Department Access')]")
	WebElement DepartmentAccess;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkETMSIsSuperAdmin' and @type='checkbox']")
	WebElement ETMS_superadmin;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkELEAVEIsSuperAdmin' and @type='checkbox']")
	WebElement ELEAVE_superadmin;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkECLAIMIsSuperAdmin' and @type='checkbox']")
	WebElement ECLAIM_superadmin;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkEPAYROLLIsSuperAdmin' and @type='checkbox']")
	WebElement PAYROLL_superadmin;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkMOBILEATTENDANCEIsSuperAdmin' and @type='checkbox']")
	WebElement Mobile_superadmin;
	
	@FindBy(xpath=".//input[@type='submit' and @value='Save']")
	WebElement savebutton;
	
	@FindBy(xpath=".//span[contains(text(),'NewUsers')]")
	WebElement userGridlist;
	
	@FindBy(xpath=".//a[@class='btn removeIcon']")
	WebElement removeicon;
	
	@FindBy(xpath=".//input[@type='submit' and @value='Cancel']")
	WebElement cancelbutton;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkETMSIsApprover' and @type='checkbox']")
	WebElement ApproverETAMS;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkELEAVEIsApprover' and @type='checkbox']")
	WebElement ApproverELeave;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkECLAIMIsApprover' and @type='checkbox']")
	WebElement ApproverECLAIM;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_UserRights_chkEPAYROLLIsApprover' and @type='checkbox']")
	WebElement ApproverEApproval;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_TabContainer1_TabPanel_Main_dlEmployee1_Input' and @type='text']")
	WebElement Employeename;
	
	@FindBy(xpath=".//td[contains(text(),'TEST006 [TEST006]')]")
	WebElement Employeedrop;
	
	@FindBy(xpath=".//span[contains(text(),'test05@mailinator.com')]")
	WebElement Employeecode;
	
	
	public UserAccess_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	
	public void usercreation() throws InterruptedException
	{
		Thread.sleep(4500);
		
		usercreation.click();
	}
	public void NewButton() throws InterruptedException
	{
		try
		{
			Thread.sleep(9000);
			NewButton.click();
		}
		catch(Exception ie)
		{
			TestBase.driver.navigate().refresh();
			Thread.sleep(9000);

			NewButton.click();
			
		}
	}
	public void DisplayName(String DisplayName)
	{
		log.info("entering DisplayName.." + DisplayName);
		this.DisplayName.sendKeys(DisplayName);
	}
	public void PrimaryEmail(String PrimaryEmail)
	{
		log.info("entering DisplayName.." + PrimaryEmail);
		this.PrimaryEmail.sendKeys(PrimaryEmail);
	}
	public void MobileNumber(String MobileNumber)
	{
		log.info("entering MobileNumber.." + MobileNumber);
		this.MobileNumber.sendKeys(MobileNumber);
	}
	
	public void AppAccess() throws InterruptedException
	{
		Thread.sleep(9000);
		AppAccess.click();
	}
	
	public void ETMS(String ETMS) throws InterruptedException {
		Thread.sleep(9000);
		log.info("entering ETMS.." + ETMS);
		new Select(this.ETMS).selectByVisibleText(ETMS);
	}
	public void ELeave(String ELeave) throws InterruptedException {
		Thread.sleep(9000);
		log.info("entering ELeave.." + ELeave);
		new Select(this.ELeave).selectByVisibleText(ELeave);
	}
	public void EpayRoll(String EpayRoll) throws InterruptedException {
		Thread.sleep(9000);
		log.info("entering EpayRoll.." + EpayRoll);
		new Select(this.EpayRoll).selectByVisibleText(EpayRoll);
	}
	
	public void MobileAttendance(String MobileAttendance) throws InterruptedException {
		Thread.sleep(9000);
		log.info("entering MobileAttendance.." + MobileAttendance);
		new Select(this.MobileAttendance).selectByVisibleText(MobileAttendance);
	}
	
	public void EclaimAttendance(String EclaimAttendance) throws InterruptedException {
		Thread.sleep(9000);
		log.info("entering EclaimAttendance.." + EclaimAttendance);
		new Select(this.EclaimAttendance).selectByVisibleText(EclaimAttendance);
	}
	public void companycheckbox2() throws InterruptedException
	{
		Thread.sleep(9000);
		Thread.sleep(2000);
		companycheckbox2.click();
	}
	
	public void companyAccess() throws InterruptedException
	{
		Thread.sleep(9000);
		companyAccess.click();
	}
	
	public void companycheckbox() throws InterruptedException
	{
		Thread.sleep(9000);
		companycheckbox.click();
	}
	public void DepartmentAccess() throws InterruptedException
	{
		Thread.sleep(9000);
		DepartmentAccess.click();
	}
	public void superadmin() throws InterruptedException 
	{
		Thread.sleep(8000);
		ETMS_superadmin.click();
		Thread.sleep(8000);
		ELEAVE_superadmin.click();
		Thread.sleep(8000);
		ECLAIM_superadmin.click();
		Thread.sleep(8000);
		PAYROLL_superadmin.click();
		Thread.sleep(8000);
		Mobile_superadmin.click();
	}
	public void savebutton() throws InterruptedException
	{
		Thread.sleep(8000);
		savebutton.click();
	}
	public boolean userGridlist() throws InterruptedException
	{ Thread.sleep(8000);
		return new GenericHelper().isDisplayed(userGridlist);
	}
	public void removeicon() throws InterruptedException
	{
		Thread.sleep(4000);
		removeicon.click();
		
		driver.switchTo().alert().accept();
	}
	public void Before_removeicon() throws InterruptedException
	{
		try
		{
		Thread.sleep(4000);
		removeicon.click();
		
		driver.switchTo().alert().accept();
		}
		catch(Exception ie)
		{
			
		}
	}
	public void cancelbutton() throws InterruptedException
	{
		Thread.sleep(9000);
		cancelbutton.click();
	}
	public boolean userGridlistsnotdisplayed()
	{
		return new GenericHelper().isDisplayed(UserCancel);	
	}
	public void EApprove() throws InterruptedException 
	{
		Thread.sleep(9000);
		ApproverETAMS.click();
		Thread.sleep(9000);
		ApproverELeave.click();
		Thread.sleep(9000);
		ApproverECLAIM.click();
		Thread.sleep(9000);
		ApproverEApproval.click();
	}
	public boolean VerifycompanyAccess()
	{
		return new GenericHelper().isDisplayed(companyAccess);	
	}
	public void ETMS_superadmin() throws InterruptedException 
	{
		Thread.sleep(12000);
		ETMS_superadmin.click();
		
	}
	public void ELEAVE_superadmin() throws InterruptedException 
	{
		Thread.sleep(12000);
		ELEAVE_superadmin.click();
		
	}
	public void ECLAIM_superadmin() throws InterruptedException 
	{
		Thread.sleep(12000);
		ECLAIM_superadmin.click();
		
	}
	public void PAYROLL_superadmin() throws InterruptedException 
	{
		Thread.sleep(12000);
		PAYROLL_superadmin.click();
		
	}
	public void Mobile_superadmin() throws InterruptedException 
	{
		Thread.sleep(12000);
		Mobile_superadmin.click();
		
	}
	public void ETMS_Approvals() throws InterruptedException 
	{
		Thread.sleep(12000);
		ApproverETAMS.click();	
	}
	
	public void Employeename() throws InterruptedException
	{

		Thread.sleep(9000);
		Employeename.clear();
	}
	public void Employeename(String Employeename) throws InterruptedException
	{
		Thread.sleep(9000);

		log.info("entering Employeename.." + Employeename);
		this.Employeename.sendKeys(Employeename);
	}
	
	public void Employeedrop() throws InterruptedException 
	{
		Thread.sleep(9000);
		Employeedrop.click();	
	}
	public boolean Employeecode() throws InterruptedException 
	{
		Thread.sleep(2000);
		return new GenericHelper().isDisplayed(Employeecode);
	}
	
}
