@all
Feature: Testing on NinaDemo application

  Background: 
    Given I am on tutorialsNinja Homepage

  @regression
  Scenario: 
    Then I enter Input for the search box
    And I click on search button
    And I close browser

  @regression
  Scenario: 
    And I click on Add to Cart button
    And I close browser

  @db
  Scenario: 
    And I click on Checkout button
    And I close browser
