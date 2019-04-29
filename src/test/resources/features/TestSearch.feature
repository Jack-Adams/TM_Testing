Feature: Searching with the search bar
  As a potential buyer
  I want to search TradeMe
  So that I can find items which interest me

  Acceptance Criteria
  -------------------
  1. I can search for an item and get relevant results.
  2. I can search for an item and not get irrelevant results.

  Scenario Outline:
    Given I am on "<a_page>" with a search bar
    When I search "<term>" in the search bar
    Then I see results relevant to "<term>"

    Examples:
      | a_page | term |
      | https://www.tmsandbox.co.nz/ | tea |
      | https://www.tmsandbox.co.nz/ | bicycle |