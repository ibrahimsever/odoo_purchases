Feature: Home Page
  As user, I should be able to open the page

  @homePage
  Scenario: open the link
    Given domain address
    When user go the page
    Then home page should be displayed

  @login
  Scenario: login as a manager
    Given user on the login page
    When  user login as a manager
    And user enter valid email
    And user enter valid password
    And user click login button
    Then user should see inbox title







