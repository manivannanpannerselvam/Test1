@Employee_Basic_Details_Negative_Scenario
Feature: verify Employee_Basic_Details_Negative_Scenario

 @SanityTest
  Scenario: verify Validation in Employee_Basic_Details
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
    Then Enter the Valid  Employee code "Emp066"
    Then Enter the Valid Employee name "NewEmployee"
    Then Select the correct gender name "MALE"
    Then Select the correct Marital status "Single"
    Then Enter the invalid Email id "test123"
    Then click the App Access
    Then Enter the Invalid Join Date "3424234"
    Then Enter the Invalid NRIC number "21321313"
    Then  click the mobile number
    Then verify the Join Date alert message
    Then  Alert message should be displayed in NRIC Field
    Then  Alert message should be displayed in Email field	
    Then click the E Levae button button
    Then Select the final Approver "testmani2"
    Then click the Save button
    And Verify Employee Details shouldn't displayed in grid list
    
    
    
    @SanityTest
  Scenario: verify the Employee_Basic_Details in Face_id field when user Access the E-TMS app 
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
    Then Enter the Valid  Employee code "Emp066"
    Then Enter the Valid Employee name "NewEmployee"
    Then Select the correct gender name "MALE"
    Then Select the correct Marital status "Single"
    Then Enter the invalid Email id "test123545@1.com"
    Then click the E-TMS App Access
    Then Enter the Invalid Join Date "12-08-2019"
    Then Enter the Invalid NRIC number "S2511165F"
    Then  click the mobile number
    Then click the E-TMS button 
    Then click the Save button
    And Verify Employee Details shouldn't displayed in grid list
    
    
    @SanityTest
  Scenario: verify the E-TMS app employee details with Empty Approvals
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
    Then Enter the Valid  Employee code "Emp066"
    Then Enter the Valid Employee name "NewEmployee"
    Then Select the correct gender name "MALE"
    Then Select the correct Marital status "Single"
    Then Enter the invalid Email id "test123545@1.com"
    Then click the E-claim App Access
    Then Enter the Invalid Join Date "12-08-2019"
    Then Enter the Invalid NRIC number "S2511165F"
    Then click the E-claim button 
    Then click the Save button
    And Verify Eclaim app employee shouldn't displayed in grid list
    
     @SanityTest
  Scenario: verify the E-TMS app employee details with Empty Personal Details
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
    Then Enter the Valid  Employee code "Emp066"
    Then Enter the Valid Employee name "NewEmployee"
    Then Select the correct gender name "MALE"
    Then Select the correct Marital status "Single"
    Then Enter the invalid Email id "test123545@1.com"
    Then click the E-Payroll App Access
    Then Enter the Invalid Join Date "12-08-2019"
    Then Enter the Invalid NRIC number "S2511165F"
    Then click the E-Payroll  button 
    Then click the Save button
    And Verify E-PayRoll app employee shouldn't displayed in grid list
    
    
    @SanityTest
  Scenario: verify the E-TMS app employee details with Empty Personal Details
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
    Then Enter the Valid  Employee code "Emp066"
    Then Enter the Valid Employee name "NewEmployee"
    Then Select the correct gender name "MALE"
    Then Select the correct Marital status "Single"
    Then Enter the invalid Email id "test123545@1.com"
    Then click the Mobile App Access
    Then Enter the Invalid Join Date "12-08-2019"
    Then Enter the Invalid NRIC number "S2511165F"
    Then click the E-Mobile  button
    Then click the Allow change button
    Then click the Mobile Tracking button
    Then click the Save button
    And Verify E-PayRoll app employee shouldn't displayed in grid list
    
    
   
    
    
    
    
    
    
    
    