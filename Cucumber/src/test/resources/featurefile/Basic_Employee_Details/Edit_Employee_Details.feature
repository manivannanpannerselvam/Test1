@Employee_Basic_Details_Edit_scenario
Feature: verify Edit employee code,Eamil id,Email name and Mobile number

  @SanityTest
  Scenario Outline: Verify Edit employee code,Eamil id,Email name and Mobile number
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
    Then Enter the Employee name in search text field "THIRD"
    Then click the Search button
    Then Edit the icon in staff master
    Then Enter the Employee Name "<EmployeeName>"
    Then Enter the Email Address "<EmailAddress>"
    Then Enter the Mobile Number "<MobileNumber>"
    #Then click the App Access
    Then click the E Levae button button
    Then Select the final Approver "<Final>"
    Then click the Update button in Staff details
    And Verify the Employee Details successfully registered
    Examples: 
      | EmployeeName | Gender | Maritalstatus | EmailAddress                 | MobileNumber | Final     |
      | mani006   | MALE   | Single        | mankannan@mailinator.com |     96666667 | testmani2 |
