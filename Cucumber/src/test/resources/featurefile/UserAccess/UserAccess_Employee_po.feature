@InfoTech_Employee
Feature: verify the InfoTech_cloud UserAccess_Positive_Flow

#@PO
  Scenario: verify the Department Access are empty and company access is partial
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    #Then click the close button
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
    Then click the company access icon
    Then Select the company name list
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list

  #@PO
  Scenario: verify the company name is empty and Department Access is only for  Approvals
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    #Then click the close button
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
    Then click the Department Access icon
    Then click the Approver icon
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list

  #@PO
  Scenario: verify the company name is empty and Department Access is empty
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    #Then click the close button
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
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list

  #@PO
  Scenario: verify the Appaccess only for leave and company access is empty
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    #Then click the close button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then Enter the valid Display name "NewUsers"
    Then Enter the Primary Email "useraccess001@mailinator.com"
    Then Enter the Mobile number "98678412"
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then click the Department Access icon
    Then click the E-TMS super admin
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list

  #@PO
  Scenario: verify the Appaccess only for leave and company access is empty-DepAccess is SuperAdmin
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    #Then click the close button
    Then click the Administration
    Then click the userAccess icon
    Then click the New buttons
    Then Enter the valid Display name "NewUsers"
    Then Enter the Primary Email "useraccess001@mailinator.com"
    Then Enter the Mobile number "98678412"
    Then click the App Access button
    Then Select the E-TMS Access drop down list "ALL"
    Then click the Department Access icon
    Then click the E-TMS super admin
    Then click the save button
    Then Veriy User shouldn't be displayed in grid list