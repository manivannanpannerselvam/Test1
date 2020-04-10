 @InfoTech_Hr
Feature: verify payroll initialize

  @SanityTest
  Scenario: Check for the display and list of employees based on the Department
  
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info Payroll application
    And verify the Payroll software application is visible properly
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then verify 50 user displayed in All Employees grid list
    Then Choose the All Employee checkbox for intialize
    Then Double click the Initialize button
    Then verify the success alert message for Initialize
    Then verify the Initialized employee should be fifty
    Then click the Not Initializa radio button
    Then Verify the Not Initialize employees
    Then click the Montly Activity menu
    Then click the salary Adjustment option
    
    