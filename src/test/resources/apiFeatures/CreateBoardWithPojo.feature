Feature:
  @apiPojo
  Scenario: Create_Board_POJO
    Given POST request for create board "Amazon" with Pojo
   # And get response with pojo
    Then assert response "Amazon"