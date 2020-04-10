package com.cucumber.framework.stepdefinition.UserAccess_Step;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.InfoTech.InfoTech_Page;
import com.cucumber.framework.InfoTech.Leave_Software;
import com.cucumber.framework.InfoTech_UserAccess.UserAccess_Page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;
import com.cucumber.framework.stepdefinition.InfoTech_cloud.Login_infotech;

import cucumber.api.java.en.Then;

public class UserAccess_Positive 
{
	private final Logger log = LoggerHelper.getLogger(UserAccess_Positive.class);

	UserAccess_Page useraccess;
	
	@Then("^click the userAccess icon$")
	public void click_the_userAccess_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		useraccess = new UserAccess_Page(TestBase.driver);
		Thread.sleep(8000);
		useraccess.usercreation();
	}
	@Then("^Delete the Employee details in grid list$")
	public void delete_the_Employee_details_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		useraccess.Before_removeicon();
	}
	
	@Then("^click the New buttons$")
	public void click_the_New_buttons() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
	  useraccess.NewButton();
	}

	@Then("^Enter the valid Display name \"([^\"]*)\"$")
	public void enter_the_valid_Display_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    useraccess.DisplayName(arg1);
	}

	@Then("^Enter the Primary Email \"([^\"]*)\"$")
	public void enter_the_Primary_Email(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   useraccess.PrimaryEmail(arg1);
	}

	@Then("^Enter the Mobile number \"([^\"]*)\"$")
	public void enter_the_Mobile_number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    useraccess.MobileNumber(arg1);
	}

	@Then("^click the App Access button$")
	public void click_the_App_Access_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(12000);
	    useraccess.AppAccess();
	}
	@Then("^Select the E-TMS Access drop down list \"([^\"]*)\"$")
	public void select_the_E_TMS_Access_drop_down_list(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		useraccess.ETMS(arg1);
	}

	@Then("^Select the E-Leave Access drop down list \"([^\"]*)\"$")
	public void select_the_E_Leave_Access_drop_down_list(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	   useraccess.ELeave(arg1);
	}

	@Then("^Select the E-PayRoll Access \"([^\"]*)\"$")
	public void select_the_E_PayRoll_Access(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	   useraccess.EpayRoll(arg1);
	}

	@Then("^Select the Mobile Attendance Access \"([^\"]*)\"$")
	public void select_the_Mobile_Attendance_Access(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	  useraccess.MobileAttendance(arg1);
	}

	@Then("^Select the E-Claim Access \"([^\"]*)\"$")
	public void select_the_E_Claim_Access(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		useraccess.EclaimAttendance(arg1);
	}
	@Then("^click the company access icon$")
	public void click_the_company_access_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		useraccess.companyAccess();
	}

	@Then("^Select the company name list$")
	public void select_the_company_name_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3500);
		useraccess.companycheckbox();
	}

	@Then("^click the Department Access icon$")
	public void click_the_Department_Access_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(12000);
		useraccess.DepartmentAccess();
	}
	@Then("^click the Super Admin icon$")
	public void click_the_Super_Admin_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(12000);
		
		useraccess.superadmin();
	}
	@Then("^click the save button$")
	public void click_the_save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(12000);
		useraccess.savebutton();
	}
	@Then("^Veriy User should be displayed in grid list$")
	public void veriy_User_should_be_displayed_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(7000);
		if(useraccess.userGridlist())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}
	@Then("^click the Delete button$")
	public void click_the_Delete_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		useraccess.removeicon();
	}
	@Then("^click the cancel button$")
	public void click_the_cancel_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		useraccess.cancelbutton();
	}

	@Then("^Veriy userdetails shouldn't displayed in grid list$")
	public void veriy_userdetails_shouldn_t_displayed_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		if(useraccess.userGridlistsnotdisplayed())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
		
	}
	@Then("^click the Approver icon$")
	public void click_the_Approver_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		useraccess.EApprove();
	}
	

	@Then("^Veriy User shouldn't be displayed in grid list$")
	public void veriy_User_shouldn_t_be_displayed_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
	   
	   if(useraccess.VerifycompanyAccess())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	   
	   
	}
	@Then("^select the second company name list$")
	public void select_the_second_company_name_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		useraccess.companycheckbox2();
	}
	@Then("^click the E-TMS super admin$")
	public void click_the_E_TMS_super_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		useraccess.ETMS_superadmin();
	}
	@Then("^click the E-TMS Aprrover$")
	public void click_the_E_TMS_Aprrover() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
	    useraccess.ETMS_Approvals();
	}
	@Then("^click the E-LEAVE super admin$")
	public void click_the_E_LEAVE_super_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		useraccess.ELEAVE_superadmin();
	}
	@Then("^click the E-Leave Aprrover$")
	public void click_the_E_Leave_Aprrover() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		useraccess.ETMS_Approvals();
	}
	@Then("^click the E-PAYROLL super admin$")
	public void click_the_E_PAYROLL_super_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		useraccess.PAYROLL_superadmin();
	}
	@Then("^click the E-claim super admin$")
	public void click_the_E_claim_super_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	  useraccess.ECLAIM_superadmin();
	}
	@Then("^click the E-Mobile super admin$")
	public void click_the_E_Mobile_super_admin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		useraccess.Mobile_superadmin();
	}
	@Then("^clear the employee details$")
	public void clear_the_employee_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		useraccess.Employeename();
	}

	@Then("^Enter the Employe name \"([^\"]*)\"$")
	public void enter_the_Employe_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		useraccess.Employeename(arg1);
	}
	@Then("^click the Employee name in drop down$")
	public void click_the_Employee_name_in_drop_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		useraccess.Employeedrop();
	}

	@Then("^Veriy employee code should be displayed in grid list$")
	public void veriy_employee_code_should_be_displayed_in_grid_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(useraccess.Employeecode())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	
	}
	  


}
