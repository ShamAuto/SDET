#Author :Shameem Akther
#Keywords Summary :
@RetailRegistrationTest
Feature: User Retail Registration

  Scenario Outline: User able to register successfully.
    Given User navigate to retails application
    And User validate the registration page
    When User click on accont link
    And User click on Login/Register link
    And User click on register button
    And User enter first name "<firstname>"
    And User enter last name "<lastname>"
    And User enter email "<email>"
    And User enter telephone "<telephone>"
    And User enter address1 "<address1>"
    And User enter address2 "<address2>"
    And User enter city "<city>"
    And User enter postcode "<postcode>"
    And User select country "<country>"
    And User select region/state "<state>"
    And User enter password "<password>"
    And User enter passwordconfirm "<passwordconfirm>"
    And User click on no subscribe button
    And User click on polic radiobutton
    And User click on continue link
    Then User validate user register successfully
    And User close the application

    Examples: 
      | firstname | lastname | email         | telephone  | address1  | address2 | city      | postcode | country | state     |
      | Shameem   | Akther   | abc@gmail.com | 1234567890 | Bangalore | Nagawara | Bangalore |   520045 | India   | Karnataka |
      | Shameem   | Akther   | abc@gmail.com | 1234567890 | Bangalore | Nagawara | Bangalore |   520045 | India   | Karnataka |
