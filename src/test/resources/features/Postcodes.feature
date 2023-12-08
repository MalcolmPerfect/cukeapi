Feature: postcodes
    Postcodes.io is a freely available open source site that's
    useful for trying out api testing approaches, as has various
    api to retrieve postcode/location based data

  Background: 
    Given the base url "https://api.postcodes.io"

  Scenario: Get postcode
        Simple scenario running 

    When request postcode "GU10 3PJ" from "/postcodes"
    Then the status is 200
    And the result payload includes the data
      | result.parliamentary_constituency | South West Surrey |
      | result.admin_district             | Waverley          |
