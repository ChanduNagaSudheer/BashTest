@testing
Feature: To test the bash script

  @test
  Scenario Outline: Test the bash script
    When i have printed few lines "<First_name>"
    Then i have printed few more lines "<Last_Name>"
    Examples:
    |First_name|Last_Name|
    |chandu    |naga sudheer|