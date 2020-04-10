package com.cucumber.framework.runner.Infotech_HR;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = { "classpath:featurefile/Infofeature/Login.feature","classpath:featurefile/Infofeature/forgot.feature","classpath:featurefile/UserAccess/UserAccess_positive.feature","classpath:featurefile/UserAccess/UserAccess_Edit.feature","classpath:featurefile/UserAccess/UserAccess_Negative1.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\Users\\MANIVANNAN\\Downloads\\InfoTech-develop\\InfoTech-develop\\Reports\\cucumber-pretty",
	    "json:C:\\Users\\MANIVANNAN\\Downloads\\InfoTech-develop\\InfoTech-develop\\Reports\\cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\MANIVANNAN\\Downloads\\InfoTech-develop\\InfoTech-develop\\Reports\\report.html","rerun:target/rerun.txt"}
//,tags = {"@SanityTest"}
)

public class Login_runner_Sanity extends AbstractTestNGCucumberTests {

}
