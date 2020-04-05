@regressionjune
Feature: Add Coustomer in demo site
  @sanity1
  Scenario: Add Coustomer with hard coded datas
  
    And User clic on and add coustomer button
    When User enter all the fields
    And User click on submit button
    Then User should be displayed coustomer ID or not
 @smoke1 @maruthu
 Scenario: Add Coustomer with hard coded datas
   
    And User clic on and add coustomer button
    When User enter all the fields with one dimesional
    |maruthu|pandi|pandi@gmail.com|tirunelveli|9952861703|
    And User click on submit button
    Then User should be displayed coustomer ID or not
 @maruthu
 Scenario: Add Coustomer with hard coded datas
    Given User lanches demo telecomsite
    And User clic on and add coustomer button
    When User enter all the fields with one dimesional map
    | Fname  |  maruthu      |
    | Lname  |pandi          |
    | Email  |pandi@gmail.com|
    | Address|tirunelveli    |
    | phno   |12233334444    |
    And User click on submit button
    Then User should be displayed coustomer ID or not
 