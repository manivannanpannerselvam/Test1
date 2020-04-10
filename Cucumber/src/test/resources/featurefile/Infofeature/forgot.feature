@InfoTech_Hr_Forgot_Password
Feature: verify the InfoTech_cloud Forgot Password

  #@SanityTest
  Scenario: verify the InfoTech_cloud sigin page with forgot password
    Given open the valid url in InfoTech_cloud application
    Then click the Forgot password icon
    Then Enter the Email in Forgot password page "test088@mailinator.com"
    Then click the Send button
    Then Verify the succcess alert message is displayed

     #@SanityTest
 		 Scenario: Verify the Account lock on multiple wrong password 
   	 Given open the valid url in InfoTech_cloud application
		 Then Enter the  usernamesdsdsds in username field "test009@mailinator.com"
     Then Enter the valid passwordsdsd in password field "324"
     Then click the submit button
     Then Enter the valid passwordsdsd in password field "3243123"
     Then click the submit button
     Then Enter the valid passwordsdsd in password field "3243123"
     Then click the submit button
     Then Enter the valid passwordsdsd in password field "3243123"
     Then click the submit button
     Then Enter the valid passwordsdsd in password field "3243123"
     Then click the submit button
     Then Enter the valid passwordsdsd in password field "3243123"
     Then click the submit button
     And verify the applicatisdfsfdsondgdgdd not  successfully.
     
   
   
  Scenario: verify the InfoTech_cloud sigin page with Invalid Mobile number in forgot password
    Given open the valid url in InfoTech_cloud application
    Then click the Forgot password icon
    Then Enter the Email in Forgot password page "9867841988"
    Then click the Send button
    Then Verify the succcess alert message is displayed
    
    
   #@PO
  #Scenario: verify the InfoTech_cloud sigin page with Invalid  Email id in forgot password
    #Given open the valid url in InfoTech_cloud application
    #Then click the Forgot password icon
    #Then Enter the Email in Forgot password page "demosfsf777"
   #	Then click the Send button
    #Then Verify the succcess alert message is displayed
    #
    #
    #
    #@PO
  #Scenario: verify the InfoTech_cloud sigin page in Password trigger using mobile number
    #Given open the valid url in InfoTech_cloud application
    #Then click the Forgot password icon
    #Then Enter the Email in Forgot password page "98678416"
    #Then click the Send button
    #Then Verify the succcess alert message is displayed
    
    
    
    
    
    
    
    
    
    
    
  #@RegressionTest
  #Scenario: verify the  Two factor Notification triggering using mobile number
    #Given open the valid url in InfoTech_cloud application
    #Then Enter the  usernamesdsdsds in username field "test218@1.com"
    #Then Enter the valid passwordsdsd in password field "1"
    #Then click the submit button
    #Then click the Administration icon
    #Then click the Email Settings icon
    #Then click the  Allow Login with Mobile Number radio icon
    #

    
    
    
    
    
     