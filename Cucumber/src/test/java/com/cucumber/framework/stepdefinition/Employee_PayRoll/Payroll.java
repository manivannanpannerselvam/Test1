package com.cucumber.framework.stepdefinition.Employee_PayRoll;

import org.apache.log4j.Logger;


import org.testng.Assert;


import com.cucumber.framework.Payroll_page.Payrolls_page;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Payroll 
{
	private final Logger log = LoggerHelper.getLogger(Payroll.class);

	Payrolls_page payroll;
	

	@Then("^Verify the percentage in salary mode$")
	public void verify_the_percentage_in_salary_mode() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
		if(payroll.Percentage())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
		
	}
	
	@Then("^Enter the Basic salary \"([^\"]*)\"$")
	public void enter_the_Basic_salary(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
		payroll.BasicSalary(arg1);
	}

	@Then("^Choose the Bank Name \"([^\"]*)\"$")
	public void choose_the_Bank_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll.BankName(arg1);
	}

	@Then("^Enter the Branch Id \"([^\"]*)\"$")
	public void enter_the_Branch_Id(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    payroll.BranchID(arg1);
	}

	@Then("^Enter the Ac/No \"([^\"]*)\"$")
	public void enter_the_Ac_No(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   payroll.Account_No(arg1);
	}
	@Then("^Enter the Percentage \"([^\"]*)\"$")
	public void enter_the_Percentage(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll.percenatageBank(arg1);
	}
	@Then("^Verify the Alert message in Paysal mode$")
	public void verify_the_Alert_message_in_Paysal_mode() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		if(payroll.SalModeAlertMessage())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^click the Hourly Rate$")
	public void click_the_Hourly_Rate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
	    payroll.HourlyRate();
	}

	@Then("^Enter the Hourly Rate \"([^\"]*)\"$")
	public void enter_the_Hourly_Rate(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   payroll.HourlyRatetextbox(arg1);
	}
	@Then("^click the component button$")
	public void click_the_component_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  payroll.componentbutton();
	}

	@Then("^enter the fixed Amount for Basic Salary \"([^\"]*)\"$")
	public void enter_the_fixed_Amount_for_Basic_Salary(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    payroll.BasicFixAmount(arg1);
	}

	@Then("^Enter the Variable Component for fixed amount \"([^\"]*)\"$")
	public void enter_the_Variable_Component_for_fixed_amount(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   payroll.VariabelFixAmount(arg1);
	}

	@Then("^click the Update button in component pop up$")
	public void click_the_Update_button_in_component_pop_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  payroll.updatebutton_Component();
	  Thread.sleep(7000);
	  
	  TestBase.driver.switchTo().alert().accept();
	}
	@Then("^Select the Religion \"([^\"]*)\"$")
	public void select_the_Religion(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   payroll.Religion(arg1);
	}

	@Then("^Select the Race \"([^\"]*)\"$")
	public void select_the_Race(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    payroll.Race(arg1);
	}

	@Then("^verify the fund selected checkbox$")
	public void verify_the_fund_selected_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(payroll.Funcheckbox())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	
	@Then("^Select the Employement Type \"([^\"]*)\"$")
	public void select_the_Employement_Type(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
		payroll.Employement_Type(arg1);
	}
	@Then("^Select the CPF/FWL field \"([^\"]*)\"$")
	public void select_the_CPF_FWL_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    payroll.CPF(arg1);
	}

	

	@Then("^Enter the PR Approval Date \"([^\"]*)\"$")
	public void enter_the_PR_Approval_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll.PRApprovalDate(arg1);
	}
	@Then("^Verify the Alert message should bd displayed in Employment Details$")
	public void verify_the_Alert_message_should_bd_displayed_in_Employment_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(payroll.Employement_Error())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^Select the PayDay Group \"([^\"]*)\"$")
	public void select_the_PayDay_Group(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
	   payroll.paydaygroup(arg1);
	}

	@Then("^click the Twice a group button$")
	public void click_the_Twice_a_group_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   payroll.Twicemonth();
	}
	@Then("^Verify the Alert message in Basic Salary$")
	public void verify_the_Alert_message_in_Basic_Salary() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
		if(payroll.AlertBasicSalary())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^Alert message should be displayed$")
	public void alert_message_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
		if(payroll.EmailAlertmessage())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^Edit the icon in staff master$")
	public void edit_the_icon_in_staff_master() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
	   payroll.editicon_staffmaster();
	}
	@Then("^click the Update button in Staff details$")
	public void click_the_Update_button_in_Staff_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   payroll.update_button();
	}
	@Then("^Verify the Employee Details shouldn't accept duplicate values$")
	public void verify_the_Employee_Details_shouldn_t_accept_duplicate_values() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("^Select the IdType \"([^\"]*)\"$")
	public void select_the_IdType(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll = new Payrolls_page(TestBase.driver);
		payroll.FinType(arg1);
	}
	
	@Then("^Select the second level Approver \"([^\"]*)\"$")
	public void select_the_second_level_Approver(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		payroll = new Payrolls_page(TestBase.driver);
		payroll.secondApproval(arg1);
	}

	@Then("^Select the First level Approver \"([^\"]*)\"$")
	public void select_the_First_level_Approver(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	    payroll.FirstApproval(arg1);
	}

	@Then("^Select the Exclude Days \"([^\"]*)\"$")
	public void select_the_Exclude_Days(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	   payroll.ExcludeDays(arg1);
	}
	@Then("^Enter the Children name details \"([^\"]*)\"$")
	public void enter_the_Children_name_details(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		payroll = new Payrolls_page(TestBase.driver);
	    payroll.childname(arg1);
	}

	@Then("^Enter the date of Birth \"([^\"]*)\"$")
	public void enter_the_date_of_Birth(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   payroll.DateofBirth(arg1);
	}

	@Then("^Select the Gender details \"([^\"]*)\"$")
	public void select_the_Gender_details(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    payroll.childGender(arg1);
	}

	@Then("^Enter the Birthcertificate number \"([^\"]*)\"$")
	public void enter_the_Birthcertificate_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   payroll.BirthCertificate(arg1);
	   
	}

	@Then("^Select the singapore citizen \"([^\"]*)\"$")
	public void select_the_singapore_citizen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    payroll.singaporecitizen(arg1);
	}
	
	@Then("^click the copy icon in staff master$")
	public void click_the_copy_icon_in_staff_master() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		payroll = new Payrolls_page(TestBase.driver);
	    payroll.copyicon_edit();
	}

	@Then("^Enter the New Employye code \"([^\"]*)\"$")
	public void enter_the_New_Employye_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			Thread.sleep(9000);
	     payroll.copy_Empcode(arg1);
	}

	@Then("^click the copy button$")
	public void click_the_copy_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	  payroll.copy_button();
	}
	@Then("^verify the Employee code alert message$")
	public void verify_the_Employee_code_alert_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(payroll.Verify_copy_Empcode())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^click the Delete button in children details$")
	public void click_the_Delete_button_in_children_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    payroll.child_Delete();
	}
}
