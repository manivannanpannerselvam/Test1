package com.cucumber.framework.stepdefinition.Payroll_Initialize;

import java.io.File;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.cucumber.framework.Payroll_page.Payroll_Excel_Import;
import com.cucumber.framework.Payroll_page.Payroll_Initialize_page;
import com.cucumber.framework.Payroll_page.Salary_Adjustment_page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.helper.genericHelper.DataHelper;

import cucumber.api.java.en.Then;

public class Payroll_Excel_Import_step {
	
	private final Logger log = LoggerHelper.getLogger(Payroll_Excel_Import_step.class);
	private static DecimalFormat df = new DecimalFormat("00.00");
	Payroll_Excel_Import payroll_Excel;
	
	public List<HashMap<String,String>> datamap;
	public Payroll_Excel_Import_step()
    {
    	
     	datamap = DataHelper.data(System.getProperty("user.dir")+"//src//test//resources//testData/InfoExcelImport.xlsx","Data");
    }
	
	


	
	@Then("^I contact the customer service with excel row \"([^\"]*)\" dataset$")
	public void i_contact_the_customer_service_with_excel_row_dataset(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_Excel = new Payroll_Excel_Import(TestBase.driver);
		int index = Integer.parseInt(arg1)-1;
		

		System.out.println("INdexxcccccccccccccccc"+ index);
	    System.out.println("Printing current data set...");
	    
	    for(HashMap h:datamap)
	    {
	        System.out.println(h.keySet());
	        System.out.println(h.values());
	        
	    
	    }
	  
	    	Thread.sleep(9000);
	   // Select subjectHeading = new Select(TestBase.driver.findElement(By.id("id_contact")));
	  //  subjectHeading.selectByVisibleText(datamap.get(index).get("heading"));
	    	
	    	
	   TestBase.driver.findElement(By.xpath(".//input[@id='ContentPlaceHolder1_txtEmpSearchText']")).sendKeys(datamap.get(index).get("Employee Name"));
	   TestBase.driver.findElement(By.xpath(".//button[@class='btn bgInfo']")).click();
	   TestBase.driver.findElement(By.xpath(".//a[@id='ContentPlaceHolder1_gvEmpSearch_lnkEdit_0']")).click();
	   Thread.sleep(8000);
	   TestBase.driver.findElement(By.xpath(".//span[contains(text(),'E-PAYROLL')]")).click();
	   String BasicSalary=TestBase.driver.findElement(By.xpath(".//input[@id='txtBasicSalary']")).getAttribute("value");
	   System.out.println("Basic Employee sal in web"+ BasicSalary);
	   String Excelvalue=datamap.get(index).get("#BAS - Basic Salary");
	   System.out.println("Basic Employee from Excel sheet data "+ Excelvalue);
	   double Excelvalues = Double.parseDouble(Excelvalue);
	   System.out.println("Basic Employee from Excel  sheet data "+ Excelvalues);
	   System.out.println(String.format("%.2f", Excelvalues));
	   //System.out.println("Basic Employee from Excel  sheet data "+ d);
	   
	  // System.out.println("Basic Employee Excel sheet "+df.format(datamap.get(index).get("#BAS - Basic Salary")));
	   if(BasicSalary.equals(String.format("%.2f", Excelvalues)))
		{
		System.out.println("Basic Salary Employee Details Correct");
		}
		else
		{
			System.out.println("Basic Salary Employee Details is not Correct");
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	    
	   // TestBase.driver.findElement(By.xpath(".//input[@id='txtPassword']")).sendKeys(datamap.get(index).get("order_reference"));
	   // TestBase.driver.findElement(By.id("message")).sendKeys(datamap.get(index).get("message"));
	  //  TestBase.driver.findElement(By.id("submitMessage")).sendKeys(datamap.get(index).get("message"));
	    Thread.sleep(9000);
	  
	    
	    
	}
	
	@Then("^click the payroll Excel Import$")
	public void click_the_payroll_Excel_Import() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_Excel = new Payroll_Excel_Import(TestBase.driver);
		
		payroll_Excel.PayrollExcel_import();
		
	}

	@Then("^click the All checkbox in payroll Excel Import$")
	public void click_the_All_checkbox_in_payroll_Excel_Import() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_Excel.payroll_Excel_checkbox();
	}

	@Then("^click the Next button in payroll$")
	public void click_the_Next_button_in_payroll() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_Excel.payroll_Next_button();
	}

	@Then("^Delete the Previous Excel file$")
	public void delete_the_Previous_Excel_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
    		
    		
    		File file = new File("C:\\Users\\Mani\\git\\tests\\Cucumber\\src\\test\\resources\\testData\\InfoExcelImport.xlsx");
        	
    		
    		
    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
    	   
    	}catch(Exception e){
    		
    		e.printStackTrace();
    		
    	}
	}

	@Then("^click the Export button$")
	public void click_the_Export_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		 Map<String, Object> prefs = new HashMap<String, Object>();
         
	        // Use File.separator as it will work on any OS
	        prefs.put("download.default_directory",
	                System.getProperty("user.dir") + File.separator + "testData");
	         
	        // Adding cpabilities to ChromeOptions
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("prefs", prefs);
	         
	        // Printing set download directory
	        System.out.println(options.getExperimentalOption("prefs"));
	        Thread.sleep(7000);
		payroll_Excel.payroll_Export_Button();
	}
	
	@Then("^click the Import Excel Templete$")
	public void click_the_Import_Excel_Templete() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_Excel.ImportExcel_Templete();
	}

	@Then("^click the Import button$")
	public void click_the_Import_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_Excel.choose_file();
		
		
	}
	@Then("^import the file then click  the import button$")
	public void import_the_file_then_click_the_import_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_Excel.import_button();
	}
	
	@Then("^verify  uploaded the Excel file$")
	public void verify_uploaded_the_Excel_file() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//payroll_Excel.verify__Importfile();
		if(payroll_Excel.verify__Importfile()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}

}
