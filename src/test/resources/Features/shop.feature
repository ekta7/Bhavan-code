Feature: This feature will make sure that the shop page is navigable and usable.

  Scenario: User navigates to shop page
    Given I am on the home page
    When I navigate to Deals
    Then the user should be on the "https://www.sky.com/deals"

  Scenario: User sees tiles on the shop page
    Given I am on the home page
    When I try to sign in with invalid credentials
      | userName       | password    |
      | invalid_username@test.com | invalidTest@123 |
    Then I should see a text saying that "Sorry, we did not recognise either your username or password"

  Scenario: User sees a list of deals on the deals page
    Given I am on the "https://www.sky.com/deals" page
    Then I see a list of deals with a price to it



