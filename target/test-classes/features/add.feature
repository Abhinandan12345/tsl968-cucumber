Feature: Addition
 
  Scenario: Addition of two Number
  Given I have two Number as "25" & "65"
  When I do Addition
  Then Result should display in Console

    Scenario: Addition of two Number
  Given I have two Number as List
  | 8 |
  | 9 |
    When I do Addition
  Then Result should display in Console
  Scenario: Addition of two Number
 Given I have two Number as Map
  | num1 | 8 |
  | num2 | 10 |
  When I do Addition
  Then Result should display in Console