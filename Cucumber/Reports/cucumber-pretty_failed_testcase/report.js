$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/Basic_Employee_Details/E-TMS.feature");
formatter.feature({
  "line": 2,
  "name": "Employee_Basic_Details_Positive_flow",
  "description": "",
  "id": "employee-basic-details-positive-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Positive_flow"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify the Positive flow in E-TMS modules",
  "description": "",
  "id": "employee-basic-details-positive-flow;verify-the-positive-flow-in-e-tms-modules",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Info Tms application",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the Time Attendance software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the Employee Code \"\u003cEmployeeCodes\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Name \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Select the Gender field \"\u003cGender\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Marital status \"\u003cMaritalstatus\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Enter the Email Address \"\u003cEmailAddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Mobile Number \"\u003cMobileNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Join Date \"\u003cJoinDate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the NRIC number \"\u003cNRICnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter the Fin id number \"Tghf0222\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click the E-TMS App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click the E-TMS button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "employee-basic-details-positive-flow;verify-the-positive-flow-in-e-tms-modules;",
  "rows": [
    {
      "cells": [
        "EmployeeCodes",
        "EmployeeName",
        "Gender",
        "Maritalstatus",
        "EmailAddress",
        "MobileNumber",
        "JoinDate",
        "NRICnumber",
        "Final"
      ],
      "line": 43,
      "id": "employee-basic-details-positive-flow;verify-the-positive-flow-in-e-tms-modules;;1"
    },
    {
      "cells": [
        "mani004",
        "maniva",
        "MALE",
        "Single",
        "empnffewseco888ndgt@mailinator.com",
        "96666664",
        "12-12-2018",
        "S9247710Z",
        "testmani2"
      ],
      "line": 44,
      "id": "employee-basic-details-positive-flow;verify-the-positive-flow-in-e-tms-modules;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14031283753,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "verify the Positive flow in E-TMS modules",
  "description": "",
  "id": "employee-basic-details-positive-flow;verify-the-positive-flow-in-e-tms-modules;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Positive_flow"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Info Tms application",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the Time Attendance software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employee name in search text field \"maniva\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the Employee Code \"mani004\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Name \"maniva\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Select the Gender field \"MALE\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Marital status \"Single\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Enter the Email Address \"empnffewseco888ndgt@mailinator.com\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Mobile Number \"96666664\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Join Date \"12-12-2018\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the NRIC number \"S9247710Z\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter the Fin id number \"Tghf0222\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click the E-TMS App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click the E-TMS button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Enter the Employee name in search text field \"maniva\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 3307592691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testmani2@1.com",
      "offset": 46
    }
  ],
  "location": "Login_infotech.enter_the_usernamesdsdsds_in_username_field(String)"
});
formatter.result({
  "duration": 140766814,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 48
    }
  ],
  "location": "Login_infotech.enter_the_valid_passwordsdsd_in_password_field(String)"
});
formatter.result({
  "duration": 5111826568,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "duration": 4404867951,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.verify_the_applicationsssaadsasds_successfully()"
});
formatter.result({
  "duration": 41289876,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_change_app_button()"
});
formatter.result({
  "duration": 4125082469,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Info_Tms_application()"
});
formatter.result({
  "duration": 3619184988,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Time_Attendance_software_application_is_visible_properly()"
});
formatter.result({
  "duration": 7130178370,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_master_icon()"
});
formatter.result({
  "duration": 7161376790,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Employee_Basic_Details()"
});
formatter.result({
  "duration": 5796082173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maniva",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4377893136,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 123183407,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_employee_name_already_grid_list_or_not()"
});
formatter.result({
  "duration": 8165508346,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 37
    }
  ],
  "location": "Leave_Software_Step.click_the_Delete_confimation_pop_up(String)"
});
formatter.result({
  "duration": 10371998420,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_New_button()"
});
formatter.result({
  "duration": 3163139555,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mani004",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Code(String)"
});
formatter.result({
  "duration": 1229447506,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maniva",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Name(String)"
});
formatter.result({
  "duration": 12291444544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MALE",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.select_the_Gender_field(String)"
});
formatter.result({
  "duration": 157267359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single",
      "offset": 27
    }
  ],
  "location": "Leave_Software_Step.select_the_Marital_status(String)"
});
formatter.result({
  "duration": 146228148,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "empnffewseco888ndgt@mailinator.com",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Email_Address(String)"
});
formatter.result({
  "duration": 3542595160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "96666664",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Mobile_Number(String)"
});
formatter.result({
  "duration": 3283958914,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-12-2018",
      "offset": 21
    }
  ],
  "location": "Leave_Software_Step.enter_the_Join_Date(String)"
});
formatter.result({
  "duration": 749247210,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S9247710Z",
      "offset": 23
    }
  ],
  "location": "Leave_Software_Step.enter_the_NRIC_number(String)"
});
formatter.result({
  "duration": 181214025,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tghf0222",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Fin_id_number(String)"
});
formatter.result({
  "duration": 177540741,
  "status": "passed"
});
formatter.match({
  "location": "Negative_Employee_Details.click_the_E_TMS_App_Access()"
});
formatter.result({
  "duration": 85426173,
  "status": "passed"
});
formatter.match({
  "location": "Negative_Employee_Details.click_the_E_TMS_button()"
});
formatter.result({
  "duration": 123704889,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Save_button()"
});
formatter.result({
  "duration": 16205833876,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Employee_Details_successfully_registered()"
});
formatter.result({
  "duration": 7144738766,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.clear_the_Employee_name_details()"
});
formatter.result({
  "duration": 3116570074,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maniva",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4342618864,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 86957827,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.delete_the_Employee_Data_in_staff_Details_grid_list()"
});
formatter.result({
  "duration": 8149956741,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca id\u003d\"ContentPlaceHolder1_gvEmpSearch_lnkDelete_0\" class\u003d\"btn removeIcon\" href\u003d\"javascript:WebForm_DoPostBackWithOptions(new WebForm_PostBackOptions(\u0026quot;ctl00$ContentPlaceHolder1$gvEmpSearch$ctl02$lnkDelete\u0026quot;, \u0026quot;\u0026quot;, true, \u0026quot;\u0026quot;, \u0026quot;\u0026quot;, false, true))\"\u003e\u003c/a\u003e is not clickable at point (1181, 323). Other element would receive the click: \u003cdiv class\u003d\"fullscreen\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027INFO-LTP-014\u0027, ip: \u0027192.168.1.95\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\Mani\\AppData\\Local\\Temp\\scoped_dir28208_24308}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d75.0.3770.142, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 60069dcbbd5f211bd7666d5d573bf796\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat com.cucumber.framework.InfoTech.Leave_Software.Deleteicon(Leave_Software.java:291)\r\n\tat com.cucumber.framework.stepdefinition.InfoTech_cloud.Leave_Software_Step.delete_the_Employee_Data_in_staff_Details_grid_list(Leave_Software_Step.java:211)\r\n\tat ✽.Then Delete the Employee Data in staff Details grid list(featurefile/Basic_Employee_Details/E-TMS.feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 55
    }
  ],
  "location": "Leave_Software_Step.enter_the_password_in_Delete_Confirmation_pop_up_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Delete_button_in_Delete_confirmation_pop_up_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Delete_button_is_working_properly()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 12349622123,
  "status": "passed"
});
formatter.uri("featurefile/Basic_Employee_Details/EPayroll_Basic.feature");
formatter.feature({
  "line": 2,
  "name": "verify Employee_Basic_Details_Positive_flow",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Positive_flow"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify Cash amount is 100 percentage in Payroll app",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-cash-amount-is-100-percentage-in-payroll-app",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Then click the close button"
    }
  ],
  "line": 12,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click the Info Payroll application",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verify the Payroll software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Code \"\u003cEmployeeCodes\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter the Employee Name \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Gender field \"\u003cGender\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Select the Marital status \"\u003cMaritalstatus\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Email Address \"\u003cEmailAddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Mobile Number \"\u003cMobileNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the Join Date \"\u003cJoinDate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter the NRIC number \"\u003cNRICnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Enter the Fin id number \"T7h2122\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click the E-Payroll App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the E-Payroll  button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click the Birth date \"12-12-2001\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Select the Employee cpf \"200618119NPTE01\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Enter the Basic salary \"2000\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Verify the percentage in salary mode",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "click the Additional button",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Select the Nationlaity in Additional Tab \"INDIAN\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.examples({
  "line": 49,
  "name": "",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-cash-amount-is-100-percentage-in-payroll-app;",
  "rows": [
    {
      "cells": [
        "EmployeeCodes",
        "EmployeeName",
        "Gender",
        "Maritalstatus",
        "EmailAddress",
        "MobileNumber",
        "JoinDate",
        "NRICnumber",
        "Final"
      ],
      "line": 50,
      "id": "verify-employee-basic-details-positive-flow;verify-cash-amount-is-100-percentage-in-payroll-app;;1"
    },
    {
      "cells": [
        "mani008",
        "manimss",
        "MALE",
        "Single",
        "maniss@mailinator.com",
        "96666669",
        "12-12-2018",
        "S9247710Z",
        "testmani2"
      ],
      "line": 51,
      "id": "verify-employee-basic-details-positive-flow;verify-cash-amount-is-100-percentage-in-payroll-app;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8507860148,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "verify Cash amount is 100 percentage in Payroll app",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-cash-amount-is-100-percentage-in-payroll-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Positive_flow"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Then click the close button"
    }
  ],
  "line": 12,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click the Info Payroll application",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verify the Payroll software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the Employee name in search text field \"manimss\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Code \"mani008\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter the Employee Name \"manimss\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Gender field \"MALE\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Select the Marital status \"Single\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Email Address \"maniss@mailinator.com\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Mobile Number \"96666669\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the Join Date \"12-12-2018\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter the NRIC number \"S9247710Z\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Enter the Fin id number \"T7h2122\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click the E-Payroll App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the E-Payroll  button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click the Birth date \"12-12-2001\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Select the Employee cpf \"200618119NPTE01\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Enter the Basic salary \"2000\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Verify the percentage in salary mode",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "click the Additional button",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Select the Nationlaity in Additional Tab \"INDIAN\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Enter the Employee name in search text field \"manimss\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 16948988050,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testmani2@1.com",
      "offset": 46
    }
  ],
  "location": "Login_infotech.enter_the_usernamesdsdsds_in_username_field(String)"
});
formatter.result({
  "duration": 142054321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 48
    }
  ],
  "location": "Login_infotech.enter_the_valid_passwordsdsd_in_password_field(String)"
});
formatter.result({
  "duration": 5170736593,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "duration": 4195126124,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.verify_the_applicationsssaadsasds_successfully()"
});
formatter.result({
  "duration": 56845827,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_change_app_button()"
});
formatter.result({
  "duration": 4130239210,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Info_Payroll_application()"
});
formatter.result({
  "duration": 1383554370,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Payroll_software_application_is_visible_properly()"
});
formatter.result({
  "duration": 7145377580,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_master_icon()"
});
formatter.result({
  "duration": 7203615210,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Employee_Basic_Details()"
});
formatter.result({
  "duration": 5577880494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manimss",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4387142321,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 91771655,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_employee_name_already_grid_list_or_not()"
});
formatter.result({
  "duration": 108106482173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 37
    }
  ],
  "location": "Leave_Software_Step.click_the_Delete_confimation_pop_up(String)"
});
formatter.result({
  "duration": 108121354272,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_New_button()"
});
formatter.result({
  "duration": 3154171259,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mani008",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Code(String)"
});
formatter.result({
  "duration": 2106061037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manimss",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Name(String)"
});
formatter.result({
  "duration": 12273492148,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MALE",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.select_the_Gender_field(String)"
});
formatter.result({
  "duration": 137812938,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single",
      "offset": 27
    }
  ],
  "location": "Leave_Software_Step.select_the_Marital_status(String)"
});
formatter.result({
  "duration": 137370469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maniss@mailinator.com",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Email_Address(String)"
});
formatter.result({
  "duration": 3409110519,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "96666669",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Mobile_Number(String)"
});
formatter.result({
  "duration": 3291222123,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-12-2018",
      "offset": 21
    }
  ],
  "location": "Leave_Software_Step.enter_the_Join_Date(String)"
});
formatter.result({
  "duration": 471412544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S9247710Z",
      "offset": 23
    }
  ],
  "location": "Leave_Software_Step.enter_the_NRIC_number(String)"
});
formatter.result({
  "duration": 182471111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T7h2122",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Fin_id_number(String)"
});
formatter.result({
  "duration": 156419951,
  "status": "passed"
});
formatter.match({
  "location": "Negative_Employee_Details.click_the_E_Payroll_App_Access()"
});
formatter.result({
  "duration": 3122729086,
  "status": "passed"
});
formatter.match({
  "location": "Negative_Employee_Details.click_the_E_Payroll_button()"
});
formatter.result({
  "duration": 4170313482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-12-2001",
      "offset": 22
    }
  ],
  "location": "Leave_Software_Step.click_the_Birth_date(String)"
});
formatter.result({
  "duration": 236570864,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200618119NPTE01",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.select_the_Employee_cpf(String)"
});
formatter.result({
  "duration": 242265679,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 24
    }
  ],
  "location": "Payroll.enter_the_Basic_salary(String)"
});
formatter.result({
  "duration": 127309432,
  "status": "passed"
});
formatter.match({
  "location": "Payroll.verify_the_percentage_in_salary_mode()"
});
formatter.result({
  "duration": 4105968197,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Additional_button()"
});
formatter.result({
  "duration": 83686716,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INDIAN",
      "offset": 42
    }
  ],
  "location": "Leave_Software_Step.select_the_Nationlaity_in_Additional_Tab(String)"
});
formatter.result({
  "duration": 123128889,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Save_button()"
});
formatter.result({
  "duration": 16237112494,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Employee_Details_successfully_registered()"
});
formatter.result({
  "duration": 107148420740,
  "error_message": "java.lang.AssertionError: Leave_Software_Step is fail expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:496)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.cucumber.framework.stepdefinition.InfoTech_cloud.Leave_Software_Step.verify_the_Employee_Details_successfully_registered(Leave_Software_Step.java:185)\r\n\tat ✽.And Verify the Employee Details successfully registered(featurefile/Basic_Employee_Details/EPayroll_Basic.feature:40)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Leave_Software_Step.clear_the_Employee_name_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "manimss",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.delete_the_Employee_Data_in_staff_Details_grid_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 55
    }
  ],
  "location": "Leave_Software_Step.enter_the_password_in_Delete_Confirmation_pop_up_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Delete_button_in_Delete_confirmation_pop_up_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Delete_button_is_working_properly()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 12679518815,
  "status": "passed"
});
formatter.uri("featurefile/Basic_Employee_Details/Edit_Employee_Details.feature");
formatter.feature({
  "line": 2,
  "name": "verify Edit employee code,Eamil id,Email name and Mobile number",
  "description": "",
  "id": "verify-edit-employee-code,eamil-id,email-name-and-mobile-number",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Edit_scenario"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify Edit employee code,Eamil id,Email name and Mobile number",
  "description": "",
  "id": "verify-edit-employee-code,eamil-id,email-name-and-mobile-number;verify-edit-employee-code,eamil-id,email-name-and-mobile-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Info_Leave icon",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the leave software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employee name in search text field \"THIRD\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Edit the icon in staff master",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Enter the Employee Name \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Enter the Email Address \"\u003cEmailAddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the Mobile Number \"\u003cMobileNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#Then click the App Access"
    }
  ],
  "line": 23,
  "name": "click the E Levae button button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the final Approver \"\u003cFinal\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "click the Update button in Staff details",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "verify-edit-employee-code,eamil-id,email-name-and-mobile-number;verify-edit-employee-code,eamil-id,email-name-and-mobile-number;",
  "rows": [
    {
      "cells": [
        "EmployeeName",
        "Gender",
        "Maritalstatus",
        "EmailAddress",
        "MobileNumber",
        "Final"
      ],
      "line": 28,
      "id": "verify-edit-employee-code,eamil-id,email-name-and-mobile-number;verify-edit-employee-code,eamil-id,email-name-and-mobile-number;;1"
    },
    {
      "cells": [
        "mani006",
        "MALE",
        "Single",
        "mankannan@mailinator.com",
        "96666667",
        "testmani2"
      ],
      "line": 29,
      "id": "verify-edit-employee-code,eamil-id,email-name-and-mobile-number;verify-edit-employee-code,eamil-id,email-name-and-mobile-number;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 22291884247,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Verify Edit employee code,Eamil id,Email name and Mobile number",
  "description": "",
  "id": "verify-edit-employee-code,eamil-id,email-name-and-mobile-number;verify-edit-employee-code,eamil-id,email-name-and-mobile-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Edit_scenario"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Info_Leave icon",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the leave software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employee name in search text field \"THIRD\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Edit the icon in staff master",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Enter the Employee Name \"mani006\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Enter the Email Address \"mankannan@mailinator.com\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the Mobile Number \"96666667\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#Then click the App Access"
    }
  ],
  "line": 23,
  "name": "click the E Levae button button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the final Approver \"testmani2\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "click the Update button in Staff details",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 21150334419,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testmani2@1.com",
      "offset": 46
    }
  ],
  "location": "Login_infotech.enter_the_usernamesdsdsds_in_username_field(String)"
});
formatter.result({
  "duration": 148069926,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 48
    }
  ],
  "location": "Login_infotech.enter_the_valid_passwordsdsd_in_password_field(String)"
});
formatter.result({
  "duration": 5089933432,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "duration": 6051257283,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.verify_the_applicationsssaadsasds_successfully()"
});
formatter.result({
  "duration": 41100247,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_change_app_button()"
});
formatter.result({
  "duration": 4130039704,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Info_Leave_icon()"
});
formatter.result({
  "duration": 2238621629,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_leave_software_application_is_visible_properly()"
});
formatter.result({
  "duration": 69383111,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_master_icon()"
});
formatter.result({
  "duration": 7170024296,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Employee_Basic_Details()"
});
formatter.result({
  "duration": 9125002667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THIRD",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4329955951,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 86287408,
  "status": "passed"
});
formatter.match({
  "location": "Payroll.edit_the_icon_in_staff_master()"
});
formatter.result({
  "duration": 108129967802,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//a[@id\u003d\u0027ContentPlaceHolder1_gvEmpSearch_lnkEdit_0\u0027 and @class\u003d\u0027btn editIcon\u0027]\"}\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027INFO-LTP-014\u0027, ip: \u0027192.168.1.95\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\Mani\\AppData\\Local\\Temp\\scoped_dir26256_192}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d75.0.3770.142, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 9a6eafe9f4f81db0665eb3a731a0536f\n*** Element info: {Using\u003dxpath, value\u003d.//a[@id\u003d\u0027ContentPlaceHolder1_gvEmpSearch_lnkEdit_0\u0027 and @class\u003d\u0027btn editIcon\u0027]}\r\n\tat sun.reflect.GeneratedConstructorAccessor24.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat com.cucumber.framework.Payroll_page.Payrolls_page.editicon_staffmaster(Payrolls_page.java:277)\r\n\tat com.cucumber.framework.stepdefinition.Employee_PayRoll.Payroll.edit_the_icon_in_staff_master(Payroll.java:211)\r\n\tat ✽.Then Edit the icon in staff master(featurefile/Basic_Employee_Details/Edit_Employee_Details.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "mani006",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "mankannan@mailinator.com",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Email_Address(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "96666667",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Mobile_Number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_E_Levae_button_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "testmani2",
      "offset": 27
    }
  ],
  "location": "Leave_Software_Step.select_the_final_Approver(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Payroll.click_the_Update_button_in_Staff_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Employee_Details_successfully_registered()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 12434269235,
  "status": "passed"
});
formatter.uri("featurefile/Basic_Employee_Details/EpayRoll_fund.feature");
formatter.feature({
  "line": 2,
  "name": "verify Employee_Basic_Details_Negative_Scenario",
  "description": "",
  "id": "verify-employee-basic-details-negative-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Negative_Scenario"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify fund should be display based on the Race Details in Payroll app",
  "description": "",
  "id": "verify-employee-basic-details-negative-scenario;verify-fund-should-be-display-based-on-the-race-details-in-payroll-app",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Then click the close button"
    }
  ],
  "line": 12,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click the Info Payroll application",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verify the Payroll software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Code \"\u003cEmployeeCodes\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter the Employee Name \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Gender field \"\u003cGender\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Select the Marital status \"\u003cMaritalstatus\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Email Address \"\u003cEmailAddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Mobile Number \"\u003cMobileNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the Join Date \"\u003cJoinDate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter the NRIC number \"\u003cNRICnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Enter the Fin id number \"asdd02\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click the E-Payroll App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the E-Payroll  button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click the Birth date \"12-12-2001\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Select the Employee cpf \"200618119NPTE01\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Enter the Basic salary \"2000\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Verify the percentage in salary mode",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Choose the Bank Name \"DBS / POSB BANK\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the Branch Id \"1212131\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Enter the Ac/No \"123456\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "click the Additional button",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Select the Nationlaity in Additional Tab \"SINGAPOREAN\"",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Select the Religion \"HINDU\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Select the Race \"MALAY\"",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "verify the fund selected checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.examples({
  "line": 55,
  "name": "",
  "description": "",
  "id": "verify-employee-basic-details-negative-scenario;verify-fund-should-be-display-based-on-the-race-details-in-payroll-app;",
  "rows": [
    {
      "cells": [
        "EmployeeCodes",
        "EmployeeName",
        "Gender",
        "Maritalstatus",
        "EmailAddress",
        "MobileNumber",
        "JoinDate",
        "NRICnumber",
        "Final"
      ],
      "line": 56,
      "id": "verify-employee-basic-details-negative-scenario;verify-fund-should-be-display-based-on-the-race-details-in-payroll-app;;1"
    },
    {
      "cells": [
        "mani100",
        "subash",
        "MALE",
        "Single",
        "subash@mailinator.com",
        "96666612",
        "12-12-2018",
        "S9247710Z",
        "testmani2"
      ],
      "line": 57,
      "id": "verify-employee-basic-details-negative-scenario;verify-fund-should-be-display-based-on-the-race-details-in-payroll-app;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9071142716,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "verify fund should be display based on the Race Details in Payroll app",
  "description": "",
  "id": "verify-employee-basic-details-negative-scenario;verify-fund-should-be-display-based-on-the-race-details-in-payroll-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Negative_Scenario"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Then click the close button"
    }
  ],
  "line": 12,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click the Info Payroll application",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verify the Payroll software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter the Employee name in search text field \"subash\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Code \"mani100\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter the Employee Name \"subash\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Gender field \"MALE\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Select the Marital status \"Single\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Email Address \"subash@mailinator.com\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Mobile Number \"96666612\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the Join Date \"12-12-2018\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter the NRIC number \"S9247710Z\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Enter the Fin id number \"asdd02\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click the E-Payroll App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the E-Payroll  button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click the Birth date \"12-12-2001\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Select the Employee cpf \"200618119NPTE01\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Enter the Basic salary \"2000\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Verify the percentage in salary mode",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Choose the Bank Name \"DBS / POSB BANK\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the Branch Id \"1212131\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "Enter the Ac/No \"123456\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "click the Additional button",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Select the Nationlaity in Additional Tab \"SINGAPOREAN\"",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Select the Religion \"HINDU\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Select the Race \"MALAY\"",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "verify the fund selected checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Enter the Employee name in search text field \"subash\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 6241889975,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testmani2@1.com",
      "offset": 46
    }
  ],
  "location": "Login_infotech.enter_the_usernamesdsdsds_in_username_field(String)"
});
formatter.result({
  "duration": 130496395,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 48
    }
  ],
  "location": "Login_infotech.enter_the_valid_passwordsdsd_in_password_field(String)"
});
formatter.result({
  "duration": 5098565926,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "duration": 22496911803,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.verify_the_applicationsssaadsasds_successfully()"
});
formatter.result({
  "duration": 126407901,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_change_app_button()"
});
formatter.result({
  "duration": 4149162667,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Info_Payroll_application()"
});
formatter.result({
  "duration": 1804900345,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Payroll_software_application_is_visible_properly()"
});
formatter.result({
  "duration": 7137135803,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_master_icon()"
});
formatter.result({
  "duration": 7169292247,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Employee_Basic_Details()"
});
formatter.result({
  "duration": 5097782518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "subash",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4328157235,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 83409778,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_employee_name_already_grid_list_or_not()"
});
formatter.result({
  "duration": 8174133333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 37
    }
  ],
  "location": "Leave_Software_Step.click_the_Delete_confimation_pop_up(String)"
});
formatter.result({
  "duration": 10348437333,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_New_button()"
});
formatter.result({
  "duration": 3151068444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mani100",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Code(String)"
});
formatter.result({
  "duration": 1572969481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "subash",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Name(String)"
});
formatter.result({
  "duration": 12342012840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MALE",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.select_the_Gender_field(String)"
});
formatter.result({
  "duration": 159566222,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single",
      "offset": 27
    }
  ],
  "location": "Leave_Software_Step.select_the_Marital_status(String)"
});
formatter.result({
  "duration": 145812938,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "subash@mailinator.com",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Email_Address(String)"
});
formatter.result({
  "duration": 3437521383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "96666612",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Mobile_Number(String)"
});
formatter.result({
  "duration": 3264184099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-12-2018",
      "offset": 21
    }
  ],
  "location": "Leave_Software_Step.enter_the_Join_Date(String)"
});
formatter.result({
  "duration": 424849778,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S9247710Z",
      "offset": 23
    }
  ],
  "location": "Leave_Software_Step.enter_the_NRIC_number(String)"
});
formatter.result({
  "duration": 191937185,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asdd02",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Fin_id_number(String)"
});
formatter.result({
  "duration": 147610074,
  "status": "passed"
});
formatter.match({
  "location": "Negative_Employee_Details.click_the_E_Payroll_App_Access()"
});
formatter.result({
  "duration": 3154978765,
  "status": "passed"
});
formatter.match({
  "location": "Negative_Employee_Details.click_the_E_Payroll_button()"
});
formatter.result({
  "duration": 4180079012,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-12-2001",
      "offset": 22
    }
  ],
  "location": "Leave_Software_Step.click_the_Birth_date(String)"
});
formatter.result({
  "duration": 281161481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200618119NPTE01",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.select_the_Employee_cpf(String)"
});
formatter.result({
  "duration": 184152889,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 24
    }
  ],
  "location": "Payroll.enter_the_Basic_salary(String)"
});
formatter.result({
  "duration": 126407111,
  "status": "passed"
});
formatter.match({
  "location": "Payroll.verify_the_percentage_in_salary_mode()"
});
formatter.result({
  "duration": 4156576000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DBS / POSB BANK",
      "offset": 22
    }
  ],
  "location": "Payroll.choose_the_Bank_Name(String)"
});
formatter.result({
  "duration": 227867655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1212131",
      "offset": 21
    }
  ],
  "location": "Payroll.enter_the_Branch_Id(String)"
});
formatter.result({
  "duration": 131301926,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 17
    }
  ],
  "location": "Payroll.enter_the_Ac_No(String)"
});
formatter.result({
  "duration": 130247111,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Additional_button()"
});
formatter.result({
  "duration": 138663111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SINGAPOREAN",
      "offset": 42
    }
  ],
  "location": "Leave_Software_Step.select_the_Nationlaity_in_Additional_Tab(String)"
});
formatter.result({
  "duration": 177353482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HINDU",
      "offset": 21
    }
  ],
  "location": "Payroll.select_the_Religion(String)"
});
formatter.result({
  "duration": 135558321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MALAY",
      "offset": 17
    }
  ],
  "location": "Payroll.select_the_Race(String)"
});
formatter.result({
  "duration": 145745382,
  "status": "passed"
});
formatter.match({
  "location": "Payroll.verify_the_fund_selected_checkbox()"
});
formatter.result({
  "duration": 53460938,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Save_button()"
});
formatter.result({
  "duration": 16195665778,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Employee_Details_successfully_registered()"
});
formatter.result({
  "duration": 7108911803,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.clear_the_Employee_name_details()"
});
formatter.result({
  "duration": 3128448000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "subash",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4319430321,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 84828840,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.delete_the_Employee_Data_in_staff_Details_grid_list()"
});
formatter.result({
  "duration": 8145863111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 55
    }
  ],
  "location": "Leave_Software_Step.enter_the_password_in_Delete_Confirmation_pop_up_page(String)"
});
formatter.result({
  "duration": 8194354568,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Delete_button_in_Delete_confirmation_pop_up_page()"
});
formatter.result({
  "duration": 2150537481,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Delete_button_is_working_properly()"
});
formatter.result({
  "duration": 7111038024,
  "status": "passed"
});
formatter.after({
  "duration": 12014531161,
  "status": "passed"
});
formatter.uri("featurefile/Basic_Employee_Details/Leave.feature");
formatter.feature({
  "line": 2,
  "name": "verify Employee_Basic_Details_Positive_flow",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Positive_flow"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify positive flow in  Leave App access",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-positive-flow-in--leave-app-access",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Info_Leave icon",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the leave software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the Employee Code \"\u003cEmployeeCodes\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Name \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Select the Gender field \"\u003cGender\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Marital status \"\u003cMaritalstatus\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Enter the Email Address \"\u003cEmailAddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Mobile Number \"\u003cMobileNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Join Date \"\u003cJoinDate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the NRIC number \"\u003cNRICnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "click the App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click the E Levae button button",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Select the final Approver \"\u003cFinal\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-positive-flow-in--leave-app-access;",
  "rows": [
    {
      "cells": [
        "EmployeeCodes",
        "EmployeeName",
        "Gender",
        "Maritalstatus",
        "EmailAddress",
        "MobileNumber",
        "JoinDate",
        "NRICnumber",
        "Final"
      ],
      "line": 43,
      "id": "verify-employee-basic-details-positive-flow;verify-positive-flow-in--leave-app-access;;1"
    },
    {
      "cells": [
        "mithra007",
        "mithra",
        "MALE",
        "Single",
        "mithra@mailinator.com",
        "96666619",
        "12-12-2018",
        "S2390023H",
        "testmani2"
      ],
      "line": 44,
      "id": "verify-employee-basic-details-positive-flow;verify-positive-flow-in--leave-app-access;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8834082371,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "verify positive flow in  Leave App access",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-positive-flow-in--leave-app-access;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Positive_flow"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Info_Leave icon",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the leave software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employee name in search text field \"mithra\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the Employee Code \"mithra007\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Name \"mithra\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Select the Gender field \"MALE\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Marital status \"Single\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Enter the Email Address \"mithra@mailinator.com\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Mobile Number \"96666619\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Join Date \"12-12-2018\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the NRIC number \"S2390023H\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "click the App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click the E Levae button button",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Select the final Approver \"testmani2\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Enter the Employee name in search text field \"mithra\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 4538265284,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testmani2@1.com",
      "offset": 46
    }
  ],
  "location": "Login_infotech.enter_the_usernamesdsdsds_in_username_field(String)"
});
formatter.result({
  "duration": 143242271,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 48
    }
  ],
  "location": "Login_infotech.enter_the_valid_passwordsdsd_in_password_field(String)"
});
formatter.result({
  "duration": 5125176099,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "duration": 3421745383,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.verify_the_applicationsssaadsasds_successfully()"
});
formatter.result({
  "duration": 63378963,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_change_app_button()"
});
formatter.result({
  "duration": 4172841086,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Info_Leave_icon()"
});
formatter.result({
  "duration": 1931453630,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_leave_software_application_is_visible_properly()"
});
formatter.result({
  "duration": 629587358,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_master_icon()"
});
formatter.result({
  "duration": 7155356840,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Employee_Basic_Details()"
});
formatter.result({
  "duration": 7998373136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mithra",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4342992593,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 100090074,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_employee_name_already_grid_list_or_not()"
});
formatter.result({
  "duration": 8151290865,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 37
    }
  ],
  "location": "Leave_Software_Step.click_the_Delete_confimation_pop_up(String)"
});
formatter.result({
  "duration": 10333536000,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_New_button()"
});
formatter.result({
  "duration": 3131940741,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mithra007",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Code(String)"
});
formatter.result({
  "duration": 1431421630,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mithra",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Name(String)"
});
formatter.result({
  "duration": 12276514370,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MALE",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.select_the_Gender_field(String)"
});
formatter.result({
  "duration": 134460444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single",
      "offset": 27
    }
  ],
  "location": "Leave_Software_Step.select_the_Marital_status(String)"
});
formatter.result({
  "duration": 144730469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mithra@mailinator.com",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Email_Address(String)"
});
formatter.result({
  "duration": 3409815704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "96666619",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Mobile_Number(String)"
});
formatter.result({
  "duration": 3319299951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-12-2018",
      "offset": 21
    }
  ],
  "location": "Leave_Software_Step.enter_the_Join_Date(String)"
});
formatter.result({
  "duration": 407722272,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S2390023H",
      "offset": 23
    }
  ],
  "location": "Leave_Software_Step.enter_the_NRIC_number(String)"
});
formatter.result({
  "duration": 176936691,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_App_Access()"
});
formatter.result({
  "duration": 9142216691,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_E_Levae_button_button()"
});
formatter.result({
  "duration": 98215901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testmani2",
      "offset": 27
    }
  ],
  "location": "Leave_Software_Step.select_the_final_Approver(String)"
});
formatter.result({
  "duration": 145377185,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Save_button()"
});
formatter.result({
  "duration": 16201412741,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Employee_Details_successfully_registered()"
});
formatter.result({
  "duration": 7128821333,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.clear_the_Employee_name_details()"
});
formatter.result({
  "duration": 3115980247,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mithra",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4328691358,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 83042765,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.delete_the_Employee_Data_in_staff_Details_grid_list()"
});
formatter.result({
  "duration": 8159546864,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 55
    }
  ],
  "location": "Leave_Software_Step.enter_the_password_in_Delete_Confirmation_pop_up_page(String)"
});
formatter.result({
  "duration": 8203873581,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Delete_button_in_Delete_confirmation_pop_up_page()"
});
formatter.result({
  "duration": 2144023308,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Delete_button_is_working_properly()"
});
formatter.result({
  "duration": 7140846222,
  "status": "passed"
});
formatter.after({
  "duration": 12026013235,
  "status": "passed"
});
formatter.uri("featurefile/Basic_Employee_Details/Mobile.feature");
formatter.feature({
  "line": 2,
  "name": "verify Employee_Basic_Details_Positive_flow",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Positive_flow"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify the Positive flow in Mobile Module",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-the-positive-flow-in-mobile-module",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Info Payroll application",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the Payroll software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the Employee Code \"\u003cEmployeeCodes\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Name \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Select the Gender field \"\u003cGender\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Marital status \"\u003cMaritalstatus\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Enter the Email Address \"\u003cEmailAddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Mobile Number \"\u003cMobileNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Join Date \"\u003cJoinDate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the NRIC number \"\u003cNRICnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter the Fin id number \"T0jhj2112\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click the E-Payroll App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click the E-Payroll  button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the Birth date \"12-12-2001\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Select the Employee cpf \"200618119NPTE01\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Enter the Basic salary \"2000\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click the Additional button",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Select the Nationlaity in Additional Tab \"INDIAN\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Enter the Employee name in search text field \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.examples({
  "line": 47,
  "name": "",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-the-positive-flow-in-mobile-module;",
  "rows": [
    {
      "cells": [
        "EmployeeCodes",
        "EmployeeName",
        "Gender",
        "Maritalstatus",
        "EmailAddress",
        "MobileNumber",
        "JoinDate",
        "NRICnumber",
        "Final"
      ],
      "line": 48,
      "id": "verify-employee-basic-details-positive-flow;verify-the-positive-flow-in-mobile-module;;1"
    },
    {
      "cells": [
        "ayyapan002",
        "ayyaps",
        "MALE",
        "Single",
        "ayyaps@mailinator.com",
        "96666620",
        "12-12-2018",
        "S9247710Z",
        "testmani2"
      ],
      "line": 49,
      "id": "verify-employee-basic-details-positive-flow;verify-the-positive-flow-in-mobile-module;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6792737185,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "verify the Positive flow in Mobile Module",
  "description": "",
  "id": "verify-employee-basic-details-positive-flow;verify-the-positive-flow-in-mobile-module;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Employee_Basic_Details_Positive_flow"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify the applicationsssaadsasds successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click the change app button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click the Info Payroll application",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the Payroll software application is visible properly",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the master icon",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click the Employee Basic Details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employee name in search text field \"ayyaps\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "verify employee name already grid list or not",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click the Delete confimation pop up \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click the New button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Enter the Employee Code \"ayyapan002\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Enter the Employee Name \"ayyaps\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Select the Gender field \"MALE\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Select the Marital status \"Single\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Enter the Email Address \"ayyaps@mailinator.com\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Enter the Mobile Number \"96666620\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter the Join Date \"12-12-2018\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Enter the NRIC number \"S9247710Z\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Enter the Fin id number \"T0jhj2112\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "click the E-Payroll App Access",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click the E-Payroll  button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click the Birth date \"12-12-2001\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Select the Employee cpf \"200618119NPTE01\"",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Enter the Basic salary \"2000\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "click the Additional button",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Select the Nationlaity in Additional Tab \"INDIAN\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "click the Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Verify the Employee Details successfully registered",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "clear the Employee name details",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Enter the Employee name in search text field \"ayyaps\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "click the Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Delete the Employee Data in staff Details grid list",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "Enter the password in Delete Confirmation pop up page \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "click the Delete  button in Delete confirmation pop up page.",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "verify the Delete button is working properly",
  "keyword": "And "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 5512996345,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testmani2@1.com",
      "offset": 46
    }
  ],
  "location": "Login_infotech.enter_the_usernamesdsdsds_in_username_field(String)"
});
formatter.result({
  "duration": 137760395,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 48
    }
  ],
  "location": "Login_infotech.enter_the_valid_passwordsdsd_in_password_field(String)"
});
formatter.result({
  "duration": 5077423408,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "duration": 2627713975,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.verify_the_applicationsssaadsasds_successfully()"
});
formatter.result({
  "duration": 61204543,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_change_app_button()"
});
formatter.result({
  "duration": 4150298469,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Info_Payroll_application()"
});
formatter.result({
  "duration": 1238480197,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Payroll_software_application_is_visible_properly()"
});
formatter.result({
  "duration": 7092391507,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_master_icon()"
});
formatter.result({
  "duration": 7160491061,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Employee_Basic_Details()"
});
formatter.result({
  "duration": 5303858568,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ayyaps",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "duration": 4349765136,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "duration": 83102815,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_employee_name_already_grid_list_or_not()"
});
formatter.result({
  "duration": 108090693531,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 37
    }
  ],
  "location": "Leave_Software_Step.click_the_Delete_confimation_pop_up(String)"
});
formatter.result({
  "duration": 108110936889,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_New_button()"
});
formatter.result({
  "duration": 3145974519,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ayyapan002",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Code(String)"
});
formatter.result({
  "duration": 4419349334,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ayyaps",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_Name(String)"
});
formatter.result({
  "duration": 12303927309,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MALE",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.select_the_Gender_field(String)"
});
formatter.result({
  "duration": 139108741,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Single",
      "offset": 27
    }
  ],
  "location": "Leave_Software_Step.select_the_Marital_status(String)"
});
formatter.result({
  "duration": 129303704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ayyaps@mailinator.com",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Email_Address(String)"
});
formatter.result({
  "duration": 3409954765,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "96666620",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Mobile_Number(String)"
});
formatter.result({
  "duration": 3320858469,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-12-2018",
      "offset": 21
    }
  ],
  "location": "Leave_Software_Step.enter_the_Join_Date(String)"
});
formatter.result({
  "duration": 447376593,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S9247710Z",
      "offset": 23
    }
  ],
  "location": "Leave_Software_Step.enter_the_NRIC_number(String)"
});
formatter.result({
  "duration": 180373728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "T0jhj2112",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.enter_the_Fin_id_number(String)"
});
formatter.result({
  "duration": 175163654,
  "status": "passed"
});
formatter.match({
  "location": "Negative_Employee_Details.click_the_E_Payroll_App_Access()"
});
formatter.result({
  "duration": 3139382914,
  "status": "passed"
});
formatter.match({
  "location": "Negative_Employee_Details.click_the_E_Payroll_button()"
});
formatter.result({
  "duration": 4187275852,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12-12-2001",
      "offset": 22
    }
  ],
  "location": "Leave_Software_Step.click_the_Birth_date(String)"
});
formatter.result({
  "duration": 282125037,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200618119NPTE01",
      "offset": 25
    }
  ],
  "location": "Leave_Software_Step.select_the_Employee_cpf(String)"
});
formatter.result({
  "duration": 176156049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 24
    }
  ],
  "location": "Payroll.enter_the_Basic_salary(String)"
});
formatter.result({
  "duration": 132692938,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Additional_button()"
});
formatter.result({
  "duration": 120261136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INDIAN",
      "offset": 42
    }
  ],
  "location": "Leave_Software_Step.select_the_Nationlaity_in_Additional_Tab(String)"
});
formatter.result({
  "duration": 109898667,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Save_button()"
});
formatter.result({
  "duration": 16189615802,
  "status": "passed"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Employee_Details_successfully_registered()"
});
formatter.result({
  "duration": 107401658469,
  "error_message": "java.lang.AssertionError: Leave_Software_Step is fail expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:496)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat com.cucumber.framework.stepdefinition.InfoTech_cloud.Leave_Software_Step.verify_the_Employee_Details_successfully_registered(Leave_Software_Step.java:185)\r\n\tat ✽.And Verify the Employee Details successfully registered(featurefile/Basic_Employee_Details/Mobile.feature:38)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Leave_Software_Step.clear_the_Employee_name_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ayyaps",
      "offset": 46
    }
  ],
  "location": "Leave_Software_Step.enter_the_Employee_name_in_search_text_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.delete_the_Employee_Data_in_staff_Details_grid_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 55
    }
  ],
  "location": "Leave_Software_Step.enter_the_password_in_Delete_Confirmation_pop_up_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.click_the_Delete_button_in_Delete_confirmation_pop_up_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Leave_Software_Step.verify_the_Delete_button_is_working_properly()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 10175262420,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027INFO-LTP-014\u0027, ip: \u0027192.168.1.95\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\Mani\\AppData\\Local\\Temp\\scoped_dir2244_23256}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d75.0.3770.142, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 4b2219272ed36ffb25b4da0611bdcae9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:698)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:386)\r\n\tat com.cucumber.framework.helper.TestBase.TestBase.after(TestBase.java:194)\r\n\tat sun.reflect.GeneratedMethodAccessor43.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.GeneratedMethodAccessor44.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:85)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:663)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:849)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1157)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:124)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:108)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:771)\r\n\tat org.testng.TestRunner.run(TestRunner.java:621)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:357)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:352)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:310)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:259)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1200)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1125)\r\n\tat org.testng.TestNG.run(TestNG.java:1033)\r\n\tat org.testng.remote.RemoteTestNG.run(RemoteTestNG.java:111)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:204)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:175)\r\n",
  "status": "failed"
});
});