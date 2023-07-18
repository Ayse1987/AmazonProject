Feature: Trello test
  @api
  Scenario: Create_Board
    Given send request for create "api" board
    And Assert status code is 200
    And Assert board name is "api"