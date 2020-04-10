package com.cucumber.framework.stepdefinition.InfoTech_cloud;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.cucumber.framework.InfoTech.Leave_Software;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Leave_Software_Step 
{
	private final Logger log = LoggerHelper.getLogger(Leave_Software_Step.class);

	Leave_Software leave;
	
	@Then("^click the change app button$")
	public void click_the_change_app_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leave = new Leave_Software(TestBase.driver);
		leave.changeapp();
	}

	@Then("^click the Info_Leave icon$")
	public void click_the_Info_Leave_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leave.Info_Leave();
	}
	@Then("^verify the leave software application is visible properly$")
	public void verify_the_leave_software_application_is_visible_properly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    if(leave.leave_software())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}
	
	@Then("^click the master icon$")
	public void click_the_master_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leave.master();
	}
	
	@Then("^click the Employee Basic Details$")
	public void click_the_Employee_Basic_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    leave.EmployeeDetails();
	}
	
	@Then("^verify employee name already grid list or not$")
	public void verify_employee_name_already_grid_list_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Thread.sleep(8000);
		   leave.Beforedeleteicon(); 
		}
		catch(Exception ie)
		{
			
		}
	}
	@Then("^Click the Delete confimation pop up \"([^\"]*)\"$")
	public void click_the_Delete_confimation_pop_up(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
		Thread.sleep(8000);
		   leave.BeforePasswordDeletepage(arg1);
		   
		   Thread.sleep(2000);
		   leave.BeforeDeletebutton();
		   
		}
		catch(Exception ie)
		{
			
		}
	}

	@Then("^click the New button$")
	public void click_the_New_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.Addbutton();
	}

	@Then("^Enter the Employee Code \"([^\"]*)\"$")
	public void enter_the_Employee_Code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leave.EnterEmpCode(arg1);
	}

	@Then("^Enter the Employee Name \"([^\"]*)\"$")
	public void enter_the_Employee_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		leave.EmpName();
	   leave.EnterEmpName(arg1);
	}

	@Then("^Select the Gender field \"([^\"]*)\"$")
	public void select_the_Gender_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.setYourAddressState(arg1);
	}

	@Then("^Select the Marital status \"([^\"]*)\"$")
	public void select_the_Marital_status(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    leave.MaritalStatus(arg1);
	}

	@Then("^Enter the Email Address \"([^\"]*)\"$")
	public void enter_the_Email_Address(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leave.Emailid();
	   leave.EnterEmailid(arg1);
	}

	@Then("^Enter the Mobile Number \"([^\"]*)\"$")
	public void enter_the_Mobile_Number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		leave.Mobileno();
	   leave.EnterMobileNo(arg1);
	}

	@Then("^Enter the Join Date \"([^\"]*)\"$")
	public void enter_the_Join_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.EnterJoinDate(arg1);
	}

	@Then("^Enter the NRIC number \"([^\"]*)\"$")
	public void enter_the_NRIC_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    leave.EnterNRIC(arg1);
	}

	@Then("^click the App Access$")
	public void click_the_App_Access() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.AppAccess();
	}
	
	

	@Then("^Select the final Approver \"([^\"]*)\"$")
	public void select_the_final_Approver(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  leave.firstlevelapprove(arg1);
	}

	@Then("^click the E Levae button button$")
	public void click_the_E_Levae_button_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.Eleve();
	}
	
	@Then("^click the Save button$")
	public void click_the_Save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(7000);
	    leave.savebutton();
	}
	@Then("^Verify the Employee Details successfully registered$")
	public void verify_the_Employee_Details_successfully_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(7000);
		if(leave.verifySuccessStaffDetails()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
		
		
		
	}

	@Then("^Enter the Employee name in search text field \"([^\"]*)\"$")
	public void enter_the_Employee_name_in_search_text_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
	    leave.SearchEmployeeDetails(arg1);
	    
	  //  leave.SearchEmployeeDetails(Keys.ENTER);
	    
	}
	@Then("^click the Search button$")
	public void click_the_Search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  leave.search();
	}
	@Then("^Delete the Employee Data in staff Details grid list$")
	public void delete_the_Employee_Data_in_staff_Details_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(8000);
	   leave.Deleteicon();
	}
	@Then("^Enter the password in Delete Confirmation pop up page \"([^\"]*)\"$")
	public void enter_the_password_in_Delete_Confirmation_pop_up_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	   leave.PasswordDeletepage(arg1);
	}
	

	@Then("^click the Delete  button in Delete confirmation pop up page\\.$")
	public void click_the_Delete_button_in_Delete_confirmation_pop_up_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
	   leave.Deletebutton();
	}

	@Then("^verify the Delete button is working properly$")
	public void verify_the_Delete_button_is_working_properly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	   
	   Thread.sleep(7000);
		if(leave.verifySuccessStaffDetails()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^Enter the Fin id number \"([^\"]*)\"$")
	public void enter_the_Fin_id_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.FaceId(arg1);
	}
	@Then("^click the Info Tms application$")
	public void click_the_Info_Tms_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leave.Info_TMS();
	}
	@Then("^verify the Time Attendance software application is visible properly$")
	public void verify_the_Time_Attendance_software_application_is_visible_properly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // leave.TMS_software();
	    Thread.sleep(7000);
		if(leave.TMS_software()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^select the claim Date Range name \"([^\"]*)\"$")
	public void select_the_claim_Date_Range_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.ClaimDateDRange(arg1);
	}

	@Then("^select the claim Date \"([^\"]*)\"$")
	public void select_the_claim_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.ClaimLimit(arg1); 
	}
	@Then("^click the Info claims application$")
	public void click_the_Info_claims_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.INFOCLAIM();
	}

	@Then("^verify the Eclaim  software application is visible properly$")
	public void verify_the_Eclaim_software_application_is_visible_properly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(7000);
			if(leave.claim_software())
			{
				log.info("login test is pass");
			}
			else{
				Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			}
	}
	
	@Then("^Select the final Approver in Eclaim \"([^\"]*)\"$")
	public void select_the_final_Approver_in_Eclaim(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    leave.FinalApprover(arg1);
	}
	
	@Then("^click the Info Payroll application$")
	public void click_the_Info_Payroll_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.INFOPAY();
	}

	@Then("^verify the Payroll software application is visible properly$")
	public void verify_the_Payroll_software_application_is_visible_properly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(7000);
			if(leave.PAYROLLsoftware())
			{
				log.info("login test is pass");
			}
			else{
				Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			}
	}

	@Then("^click the Birth date \"([^\"]*)\"$")
	public void click_the_Birth_date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.PAYDate(arg1);
	}
	
	@Then("^Select the Employee cpf \"([^\"]*)\"$")
	public void select_the_Employee_cpf(String arg1) throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
	   leave.EmployeeCPF(arg1);
	}
	
	
	@Then("^Select the Nationlaity in Additional Tab \"([^\"]*)\"$")
	public void select_the_Nationlaity_in_Additional_Tab(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leave.Nationality(arg1);
	}
	@Then("^click the Additional button$")
	public void click_the_Additional_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leave.Additionalbutton();
	}

	@Then("^click the ok button in Alert message$")
	public void click_the_ok_button_in_Alert_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		TestBase.driver.switchTo().alert().accept();
	}
	
	
	@Then("^clear the Employee name details$")
	public void clear_the_Employee_name_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leave.clearEmployeeDetaiils();
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
