package com.cucumber.framework.stepdefinition.Basic_master_setup_step;

import org.apache.log4j.Logger;

import com.cucumber.framework.Basic_Master_setup.Department_page;

import com.cucumber.framework.helper.Logger.LoggerHelper;


import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;


public class Department_step {

	private final Logger log = LoggerHelper.getLogger(Department_step.class);

	Department_page Department;
	
	@Then("^click the Basic master setup$")
	public void click_the_Basic_master_setup() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department = new Department_page(TestBase.driver);
		Thread.sleep(7000);
		
		Department.Basic_master_stepup();
	}

	@Then("^click the Department icon$")
	public void click_the_Department_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	   Department.Department_icon();
	}
	@Then("^click the new button in Department module$")
	public void click_the_new_button_in_Department_module() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		Department.Newbutton_Department();
	}

	@Then("^Enter the Department code \"([^\"]*)\"$")
	public void enter_the_Department_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		Department.Departmentcode(arg1);
	}

	@Then("^Enter the Department name \"([^\"]*)\"$")
	public void enter_the_Department_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		Department.DepartmentName(arg1);
	}
	@Then("^click the save button in Department icon$")
	public void click_the_save_button_in_Department_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		Department.Department_save();
	}
	
	@Then("^click the Designation icon$")
	public void click_the_Designation_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		Department.Designation();
	}
	
	@Then("^click the new button in Designation$")
	public void click_the_new_button_in_Designation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_New();
	}

	@Then("^Enter the Designation code \"([^\"]*)\"$")
	public void enter_the_Designation_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_code(arg1);
	}

	@Then("^Enter the Designation name \"([^\"]*)\"$")
	public void enter_the_Designation_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_Name(arg1);
	}

	@Then("^click the save button in Designation icon$")
	public void click_the_save_button_in_Designation_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_save_button();
	}

	
	@Then("^click the Section$")
	public void click_the_Section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Section_icon();
	}

	@Then("^click the new button in section module$")
	public void click_the_new_button_in_section_module() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_New();
	}

	@Then("^Enter the section code \"([^\"]*)\"$")
	public void enter_the_section_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		Department.Section_code(arg1);
	}

	@Then("^Enter the Section name \"([^\"]*)\"$")
	public void enter_the_Section_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(8000);
		Department.Section_name(arg1);
	}

	@Then("^Select the Department icon$")
	public void select_the_Department_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Department_dropdown();
	}

	@Then("^click the save button in section module$")
	public void click_the_save_button_in_section_module() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.save_Section();
	}

	@Then("^click the category icon$")
	public void click_the_category_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.category_icon();
	}

	@Then("^Enter the category code \"([^\"]*)\"$")
	public void enter_the_category_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.category_code(arg1);
	}

	@Then("^Enter the category name \"([^\"]*)\"$")
	public void enter_the_category_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.category_name(arg1);
	}
	
	@Then("^click the new button in category module$")
	public void click_the_new_button_in_category_module() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.category_Addbutton();
	}
	
	@Then("^click the save button in category field$")
	public void click_the_save_button_in_category_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.category_savebutton();
	}
	@Then("^click the Designation group$")
	public void click_the_Designation_group() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_Group();
	}

	@Then("^click the Add icon in Designation group$")
	public void click_the_Add_icon_in_Designation_group() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_Group_newbutton();
	}

	@Then("^Enter the Designation group code \"([^\"]*)\"$")
	public void enter_the_Designation_group_code(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_Group_code(arg1);
	}

	@Then("^Enter the Designation group name \"([^\"]*)\"$")
	public void enter_the_Designation_group_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_Group_name(arg1);
	}

	@Then("^click the save button in Designation group button$")
	public void click_the_save_button_in_Designation_group_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Department.Designation_Group_save_button();
	}
	
	
	
	
}
