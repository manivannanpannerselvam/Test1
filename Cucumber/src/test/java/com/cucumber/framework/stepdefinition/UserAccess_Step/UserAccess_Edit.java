package com.cucumber.framework.stepdefinition.UserAccess_Step;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;




import com.cucumber.framework.InfoTech_UserAccess.Edit_UserAccess_Page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class UserAccess_Edit 
{
	private final Logger log = LoggerHelper.getLogger(UserAccess_Edit.class);

	Edit_UserAccess_Page useraccess;
	
	
	//Close Button for LOGIN AND NEED TO ADD TESTBASE.DRIVERRRRRRR
	
	@Then("^click the close button$")
	public void click_the_close_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(3000);
		useraccess = new Edit_UserAccess_Page(TestBase.driver);
		useraccess.closebutton();
	}

	@Then("^Click the Edit icon$")
	public void click_the_Edit_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		useraccess = new Edit_UserAccess_Page(TestBase.driver);
		useraccess.EditUser();
	/*
		Thread.sleep(9000);
		List<WebElement> dayss =TestBase.driver.findElements(By.tagName("a"));
		
		System.out.println(dayss.size());
		
		for(int i=0;i<dayss.size();i++)
		{
			//System.out.println(dayss.get(i).getText());
			
			
				try
				{
					System.out.println(dayss.get(i).getText());
					System.out.println(i);
					if(i==245)
					{
					dayss.get(i).click();
					System.out.println(i);
					Thread.sleep(5000);
					
					break;
					//TestBase.driver.findElement(By.xpath(".//input[@id='ContentPlaceHolder1_tabUsers_tabActiveUsers_btnSaveInActive' and @value='Deactivate']")).click();
					}
					
				}
				catch(Exception ie)
				{
					System.out.println("Exception ");
				}
			}
			
		*/
	}
	
	
	

	@Then("^Edit the Display name \"([^\"]*)\"$")
	public void edit_the_Display_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		useraccess.EditDisplayName(arg1);
	}

	@Then("^click the Update button$")
	public void click_the_Update_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(7000);
	
		useraccess.Update_Button();
	}

	@Then("^Verify Display name should be changed$")
	public void verify_Display_name_should_be_changed() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		if(useraccess.updatename())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}
	@Then("^Clear the Email id$")
	public void clear_the_Email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		useraccess.Update_Email_clear();
	   
	}

	@Then("^Edit the Emailid \"([^\"]*)\"$")
	public void edit_the_Emailid(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(5000);
		useraccess.UpdateEmail(arg1);
	}
	@Then("^Verify Eamil id  should be changed$")
	public void verify_Eamil_id_should_be_changed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(25000);
		if(useraccess.VerifyEmail())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}
	@Then("^Clear the Phone Number$")
	public void clear_the_Phone_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		useraccess.UpdatePhoneNumber_clear();
	}

	@Then("^Edit the Phone Number  \"([^\"]*)\"$")
	public void edit_the_Phone_Number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		useraccess.UpdatePhoneNumber(arg1);
	}

	@Then("^Verify Phone number should be changed$")
	public void verify_Phone_number_should_be_changed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		if(useraccess.VerifyEmail())
		{
			log.info("login test is pass");
		}
		else
		{
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
			
		}
	}

	@Then("^click the deactivate icon$")
	public void click_the_deactivate_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(9000);
		List<WebElement> dayss =TestBase.driver.findElements(By.tagName("input"));
		
		System.out.println(dayss.size());
		
		for(int i=0;i<dayss.size();i++)
		{
			//System.out.println(days.get(i).getText());
			
			
				try
				{
					
					if(i==22)
					{
					dayss.get(i).click();
					System.out.println(i);
					Thread.sleep(5000);
					TestBase.driver.findElement(By.xpath(".//input[@id='ContentPlaceHolder1_tabUsers_tabActiveUsers_btnSaveInActive' and @value='Deactivate']")).click();
					}
					
				}
				catch(Exception ie)
				{
					System.out.println("Exception ");
				}
			}
			
	}

	@Then("^click the InActive User$")
	public void click_the_InActive_User() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		useraccess.InActivebutton();
	}

	@Then("^click the Activate icon$")
	public void click_the_Activate_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(9000);
		
		TestBase.driver.findElement(By.xpath(".//div[@id='upContent']//following::span[contains(text(),'InActive Users')]")).click();
		
		
		Thread.sleep(8000);
		
		TestBase.driver.findElement(By.xpath(".//table[@class='table table-bordered table-striped gridviewHeaderFont']/following::input[@id='ContentPlaceHolder1_tabUsers_tabInActiveUsers_gvInactiveUserManagement_chkActivate_0' and @type='checkbox']")).click();
		
		
		
		Thread.sleep(5000);
		
		
		TestBase.driver.findElement(By.xpath(".//input[@id='ContentPlaceHolder1_tabUsers_tabInActiveUsers_btnSaveActivate' and @value='Activate']")).click();
		/*
		List<WebElement> dayss =TestBase.driver.findElements(By.tagName("span"));
		
		System.out.println("InActive span"+dayss.size());
		
		for(int i=0;i<dayss.size();i++)
		{
			//System.out.println(days.get(i).getText());
			
			
				try
				{
					
					if(i==41)
					{
						dayss.get(i).click();
					System.out.println("InActive Button is working "+i);
					Thread.sleep(5000);
					
					List<WebElement> Activate =TestBase.driver.findElements(By.tagName("input"));
					
					System.out.println("Activate number is "+Activate.size());
					
					for(int j=0;j<Activate.size();j++)
					{
						try
						{
							System.out.println("number is "+j);
							if(j==24)
							{
								Thread.sleep(8000);
								System.out.println("what is "+j);
								Activate.get(j).click();
								Thread.sleep(5000);
								
								TestBase.driver.findElement(By.xpath(".//input[@id='ContentPlaceHolder1_tabUsers_tabInActiveUsers_btnSaveActivate' and @value='Activate']")).click();
								
								break;
							}
						
						}
						catch(Exception ie)
						{
							System.out.println("error ");
						}
						
						
					}
						break;
					}
					//TestBase.driver.findElement(By.xpath(".//input[@id='ContentPlaceHolder1_tabUsers_tabActiveUsers_btnSaveInActive' and @value='Deactivate']")).click();
					
					
				}
				catch(Exception ie)
				{
					System.out.println("Exception ");
				}
			}
			*/
	}

	@Then("^click the Activate User$")
	public void click_the_Activate_User() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(7000);
			
		TestBase.driver.findElement(By.xpath(".//div[@id='ContentPlaceHolder1_divDetails']//following::a[@id='__tab_ContentPlaceHolder1_tabUsers_tabActiveUsers']")).click();
	}
	
	

	}


