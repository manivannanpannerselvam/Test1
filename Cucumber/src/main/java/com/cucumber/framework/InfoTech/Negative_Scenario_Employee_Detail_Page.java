package com.cucumber.framework.InfoTech;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Negative_Scenario_Employee_Detail_Page
{
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Negative_Scenario_Employee_Detail_Page.class);
	WaitHelper waitHelper;
	
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
	
	
	@FindBy(xpath=".//span[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_LblHeader']")
	WebElement BasicDetails;
	
	@FindBy(xpath=".//input[@id='txtJoinDate']")
	WebElement JoinDate;
	
	
	@FindBy(xpath=".//span[contains(text(),'Please enter valid date')]")
	WebElement JoinDateAlertmessage;
	
	@FindBy(xpath=".//input[@id='txtNRIC']")
	WebElement NRIC;
	
	@FindBy(xpath=".//span[contains(text(),'Please enter valid NRIC')]")
	WebElement NRICAlertMessage;
	
	@FindBy(xpath=".//span[contains(text(),'Please enter valid email')]")
	WebElement EmailAlertMessage;
	
	@FindBy(xpath=".//input[@id='txtMobileNo' and @type='text']")
	WebElement mobilenumber;
	
	@FindBy(xpath=".//input[@id='chkAppETMS' and @type='checkbox']")
	WebElement EtmsApp;
	
	@FindBy(xpath=".//a[@id='__tab_tabETMS']")
	WebElement Etmsbutton;
	
	@FindBy(xpath=".//input[@id='chkAppECLAIM']")
	WebElement EclaimApp;
	
	@FindBy(xpath=".//a[@id='__tab_tabECLAIM']")
	WebElement Eclaimbutton;
	
	@FindBy(xpath=".//select[@id='ddlEClaimDRName']")
	WebElement verifyEmpEclaim;
	
	
	@FindBy(xpath=".//input[@id='chkAppEPAYROLL']")
	WebElement PayRollApp;
	
	@FindBy(xpath=".//a[@id='__tab_ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL']")
	WebElement PayRollAppbutton;
	
	@FindBy(xpath=".//a[@id='__tab_ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlPersonal']")
	WebElement VerifyPayRollAppbutton;
	
	
	@FindBy(xpath=".//input[@id='chkAppMOBILEATTENDANCE']")
	WebElement MobileAttendance;
	
	@FindBy(xpath=".//a[@id='__tab_tabMOBILEATTENDANCE']")
	WebElement MobileAttendancebutton;
	
	@FindBy(xpath=".//input[@id='chkAllowChangeEmployeeID' and @type='checkbox']")
	WebElement AllowchangeEmployeeid;
	
	@FindBy(xpath=".//input[@id='chkMobileTracking' and @type='checkbox']")
	WebElement MobileTracking;
	
	@FindBy(xpath=".//select[@id='dlDepartment']")
	WebElement Department;
	
	@FindBy(xpath=".//select[@id='dlSection']")
	WebElement Section;
	
	@FindBy(xpath=".//select[@id='dlDesignation']")
	WebElement Designation;
	
	@FindBy(xpath=".//select[@id='dlDesignationGrp']")
	WebElement Designation_group;
	
	public Negative_Scenario_Employee_Detail_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	
	public void EnterEmpCodes(String Empcode)
	{
		log.info("entering firstName.." + Empcode);
		this.Empcode.sendKeys(Empcode);
		
	}
	public void EnterEmpNames(String EmpName)
	{
		log.info("entering firstName.." + EmpName);
		this.EmpName.sendKeys(EmpName);
		
	}
	public void setYourAddressStates(String Gender) {
		log.info("entering yourAddressState.." + Gender);
		new Select(this.Gender).selectByVisibleText(Gender);
	}
	public void MaritalStatuss(String Marital_Status) {
		log.info("entering yourAddressState.." + Marital_Status);
		new Select(this.Marital_Status).selectByVisibleText(Marital_Status);
	}
	public void EnterEmailids(String Emailid)
	{
		log.info("entering firstName.." + Emailid);
		this.Emailid.sendKeys(Emailid);
		
	}
	public boolean BasicDetails() throws InterruptedException
	{
		
		return new GenericHelper().isDisplayed(BasicDetails);
	}
	
	public void JoinDate(String JoinDate)
	{
		log.info("entering firstName.." + JoinDate);
		this.JoinDate.sendKeys(JoinDate);
		
	}
	public boolean JoinDateAlertmessage() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(JoinDateAlertmessage);
	}
	
	public void EnterInvalidNRIC(String NRIC)
	{
		log.info("entering firstName.." + NRIC);
		this.NRIC.sendKeys(NRIC);
	}
	
	public boolean NRICAlertMessage() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(NRICAlertMessage);
	}
	
	public boolean EmailAlertMessage() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(EmailAlertMessage);
	}
	
	public boolean verifyEmploycode() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(Empcode);
	}
	public void mobilenumber() throws InterruptedException
	{
		mobilenumber.click();
	}
	
	public void EtmsApp() throws InterruptedException
	{
		EtmsApp.click();
	}
	public void Etmsbutton() throws InterruptedException
	{
		Etmsbutton.click();
	}
	public void EclaimApp() throws InterruptedException
	{
		EclaimApp.click();
	}
	public void Eclaimbutton() throws InterruptedException
	{
		Eclaimbutton.click();
	}
	public boolean verifyEmpEclaim() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(verifyEmpEclaim);
	}
	public void PayRollApp() throws InterruptedException
	{
		PayRollApp.click();
	}
	public void PayRollAppbutton() throws InterruptedException
	{
		PayRollAppbutton.click();
	}
	public boolean VerifyPayRollAppbutton() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(VerifyPayRollAppbutton);
	}
	public void MobileAttendance() throws InterruptedException
	{
		MobileAttendance.click();
	}
	public void MobileAttendancebutton() throws InterruptedException
	{
		MobileAttendancebutton.click();
	}
	public void AllowchangeEmployeeid() throws InterruptedException
	{
		AllowchangeEmployeeid.click();
	}
	public void MobileTracking() throws InterruptedException
	{
		MobileTracking.click();
	}
	
	public void Department(String Department) {
		log.info("entering Department.." + Department);
		new Select(this.Department).selectByVisibleText(Department);
	}
	
	public void Section(String Section) {
		log.info("entering Section.." + Section);
		new Select(this.Section).selectByVisibleText(Section);
	}
	
	public void Designation(String Designation) {
		log.info("entering Designation.." + Designation);
		new Select(this.Designation).selectByVisibleText(Designation);
	}
	
	public void Designation_group(String Designation_group) {
		log.info("entering Designation_group.." + Designation_group);
		new Select(this.Designation_group).selectByVisibleText(Designation_group);
	}
}
