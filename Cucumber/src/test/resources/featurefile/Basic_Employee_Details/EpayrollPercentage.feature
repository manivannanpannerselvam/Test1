@Employee_Basic_Details_Negative_Scenario
Feature: verify Employee_Basic_Details_Negative_Scenario

  @SanityTest
  Scenario Outline: Validate the Salary pay mode field
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
    Then Enter the Fin id number "Tdsdsd"
    Then click the E-Payroll App Access
    Then click the E-Payroll  button
    Then click the Birth date "12-12-2001"
    Then Select the Employee cpf "200618119NPTE01"
    Then Enter the Basic salary "2000"
    Then Verify the percentage in salary mode
    Then Choose the Bank Name "DBS / POSB BANK"
    Then Enter the Branch Id "1212131"
    Then Enter the Ac/No "123456"
    Then Enter the Percentage "100"
    Then Verify the Alert message in Paysal mode

    Examples: 
      | EmployeeCodes   | EmployeeName  | Gender | Maritalstatus | EmailAddress                      | MobileNumber | JoinDate   | NRICnumber | Final     |
      | sanmugan005 | sanmugaraj | MALE   | Single        | sanmugaraj@mailinator.com |     96666618 | 12-12-2018 | S9247710Z  | testmani2 |
