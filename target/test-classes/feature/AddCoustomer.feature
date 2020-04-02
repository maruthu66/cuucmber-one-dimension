Feature: Add Coustomer in demo site
  
  Scenario: Add Coustomer with hard coded datas
    Given User lanches demo telecomsite
    And User clic on and add coustomer button
    When User enter all the fields
    And User click on submit button
    Then User should be displayed coustomer ID or not

 Scenario: Add Coustomer with hard coded datas
    Given User lanches demo telecomsite
    And User clic on and add coustomer button
    When User enter all the fields with one dimesional
    |maruthu|pandi|pandi@gmail.com|tirunelveli|9952861703|
    And User click on submit button
    Then User should be displayed coustomer ID or not
 