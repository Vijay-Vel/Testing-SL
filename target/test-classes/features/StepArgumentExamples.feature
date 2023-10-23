Feature: Enter login Credentials on tutorialsNinja Page

  Scenario Outline: Test username and password for login page
    Given I am on tutorialsNinja Homepage
    Then I click on myaccount link
    When I click on login link
    Then I will on the login page and I capture the title of the page
    And I enter email id as '<EmailId>' on the page
    And I enter password as '<password>' on the page
    Then I click login button


    Examples: 
      | EmailId                | password |
      | javaselenium@gmail.com |     1234 |
