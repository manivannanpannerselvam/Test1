 @InfoTech_Hr_Forgot_Password
Feature: verify the InfoTech_cloud Forgot Password


  Scenario: verify the InfoTech_cloud sigin page with Invalid Mobile number in forgot password
    Given open the valid url in InfoTech_cloud application
    Then click the Forgot password icon
    Then Enter the Email in Forgot password page "9867841988"
    Then click the Send button
    Then Verify the succcess alert message is displayed
    

  Scenario: verify the InfoTech_cloud sigin page with Invalid  Email id in forgot password
    Given open the valid url in InfoTech_cloud application
    Then click the Forgot password icon
    Then Enter the Email in Forgot password page "demosfsf777"
   	Then click the Send button
    Then Verify the succcess alert message is displayed
    
   
  Scenario: verify the InfoTech_cloud sigin page in Password trigger using mobile number
    Given open the valid url in InfoTech_cloud application
    Then click the Forgot password icon
    Then Enter the Email in Forgot password page "98678416"
    Then click the Send button
    Then Verify the succcess alert message is displayed