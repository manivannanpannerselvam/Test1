@Employee_Basic_Details_Positive_flow
Feature: verify Employee_Basic_Details_Positive_flow

  @SanityTest
  Scenario Outline: verify Cash amount is 100 percentage in Payroll app
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
    Then Enter the Fin id number "T7h2122"
    Then click the E-Payroll App Access
    Then click the E-Payroll  button
    Then click the Birth date "12-12-2001"
    Then Select the Employee cpf "200618119NPTE01"
    Then Enter the Basic salary "2000"
    Then Verify the percentage in salary mode
    Then click the Additional button
    Then Select the Nationlaity in Additional Tab "INDIAN"
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
      | EmployeeCodes  | EmployeeName     | Gender | Maritalstatus | EmailAddress                      | MobileNumber | JoinDate   | NRICnumber | Final     |
      | mani008 | manimss | MALE   | Single        | maniss@mailinator.com |     96666669 | 12-12-2018 | S9247710Z  | testmani2 |
