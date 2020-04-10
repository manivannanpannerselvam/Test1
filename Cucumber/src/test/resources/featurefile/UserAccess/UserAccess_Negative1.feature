@InfoTech_Employee_negative1
Feature: verify the InfoTech_ negative1


 #@SanityTest
  Scenario: verify the UserAccess_with Employee code
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    #Then click the close button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then Delete the Employee details in grid list
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
    Then click the Department Access icon
    Then click the Super Admin icon
    Then click the save button
    Then Veriy employee code should be displayed in grid list
    Then click the Delete button

 #@SanityTest
  Scenario: verify the UserAccess_with Employee code and Department Access is SuperAdmin, Approvers
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    #Then click the close button
    Then click the Administration
    Then click the userAccess icon
    Then Delete the Employee details in grid list
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
    Then click the Department Access icon
    Then click the Super Admin icon
    Then click the Approver icon
    Then click the save button
    Then Veriy employee code should be displayed in grid list
    Then click the Delete button

  

 # @SanityTest
  Scenario: verify the UserAccess_with Employee code and All company Access for this user
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    #Then click the close button
    Then click the Administration
    Then click the userAccess icon
    Then Delete the Employee details in grid list
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
    Then click the Super Admin icon
    Then click the save button
    Then Veriy employee code should be displayed in grid list
    Then click the Delete button
