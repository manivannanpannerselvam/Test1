@InfoTech_Edit_user_change
Feature: verify the InfoTech_cloud UserAccess_Edit_User_Change

#@SanityTest
 Scenario: verify Edit the Display name in User Access page
   Given open the valid url in InfoTech_cloud application
   Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
   Then Enter the valid passwordsdsd in password field "1"
   Then click the submit button
   Then click the Administration
   Then click the userAccess icon
   Then Delete the Employee details in grid list
   Then click the New buttons
   Then Enter the valid Display name "ABC"
   Then Enter the Primary Email "ABCd@GMAIL.COM"
   Then Enter the Mobile number "97123456"
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
   Then Click the Edit icon 
   Then Edit the Display name "dd"
   Then click the Update button
   Then Verify Display name should be changed
   Then click the Delete button
 
   
  #@SanityTest
 Scenario: verify Edit the Email name in User Access page
   Given open the valid url in InfoTech_cloud application
   Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
   Then Enter the valid passwordsdsd in password field "1"
   Then click the submit button
   Then click the Administration
   Then click the userAccess icon
   Then click the New buttons
   Then Enter the valid Display name "ABC"
   Then Enter the Primary Email "ABCef@GMAIL.COM"
   Then Enter the Mobile number "97123457"
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
   Then Click the Edit icon 
   Then Clear the Email id 
   Then Edit the Emailid "test512345678@gmail.com"
   Then click the Update button
   Then Verify Eamil id  should be changed

  #@SanityTest
   Scenario: verify Edit the App Access 
   Given open the valid url in InfoTech_cloud application
   Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
   Then Enter the valid passwordsdsd in password field "1"
   Then click the submit button
   Then click the Administration
   Then click the userAccess icon
   Then Click the Edit icon
   Then click the App Access button
   Then Select the E-TMS Access drop down list "EMPLOYEE"
   Then click the Update button
   
   
   
   #@SanityTest
   Scenario: verify Edit the Department Access
   Given open the valid url in InfoTech_cloud application
   Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
   Then Enter the valid passwordsdsd in password field "1"
   Then click the submit button
   Then click the Administration
   Then click the userAccess icon
   Then Click the Edit icon
   Then click the Department Access icon
   Then click the E-PAYROLL super admin
   Then click the Update button
   
   
  # @SanityTest
   Scenario: verify DeActivated user 
   Given open the valid url in InfoTech_cloud application
   Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
   Then Enter the valid passwordsdsd in password field "1"
   Then click the submit button
   Then click the Administration
   Then click the userAccess icon
   Then click the deactivate icon
   
   
   #@SanityTest
  Scenario: verify Activated user
  Given open the valid url in InfoTech_cloud application
  Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
  Then Enter the valid passwordsdsd in password field "1"
  Then click the submit button
  Then click the Administration
  Then click the userAccess icon
  Then click the Activate icon
  Then click the Activate User
  Then click the Delete button  
  
  
 # @SanityTest
  Scenario: verify Login as a Deactivate User
  Given open the valid url in InfoTech_cloud application
  Then Enter the  usernamesdsdsds in username field "test333@1.com"
  Then Enter the valid passwordsdsd in password field "1"
  Then click the submit button
  And verify the applicatisdfsfdsondgdgdd not  successfully.
  
   
   
  
  
  
  
   
    
