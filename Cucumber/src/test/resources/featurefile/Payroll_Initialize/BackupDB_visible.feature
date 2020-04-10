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
    Then click the Backup your Datebases button 
    Then Verify the Backup alert should be displayed
    
    @SanityTest
  Scenario: Double click the Initialize button
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
    Then click the checkbox for Payroll initialize
    Then Double click the Initialize button
    Then verify the success alert message for Initialize