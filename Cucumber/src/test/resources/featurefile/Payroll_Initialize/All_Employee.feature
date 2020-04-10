@InfoTech_Hr
Feature: verify payroll initialize


  #Scenario: verify create the Department
    #Given open the valid url in InfoTech_cloud application
    #Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
    #Then Enter the valid passwordsdsd in password field "1"
    #Then click the submit button
    #Then verify the applicationsssaadsasds successfully.
    #Then click the change app button
    #Then click the Info Payroll application
    #And verify the Payroll software application is visible properly
    #Then click the master icon   
    #Then click the Basic master setup
    #Then click the Department icon
    #Then click the new button in Department module
    #Then Enter the Department code "Dept005"
    #Then Enter the Department name "PayrollDepartment"
    #Then click the save button in Department icon
    #Then click the master icon
    #Then click the Basic master setup
    #Then click the Designation icon
    #Then click the new button in Designation
    #Then Enter the Designation code "Des005"
    #Then Enter the Designation name "PayrollDesignation"
    #Then click the save button in Designation icon
    #Then click the master icon   
    #Then click the Basic master setup
    #Then click the Section
    #Then click the new button in section module
    #Then Enter the section code "Sec005"
    #Then Enter the Section name "payroll_section"
    #Then Select the Department icon
    #Then click the save button in section module
    #Then click the master icon   
    #Then click the Basic master setup
    #Then click the category icon 
    #Then click the new button in category module
    #Then Enter the category code "categ005"
    #Then Enter the category name "cateName"
    #Then click the save button in category field
    #Then click the master icon   
    #Then click the Basic master setup
    #Then click the Designation group
    #Then click the Add icon in Designation group
    #Then Enter the Designation group code "Des0022"
    #Then Enter the Designation group name "payroll_Designation"
    #Then click the save button in Designation group button

  @SanityTest
  Scenario Outline: verify All employee displayed in Payroll Initialize modules
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
    Then click the New button
    Then Enter the Employee Code "<EmployeeCodes>"
    Then Enter the Employee Name "<EmployeeName>"
    Then Select the Gender field "<Gender>"
    Then Select the Marital status "<Maritalstatus>"
    Then Enter the Email Address "<EmailAddress>"
    Then Enter the Mobile Number "<MobileNumber>"
    Then Enter the Join Date "<JoinDate>"
    Then Enter the NRIC number "<NRICnumber>"
    Then Enter the Fin id number "T02122"
    Then Select the Department field "PAYROLLDEPARTMENT"
    Then Select the Section field "PAYROLL_SECTION"
    Then Select the Designation field "PAYROLLDESIGNATION"
    Then Select the Designation group field  "PAYROLL_DESIGNATION"
    Then Select the Category group field "PAYROLLCATEGORY"
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
    

    Examples: 
      | EmployeeCodes | EmployeeName | Gender | Maritalstatus | EmailAddress   | MobileNumber | JoinDate   | NRICnumber | Final     |
      | Payroll001    | payrollemp   | MALE   | Single        | payroll2@1.com |     98272727 | 12-12-2018 | S9247710Z  | testmani2 |

      
   
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
    Then click the Montly Activity menu
    Then click the payroll initialize icon
   Then click the Department radio button
   Then click the Department Initialize check box button 
   Then Verify the correct Department name is displayed in all employee
   Then click the Initialize button
   Then click the Radio button in Initialized field
   Then click the Department radio button
   Then Verify the correct Department name is displayed in all employee
   Then click the Not Initializa radio button
   Then click the Department radio button
		Then Enter the Employee name in payroll searh field "<DepartmentName>"
	Then click the search icon in payroll
   Then Verify the Not Initialize employees
    
   Then click the section radio button
   Then choose the Department in Radio button
   Then verify the Section name is displayed in All employee
   Then click the Section Initialize check box button
   Then click the Initialize button
   Then click the Radio button in Initialized field
   Then click the section radio button
   Then verify the Section name is displayed in All employee
    
   Then click the Designation radio button 
   Then Enter the Designation name in search field "PAYROLLDESIGNATION"
   Then click the search icon in payroll
   Then verify the Designation name in grid list
   Then click the Radio button in Initialized field
   Then click the Designation radio button
   Then Enter the Designation name in search field "PAYROLLDESIGNATION"
   Then click the search icon in payroll
   Then verify the Designation name in grid list
   Then click the Not Initializa radio button
   Then click the Designation radio button
   Then Enter the Designation name in search field "PAYROLLDESIGNATION"
   Then click the search icon in payroll
   Then Verify the Not Initialize employees
    
   Then click the category radio button
   Then Enter the Employee name in payroll searh field "<categoryName>"
   Then click the search icon in payroll
   Then verify the category name is displayed in grid list
   Then click the Radio button in Initialized field
   Then click the category radio button
   Then Enter the Employee name in payroll searh field "<categoryName>"
   Then click the search icon in payroll
   Then verify the category name is displayed in grid list
   Then click the Not Initializa radio button
   Then click the category radio button
   Then Enter the Employee name in payroll searh field "<categoryName>"
   Then click the search icon in payroll
   Then Verify the Not Initialize employees
    
   Then click the Designation group icon
   Then Enter the Employee name in payroll searh field "<Designation_Group>"
   Then click the search icon in payroll
   Then Verify the Designation group in grid list
   Then click the Radio button in Initialized field
   Then click the Designation group icon
   Then Enter the Employee name in payroll searh field "<Designation_Group>"
   Then click the search icon in payroll
   Then Verify the Designation group in grid list
   Then click the Not Initializa radio button
   Then click the Designation group icon
   Then Enter the Employee name in payroll searh field "<Designation_Group>"
   Then click the search icon in payroll
   Then Verify the Not Initialize employees
    
    
    Then click the paygroup radio button
    Then Enter the Employee name in payroll searh field "<PayGroup>"
    Then click the search icon in payroll
    Then Verify the Paygroup name in grid list
    Then click the Radio button in Initialized field
    Then click the paygroup radio button
    Then Enter the Employee name in payroll searh field "<PayGroup>"
    Then click the search icon in payroll
    Then Verify the Paygroup name in grid list
    Then click the Not Initializa radio button
    Then click the paygroup radio button
    Then Enter the Employee name in payroll searh field "<PayGroup>"
    Then click the search icon in payroll
    Then Verify the Not Initialize employees
    
     Examples: 
      | DepartmentName | SectionName|   categoryName | Designation_Group | PayGroup |
      | PAYROLLDEPARTMENT|  PAYROLLEMP | PAYROLLCATEGORY | PAYROLL_DESIGNATION | 5 WORKING DAYS |
    
      