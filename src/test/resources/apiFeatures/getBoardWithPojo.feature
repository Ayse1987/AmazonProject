Feature:

  @getRequest
  Scenario: Get_Board_POJO
    Given GET request for board created on Trello with id "Mb4ZFKOh"
    And get response
    Then assert that board name is "Api Project"