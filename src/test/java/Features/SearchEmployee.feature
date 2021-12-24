
Feature: Login
  As a user, I want to Search Employee by Name On
  OrangeHRM so that,I can Delete Selected Employee Successfully

  @Serach
  Scenario: Admin user should be able to search a employee and selected record should be delete successfully

    Given user is on home page
    When user click on PIM menu
    And select Employeelist
    And Enter employee name in text box
    And click on Serach Button
    And select Records form Search result
    And click on Delete Button
    Then verify record delete successfully

