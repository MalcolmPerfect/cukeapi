Feature: example Feature
    Just an example to see everything hanging together

  Scenario: First Scenario
        Simple first scenario

    Given this is the first Scenario
    When we run cucumber
    Then this scenario is executed

  Scenario: Second Scenario
        Second scenario to show how steps can exist in different stepdefs
        and how to manage state

    Given this is the second Scenario
    When we run cucumber
    And the message "hello" is specified
    Then this scenario is executed
    And the message value is "hello"
