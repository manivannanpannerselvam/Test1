$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/UserAccess/UserAccess_Negative3_po.feature");
formatter.feature({
  "line": 2,
  "name": "verify the InfoTech_cloud negative3",
  "description": "",
  "id": "verify-the-infotech-cloud-negative3",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@InfoTech_Employee_negative3"
    }
  ]
});
formatter.before({
  "duration": 3892240441,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#@PO"
    }
  ],
  "line": 6,
  "name": "verify the UserAccess_with Employee code and App Access for E-Leave and company access is empty",
  "description": "",
  "id": "verify-the-infotech-cloud-negative3;verify-the-useraccess-with-employee-code-and-app-access-for-e-leave-and-company-access-is-empty",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click the submit button",
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
  "name": "click the Administration",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "click the userAccess icon",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click the New buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clear the employee details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Enter the Employe name \"TEST006 [TEST006]\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "click the Employee name in drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click the App Access button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Select the E-Leave Access drop down list \"ALL\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "click the Department Access icon",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "click the E-LEAVE super admin",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click the save button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Veriy User shouldn\u0027t be displayed in grid list",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 3181808011,
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
  "duration": 309304143,
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
  "duration": 5150884526,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "duration": 3312242124,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_Administration()"
});
formatter.result({
  "duration": 11190824154,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_userAccess_icon()"
});
formatter.result({
  "duration": 15018687109,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_New_buttons()"
});
formatter.result({
  "duration": 18226433017,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.clear_the_employee_details()"
});
formatter.result({
  "duration": 9157935684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TEST006 [TEST006]",
      "offset": 24
    }
  ],
  "location": "UserAccess_Positive.enter_the_Employe_name(String)"
});
formatter.result({
  "duration": 9509313277,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_Employee_name_in_drop_down()"
});
formatter.result({
  "duration": 9186123382,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_App_Access_button()"
});
formatter.result({
  "duration": 21194643788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ALL",
      "offset": 42
    }
  ],
  "location": "UserAccess_Positive.select_the_E_Leave_Access_drop_down_list(String)"
});
formatter.result({
  "duration": 17404822705,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_Department_Access_icon()"
});
formatter.result({
  "duration": 21208932391,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_E_LEAVE_super_admin()"
});
formatter.result({
  "duration": 21203072848,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_save_button()"
});
formatter.result({
  "duration": 20186857236,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.veriy_User_shouldn_t_be_displayed_in_grid_list()"
});
formatter.result({
  "duration": 92884385,
  "status": "passed"
});
formatter.after({
  "duration": 12836580424,
  "status": "passed"
});
formatter.uri("featurefile/UserAccess/UserAccess_Negative4_po.feature");
formatter.feature({
  "line": 2,
  "name": "verify the InfoTech_clo negative4",
  "description": "",
  "id": "verify-the-infotech-clo-negative4",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@InfoTech_UserAccess"
    }
  ]
});
formatter.before({
  "duration": 2740854534,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 83,
      "value": "#@PO"
    }
  ],
  "line": 84,
  "name": "verify the UserAccess_with Employee code and  Appaccess only for EClaim and company access is empty and DepAccess is only for Approvals",
  "description": "",
  "id": "verify-the-infotech-clo-negative4;verify-the-useraccess-with-employee-code-and--appaccess-only-for-eclaim-and-company-access-is-empty-and-depaccess-is-only-for-approvals",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 85,
  "name": "open the valid url in InfoTech_cloud application",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "Enter the  usernamesdsdsds in username field \"testmani2@1.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "Enter the valid passwordsdsd in password field \"1\"",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "click the submit button",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 89,
      "value": "#Then click the close button"
    }
  ],
  "line": 90,
  "name": "click the Administration",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "click the userAccess icon",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "click the New buttons",
  "keyword": "Then "
});
formatter.step({
  "line": 93,
  "name": "clear the employee details",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "Enter the Employe name \"TEST006 [TEST006]\"",
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "click the Employee name in drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "click the App Access button",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "Select the E-Claim Access \"ALL\"",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "click the Department Access icon",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "click the E-claim super admin",
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "click the save button",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "Veriy User shouldn\u0027t be displayed in grid list",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_infotech.open_the_valid_url_in_InfoTech_cloud_application()"
});
formatter.result({
  "duration": 3452921972,
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
  "duration": 287476855,
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
  "duration": 5148964701,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_submit_button()"
});
formatter.result({
  "duration": 2333205721,
  "status": "passed"
});
formatter.match({
  "location": "Login_infotech.click_the_Administration()"
});
formatter.result({
  "duration": 11206392126,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_userAccess_icon()"
});
formatter.result({
  "duration": 15046000341,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_New_buttons()"
});
formatter.result({
  "duration": 18250808266,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.clear_the_employee_details()"
});
formatter.result({
  "duration": 9178513878,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TEST006 [TEST006]",
      "offset": 24
    }
  ],
  "location": "UserAccess_Positive.enter_the_Employe_name(String)"
});
formatter.result({
  "duration": 9472972099,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_Employee_name_in_drop_down()"
});
formatter.result({
  "duration": 9158735739,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_App_Access_button()"
});
formatter.result({
  "duration": 21232939686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ALL",
      "offset": 27
    }
  ],
  "location": "UserAccess_Positive.select_the_E_Claim_Access(String)"
});
formatter.result({
  "duration": 17323191948,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_Department_Access_icon()"
});
formatter.result({
  "duration": 21177928848,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_E_claim_super_admin()"
});
formatter.result({
  "duration": 20160530859,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.click_the_save_button()"
});
formatter.result({
  "duration": 26749758290,
  "status": "passed"
});
formatter.match({
  "location": "UserAccess_Positive.veriy_User_shouldn_t_be_displayed_in_grid_list()"
});
formatter.result({
  "duration": 3640667530,
  "status": "passed"
});
formatter.after({
  "duration": 12882997984,
  "status": "passed"
});
});