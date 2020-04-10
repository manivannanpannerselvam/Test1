package com.cucumber.framework.stepdefinition.Leave_Type_step;

import org.apache.log4j.Logger;


import com.cucumber.framework.Leave_Type_page.Leavetype_page;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class LeaveType_positive {
	
	private final Logger log = LoggerHelper.getLogger(LeaveType_positive.class);

	Leavetype_page Leavetype;
	
	
	@Then("^click the Leave type and Leave group$")
	public void click_the_Leave_type_and_Leave_group() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Leavetype = new Leavetype_page(TestBase.driver);
		Thread.sleep(8000);
		Leavetype.leavetype_and_leavegroup();
		
	}

	@Then("^click the New button in Leave type$")
	public void click_the_New_button_in_Leave_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Leavetype.new_button_leavetype();
	}

}
