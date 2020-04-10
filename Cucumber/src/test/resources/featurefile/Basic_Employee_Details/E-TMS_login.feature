@Employee_Basic_Details_Positive_flow
Feature: Employee_Basic_Details_Positive_flow

  @SanityTest
  Scenario Outline: verify the Positive flow in E-TMS modules
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info Tms application
    And verify the Time Attendance software application is visible properly
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
    Then Enter the Fin id number "T33232"
    Then click the E-TMS App Access
    Then click the E-TMS button
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
      | EmployeeCodes  | EmployeeName    | Gender | Maritalstatus | EmailAddress                     | MobileNumber | JoinDate   | NRICnumber | Final     |
      | mani003 | manivannan | MALE   | Single        | manis@mailinator.com |     96666663 | 12-12-2018 | S9247710Z  | testmani2 |

      
     
    
   