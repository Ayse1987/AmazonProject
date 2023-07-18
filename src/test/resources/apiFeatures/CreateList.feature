
Feature: Trello test
  @api
  Scenario: Create_List
    Given send request for create list "shopping"
    #And Assert status code is 200
    And Assert list name is "shopping"