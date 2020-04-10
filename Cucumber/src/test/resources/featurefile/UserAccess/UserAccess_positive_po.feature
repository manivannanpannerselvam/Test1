@InfoTech_UserAccess
Feature: verify the InfoTech_cloud positive


  Scenario: verify the enter the all details and click the cancelbutton
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then Enter the valid Display name "NewUsers"
    Then Enter the Primary Email "useraccess001@mailinator.com"
    Then Enter the Mobile number "98678412"
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then Select the E-Leave Access drop down list "ALL"
    Then Select the E-PayRoll Access "ALL"
    Then Select the Mobile Attendance Access "ALL"
    Then Select the E-Claim Access "ALL"
    Then click the cancel button
    Then Veriy userdetails shouldn't displayed in grid list
    
    
  Scenario: verify  enter employee code and click the cancelbutton
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then clear the employee details
    Then Enter the Employe name "TEST006 [TEST006]"
    Then click the Employee name in drop down
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then Select the E-Leave Access drop down list "ALL"
    Then Select the E-PayRoll Access "ALL"
    Then Select the Mobile Attendance Access "ALL"
    Then Select the E-Claim Access "ALL"
    Then click the cancel button
    Then Veriy userdetails shouldn't displayed in grid list

  
  Scenario: verify the UserAccess_with Employee code and Department Access only for Approver and All company Access for this user
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then clear the employee details
    Then Enter the Employe name "TEST006 [TEST006]"
    Then click the Employee name in drop down
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then Select the E-Leave Access drop down list "ALL"
    Then Select the E-PayRoll Access "ALL"
    Then Select the Mobile Attendance Access "ALL"
    Then Select the E-Claim Access "ALL"
    Then click the company access icon
    Then Select the company name list
    Then select the second company name list
    Then click the Department Access icon
    Then click the Approver icon
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list

  
  Scenario: verify the UserAccess_with Employee code and Department Access is empty
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then clear the employee details
    Then Enter the Employe name "TEST006 [TEST006]"
    Then click the Employee name in drop down
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then Select the E-Leave Access drop down list "ALL"
    Then Select the E-PayRoll Access "ALL"
    Then Select the Mobile Attendance Access "ALL"
    Then Select the E-Claim Access "ALL"
    Then click the company access icon
    Then Select the company name list
    Then select the second company name list
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list

  
  Scenario: verify the UserAccess_with Employee code and only for  E-TMS App Access and company is empty
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then clear the employee details
    Then Enter the Employe name "TEST006 [TEST006]"
    Then click the Employee name in drop down
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then click the Department Access icon
    Then click the E-TMS super admin
    Then click the E-TMS Aprrover
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list

  
  Scenario: verify the UserAccess_with Employee code and Appaccess only for E-TMS and company access is empty-DepAccess is SuperAdmin
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then clear the employee details
    Then Enter the Employe name "TEST006 [TEST006]"
    Then click the Employee name in drop down
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then click the Department Access icon
    Then click the E-TMS super admin
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list

  
  Scenario: verify the UserAccess_with Employee code and Appaccess only for E-TMS and company access is empty and DepAccess is only for Approvals
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then clear the employee details
    Then Enter the Employe name "TEST006 [TEST006]"
    Then click the Employee name in drop down
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then click the Department Access icon
    Then click the E-TMS Aprrover
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list
    