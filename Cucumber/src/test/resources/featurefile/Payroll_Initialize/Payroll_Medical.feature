@InfoTech_Hr
Feature: verify payroll initialize

  @SanityTest
  Scenario Outline: Payroll_medical pop up in payroll initialize
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info Payroll application
    And  verify the Payroll software application is visible properly
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the Ignore and Continue button in pop up page
   
    

    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress             | MobileNumber | JoinDate   | TerminationDate | NRICnumber | Final     | FIN_ID     |
      | Test66        | TESTFIRST    | MALE   | Single        | payrollmedical@gmail.com |     96529227 | 01-01-2018 | 30-01-2018      | S1083995E  | testmani2 | Medical005 |

  
   @SanityTest
  Scenario Outline: Payroll_medical pop up in payroll initialize
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info Payroll application
    And  verify the Payroll software application is visible properly
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the Ignore and Continue button in pop up page
    Then click the Montly Activity menu
    Then click the Lock and Unlock Employee
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the lock button
    Then click the master icon
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the yes button in alert message for locked employee 
    Then click the checkbox for unlock user
    Then click the Unlock and Initialize button 
    Then click the Ignore and Continue button in pop up page
    
    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress             | MobileNumber | JoinDate   | TerminationDate | NRICnumber | Final     | FIN_ID     |
      | Test66        | TESTFIRST    | MALE   | Single        | payrollmedical@gmail.com |     96529227 | 01-01-2018 | 30-01-2018      | S1083995E  | testmani2 | Medical005 |
  
  
  
  
  
   @SanityTest
  Scenario Outline: Payroll_Unlock Employee
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info Payroll application
    And  verify the Payroll software application is visible properly
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the Ignore and Continue button in pop up page
    Then click the Montly Activity menu
    Then click the Lock and Unlock Employee
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Unlock button
    Then click the Yes button for confirmation alert message
    Then  Verify the Unlock Success Message is displayed 
    Then click the master icon
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the Ignore and Continue button in pop up page
    
    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress             | MobileNumber | JoinDate   | TerminationDate | NRICnumber | Final     | FIN_ID     |
      | Test66        | TESTFIRST    | MALE   | Single        | payrollmedical@gmail.com |     96529227 | 01-01-2018 | 30-01-2018      | S1083995E  | testmani2 | Medical005 |
      
      
      
      @SanityTest
  Scenario Outline: Payroll_medical pop up in payroll initialize
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info Payroll application
    And  verify the Payroll software application is visible properly
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the Ignore and Continue button in pop up page
    Then click the Montly Activity menu
    Then click the Salary Adjustment icon
    Then Enter the Employee name in Salary Adjustment search field "<EmployeeName>"
    Then click the search icon in salary Adjustment
    Then click the Edit  icon in salary Adjustment employee user
    Then click the Lock icon in salary Adjustment
    Then click the Montly Activity menu
    Then click the payroll initialize icon
    Then Enter the Employee name in payroll searh field "<EmployeeName>"
    Then click the search icon in payroll
    Then click the checkbox for Payroll initialize
    Then click the Initialize button
    Then click the No button for confirmation alert message
    Then click the master icon
    Then click the Montly Activity menu
    Then click the Salary Adjustment icon
    Then Enter the Employee name in Salary Adjustment search field "<EmployeeName>"
    Then click the search icon in salary Adjustment
    Then click the Edit  icon in salary Adjustment employee user
    Then click the Unlock the button in salary Adjustment
    
   
    
    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress             | MobileNumber | JoinDate   | TerminationDate | NRICnumber | Final     | FIN_ID     |
      | Test66        | TESTFIRST    | MALE   | Single        | payrollmedical@gmail.com |     96529227 | 01-01-2018 | 30-01-2018      | S1083995E  | testmani2 | Medical005 |