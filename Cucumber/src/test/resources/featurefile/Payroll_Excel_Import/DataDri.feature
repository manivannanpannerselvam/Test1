Feature: Fill a simple form with excel data

   #Scenario: Data driven with excel
   #Given open the valid url in InfoTech_cloud application
   #Given open the valid url in InfoTech_cloud application
    #Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    #Then Enter the valid passwordsdsd in password field "1"
    #Then click the submit button
    #Then verify the applicationsssaadsasds successfully.
    #Then click the change app button
    #Then click the Info Payroll application
    #Then click the Montly Activity menu
    #Then click the payroll Excel Import 
    #Then click the Import Excel Templete
    #Then Upload the Excel file 
    #Then click the upload button
    
    
    
    
    
   
  Scenario Outline: Data driven with excel and data sets
    Given open the valid url in InfoTech_cloud application
    Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    Then Enter the valid passwordsdsd in password field "1"
    Then click the submit button
    Then verify the applicationsssaadsasds successfully.
    Then click the change app button
    Then click the Info Payroll application
    And verify the Payroll software application is visible properly
    Then click the master icon
    Then click the Employee Basic Details
    Then I contact the customer service with excel row "<row_index>" dataset

    Examples: 
      | row_index |
      | 2 |
      | 3 |
      |4|
     
