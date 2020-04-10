package com.cucumber.framework.Basic_Master_setup;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;

public class Department_page 
{
	WebDriver driver;
	Actions actions;
	
	private final Logger log = LoggerHelper.getLogger(Department_page.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//a[@id='lnkPageUrl' and @menu-caption='Basic Master Setup']")
	WebElement Basic_master_stepup;
	
	@FindBy(xpath=".//a[@id='lnkSubPageUrl' and @data-id='1102']")
	WebElement Department_icon;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_lnkManage']")
	WebElement Newbutton_Department;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtAddDeptCode']")
	WebElement Departmentcode;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtAddDeptName']")
	WebElement DepartmentName;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnSave' and @type='submit']")
	WebElement Department_save;
	
	@FindBy(xpath=".//a[@id='lnkSubPageUrl' and @data-id='1103']")
	WebElement Designation;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_lnkManage']")
	WebElement Designation_New;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtAddDesigCode']")
	WebElement Designation_code;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtAddDesigName']")
	WebElement Designation_Name;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnAdd']")
	WebElement Designation_save_button;
	
	@FindBy(xpath=".//a[@id='lnkSubPageUrl' and @data-id='1104']")
	WebElement Section_icon;
	
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtAddSecCode']")
	WebElement Section_code;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtAddSecName']")
	WebElement Section_name;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_dlDept_Input']")
	WebElement Department_dropdown;
	
	@FindBy(xpath=".//td[contains(text(),'PAYROLLDEPARTMENT')]")
	WebElement Department_list;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnAddNew']")
	WebElement save_Section;
	
	@FindBy(xpath=".//a[@id='lnkSubPageUrl' and @data-id='1105']")
	WebElement category_icon;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtCategoryCode']")
	WebElement category_code;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtCategoryName']")
	WebElement category_name;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_lnkManage']")
	WebElement category_Addbutton;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnAdd']")
	WebElement category_savebutton;
	
	@FindBy(xpath=".//a[@id='lnkSubPageUrl' and @data-id='1109']")
	WebElement Designation_Group;
	
	@FindBy(xpath=".//a[@id='ContentPlaceHolder1_lnkManage']")
	WebElement Designation_Group_newbutton;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtAddDesigCode']")
	WebElement Designation_Group_code;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_txtAddDesigName']")
	WebElement Designation_Group_name;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_btnAdd']")
	WebElement Designation_Group_save_button;
	
	
	
	
	
	
	
	public Department_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	public void Basic_master_stepup() throws InterruptedException
	{
		Thread.sleep(9000);
		actions = new Actions(driver);
		
		actions.moveToElement(Basic_master_stepup);
	}
	public void Department_icon() throws InterruptedException
	{
		Thread.sleep(9000);
		
		actions.moveToElement(Department_icon);
		
		actions.click().build().perform();
	}
	
	public void Newbutton_Department() throws InterruptedException
	{
		Newbutton_Department.click();
	}
	
	public void Departmentcode(String Departmentcode)
	{
		log.info("entering Departmentcode.." + Departmentcode);
		this.Departmentcode.sendKeys(Departmentcode);
	}
	public void DepartmentName(String DepartmentName)
	{
		log.info("entering DepartmentName.." + DepartmentName);
		this.DepartmentName.sendKeys(DepartmentName);
	}
	public void Department_save() throws InterruptedException
	{
		Department_save.click();
		Thread.sleep(8000);
	}
	public void Designation() throws InterruptedException
	{
		Thread.sleep(9000);
	
		actions.moveToElement(Designation);
	
		actions.click().build().perform();
	}
	
	public void Designation_New() throws InterruptedException
	{
		Thread.sleep(7000);
		Designation_New.click();
	}
	
	public void Designation_code(String Designation_code) throws InterruptedException
	{
		Thread.sleep(6000);
		log.info("entering Designation_code.." + Designation_code);
		this.Designation_code.sendKeys(Designation_code);
	}
	
	public void Designation_Name(String Designation_Name) throws InterruptedException
	{
		Thread.sleep(6000);
		log.info("entering Designation_Name.." + Designation_Name);
		this.Designation_Name.sendKeys(Designation_Name);
	}
	public void Designation_save_button() throws InterruptedException
	{
		Designation_save_button.click();
	}
	public void Section_icon() throws InterruptedException
	{
		Thread.sleep(9000);
		
		actions.moveToElement(Section_icon);
		
		actions.click().build().perform();
	}
	
	public void Section_code(String Section_code) throws InterruptedException
	{
		Thread.sleep(6000);
		log.info("entering Section_code.." + Section_code);
		this.Section_code.sendKeys(Section_code);
	}
	
	public void Section_name(String Section_name) throws InterruptedException
	{
		Thread.sleep(6000);
		log.info("entering Section_name.." + Section_name);
		this.Section_name.sendKeys(Section_name);
	}
	public void Department_dropdown() throws InterruptedException
	{
		Department_dropdown.click();
		
		Thread.sleep(3000);
		
		Department_list.click();
	}
	public void save_Section() throws InterruptedException
	{
		Thread.sleep(7000);
		save_Section.click();
	}
	
	public void category_icon() throws InterruptedException
	{
		Thread.sleep(6000);
		
		actions.moveToElement(category_icon);
		
		actions.click().build().perform();
	}
	public void category_Addbutton() throws InterruptedException
	{
		Thread.sleep(7000);
		category_Addbutton.click();
	}
	
	
	public void category_code(String category_code) throws InterruptedException
	{
		Thread.sleep(6000);
		log.info("entering category_code.." + category_code);
		this.category_code.sendKeys(category_code);
	}
	
	public void category_name(String category_name) throws InterruptedException
	{
		Thread.sleep(6000);
		log.info("entering category_name.." + category_name);
		this.category_name.sendKeys(category_name);
	}
	public void category_savebutton() throws InterruptedException
	{
		Thread.sleep(7000);
		category_savebutton.click();
	}
	public void Designation_Group() throws InterruptedException
	{
		Thread.sleep(6000);
		
		actions.moveToElement(Designation_Group);
		
		actions.click().build().perform();
	}
	
	public void Designation_Group_newbutton() throws InterruptedException
	{
		Thread.sleep(7000);
		Designation_Group_newbutton.click();
	}
	
	
	public void Designation_Group_code(String Designation_Group_code) throws InterruptedException
	{
		Thread.sleep(6000);
		log.info("entering Designation_Group_code.." + Designation_Group_code);
		this.Designation_Group_code.sendKeys(Designation_Group_code);
	}
	
	public void Designation_Group_name(String Designation_Group_name) throws InterruptedException
	{
		Thread.sleep(6000);
		log.info("entering Designation_Group_name.." + Designation_Group_name);
		this.Designation_Group_name.sendKeys(Designation_Group_name);
	}
	public void Designation_Group_save_button() throws InterruptedException
	{
		Thread.sleep(7000);
		Designation_Group_save_button.click();
	}
	
	
}
