@Employee_Basic_Details_Negative_Scenario
Feature: verify Employee_Basic_Details_Negative_Scenario

  @SanityTest
  Scenario Outline: verify fund should be display based on the Race Details in Payroll app
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
    Then Enter the Employee name in search text field "<EmployeeName>"
    Then click the Search button
    Then verify employee name already grid list or not
    Then Click the Delete confimation pop up "1"
    Then click the New button
    Then Enter the Employee Code "<EmployeeCodes>"
    Then Enter the Employee Name "<EmployeeName>"
    Then Select the Gender field "<Gender>"
    Then Select the Marital status "<Maritalstatus>"
    Then Enter the Email Address "<EmailAddress>"
    Then Enter the Mobile Number "<MobileNumber>"
    Then Enter the Join Date "<JoinDate>"
    Then Enter the NRIC number "<NRICnumber>"
    Then Enter the Fin id number "asdd02"
    Then click the E-Payroll App Access
    Then click the E-Payroll  button
    Then click the Birth date "12-12-2001"
    Then Select the Employee cpf "200618119NPTE01"
    Then Enter the Basic salary "2000"
    Then Verify the percentage in salary mode
    Then Choose the Bank Name "DBS / POSB BANK"
    Then Enter the Branch Id "1212131"
    Then Enter the Ac/No "123456"
    Then click the Additional button
    Then Select the Nationlaity in Additional Tab "SINGAPOREAN"
    Then Select the Religion "HINDU"
    Then Select the Race "MALAY"
    Then verify the fund selected checkbox
    Then click the Save button
    And Verify the Employee Details successfully registered
    Then clear the Employee name details
    Then Enter the Employee name in search text field "<EmployeeName>"
    Then click the Search button
    Then Delete the Employee Data in staff Details grid list
    Then Enter the password in Delete Confirmation pop up page "1"
    Then click the Delete  button in Delete confirmation pop up page.
    And verify the Delete button is working properly

    Examples: 
      | EmployeeCodes   | EmployeeName    | Gender | Maritalstatus | EmailAddress                    | MobileNumber | JoinDate   | NRICnumber | Final     |
      | mani100 | subash | MALE   | Single        | subash@mailinator.com |     96666612 | 12-12-2018 | S9247710Z  | testmani2 |
