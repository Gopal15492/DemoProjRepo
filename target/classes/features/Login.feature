@all
Feature: User Login
 Registered as a user

Background:
    Given User navigates to login page

  @login @validcredential @all  @regression @dev
  Scenario Outline: Login with valid credential
  
    When User enters valid email address "<username>"
    And Enters valid password "<password>"
    And Click on login button
    Then User should login successfully
    Examples:
    |username|password|
    |Gopalade25@gmail|Gopal@123|
    |Goklpalade25@gmail|12343r5|
      |Goklpalade25@gmail|12345|
 
   @login @invalid  @validcredential  @smoke @regression 
 Scenario: Login with invalid credential
    When User enters invalid email address "Goklpalade25@gmail.com"
    And Enters invalid password "12343r5"
    And Click on login button
    Then User should get proper warning massage
    
    @login @validemail  @invalidpassword   @regression
 Scenario: Login with valid email address invalid password
    When User enters valid email address "Goklpalade25@gmail.com"
    And Enters invalid password "12343r5343"
    And Click on login button
    Then User should get proper warning massage
    
   @login  @invalidcredential   @regression @wip
 Scenario: Login with invalid credential
    And Enters invalid password "12343r5"
    And Click on login button
    Then User should get proper warning massage

   @login  @withoutcredential   @regression  @ignore
 Scenario: Login without providing any credential
    When User dont enters any credential
    And Click on login button
    Then User should get proper warning massage
 
