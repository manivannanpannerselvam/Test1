package com.cucumber.framework.Payroll_page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Payroll_Initialize_page {
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Payroll_Initialize_page.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//span[contains(text(),'Monthly Activity')]")
	WebElement MonthlyActivity;
	
	@FindBy(xpath=".//a[@id='lnkPageUrl' and @menu-caption='Payroll Initialize']")
	WebElement Payroll_initialize;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_txtGlobalSearch']")
	WebElement payroll_search;
	
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_lnkSearch']")
	WebElement search_icon;
	
	@FindBy(xpath=".//span[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_gvEmpList_lblEmpName_0']")
	WebElement payroll_empname;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_gvEmpList_chkEmp_0' and @type='checkbox']")
	WebElement payroll_initialize_checkbox;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnInitialize' and @value='Initialize']")
	WebElement Initialize_button;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_optInitialize' and @type='radio']")
	WebElement Initialize_Radio_button;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_optNotInitialize' and @type='radio']")
	WebElement Not_Initialize_button;
	
	@FindBy(xpath=".//td[contains(text(),'No records found')]")
	WebElement verify_not_initialized;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_rbCategories_1' and @type='radio']")
	WebElement Department_radio_button;
	
	@FindBy(xpath=".//span[contains(text(),'PAYROLLDEPARTMENT')]")
	WebElement Department_name;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_rbCategories_2' and @type='radio']")
	WebElement section_radiobutton;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_cbDept_Input']")
	WebElement Section_Department_dropdownlist;
	
	@FindBy(xpath=".//td[contains(text(),'PAYROLLDEPARTMENT')]")
	WebElement Section_Department_name_dropdown_list;
	
	@FindBy(xpath=".//td[contains(text(),'PAYROLLDEPARTMENT')]")
	WebElement Verify_the_section_name;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_rbCategories_3' and @type='radio']")
	WebElement Designation_radio_button;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_txtGlobalSearch']")
	WebElement Designation_searchfield;
	
	@FindBy(xpath=".//span[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_gvDesignation_lblDesigName_0']")
	WebElement Designation_grid_list;
	
	@FindBy(xpath=".//span[contains(text(),'PAYROLLCATEGORY')]")
	WebElement Verify_category_name;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_rbCategories_4']/following::label[contains(text(),'Category ')]")
	WebElement category_radio_button;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_rbCategories_5']/following::label[contains(text(),'Designation Group')]")
	WebElement Designation_Group_radio_button;
	
	@FindBy(xpath=".//span[contains(text(),'PAYROLL_DESIGNATION')]")
	WebElement Verify_Designation_Group;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_rbCategories_6']/following::label[contains(text(),'PayGroup ')]")
	WebElement Paygroup_radio_button;
	
	@FindBy(xpath=".//span[contains(text(),'5 WORKING DAYS')]")
	WebElement Verify_Paygroup;
	
	
	@FindBy(xpath=".//span[@data-text='DEPT00']/following::input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_gvDept_chkDept_2' and @type='checkbox']")
	WebElement Department_checkbox;
	
	
	@FindBy(xpath=".//span[@data-text='SEC005']/following::input[@id='ContentPlaceHolder1_UCEPayrollInfoGrid_gvSection_chkSection_0']")
	WebElement section_Name_checkbox;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnSavePyarollAfterC']")
	WebElement Update_Ok_button;
	
	@FindBy(xpath=".//input[@id='txtMidMonthPay']")
	WebElement Enter_MidMonth_Per;
	
	
	@FindBy(xpath=".//select[@id='dlCategory']")
	WebElement Select_category;
	
	public Payroll_Initialize_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	
	public void MonthlyActivity() throws InterruptedException
	{
		Thread.sleep(9000);
		MonthlyActivity.click();
	}
	
	public void Payroll_initialize() throws InterruptedException
	{
		Thread.sleep(9000);
		Payroll_initialize.click();
	}
	
	public void payroll_search(String payroll_search)
	{
		log.info("entering payroll_search.." + payroll_search);
		this.payroll_search.sendKeys(payroll_search);
	}
	
	public void search_icon() throws InterruptedException
	{
		search_icon.click();
	}
	
	public boolean payroll_empname() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(payroll_empname);
	}
	public boolean payroll_NotInitempname() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(verify_not_initialized);
	}
	public void payroll_initialize_checkbox() throws InterruptedException
	{
		Thread.sleep(4000);
		payroll_initialize_checkbox.click();
	}
	public void Initialize_button() throws InterruptedException
	{
		Thread.sleep(4000);
		Initialize_button.click();
	}
	
	public void Initialize_Radio_button() throws InterruptedException
	{
		Thread.sleep(12000);
		Initialize_Radio_button.click();
	}
	public void Not_Initialize_button() throws InterruptedException
	{
		Thread.sleep(9000);
		Not_Initialize_button.click();
	}
	public void Department_radio_button() throws InterruptedException
	{
		Thread.sleep(7000);
		Department_radio_button.click();
	}
	
	public boolean Department_name() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(Department_name);
	}
	
	public void section_radiobutton() throws InterruptedException
	{
		Thread.sleep(7000);
		section_radiobutton.click();
	}
	
	public void Section_Department_dropdownlist() throws InterruptedException
	{
		Thread.sleep(7000);
		Section_Department_dropdownlist.click();
		
		Thread.sleep(3000);
		
		Section_Department_name_dropdown_list.click();
	}
	
	public boolean Verify_the_section_name() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(Verify_the_section_name);
	}
	
	public void Designation_radio_button() throws InterruptedException
	{
		Thread.sleep(7000);
		Designation_radio_button.click();
		Thread.sleep(7000);
		
		Designation_searchfield.clear();
	}
	
	public void Designation_searchfield() throws InterruptedException
	{
		
		Thread.sleep(7000);
		
		Designation_searchfield.clear();
	}

	public void Designation_searchfield(String Designation_searchfield) throws InterruptedException
	{
		Thread.sleep(9000);
		
		
		log.info("entering Designation_searchfield.." + Designation_searchfield);
		this.Designation_searchfield.sendKeys(Designation_searchfield);
	}
	public boolean Designation_grid_list() throws InterruptedException
	{
		Thread.sleep(8000);
		return new GenericHelper().isDisplayed(Designation_grid_list);
	}
	
	public void category_radio_button() throws InterruptedException
	{
		Thread.sleep(7000);
		category_radio_button.click();
	}
	
	public boolean Verify_category_name() throws InterruptedException
	{
		Thread.sleep(8000);
		return new GenericHelper().isDisplayed(Verify_category_name);
	}
	
	public void Designation_Group_radio_button() throws InterruptedException
	{
		Thread.sleep(7000);
		Designation_Group_radio_button.click();
	}
	
	public boolean Verify_Designation_Group() throws InterruptedException
	{
		Thread.sleep(8000);
		return new GenericHelper().isDisplayed(Verify_Designation_Group);
	}
	
	public void Paygroup_radio_button() throws InterruptedException
	{
		Thread.sleep(7000);
		Paygroup_radio_button.click();
	}
	
	public boolean Verify_Paygroup() throws InterruptedException
	{
		Thread.sleep(8000);
		return new GenericHelper().isDisplayed(Verify_Paygroup);
	}
	
	public void Department_checkbox() throws InterruptedException
	{
		Thread.sleep(7000);
		Department_checkbox.click();
	}
	
	public void section_Name_checkbox() throws InterruptedException
	{
		Thread.sleep(7000);
		section_Name_checkbox.click();
	}
	public void Update_Ok_button() throws InterruptedException
	{
		Thread.sleep(9000);
		Update_Ok_button.click();
	}
	public void Enter_MidMonth_Per(String Enter_MidMonth_Per) throws InterruptedException
	{
		Thread.sleep(6000);
		
		
		log.info("entering Enter_MidMonth_Per.." + Enter_MidMonth_Per);
		this.Enter_MidMonth_Per.sendKeys(Enter_MidMonth_Per);
	}
	public void Select_category(String Select_category) throws InterruptedException
	{
		Thread.sleep(6000);
		
		
		log.info("entering Select_category.." + Select_category);
		this.Select_category.sendKeys(Select_category);
	}
}
