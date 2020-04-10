@InfoTech_Hr
Feature: verify the InfoTech_cloud login page

 #@PO
 Scenario: verify the InfoTech_cloud sigin page with valid_username and Invalid_Password credentials
   Given open the valid url in InfoTech_cloud application
   Then Enter the  usernamesdsdsds in username field "test05@mailinator.com"
   Then Enter the valid passwordsdsd in password field "aktrea@123"
   Then click the submit button
   And verify the applicatisdfsfdsondgdgdd not  successfully.

#@PO
Scenario: verify the InfoTech_cloud sigin page with Invalid_username and valid_Password credentials
  Given open the valid url in InfoTech_cloud application
  Then Enter the  usernamesdsdsds in username field "demo@gmail.com"
  Then Enter the valid passwordsdsd in password field "demo1"
  Then click the submit button
  And verify the applicatisdfsfdsondgdgdd not  successfully.

#@PO
Scenario: verify the InfoTech_cloud sigin page with Invalid_username and Invalid_Password credentials
  Given open the valid url in InfoTech_cloud application
  Then Enter the  usernamesdsdsds in username field "demo@gmail.com"
  Then Enter the valid passwordsdsd in password field "demo123"
  Then click the submit button
  And verify the applicatisdfsfdsondgdgdd not  successfully.

	#@PO
 Scenario: verify the InfoTech_cloud sigin page with valid_username and valid_Password credentials
   Given open the valid url in InfoTech_cloud application
   Then Enter the  usernamesdsdsds in username field "testmani2@1.com"
   Then Enter the valid passwordsdsd in password field "1"
   Then click the submit button
   And verify the applicationsssaadsasds successfully.
   And click the user Image
   Then click the sign out button

#@PO
Scenario: verify the InfoTech_cloud sigin page with valid_Mobile_Number and Invalid_Mobile_Password credentials
  Given open the valid url in InfoTech_cloud application
  Then Enter the  usernamesdsdsds in username field "98678414"
  Then Enter the valid passwordsdsd in password field "111"
  Then click the submit button
  And verify the applicatisdfsfdsondgdgdd not  successfully.

#@PO
Scenario: verify the InfoTech_cloud sigin page with Invalid_Mobile_Number and valid_Mobile_Password credentials
  Given open the valid url in InfoTech_cloud application
  Then Enter the  usernamesdsdsds in username field "81194690213231"
  Then Enter the valid passwordsdsd in password field "8V4pz3LCFS"
  Then click the submit button
  And verify the applicatisdfsfdsondgdgdd not  successfully.

#@PO
Scenario: verify the InfoTech_cloud sigin page with Invalid_Mobile_Number and Invalid_Mobile_Password credentials
  Given open the valid url in InfoTech_cloud application
  Then Enter the  usernamesdsdsds in username field "81194690213231"
  Then Enter the valid passwordsdsd in password field "112321"
  Then click the submit button
  And verify the applicatisdfsfdsondgdgdd not  successfully.


#@PO
Scenario: verify the InfoTech_cloud sigin page with System user confirmaition
  Given open the valid url in InfoTech_cloud application
  Then Enter the  usernamesdsdsds in username field "i1@gmail.com"
  Then Enter the valid passwordsdsd in password field "1"
  Then click the submit button
  And Verify the System user login successfully

 #@PO
Scenario: verify the InfoTech_cloud sigin page with Links on Login page should redirect to the respective page
  Given open the valid url in InfoTech_cloud application
  Then click the All link
  
   


