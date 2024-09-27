#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


@CarTrading
Feature: Car Trading
  I want to buy and sell cars

  @BuyCar
  Scenario: Buying a second hand car
    Given I go to buy car
    And car must be of 'Ford Motors'
    And car can be white, black, grey in color
    And my address is 153, Street x, Delhi, India
    When I search for car
    And I select City as Tokyo
    Then I should get white cars in result
    And car must be atleast 2 years old
    But car should not be damaged
