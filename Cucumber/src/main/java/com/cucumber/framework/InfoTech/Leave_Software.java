package com.cucumber.framework.InfoTech;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Leave_Software {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Leave_Software.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//a[@class='dropdown-toggle' and @title='Change Apps']")
	WebElement changeapp;
	
	@FindBy(xpath=".//a[@data-text='INFO-LEAVE']")
	WebElement Info_Leave;
	
	@FindBy(xpath=".//span[contains(text(),'LEAVE SOFTWARE')]")
	WebElement leave_software;
	
	@FindBy(xpath=".//span[contains(text(),'Master')]")
	WebElement master;
	
	@FindBy(xpath=".//a[@menu-caption='Employee Basic Details']")
	WebElement EmployeeBasicDetail;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_lnkManage' and @data-value='Add']")
	WebElement AddNewbutton;
	
	@FindBy(xpath=".//input[@id='txtEmpCode' and @type='text']")
	WebElement Empcode;
	
	@FindBy(xpath=".//input[@id='txtEmpName' and @type='text']")
	WebElement EmpName;
	
	@FindBy(xpath=".//select[@id='dlGender']")
	WebElement Gender;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_ddlMarital']")
	WebElement Marital_Status;
	
	@FindBy(xpath=".//input[@id='txtEmail']")
	WebElement Emailid;
	
	@FindBy(xpath=".//input[@id='txtMobileNo']")
	WebElement Mobileno;
	
	@FindBy(xpath=".//input[@id='txtJoinDate']")
	WebElement JoinDate;
	
	@FindBy(xpath=".//input[@id='txtNRIC']")
	WebElement NRIC;

	@FindBy(xpath=".//input[@id='chkAppELEAVE']")
	WebElement AppAccess;
	
	@FindBy(xpath=".//a[@id='__tab_tabELEAVE']")
	WebElement Eleave;
	
	@FindBy(xpath=".//select[@id='ddlHRCode']")
	WebElement Firstlevel;
	
	@FindBy(xpath=".//input[@type='submit' and @value='Save']")
	WebElement savebutton;
	
	@FindBy(xpath=".//span[contains(text(),'Staff Details')]")
	WebElement staffDetails;
	
	@FindBy(xpath=".//input[@name='ctl00$ContentPlaceHolder1$txtEmpSearchText' and @type='text']")
	WebElement EmployeeDetaiils;
	
	@FindBy(xpath=".//button[@class='btn bgInfo']")
	WebElement searchbutton;
	
	@FindBy(xpath=".//a[@class='btn removeIcon']")
	WebElement deleteicon;
	
	@FindBy(xpath=".//a[@class='btn removeIcon']")
	WebElement Beforedeleteicon;
	
	@FindBy(xpath=".//input[@type='password' and @id='ContentPlaceHolder1_txtUserpwd']")
	WebElement PasswordDeletepage;
	
	@FindBy(xpath=".//input[@type='password' and @id='ContentPlaceHolder1_txtUserpwd']")
	WebElement BeforePasswordDeletepage;
	
	@FindBy(xpath=".//input[@type='submit' and @value='Delete']")
	WebElement Deletebutton;
	
	@FindBy(xpath=".//input[@type='submit' and @value='Delete']")
	WebElement BeforeDeletebutton;
	
	@FindBy(xpath=".//span[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_LblHeader']")
	WebElement BasicDetails;
	
	@FindBy(xpath=".//input[@id='txtCardFPFaceID' and @type='text']")
	WebElement FaceId;
	
	@FindBy(xpath=".//a[@data-text='INFO-TMS']")
	WebElement Info_TMS;
	
	@FindBy(xpath=".//span[contains(text(),'TIME ATTENDANCE SOFTWARE')]")
	WebElement TMS_software;
	
	@FindBy(xpath=".//select[@id='ddlEClaimDRName']")
	WebElement ClaimDateDRange;
	
	@FindBy(xpath=".//select[@id='ddlEClaimClaimLimit']")
	WebElement ClaimLimit;
	

	@FindBy(xpath=".//a[@data-text='INFO-CLAIM']")
	WebElement INFOCLAIM;
	
	
	@FindBy(xpath=".//span[contains(text(),'CLAIM SOFTWARE')]")
	WebElement claim_software;
	
	@FindBy(xpath=".//select[@id='ddlEClaimHR']")
	WebElement FinalApprover;
	
	@FindBy(xpath=".//a[@data-text='INFO-PAY']")
	WebElement INFOPAY;
	
	
	@FindBy(xpath=".//span[contains(text(),'PAYROLL SOFTWARE')]")
	WebElement PAYROLLsoftware;
	
	@FindBy(xpath=".//input[@id='txtBirthDate']")
	WebElement PAYDate;
	
	@FindBy(xpath=".//select[@id='ddlEmployerCPF']")
	WebElement EmployeeCPF;
	
	@FindBy(xpath=".//select[@id='cboNationality']")
	WebElement Nationality;
	
	@FindBy(xpath=".//a[@id='__tab_ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlAddAccord']")
	WebElement Additionalbutton;
	
	
	public Leave_Software(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	public void changeapp() throws InterruptedException
	{
		Thread.sleep(4000);
		changeapp.click();
	}
	
	public void Info_Leave() throws InterruptedException
	{
		Info_Leave.click();
	}
	public boolean leave_software()
	{
		return new GenericHelper().isDisplayed(leave_software);
	}
	public boolean TMS_software()
	{
		return new GenericHelper().isDisplayed(TMS_software);
	}
	public void master() throws InterruptedException
	{
		Thread.sleep(7000);
		master.click();
	}
	public void EmployeeDetails() throws InterruptedException
	{
		Thread.sleep(3000);
		EmployeeBasicDetail.click();
	}
	public void Addbutton() throws InterruptedException
	{
		Thread.sleep(3000);
		AddNewbutton.click();
	}
	public void EnterEmpCode(String Empcode)
	{
		log.info("entering firstName.." + Empcode);
		this.Empcode.sendKeys(Empcode);
		
	}
	
	public void EmpName() throws InterruptedException
	{
		Thread.sleep(3000);
		EmpName.clear();
	}
	
	public void EnterEmpName(String EmpName) throws InterruptedException
	{
		Thread.sleep(9000);
		
		log.info("entering firstName.." + EmpName);
		this.EmpName.sendKeys(EmpName);
		
	}
	public void setYourAddressState(String Gender) {
		log.info("entering yourAddressState.." + Gender);
		new Select(this.Gender).selectByVisibleText(Gender);
	}
	public void MaritalStatus(String Marital_Status) {
		log.info("entering yourAddressState.." + Marital_Status);
		new Select(this.Marital_Status).selectByVisibleText(Marital_Status);
	}
	
	public void Emailid() throws InterruptedException
	{
		Thread.sleep(3000);
		Emailid.clear();
	}
	public void EnterEmailid(String Emailid)
	{
		log.info("entering firstName.." + Emailid);
		this.Emailid.sendKeys(Emailid);
		
	}
	public void Mobileno() throws InterruptedException
	{
		Thread.sleep(3000);
		Mobileno.clear();
	}
	public void EnterMobileNo(String Mobileno)
	{
		log.info("entering firstName.." + Mobileno);
		this.Mobileno.sendKeys(Mobileno);
	}
	
	public void EnterJoinDate(String JoinDate)
	{
		log.info("entering firstName.." + JoinDate);
		this.JoinDate.sendKeys(JoinDate);
		
	}
	
	public void EnterNRIC(String NRIC)
	{
		log.info("entering firstName.." + NRIC);
		this.NRIC.sendKeys(NRIC);
		
	}
	public void AppAccess() throws InterruptedException
	{
		Thread.sleep(9000);
		AppAccess.click();
	}
	public void Eleve() throws InterruptedException
	{
		Eleave.click();
	}
	
	public void firstlevelapprove(String Firstlevel) {
		log.info("entering yourAddressState.." + Firstlevel);
		new Select(this.Firstlevel).selectByVisibleText(Firstlevel);
	}
	public void savebutton() throws InterruptedException
	{
		Thread.sleep(9000);
		savebutton.click();
	}
	public boolean verifySuccessStaffDetails()
	{
		return new GenericHelper().isDisplayed(EmployeeDetaiils);
	}
	
	public void SearchEmployeeDetails(String EmployeeDetaiils)
	{
		log.info("entering EmployeeDetaiils.." + EmployeeDetaiils);
		this.EmployeeDetaiils.sendKeys(EmployeeDetaiils);
		
	}
	public void search() throws InterruptedException
	{
		searchbutton.click();
	}
	public void Deleteicon() throws InterruptedException
	{
		deleteicon.click();
	}
	
	public void Beforedeleteicon() throws InterruptedException
	{
		Beforedeleteicon.click();
	}
	
	
	public void PasswordDeletepage(String PasswordDeletepage)
	{
		log.info("entering firstName.." + PasswordDeletepage);
		this.PasswordDeletepage.sendKeys(PasswordDeletepage);	
	}
	
	public void BeforePasswordDeletepage(String BeforePasswordDeletepage)
	{
		log.info("entering BeforePasswordDeletepage.." + BeforePasswordDeletepage);
		this.BeforePasswordDeletepage.sendKeys(BeforePasswordDeletepage);	
	}
	
	
	public void Deletebutton() throws InterruptedException
	{
		Deletebutton.click();
	}
	
	public void BeforeDeletebutton() throws InterruptedException
	{
		BeforeDeletebutton.click();
	}
	public boolean BasicDetails() throws InterruptedException
	{
		
		return new GenericHelper().isDisplayed(BasicDetails);
	}
	public void FaceId(String FaceId)
	{
		log.info("entering FaceId.." + FaceId);
		this.FaceId.sendKeys(FaceId);
	}
	public void Info_TMS() throws InterruptedException
	{
		Info_TMS.click();
	}
	
	public void ClaimDateDRange(String ClaimDateDRange) 
	{
		log.info("entering yourAddressState.." + ClaimDateDRange);
		new Select(this.ClaimDateDRange).selectByVisibleText(ClaimDateDRange);
	}
	
	public void ClaimLimit(String ClaimLimit) {
		log.info("entering yourAddressState.." + ClaimLimit);
		new Select(this.ClaimLimit).selectByVisibleText(ClaimLimit);
	}
	
	public void INFOCLAIM() throws InterruptedException
	{
		INFOCLAIM.click();
	}
	public boolean claim_software() throws InterruptedException
	{
		
		return new GenericHelper().isDisplayed(claim_software);
	}
	
	public void FinalApprover(String FinalApprover) 
	{
		log.info("entering yourAddressState.." + FinalApprover);
		new Select(this.FinalApprover).selectByVisibleText(FinalApprover);
	}
	
	public void INFOPAY() throws InterruptedException
	{
		INFOPAY.click();
	}
	public boolean PAYROLLsoftware() throws InterruptedException
	{
		
		return new GenericHelper().isDisplayed(PAYROLLsoftware);
	}
	public void PAYDate(String PAYDate)
	{
		log.info("entering PAYDate.." + PAYDate);
		this.PAYDate.sendKeys(PAYDate);
		
	}
	
	public void EmployeeCPF(String EmployeeCPF)
	{
		log.info("entering EmployeeCPF.." + EmployeeCPF);
		this.EmployeeCPF.sendKeys(EmployeeCPF);
	}
	public void Nationality(String Nationality)
	{
		log.info("entering Nationality.." + Nationality);
		this.Nationality.sendKeys(Nationality);
	}
	
	
	public void Additionalbutton() throws InterruptedException
	{
		Additionalbutton.click();
	}
	public void clearEmployeeDetaiils() throws InterruptedException
	{
		Thread.sleep(3000);
		EmployeeDetaiils.clear();
	}
}
