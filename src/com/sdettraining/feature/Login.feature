#Author :Shameem Akther
#Keywords Summary :
@RetailLoginTest
Feature: User Retail Login page

  Scenario Outline: User able to login successfully.
    Given User navigate to retails application
    And User validate the registration page
    When User click on accont link
    And User click on Login/Register link
    And User enter username "<userName>"
    And User enter password "<password>"
    And User click on login link
    And User validate login successfully
    And User close the application
    Examples: 
      | userName               | password   |
      | shameem.test@gmail.com | sham@12345 |
