package com.cucumber.framework.Payroll_page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Payroll_Excel_Import {
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Payroll_Excel_Import.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath=".//input[@id='txtBasicSalary']")
	WebElement Salarygettext;
	
	@FindBy(xpath=".//a[@id='lnkPageUrl' and @menu-caption='Payroll Excel Import']")
	WebElement PayrollExcel_import;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabPayrollExcelImport_tabGenerate_UCEPayrollInfoGrid_gvEmpList_chkAll']")
	WebElement payroll_Excel_checkbox;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabPayrollExcelImport_tabGenerate_btnNext']")
	WebElement payroll_Next_button;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabPayrollExcelImport_tabGenerate_btnGenerate']")
	WebElement payroll_Export_Button;
	
	@FindBy(xpath=".//span[contains(text(),'Import Excel Template ')]")
	WebElement ImportExcel_Templete;
	
	@FindBy(xpath=".//input[@id='fuImport']")
	WebElement choose_file;
	
	@FindBy(xpath=".//input[@id='ContentPlaceHolder1_tabPayrollExcelImport_tabImport_btnImportExcel']")
	WebElement import_button;
	
	@FindBy(xpath=".//span[contains(text(),'Status: Processed, Please see the status below')]")
	WebElement verify__Importfile;
	
	public Payroll_Excel_Import(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//waitHelper = new WaitHelper(driver);
	//	waitHelper.waitForElement(driver, signin,ObjectRepo.reader.getExplicitWait());
	}
	
	public void PayrollExcel_import() throws InterruptedException
	{
		Thread.sleep(6000);
		PayrollExcel_import.click();
	}
	public void payroll_Excel_checkbox() throws InterruptedException
	{
		Thread.sleep(6000);
		payroll_Excel_checkbox.click();
	}
	public void payroll_Next_button() throws InterruptedException
	{
		Thread.sleep(6000);
		payroll_Next_button.click();
	}
	public void payroll_Export_Button() throws InterruptedException
	{
		Thread.sleep(6000);
		payroll_Export_Button.click();
	}
	public void ImportExcel_Templete() throws InterruptedException
	{
		Thread.sleep(6000);
		ImportExcel_Templete.click();
	}
	
	public void choose_file() throws InterruptedException
	{
		Thread.sleep(6000);
		//choose_file.click();
		
		choose_file.sendKeys("C:\\Users\\Mani\\git\\tests\\Cucumber\\src\\test\\resources\\testData\\InfoExcelImport.xlsx");
	}
	public void import_button() throws InterruptedException
	{
		Thread.sleep(6000);
		import_button.click();
	}
	public boolean verify__Importfile() throws InterruptedException
	{
		return new GenericHelper().isDisplayed(verify__Importfile);
	}
}
