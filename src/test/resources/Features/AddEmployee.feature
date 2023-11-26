Feature: add employee scenario

  Background:
    * user enters username and password
    * user clicks on login button
    * user is successfully logged in
    * user clicks on PIM option
    * user clicks on add employee option

  @addemp @test @test12
  Scenario: Adding one employee in the hrms system
    #Given user has navigated to HRMS application
    #When user enters username and password
    #And user clicks on login button
    #Then user is successfully logged in
    #When user clicks on PIM option
    #And user clicks on add employee option
    * user enters firstName middleName and lastName
    * user clicks on save button
    * employee added successfully
    #Then user closes the browser

  @notHardCoded @test
  Scenario: Adding one employee using feature file
    #When user enters admin username and password
    #And user clicks on login button
    #Then user is successfully logged in
    #When user clicks on PIM option
    #And user clicks on add employee option
    * user enters "Alina" and "mozam" and "sam"
    * user clicks on save button
    * employee added successfully

  @ddt @test
  Scenario Outline: Adding multiple employees from feature file
    * user enters "<firstName>" and "<middleName>" and "<lastName>"
    * user clicks on save button
    * employee added successfully
    Examples:
      | firstName | middleName | lastName |
      | Avis      | Sam          | Muhwerane  |
      | James      | Kenan         | Cofi   |
      | Adrews       | Anna         | Kotler      |

    @excel
    Scenario: Adding multiple employees from excel files
      When user adds multiple employees from excel using "Sheet1" and verify them

      @datatable
      Scenario: adding multiple employees from data table
        When user adds multiple employees from data table
          | firstName   | middleName    | lastName    |
          | Avis        | Sam           | Muhwerane   |
          | James       | Kenan         | Cofi        |
          | Adrews      | Anna          | Kotler      |

  @db
  Scenario: Add Employee from Frontend and verify from DB
    When user enters "fahim" and "Naughty" and "Hedaiy"
    And user clicks on save button
    Then employee added successfully
    And fetch employee info from backend
    Then verify employee info is properly stored in db