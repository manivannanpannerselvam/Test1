package com.cucumber.framework.runner.UserAccess;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:featurefile/Infofeature/Login_po.feature","classpath:featurefile/Infofeature/forgot_po.feature","classpath:featurefile/UserAccess/UserAccess_positive_po.feature","classpath:featurefile/UserAccess/UserAccess_Employee_po.feature","classpath:featurefile/UserAccess/UserAccess_Employees_po.feature","classpath:featurefile/UserAccess/UserAccess_Negative1_po.feature","classpath:featurefile/UserAccess/UserAccess_Negative2_po.feature","classpath:featurefile/UserAccess/UserAccess_Negative3_po.feature","classpath:featurefile/UserAccess/UserAccess_Negative4_po.feature", }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\Users\\MANIVANNAN\\Downloads\\InfoTech-develop\\InfoTech-develop\\Reports\\cucumber-pretty",
	    "json:C:\\Users\\MANIVANNAN\\Downloads\\InfoTech-develop\\InfoTech-develop\\Reports\\cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\MANIVANNAN\\Downloads\\InfoTech-develop\\InfoTech-develop\\Reports\\report.html","rerun:target/rerun.txt"}
//,tags = {"@PO"}
)


public class useraccess_runner extends AbstractTestNGCucumberTests
{
	

}
