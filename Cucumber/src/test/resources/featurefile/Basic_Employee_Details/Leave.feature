@Employee_Basic_Details_Positive_flow
Feature: verify Employee_Basic_Details_Positive_flow

  @SanityTest
  Scenario Outline: verify positive flow in  Leave App access
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
  Then click the App Access
  Then click the E Levae button button
  Then Select the final Approver "<Final>"
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
  | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress                   | MobileNumber | JoinDate   | NRICnumber | Final     |
  | mithra007  | mithra | MALE   | Single        | mithra@mailinator.com |     96666619 | 12-12-2018 | S2390023H  | testmani2 |
 
 
  @SanityTest
  Scenario Outline: verify InValid Fin number validation
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
    Then Select the IdType "FIN"
    Then Enter the NRIC number "<NRICnumber>"
    Then click the App Access
    Then click the E Levae button button
    Then Select the final Approver "<Final>"
    Then click the Save button
    And Verify Employee Details shouldn't displayed in grid list

    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress                   | MobileNumber | JoinDate   | NRICnumber | Final     |
      | Secwwwjjjond001  | sehhcowwwndEmp | MALE   | Single        | empnhhewfiwwwrsgt@mailinator.com |     92345679 | 12-12-2018 | S2390023H  | testmani2 |

  