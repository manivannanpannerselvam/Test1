package com.cucumber.framework.runner.Employee_Basic_Details;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefile/Basic_Employee_Details/Duplicate_Employe_Details.feature","classpath:featurefile/Basic_Employee_Details/E_leave_All_Approvals.feature","classpath:featurefile/Basic_Employee_Details/E_leave_child_Details.feature","classpath:featurefile/Basic_Employee_Details/E-TMS_login.feature","classpath:featurefile/Basic_Employee_Details/ECLAIMS.feature","classpath:featurefile/Basic_Employee_Details/Edit_Employee_Details.feature","classpath:featurefile/Basic_Employee_Details/EpayRoll_Account.feature","classpath:featurefile/Basic_Employee_Details/EPayroll_Basic.feature","classpath:featurefile/Basic_Employee_Details/Epayroll_Duplicate_idandemaii.feature","classpath:featurefile/Basic_Employee_Details/EpayRoll_fund.feature","classpath:featurefile/Basic_Employee_Details/EpayRollHourly.feature","classpath:featurefile/Basic_Employee_Details/Epayroll_Payday.feature","classpath:featurefile/Basic_Employee_Details/EPayroll_Sal.feature","classpath:featurefile/Basic_Employee_Details/EPAYROLL.feature","classpath:featurefile/Basic_Employee_Details/EpayRollEmployee_Type.feature","classpath:featurefile/Basic_Employee_Details/EpayrollPercentage.feature","classpath:featurefile/Basic_Employee_Details/E-TMS.feature","classpath:featurefile/Basic_Employee_Details/Leave.feature","classpath:featurefile/Basic_Employee_Details/Mobile.feature","classpath:featurefile/Basic_Employee_Details/Negative_Scenario_Employee.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\Users\\Mani\\git\\tests\\Cucumber\\Reports\\cucumber-pretty",
	    "json:C:\\Users\\Mani\\git\\tests\\Cucumber\\Reportscucumber.json","com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\Mani\\git\\tests\\Cucumber\\Reports\\report.html","rerun:target/rerun.txt"}
//,tags = {"@SanityTest"}
)

public class Employee_Sanity extends AbstractTestNGCucumberTests{

}
