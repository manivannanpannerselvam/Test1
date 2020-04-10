@Employee_Basic_Details_Negative_Scenario
Feature: verify Employee_Basic_Details_Negative_Scenario

  @SanityTest
  Scenario Outline: verify duplicate id and email field in payroll app
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info_Leave icon
    And verify the leave software application is visible properly
    Then click the master icon
    Then click the Employee Basic Details
    Then click the New button
    Then Enter the Employee Code "<EmployeeCodes>"
    Then Enter the Employee Name "<EmployeeName>"
    Then Select the Gender field "<Gender>"
    Then Select the Marital status "<Maritalstatus>"
    Then Enter the Email Address "<EmailAddress>"
    Then Enter the Mobile Number "<MobileNumber>"
    Then Enter the Join Date "<JoinDate>"
    Then Enter the NRIC number "<NRICnumber>"
    Then click the App Access
    Then click the E Levae button button
    Then Select the final Approver "<Final>"
    Then click the Save button
    Then Alert message should be displayed
    

    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress | MobileNumber | JoinDate   | NRICnumber | Final     |
      | TEST001       | TESTEMPNAME  | MALE   | Single        | test2@1.com  |     96666610 | 05-07-2001 | S2117781D  | testmani2 |
