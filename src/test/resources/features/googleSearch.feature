Feature: Google search functionality
  Agile story: AS a user, when I am on the Google search page I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is on the Google search page
    Then user should be see title is Google
