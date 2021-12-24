
Feature: Login
  As a user, I want to register on OrangeHRM website
  So that, I can use all user features

@Login
  Scenario: Admin User should able to Add sub Employee Credential

    Given user is home page
    When  user click on PIM menu
    And select Add Employee
    And  user enter required details
    And click on save button
    And click on Logut
    And login by valid credential user
   Then verify user successfully login



