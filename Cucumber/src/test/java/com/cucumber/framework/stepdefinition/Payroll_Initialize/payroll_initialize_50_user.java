package com.cucumber.framework.stepdefinition.Payroll_Initialize;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.Payroll_page.Payroll_Initialize_page;
import com.cucumber.framework.Payroll_page.Payroll_initialize_50_page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class payroll_initialize_50_user 
{
	
	private final Logger log = LoggerHelper.getLogger(payroll_initialize_50_user.class);

	Payroll_initialize_50_page payroll_50;
	
	
	@Then("^verify (\\d+) user displayed in All Employees grid list$")
	public void verify_user_displayed_in_All_Employees_grid_list(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_50 = new Payroll_initialize_50_page(TestBase.driver);
		if(payroll_50.AllEmployee_50()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}

	@Then("^Choose the All Employee checkbox for intialize$")
	public void choose_the_All_Employee_checkbox_for_intialize() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_50 = new Payroll_initialize_50_page(TestBase.driver);
		payroll_50.All_Employee_checkbox();
	}
	
	@Then("^verify the success alert message for Initialize$")
	public void verify_the_success_alert_message_for_Initialize() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(12000);
		
		if(payroll_50.verify_Initailize_Alert_message()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}
	@Then("^verify the Initialized employee should be fifty$")
	public void verify_the_Initialized_employee_should_be_fifty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		if(payroll_50.verify_Initailize_Alert_message()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}

	}
	@Then("^change the login  year \"([^\"]*)\"$")
	public void change_the_login_year(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_50 = new Payroll_initialize_50_page(TestBase.driver);
		payroll_50.verify_login_year(arg1);
		
	}

	@Then("^change the login month \"([^\"]*)\"$")
	public void change_the_login_month(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		payroll_50.verify_login_month(arg1);
	}
	@Then("^change the login Type \"([^\"]*)\"$")
	public void change_the_login_Type(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		payroll_50.Select_Type(arg1);
	}
	
	@Then("^Enter the Termination Date \"([^\"]*)\"$")
	public void enter_the_Termination_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		payroll_50.TerminationDate(arg1);
	}
	@Then("^click the All Employee Radio button$")
	public void click_the_All_Employee_Radio_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(9000);
		payroll_50.AllEmployee_Radiobutton();
	}
	@Then("^Edit the Termination date for payroll \"([^\"]*)\"$")
	public void edit_the_Termination_date_for_payroll(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_50.Edit_TerminationDate_clear();
		
		
		payroll_50.Edit_TerminationDate(arg1);
		
	}
	
	@Then("^click the Backup your Datebases button$")
	public void click_the_Backup_your_Datebases_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		payroll_50 = new Payroll_initialize_50_page(TestBase.driver);
		payroll_50.BackupDatebase();
		Thread.sleep(2000);
		TestBase.driver.switchTo().alert().accept();
	}
	@Then("^Verify the Backup alert should be displayed$")
	public void verify_the_Backup_alert_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	
			if(payroll_50.Verify_BackupDatebase()){
				log.info("login test is pass");
			}
			else{
				Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
				System.out.println("Fail test case");
			}
		
	}
	
	@Then("^Double click the Initialize button$")
	public void double_click_the_Initialize_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		payroll_50 = new Payroll_initialize_50_page(TestBase.driver);
		
		payroll_50.Double_Payroll_initialize();
	}
	@Then("^click the Ignore and Continue button in pop up page$")
	public void click_the_Ignore_and_Continue_button_in_pop_up_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		payroll_50 = new Payroll_initialize_50_page(TestBase.driver);
		payroll_50.Ignore_and_continue();
	}
	@Then("^click the Lock and Unlock Employee$")
	public void click_the_Lock_and_Unlock_Employee() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_50.Lock_and_Unlock();
	}
	
	@Then("^click the lock button$")
	public void click_the_lock_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		payroll_50.Lock_button();
	}
	

   @Then("^click the No button in alert message for locked employee$")
  public void click_the_No_button_in_alert_message_for_locked_employee() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	   payroll_50.Lock_Alert_message_NO();
   }
   @Then("^click the yes button in alert message for locked employee$")
   public void click_the_yes_button_in_alert_message_for_locked_employee() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   payroll_50.Lock_Alert_message_YES();
   }
   @Then("^click the Unlock and Initialize button$")
   public void click_the_Unlock_and_Initialize_button() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   payroll_50.Unlock_Initialize_button();
   }
   @Then("^click the checkbox for unlock user$")
   public void click_the_checkbox_for_unlock_user() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   payroll_50.Unlocked_checkbox();
   }
   
   @Then("^click the Unlock button$")
   public void click_the_Unlock_button() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   payroll_50.Unlock_button();
   }
   @Then("^Verify the Unlock Success Message is displayed$")
   public void verify_the_Unlock_Success_Message_is_displayed() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	  
	   
	   Thread.sleep(5000);
		if(payroll_50.Verify_Unlock_button_Alert_message()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
   }
   @Then("^click the Yes button for confirmation alert message$")
   public void click_the_Yes_button_for_confirmation_alert_message() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   payroll_50.click_Yes_Unlock_button();
   }
   
   @Then("^click the Bell Icon$")
   public void click_the_Bell_Icon() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(3000);
	   payroll_50.Bell_icon();
   }

   @Then("^verify the Notification alert message$")
   public void verify_the_Notification_alert_message() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	 //  payroll_50.Notification_Queue();
	   
	   Thread.sleep(5000);
		if(payroll_50.Notification_Queue()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
   }
   
   @Then("^Verify the Salary Adjustment Employee count$")
   public void verify_the_Salary_Adjustment_Employee_count() throws Throwable {
       // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(5000);
		if(payroll_50.Total_count_salary_Adjustment()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
   }

}
