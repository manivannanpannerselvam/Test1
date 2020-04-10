@Employee_Basic_Details_Negative_Scenario
Feature: verify Employee_Basic_Details_Negative_Scenario

  @SanityTest
  Scenario Outline: Validate the Component pop up page
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
    Then Enter the Fin id number "qw432432"
    Then click the E-Payroll App Access
    Then click the E-Payroll  button
    Then click the Birth date "12-12-2001"
    Then Select the Employee cpf "200618119NPTE01"
    Then click the Hourly Rate
    Then Enter the Hourly Rate "1000"
    Then click the component button
    Then enter the fixed Amount for Basic Salary "5000"
    Then Enter the Variable Component for fixed amount "5000"
    Then click the Update button in component pop up
    #Then Verify the percentage in salary mode
    #Then Choose the Bank Name "DBS / POSB BANK"
    #Then Enter the Branch Id "1212131"
    #Then Enter the Ac/No "123456"
    #Then click the Additional button
    #Then Select the Nationlaity in Additional Tab "INDIAN"
    #Then click the Save button
    #And Verify the Employee Details successfully registered
    #Then Enter the Employee name in search text field "<EmployeeName>"
    #Then click the Search button
   #	Then Delete the Employee Data in staff Details grid list
    #Then Enter the password in Delete Confirmation pop up page "1"
    #Then click the Delete  button in Delete confirmation pop up page.
    #And verify the Delete button is working properly

    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress                  | MobileNumber | JoinDate   | NRICnumber | Final     |
      | boss007    | boss   | MALE   | Single        | boss@mailinator.com |     96666617 | 12-12-2018 | S9247710Z  | testmani2 |
