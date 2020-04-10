package com.cucumber.framework.stepdefinition.Payroll_Initialize;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.Payroll_page.Payroll_Initialize_page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;


public class Payroll_All_Employee {

	
	private final Logger log = LoggerHelper.getLogger(Payroll_All_Employee.class);

	Payroll_Initialize_page payroll_init;
	
	@Then("^click the Montly Activity menu$")
	public void click_the_Montly_Activity_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init = new Payroll_Initialize_page(TestBase.driver);
		Thread.sleep(8000);
		payroll_init.MonthlyActivity();
	}

	@Then("^click the payroll initialize icon$")
	public void click_the_payroll_initialize_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		payroll_init.Payroll_initialize();
	}
	
	@Then("^Enter the Employee name in payroll searh field \"([^\"]*)\"$")
	public void enter_the_Employee_name_in_payroll_searh_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		payroll_init.payroll_search(arg1);
	}
	
	@Then("^click the search icon in payroll$")
	public void click_the_search_icon_in_payroll() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.search_icon();
	}
	@Then("^verify employee name is displayed in All Employee list$")
	public void verify_employee_name_is_displayed_in_All_Employee_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(payroll_init.payroll_empname()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	@Then("^click the checkbox for Payroll initialize$")
	public void click_the_checkbox_for_Payroll_initialize() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.payroll_initialize_checkbox();
	}

	@Then("^click the Initialize button$")
	public void click_the_Initialize_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		payroll_init = new Payroll_Initialize_page(TestBase.driver);
		payroll_init.Initialize_button();
	}
	@Then("^click the Radio button in Initialized field$")
	public void click_the_Radio_button_in_Initialized_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		payroll_init.Initialize_Radio_button();
	}

	@Then("^verify the employee displayed in initialized grid list$")
	public void verify_the_employee_displayed_in_initialized_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		
		if(payroll_init.payroll_empname()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	@Then("^click the Not Initializa radio button$")
	public void click_the_Not_Initializa_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(9000);
		payroll_init.Not_Initialize_button();
	}
	
	
	@Then("^Verify the Not Initialize employees$")
	public void verify_the_Not_Initialize_employees() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(7000);
		if(payroll_init.payroll_NotInitempname()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
		
		TestBase.driver.navigate().refresh();
	}
	
	@Then("^click the Department radio button$")
	public void click_the_Department_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.Department_radio_button();
	}
	
	@Then("^click the Department Initialize check box button$")
	public void click_the_Department_Initialize_check_box_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.Department_checkbox();
	}

	@Then("^Verify the correct Department name is displayed in all employee$")
	public void verify_the_correct_Department_name_is_displayed_in_all_employee() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(7000);
		if(payroll_init.Department_name()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	@Then("^click the section radio button$")
	public void click_the_section_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.section_radiobutton();
	}

	@Then("^choose the Department in Radio button$")
	public void choose_the_Department_in_Radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.Section_Department_dropdownlist();
	}

	@Then("^verify the Section name is displayed in All employee$")
	public void verify_the_Section_name_is_displayed_in_All_employee() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(7000);
		if(payroll_init.Verify_the_section_name()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	@Then("^click the Designation radio button$")
	public void click_the_Designation_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.Designation_radio_button();
	}

	@Then("^Enter the Designation name in search field \"([^\"]*)\"$")
	public void enter_the_Designation_name_in_search_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.Designation_searchfield(arg1);
	}

	@Then("^verify the Designation name in grid list$")
	public void verify_the_Designation_name_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		Thread.sleep(3000);
		if(payroll_init.Designation_grid_list()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	
	@Then("^click the category radio button$")
	public void click_the_category_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.category_radio_button();
	}

	@Then("^verify the category name is displayed in grid list$")
	public void verify_the_category_name_is_displayed_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		if(payroll_init.Verify_category_name()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	@Then("^click the Designation group icon$")
	public void click_the_Designation_group_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.Designation_Group_radio_button();
	}

	@Then("^Verify the Designation group in grid list$")
	public void verify_the_Designation_group_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		if(payroll_init.Verify_Designation_Group()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	
	@Then("^click the paygroup radio button$")
	public void click_the_paygroup_radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.Paygroup_radio_button();
	}

	@Then("^Verify the Paygroup name in grid list$")
	public void verify_the_Paygroup_name_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		if(payroll_init.Verify_Paygroup()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	
	@Then("^click the Section Initialize check box button$")
	public void click_the_Section_Initialize_check_box_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init.section_Name_checkbox();
		
	}
	
	@Then("^click the ok button in update confirmation$")
	public void click_the_ok_button_in_update_confirmation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init = new Payroll_Initialize_page(TestBase.driver);
		Thread.sleep(12000);
		try
		{
			payroll_init.Update_Ok_button();
		}
		catch(Exception ie)
		{
			System.out.println("ok button is not visible");
		}
	}
	
	@Then("^Enter the mid month percentage \"([^\"]*)\"$")
	public void enter_the_mid_month_percentage(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init = new Payroll_Initialize_page(TestBase.driver);
		payroll_init.Enter_MidMonth_Per(arg1);
	}
	@Then("^Select the Category group field \"([^\"]*)\"$")
	public void select_the_Category_group_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_init = new Payroll_Initialize_page(TestBase.driver);
		payroll_init.Select_category(arg1);
	}


}
