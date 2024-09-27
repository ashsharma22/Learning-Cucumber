@BuyComputer
Feature: Buying a computer
  I want to use this template for my feature file
  
  Background: Buying Dell PC
    Given I want to buy a PC
    And PC should be of 'Dell'

  @BuyingDesktop
  Scenario: Buying a desktop
    And it should be a desktop
    When I select 'moniter' as 15 inch
    And a 'carbon cabinet' finish
    And I select harddrive 1 TB
    # I want to write any of the below using one step only
    	# 1. a top discuount bar with
    	# 2. atmost
    	# 3. atleast
    #And I get atmost 20 results
    And I get a top discount bar with 20 results
    And RAM 8 GB
    Then price should be less than 20000

  @BuytingTab
  Scenario Outline: Buying a laptop
    And it should be a laptop
    When I select 'screen' as 12 inch
    And a 'sleak silver' finish
    And I select harddrive 1 TB
    And RAM 8 GB
    Then price should be less than 30000
    And it should come with a bag
