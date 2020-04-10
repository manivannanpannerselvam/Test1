@InfoTech_Hr
Feature: verify payroll initialize

  @SanityTest
  Scenario Outline: Check for the display and list of employees based on the Department
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info Payroll application
    And verify the Payroll software application is visible properly
    Then change the login  year "2018"
    Then change the login month "January"
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
    Then Enter the Termination Date "<TerminationDate>"
    Then Enter the NRIC number "<NRICnumber>"
    Then Enter the Fin id number "<FIN_ID>"
    Then click the E-Payroll App Access
    Then click the E-Payroll  button
    Then click the Birth date "12-12-2001"
    Then Select the Employee cpf "200618119NPTE01"
    Then Enter the Basic salary "2000"
    Then Verify the percentage in salary mode
    Then click the Additional button
    Then Select the Nationlaity in Additional Tab "INDIAN"
    Then click the Save button
    Then click the master icon
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then verify employee name is displayed in All Employee list
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the Radio button in Initialized field
    Then verify the employee displayed in initialized grid list
    Then click the Not Initializa radio button
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then Verify the Not Initialize employees
    Then click the master icon
    Then click the Employee Basic Details
    Then click the All Employee Radio button
    Then Enter the Employee name in search text field "<EmployeeName>"
    Then click the Search button
    Then Edit the icon in staff master
    Then Edit the Termination date for payroll "14-01-2018"
    Then click the Update button in Staff details
    Then click the ok button in update confirmation
    Then click the master icon
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the Radio button in Initialized field
    Then verify the employee displayed in initialized grid list
    Then click the Not Initializa radio button
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then Verify the Not Initialize employees

    Examples: 
      | EmployeeCodes  | EmployeeName        | Gender | Maritalstatus | EmailAddress                     | MobileNumber | JoinDate   | TerminationDate | NRICnumber | Final     | FIN_ID    |
      | Terminpositive | Terminationpositive | MALE   | Single        | TerminationPositiveEmp@gmail.com |     96525227 | 01-01-2018 | 30-01-2018      | S4833285D  | testmani2 | Termin005 |
