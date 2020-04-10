package com.cucumber.framework.Payroll_page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;




public class Payrolls_page 
{
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Payrolls_page.class);
	WaitHelper waitHelper;
	
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlBasicAccordion_gvSalaryPayMode_txtPercentage_0' and @value='100.00']")
	WebElement Percentage;
	
	@FindBy(xpath=".//input[@id='txtBasicSalary']")
	WebElement BasicSalary;
	
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlBasicAccordion_gvSalaryPayMode_ddlBankName_1']")
	WebElement BankName;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlBasicAccordion_gvSalaryPayMode_txtBranchId_1']")
	WebElement BranchID;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlBasicAccordion_gvSalaryPayMode_txtAccNo_1']")
	WebElement Account_No;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlBasicAccordion_gvSalaryPayMode_txtPercentage_1']")
	WebElement percenatageBank;
	
	
	@FindBy(xpath=".//span[@id='spnSalPayModeErr']")
	WebElement SalModeAlertMessage;
	
	
	@FindBy(xpath=".//input[@id='rbtHrlyRate' and @type='radio']")
	WebElement HourlyRate;
	
	@FindBy(xpath=".//input[@id='txtHrlyRate' and @type='text']")
	WebElement HourlyRatetextbox;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlBasicAccordion_btnComponent' and @type='button']")
	WebElement componentbutton;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_grdSalaryComponent_txtAmountN_0' and @type='text']")
	WebElement BasicFixAmount;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_grdSalaryComponent_txtAmountN_1' and @type='text']")
	WebElement VariabelFixAmount;
	
	@FindBy(xpath=".//input[@id='btnUpdPayMode' and @value='Update']")
	WebElement updatebutton_Component;
	
	@FindBy(xpath=".//select[@id='cboReligion']")
	WebElement Religion;
	
	@FindBy(xpath=".//select[@id='cboRace']")
	WebElement Race;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlAddAccord_gvFund_lblSelFund_1' and @type='checkbox']")
	WebElement Funcheckbox;
	
	@FindBy(xpath=".//select[@id='ddlEmploymentType']")
	WebElement Employement_Type;
	
	@FindBy(xpath=".//select[@id='cboFWL']")
	WebElement CPF;
	
	@FindBy(xpath=".//input[@id='txtPRApprovalDate']")
	WebElement PRApprovalDate;
	
	@FindBy(xpath=".//span[@id='spnEmploymentDetailsErr']")
	WebElement Employement_Error;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEPAYROLL_accEPayroll_pnlBasicAccordion_cboPayDayGroup']")
	WebElement paydaygroup;
	
	@FindBy(xpath=".//input[@id='rbtnTwiceMnth']")
	WebElement Twicemonth;

	@FindBy(xpath=".//span[@id='spnSalryDetails']")
	WebElement AlertBasicSalary;
	
	@FindBy(xpath=".//span[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_LblHeader']")
	WebElement EmailAlertmessage;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_gvEmpSearch_lnkEdit_0' and @class='btn editIcon']")
	WebElement editicon_staffmaster;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnUpdate' and @value='Update']")
	WebElement update_button;
	
	@FindBy(xpath=".//select[@id='cbIDType']")
	WebElement FinType;
	
	@FindBy(xpath=".//select[@id='ddlSup2']")
	WebElement secondApproval;
	
	@FindBy(xpath=".//select[@id='ddlSup1']")
	WebElement FirstApproval;
	
	@FindBy(xpath=".//select[@id='cbExcludeDays']")
	WebElement ExcludeDays;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_grdChildDetails_txtChildName_0' and @type='text']")
	WebElement childname;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_grdChildDetails_dtPickChildDOB_0' and @type='text']")
	WebElement DateofBirth;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_grdChildDetails_ddlChildGender_0']")
	WebElement childGender;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_grdChildDetails_txtBirthCertiNo_0']")
	WebElement BirthCertificate;
	
	@FindBy(xpath=".//select[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_grdChildDetails_ddlChildCitizen_0']")
	WebElement singaporecitizen;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_gvEmpSearch_lnkCopy_0']")
	WebElement copyicon_edit;
	
	@FindBy(xpath=".//input[@id='txtNewEmpCode' and @type='text']")
	WebElement copy_Empcode;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCCopyEmployee_btnCopy']")
	WebElement copy_button;
	
	@FindBy(xpath=".//span[@id='cvEmpCode']")
	WebElement Verify_copy_Empcode;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_tabEmployeeContainer_tabEmpBasic_grdChildDetails_lnkDeleteChild_0']")
	WebElement child_Delete;
	
	public Payrolls_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	public boolean Percentage() throws InterruptedException
	{ 
		Thread.sleep(4000);
		return new GenericHelper().isDisplayed(Percentage);
	}
	public void BasicSalary(String BasicSalary)
	{
		log.info("entering BasicSalary.." + BasicSalary);
		this.BasicSalary.sendKeys(BasicSalary);
	}
	public void BankName(String BankName)
	{
		log.info("entering BankName.." + BankName);
		this.BankName.sendKeys(BankName);
	}
	public void BranchID(String BranchID)
	{
		log.info("entering BranchID.." + BranchID);
		this.BranchID.sendKeys(BranchID);
	}
	public void Account_No(String Account_No)
	{
		log.info("entering Account_No.." + Account_No);
		this.Account_No.sendKeys(Account_No);
	}
	public void percenatageBank(String percenatageBank)
	{
		log.info("entering percenatageBank.." + percenatageBank);
		this.percenatageBank.sendKeys(percenatageBank);
	}
	
	public boolean SalModeAlertMessage() throws InterruptedException
	{
		
		return new GenericHelper().isDisplayed(SalModeAlertMessage);
	}
	
	public void HourlyRate() throws InterruptedException
	{
		HourlyRate.click();
	}
	public void HourlyRatetextbox(String HourlyRatetextbox)
	{
		log.info("entering HourlyRatetextbox.." + HourlyRatetextbox);
		this.HourlyRatetextbox.sendKeys(HourlyRatetextbox);
	}
	public void componentbutton() throws InterruptedException
	{
		componentbutton.click();
	}
	
	public void BasicFixAmount(String BasicFixAmount)
	{
		log.info("entering BasicFixAmount.." + BasicFixAmount);
		this.BasicFixAmount.sendKeys(BasicFixAmount);
	}
	public void VariabelFixAmount(String VariabelFixAmount)
	{
		log.info("entering VariabelFixAmount.." + VariabelFixAmount);
		this.VariabelFixAmount.sendKeys(VariabelFixAmount);
	}
	public void updatebutton_Component() throws InterruptedException
	{
		updatebutton_Component.click();
	}
	
	public void Religion(String Religion) {
		log.info("entering Religion.." + Religion);
		new Select(this.Religion).selectByVisibleText(Religion);
	}
	public void Race(String Race) {
		log.info("entering Race.." + Race);
		new Select(this.Race).selectByVisibleText(Race);
	}
	public boolean Funcheckbox() throws InterruptedException
	{
		return new GenericHelper().isSelected(Funcheckbox);
	}
	
	public void Employement_Type(String Employement_Type) {
		log.info("entering Race.." + Employement_Type);
		new Select(this.Employement_Type).selectByVisibleText(Employement_Type);
	}
	public void CPF(String CPF) {
		log.info("entering CPF.." + CPF);
		new Select(this.CPF).selectByVisibleText(CPF);
	}
	public void PRApprovalDate(String PRApprovalDate)
	{
		log.info("entering PRApprovalDate.." + PRApprovalDate);
		this.PRApprovalDate.sendKeys(PRApprovalDate);
	}
	
	public boolean Employement_Error() throws InterruptedException
	{
		
		return new GenericHelper().isDisplayed(Employement_Error);
	}
	public void paydaygroup(String paydaygroup) {
		log.info("entering Race.." + paydaygroup);
		new Select(this.paydaygroup).selectByVisibleText(paydaygroup);
	}
	public void Twicemonth() throws InterruptedException
	{
		Twicemonth.click();
	}
	
	public boolean AlertBasicSalary() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(AlertBasicSalary);
	}
	
	public boolean EmailAlertmessage() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(EmailAlertmessage);
	}
	public void editicon_staffmaster() throws InterruptedException
	{
		Thread.sleep(8000);
		editicon_staffmaster.click();
	}
	public void update_button() throws InterruptedException
	{
		update_button.click();
	}
	public void FinType(String FinType) {
		log.info("entering FinType.." + FinType);
		new Select(this.FinType).selectByVisibleText(FinType);
	}
	
	public void secondApproval(String secondApproval) {
		log.info("entering secondApproval.." + secondApproval);
		new Select(this.secondApproval).selectByVisibleText(secondApproval);
	}
	
	public void FirstApproval(String FirstApproval) {
		log.info("entering FirstApproval.." + FirstApproval);
		new Select(this.FirstApproval).selectByVisibleText(FirstApproval);
	}
	
	public void ExcludeDays(String ExcludeDays) {
		log.info("entering ExcludeDays.." + ExcludeDays);
		new Select(this.ExcludeDays).selectByVisibleText(ExcludeDays);
	}
	
	public void childname(String childname)
	{
		log.info("entering childname.." + childname);
		this.childname.sendKeys(childname);
	}
	
	public void DateofBirth(String DateofBirth)
	{
		log.info("entering DateofBirth.." + DateofBirth);
		this.DateofBirth.sendKeys(DateofBirth);
	}
	public void childGender(String childGender) {
		log.info("entering childGender.." + childGender);
		new Select(this.childGender).selectByVisibleText(childGender);
	}
	public void BirthCertificate(String BirthCertificate)
	{
		log.info("entering BirthCertificate.." + BirthCertificate);
		this.BirthCertificate.sendKeys(BirthCertificate);
	}
	
	public void singaporecitizen(String singaporecitizen) {
		log.info("entering singaporecitizen.." + singaporecitizen);
		new Select(this.singaporecitizen).selectByVisibleText(singaporecitizen);
	}

	public void copyicon_edit() throws InterruptedException
	{
		copyicon_edit.click();
	}
	
	public void copy_Empcode(String copy_Empcode)
	{
		log.info("entering copy_Empcode.." + copy_Empcode);
		this.copy_Empcode.sendKeys(copy_Empcode);
	}
	
	public void copy_button() throws InterruptedException
	{
		copy_button.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}
	
	public boolean Verify_copy_Empcode() throws InterruptedException
	{
		Thread.sleep(2000);
		return new GenericHelper().isDisplayed(Verify_copy_Empcode);
	}
	public void child_Delete() throws InterruptedException
	{
		child_Delete.click();
	}
	
}
