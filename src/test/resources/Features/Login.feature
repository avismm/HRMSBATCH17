Feature: Login scenarios

  @sprint1 @nafisa @regression @test
  Scenario: valid admin login
   # Given user is navigated to HRMS application
    When user enters username and password
    And  user clicks on login button
    Then user is successfully logged in
    #Then user close the browser