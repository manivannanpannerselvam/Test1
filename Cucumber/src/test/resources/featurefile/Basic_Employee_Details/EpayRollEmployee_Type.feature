@Employee_Basic_Details_Negative_Scenario
Feature: verify Employee_Basic_Details_Negative_Scenario

  @SanityTest
  Scenario Outline: verify Employee type validation should be displayed
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    #Then click the close button
    Then click the change app button
    Then click the Info Payroll application
    And verify the Payroll software application is visible properly
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
    Then Enter the Fin id number "T087672"
    Then click the E-Payroll App Access
    Then click the E-Payroll  button
    Then click the Birth date "12-12-2001"
    Then Select the Employee cpf "200618119NPTE01"
    Then Select the Employement Type "EMPLOYMENT PASS"
    Then Select the CPF/FWL field "PR 1ST YEAR"
    Then Enter the PR Approval Date "12-12-2020"
    Then Enter the Basic salary "2000"
    Then Verify the percentage in salary mode
    Then click the Additional button
    Then Select the Nationlaity in Additional Tab "INDIAN"
    Then click the Save button
    And  Verify the Alert message should bd displayed in Employment Details
    

    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress                  | MobileNumber | JoinDate   | NRICnumber | Final     |
      | Saba002    | sabanayakam   | MALE   | Single        | sabanayakam@mailinator.com |     96666616 | 12-12-2018 | S9247710Z  | testmani2 |
