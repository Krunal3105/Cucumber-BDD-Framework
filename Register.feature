Feature: Nopcommerce Registration
  Background:
    Given User open browser and enter url
  # Simple hard codded scenario
  Scenario Outline: Nopcommerce Register Test
    Then User click on Register option
    When User is on Register page and Verify the register page Title
    Then User click on Male Radio Button from Gender
    Then User Enter "<Firstname>" and "<Lastname>"
    Then User Select Day,Month and Year From Date of birth
    Then User enter "<Email>" and Company name
    And User deselect Newsletter radio button
    When User enter "<Password>" and "<Confirmpassword>"
    Then User click on Register button
    And User on Homepage
    Examples:
    |Firstname|Lastname|Email|Password|Confirmpassword|
    |Krunal    |Patel    |abcd12@gmail.com|Xyz1234|Xyz1234|
