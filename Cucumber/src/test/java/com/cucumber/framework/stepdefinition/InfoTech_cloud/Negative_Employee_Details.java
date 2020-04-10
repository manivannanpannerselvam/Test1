package com.cucumber.framework.stepdefinition.InfoTech_cloud;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.InfoTech.Leave_Software;
import com.cucumber.framework.InfoTech.Negative_Scenario_Employee_Detail_Page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Negative_Employee_Details 
{
	private final Logger log = LoggerHelper.getLogger(Negative_Employee_Details.class);
	
	
	Negative_Scenario_Employee_Detail_Page leaves;
	
	@Then("^Enter the Valid  Employee code \"([^\"]*)\"$")
	public void enter_the_Valid_Employee_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leaves = new Negative_Scenario_Employee_Detail_Page(TestBase.driver);
	   leaves.EnterEmpCodes(arg1);
	}

	@Then("^Enter the Valid Employee name \"([^\"]*)\"$")
	public void enter_the_Valid_Employee_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	  leaves.EnterEmpNames(arg1);
	 
	}

	@Then("^Select the correct gender name \"([^\"]*)\"$")
	public void select_the_correct_gender_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    leaves.setYourAddressStates(arg1);
	}

	@Then("^Select the correct Marital status \"([^\"]*)\"$")
	public void select_the_correct_Marital_status(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   leaves.MaritalStatuss(arg1);
	}

	@Then("^Enter the invalid Email id \"([^\"]*)\"$")
	public void enter_the_invalid_Email_id(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  leaves.EnterEmailids(arg1);
	}
	
	@Then("^Enter the Invalid Join Date \"([^\"]*)\"$")
	public void enter_the_Invalid_Join_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    leaves.JoinDate(arg1);
	}
	
	@Then("^verify the Join Date alert message$")
	public void verify_the_Join_Date_alert_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(leaves.JoinDateAlertmessage())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^Enter the Invalid NRIC number \"([^\"]*)\"$")
	public void enter_the_Invalid_NRIC_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leaves.EnterInvalidNRIC(arg1);
	}
	
	@Then("^click the mobile number$")
	public void click_the_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leaves.mobilenumber();
	}

	@Then("^Alert message should be displayed in NRIC Field$")
	public void alert_message_should_be_displayed_in_NRIC_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  // leaves.NRICAlertMessage();
	   if(leaves.NRICAlertMessage())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	
	@Then("^Alert message should be displayed in Email field$")
	public void alert_message_should_be_displayed_in_Email_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(leaves.EmailAlertMessage())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	@Then("^Verify Employee Details shouldn't displayed in grid list$")
	public void verify_Employee_Details_shouldn_t_displayed_in_grid_list() throws Throwable {
	  
		//We are verifying the EMPCODE now 
		leaves = new Negative_Scenario_Employee_Detail_Page(TestBase.driver);
		if(leaves.verifyEmploycode())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		} 
	}
	@Then("^click the E-TMS App Access$")
	public void click_the_E_TMS_App_Access() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leaves = new Negative_Scenario_Employee_Detail_Page(TestBase.driver);
		leaves.EtmsApp();
	}

	@Then("^click the E-TMS button$")
	public void click_the_E_TMS_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		leaves.Etmsbutton();
	}
	@Then("^click the E-claim App Access$")
	public void click_the_E_claim_App_Access() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		leaves = new Negative_Scenario_Employee_Detail_Page(TestBase.driver);
	   leaves.EclaimApp();
	}

	@Then("^click the E-claim button$")
	public void click_the_E_claim_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	   leaves.Eclaimbutton();
	}
	@Then("^Verify Eclaim app employee shouldn't displayed in grid list$")
	public void verify_Eclaim_app_employee_shouldn_t_displayed_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(leaves.verifyEmpEclaim())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		} 
	}
	
	@Then("^click the E-Payroll App Access$")
	public void click_the_E_Payroll_App_Access() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		Thread.sleep(3000);
		leaves = new Negative_Scenario_Employee_Detail_Page(TestBase.driver);
	    leaves.PayRollApp();
	}

	@Then("^click the E-Payroll  button$")
	public void click_the_E_Payroll_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
	  leaves.PayRollAppbutton();
	}

	@Then("^Verify E-PayRoll app employee shouldn't displayed in grid list$")
	public void verify_E_PayRoll_app_employee_shouldn_t_displayed_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(leaves.VerifyPayRollAppbutton())
		{
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		} 
	}
	
	@Then("^click the Mobile App Access$")
	public void click_the_Mobile_App_Access() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		leaves.MobileAttendance();
	}

	@Then("^click the E-Mobile  button$")
	public void click_the_E_Mobile_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		leaves.MobileAttendancebutton();
	}

	@Then("^click the Allow change button$")
	public void click_the_Allow_change_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	    leaves.AllowchangeEmployeeid();
	}

	@Then("^click the Mobile Tracking button$")
	public void click_the_Mobile_Tracking_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	  leaves.MobileTracking();
	}
	
	//payroll for Designation and section
	
	
	@Then("^Select the Department field \"([^\"]*)\"$")
	public void select_the_Department_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		leaves = new Negative_Scenario_Employee_Detail_Page(TestBase.driver);
		leaves.Department(arg1);
	}

	@Then("^Select the Section field \"([^\"]*)\"$")
	public void select_the_Section_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		leaves.Section(arg1);
	}

	@Then("^Select the Designation field \"([^\"]*)\"$")
	public void select_the_Designation_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(7000);
		leaves.Designation(arg1);
	}

	@Then("^Select the Designation group field  \"([^\"]*)\"$")
	public void select_the_Designation_group_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(7000);
	    leaves.Designation_group(arg1);
	}

}
