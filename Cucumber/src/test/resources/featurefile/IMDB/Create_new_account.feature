@IMDB_Create_account
Feature: verify the account by filling the registration

  Scenario Outline: Verify the   account by filling the registration
  Given open the valid url in IMDb application
  Then  click the sigin icon
  Then  click the create new button
  Then  Enter the UserName in username field "<Username>"
  Then  Enter the Email id in Eamil field "<Emailid>"
  Then  Enter the password in password field "<password>"
  Then  Enter the reenter password "<password>"
  Then  click the Create your ImDb account
  Then  click the Sign out button
  
  Examples:
  | Username   | Emailid        |  password   |
  | jlgetertertertertetretrhlet  | @example.com   |  @password  |
  | test       | @examplet.com  |  @passworda |
  | testplan   | @examples.com  |  @passwords |
  | testcase   | @exampless.com |  @passwordd |
  
  Scenario Outline: Verify the  characters ,number and special character allowed to be entered into the search box.
    Given open the valid url in IMDb application
    Then click the sigin icon
    Then click the create new button
    Then Enter the UserName in username field "<Username>"
    Then Enter the Email id in Eamil field "<Emailid>"
    Then Enter the password in password field "<password>"
    Then Enter the reenter password "<password>"
    Then click the Create your ImDb account
    Then click the Sign out button
    Then click the sigin icon
    Then click the sigin with IMbd button
    Then Enter the valid Email id in email field "<Emailid>"
    Then Enter the valid Password id in password field "<password>"
    Then click the sign in button

    Examples: 
      | Username | Emailid        | password   |
      | qweqwesd | @ex.com        | @pass      |
      | test     | @examplet.com  | @passworda |
      | testplan | @examples.com  | @passwords |
      | testcase | @exampless.com | @passwordd |
