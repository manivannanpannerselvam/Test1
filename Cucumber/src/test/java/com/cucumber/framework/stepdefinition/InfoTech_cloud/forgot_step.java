package com.cucumber.framework.stepdefinition.InfoTech_cloud;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.cucumber.framework.InfoTech.InfoTech_Page;
import com.cucumber.framework.InfoTech.forgot_page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class forgot_step
{
	
	private final Logger log = LoggerHelper.getLogger(forgot_step.class);

	forgot_page login;
	
	@Then("^click the Forgot password icon$")
	public void click_the_Forgot_password_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login= new forgot_page(TestBase.driver);
		
		login.forgotpassword();
	}

	@Then("^Enter the Email in Forgot password page \"([^\"]*)\"$")
	public void enter_the_Email_in_Forgot_password_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.forgotemailid(arg1);
	}

	@Then("^click the Send button$")
	public void click_the_Send_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.sendbutton();
	}

	@Then("^Verify the succcess alert message is displayed$")
	public void verify_the_succcess_alert_message_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	   
	   if(login.forgotalertmessage())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}

	@Then("^verify the Blocked alert message is displayed successfully$")
	public void verify_the_Blocked_alert_message_is_displayed_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(8000);
		 if(login.blockedalertmessage())
			{
				log.info("login test is pass");
			}
			else
			{
				Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
				
			}
	}
	
	
	@Then("^click the Administration icon$")
	public void click_the_Administration_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
	  login.Administration();
	}

	@Then("^click the Email Settings icon$")
	public void click_the_Email_Settings_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.EmailSettings();
	}

	@Then("^click the  Allow Login with Mobile Number radio icon$")
	public void click_the_Allow_Login_with_Mobile_Number_radio_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.Allowmobilenumber();
	}



}
