package com.cucumber.framework.stepdefinition.Payroll_Initialize;



import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;




import com.cucumber.framework.Payroll_page.Salary_Adjustment_page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.helper.genericHelper.DataHelper;

import cucumber.api.java.en.Then;

public class SalaryAdjustment_step {

	//public List<HashMap<String,String>> datamap;
	/*
	public SalaryAdjustment_step()
    {
    	
     	datamap = DataHelper.data(System.getProperty("user.dir")+"//src//test//resources//testData/default.xlsx","Sheet1");
    }/*/
	private final Logger log = LoggerHelper.getLogger(SalaryAdjustment_step.class);

	Salary_Adjustment_page SalaryAdjustment;
	
	@Then("^click the Salary Adjustment icon$")
	public void click_the_Salary_Adjustment_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		SalaryAdjustment = new Salary_Adjustment_page(TestBase.driver);
		SalaryAdjustment.Salary_Adjustment_icon();
	}
	
	@Then("^Enter the Employee name in Salary Adjustment search field \"([^\"]*)\"$")
	public void enter_the_Employee_name_in_Salary_Adjustment_search_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		TestBase.driver.navigate().refresh();
		Thread.sleep(9000);
		SalaryAdjustment.Search_Adjustment(arg1);
	}
	
	@Then("^click the search icon in salary Adjustment$")
	public void click_the_search_icon_in_salary_Adjustment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		SalaryAdjustment.search_icon();
	}

	@Then("^click the Edit  icon in salary Adjustment employee user$")
	public void click_the_Edit_icon_in_salary_Adjustment_employee_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		SalaryAdjustment.Edit_salaryAdjustment_user();
	}

	@Then("^click the Lock icon in salary Adjustment$")
	public void click_the_Lock_icon_in_salary_Adjustment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		SalaryAdjustment.Lock_salaryAdjustment_user();
	}
	

@Then("^click the No button for confirmation alert message$")
public void click_the_No_button_for_confirmation_alert_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(6000);
	SalaryAdjustment.No_Alert_Message();
}
	
@Then("^click the Unlock the button in salary Adjustment$")
public void click_the_Unlock_the_button_in_salary_Adjustment() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(6000);
	SalaryAdjustment.Unlock_slaryAdjustment();
}	
/*
@Then("^I contact the customer service with excel row \"([^\"]*)\" dataset$")
public void i_contact_the_customer_service_with_excel_row_dataset(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	SalaryAdjustment = new Salary_Adjustment_page(TestBase.driver);
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
    	
    	
    TestBase.driver.findElement(By.xpath(".//input[@id='txtLogin']")).sendKeys(datamap.get(index).get("email"));
    TestBase.driver.findElement(By.xpath(".//input[@id='txtPassword']")).sendKeys(datamap.get(index).get("order_reference"));
   // TestBase.driver.findElement(By.id("message")).sendKeys(datamap.get(index).get("message"));
  //  TestBase.driver.findElement(By.id("submitMessage")).sendKeys(datamap.get(index).get("message"));
    Thread.sleep(9000);
  
    
    
}*/

	
	@Then("^click the Update button in Salary Adjustment$")
	public void click_the_Update_button_in_Salary_Adjustment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		
		
	}
	
	
	
	
	
	
	
	
	/*
	
	
	
	
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
	*/
}
