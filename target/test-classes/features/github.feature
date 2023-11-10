Feature: Test Github APis using Rest Assured
  Scenario: Get all the github repos with autorization as Bearer token
    Given User Enters github base URL and Authorization
    When User executes HTTP get method
    Then Validate the response status code