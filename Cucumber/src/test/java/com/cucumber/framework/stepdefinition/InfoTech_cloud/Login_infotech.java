package com.cucumber.framework.stepdefinition.InfoTech_cloud;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.framework.InfoTech.InfoTech_Page;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class Login_infotech 
{
	
	private final Logger log = LoggerHelper.getLogger(Login_infotech.class);

	InfoTech_Page login;
	
	
	
	@Given("^open the valid url in InfoTech_cloud application$")
	public void open_the_valid_url_in_InfoTech_cloud_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try
		{
			TestBase.driver.get(ObjectRepo.reader.getWebsite());
			System.out.println("page need to load");
			TestBase.driver.navigate().refresh();
		}
		catch(Exception ie)
		{
			TestBase.driver.quit();
			
	        TestBase.driver.get("http://daf5f63fa41d40aba3a56e3ecf36ee6d.cloudapp.net/Login.aspx");
		}
		
		//TestBase.driver.get(ObjectRepo.reader.getWebsite());
	
	}

	@Then("^Enter the  usernamesdsdsds in username field \"([^\"]*)\"$")
	public void enter_the_usernamesdsdsds_in_username_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login= new InfoTech_Page(TestBase.driver);
		login.enternamefield(arg1);

	}

	@Then("^Enter the valid passwordsdsd in password field \"([^\"]*)\"$")
	public void enter_the_valid_passwordsdsd_in_password_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		login.enterpasswordfield(arg1);
	}
	
	@Then("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.loginButton();
	}

	@Then("^verify the applicatisdfsfdsondgdgdd not  successfully\\.$")
	public void verify_the_applicatisdfsfdsondgdgdd_not_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 
		if(login.verifySuccessLoginMsg()){
			log.info("login test is pass");
		}
		else{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			System.out.println("Fail test case");
		}
	}

	@Then("^verify the applicationsssaadsasds successfully\\.$")
	public void verify_the_applicationsssaadsasds_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		if(login.verifySuccesswelcomeMsg())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}
	@Then("^click the user Image$")
	public void click_the_user_Image() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	   login.userimage();
	}
	@Then("^click the sign out button$")
	public void click_the_sign_out_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.signout();
	}
	
	@Then("^Verify the Employee login successfully$")
	public void verify_the_Employee_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	    if(login.verifySuccesswelcomeMsg_Employee_id())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}
	@Then("^Verify the System user login successfully$")
	public void verify_the_System_user_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   Thread.sleep(6000);
	    if(login.verifySuccessSupportlogin())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}
	
	
	@Then("^click the All link$")
	public void click_the_All_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		List<WebElement> days =TestBase.driver.findElements(By.tagName("a"));
		
		for(int i=0;i<days.size();i++)
		{
			System.out.println(days.get(i).getText());
			
			if(days.get(i).getText().equals("Attendance"))
			{
				days.get(i).click();
				
				ArrayList<String> tabs2 = new ArrayList<String> (TestBase.driver.getWindowHandles());
				System.out.println(tabs2.size());
			    TestBase.driver.switchTo().window(tabs2.get(1));
			    
			   String currenturl=TestBase.driver.getCurrentUrl();
			   
			   if(currenturl.contains("https://www.info-tech.com.sg/time-attendance-pro.htm"))
			   {
				   System.out.println("Pass");
			   }
			   else
			   {
				   System.out.println("fail");
			   }
			    TestBase.driver.close();
			    TestBase.driver.switchTo().window(tabs2.get(0));
				
			}
			else if(days.get(i).getText().equals("Payroll & HR"))
			{
				days.get(i).click();
				
				ArrayList<String> tabs2 = new ArrayList<String> (TestBase.driver.getWindowHandles());
				System.out.println(tabs2.size());
			    TestBase.driver.switchTo().window(tabs2.get(1));
			    
			   String currenturl=TestBase.driver.getCurrentUrl();
			   
			   if(currenturl.contains("https://www.info-tech.com.sg/payroll.htm"))
			   {
				   System.out.println("Pass");
			   }
			   else
			   {
				   System.out.println("fail");
			   }
			    TestBase.driver.close();
			    TestBase.driver.switchTo().window(tabs2.get(0));
			}
			else if(days.get(i).getText().equals("e-Leave"))
			{
				days.get(i).click();
				
				ArrayList<String> tabs2 = new ArrayList<String> (TestBase.driver.getWindowHandles());
				System.out.println(tabs2.size());
			    TestBase.driver.switchTo().window(tabs2.get(1));
			    
			   String currenturl=TestBase.driver.getCurrentUrl();
			   
			   if(currenturl.contains("https://www.info-tech.com.sg/eleave.htm"))
			   {
				   System.out.println("Pass");
			   }
			   else
			   {
				   System.out.println("fail");
			   }
			    TestBase.driver.close();
			    TestBase.driver.switchTo().window(tabs2.get(0));
				
			}
			else if(days.get(i).getText().equals("e-Claim"))
			{
				days.get(i).click();
				
				ArrayList<String> tabs2 = new ArrayList<String> (TestBase.driver.getWindowHandles());
				System.out.println(tabs2.size());
			    TestBase.driver.switchTo().window(tabs2.get(1));
			    
			   String currenturl=TestBase.driver.getCurrentUrl();
			   
			   if(currenturl.contains("https://www.info-tech.com.sg/eclaim.htm"))
			   {
				   System.out.println("Pass");
			   }
			   else
			   {
				   System.out.println("fail");
			   }
			    TestBase.driver.close();
			    TestBase.driver.switchTo().window(tabs2.get(0));
				
			}
			else if(days.get(i).getText().equals("e-Appraisal"))
			{
				days.get(i).click();
				
				ArrayList<String> tabs2 = new ArrayList<String> (TestBase.driver.getWindowHandles());
				System.out.println(tabs2.size());
			    TestBase.driver.switchTo().window(tabs2.get(1));
			    
			   String currenturl=TestBase.driver.getCurrentUrl();
			   
			   if(currenturl.contains("https://www.info-tech.com.sg/eappraisal.htm"))
			   {
				   System.out.println("Pass");
			   }
			   else
			   {
				   System.out.println("fail");
			   }
			    TestBase.driver.close();
			    TestBase.driver.switchTo().window(tabs2.get(0));
				
			}
			else if(days.get(i).getText().equals("Staff Portal"))
			{
				days.get(i).click();
				
				ArrayList<String> tabs2 = new ArrayList<String> (TestBase.driver.getWindowHandles());
				System.out.println(tabs2.size());
			    TestBase.driver.switchTo().window(tabs2.get(1));
			    
			   String currenturl=TestBase.driver.getCurrentUrl();
			   
			   if(currenturl.contains("https://www.info-tech.com.sg/staffportal.htm"))
			   {
				   System.out.println("Pass");
			   }
			   else
			   {
				   System.out.println("fail");
			   }
			    TestBase.driver.close();
			    TestBase.driver.switchTo().window(tabs2.get(0));
				
			}
			else if(days.get(i).getText().equals("WATCH VIDEO"))
			{
				days.get(i).click();
				
				ArrayList<String> tabs2 = new ArrayList<String> (TestBase.driver.getWindowHandles());
				System.out.println(tabs2.size());
			    TestBase.driver.switchTo().window(tabs2.get(1));
			    
			   String currenturl=TestBase.driver.getCurrentUrl();
			   
			   if(currenturl.contains("https://www.youtube.com/watch?v=WbKM304U0Ms"))
			   {
				   System.out.println("Pass");
			   }
			   else
			   {
				   System.out.println("fail");
			   }
			    TestBase.driver.close();
			    TestBase.driver.switchTo().window(tabs2.get(0));
			
			}
		}
	}


	@Then("^click the Administration$")
	public void click_the_Administration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		login.Administrations();
	}

	@Then("^click the Email(\\d+)fA settings$")
	public void click_the_Email_fA_settings(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.Email2fasetting();
	   
	}

	
	@Then("^Verify the Employee login confirmation$")
	public void verify_the_Employee_login_confirmation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1300);
		 if(login.Employeecheckbox())
	 		{
	 			log.info("login test is pass");
	 			
	 			
	 		}
	 		else
	 		{
	 			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	 			
	 		}
	}
	
	@Then("^Verify the Employee login confirmation for Mobile$")
	public void verify_the_Employee_login_confirmation_for_Mobile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1300);
		if(login.Mobilecheckbox())
 		{
 			log.info("login test is pass");
 		}
 		else
 		{
 			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
 			
 		}
	}
	
	
	
/*
	@Then("^click the Forgot password icon$")
	public void click_the_Forgot_password_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
		
		login.forgotpassword();
	}

	

	@Then("^click the Send button$")
	public void click_the_Send_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.sendbutton();
	}
	
	@Then("^Enter the Email in Forgot password page \"([^\"]*)\"$")
	public void enter_the_Email_in_Forgot_password_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.forgotemailid(arg1);
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

	*/


}
