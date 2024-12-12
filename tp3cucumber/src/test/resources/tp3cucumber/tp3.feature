Feature: Managing players in a list based on a random draw
  I want to add or remove players from the list

  Scenario: Add a player to the list when the draw is positive
    Given an initially empty list of players
    And a player named "Etienne" is ready to be added
    When the random draw is positive
    Then Etienne must be added to the list
    And list size must be 1

  Scenario: Remove a player from the list when the random draw is negative
    Given a list containing the player "Bastien"
    When the random draw is negative
    Then the player "Bastien" must be removed from the list
    And list size must be 0

  Scenario: Do nothing when the draw is neutral
    Given a list containing the player "Eliot"
    When the random draw is neutral
    Then the list must contain only the player "Eliot"
    And list size must be 1
