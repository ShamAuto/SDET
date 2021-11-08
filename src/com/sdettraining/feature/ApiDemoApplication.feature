#Author :Shameem Akther
#Keywords Summary :
@ApiDemosApplication
Feature: User validate the time count using chronometer in apidemos application

  #Scenario: user able to validate time count successfully.
    #Given user navigate to apidemo application and click on views
    #And user click on chronometer
    #When user click on start buttom
    #And user caputre the time
    #And user click on stop buttom
    #And user click on reset buttom
    #Then user validate  time
#
  #And user close the apiDemos
  #Scenario: user validate Checkebox and radoibuton in Hold or Old Theme page
    #Given user navigate to apidemo application and click on views
    #And user click on Controls
    #When user click on Hold or Old Theme
    #And user click on CheckboxFirst and  validate
    #And user click on RadioButtonSecond and validate
      #And user close the apiDemos
      #| 
#
  #Scenario: user validate updated date in Dialog page
    #Given user navigate to apidemo application and click on views
    #And user click on Date Widgets
    #When user click on Dialog
    #And user click on Change the date
    #Then user click on date
    #And user click on ok
    #Then user validate updated date

  #And user close the apiDemos
  #Scenario: user validate select different tab and verify changing text
    #Given user navigate to apidemo application and click on views
    #And user click on expandableLists
    #When user click on custom Adapter
    #And user click on peopleNames and validate them

  #And user close the apiDemos
  #Examples:
  #| tab  | tabtext       |
  #| TAB1 | with tag tab1 |
  #| TAB2 | with tag tab2 |
  #| TAB3 | with tag tab3 |
  
  Scenario: user Check expanded items and validate them
    Given user navigate to apidemo application and click on views
    And user click on Tabs
    When user click on Dialog
    And user click on content by factory
    And user click on tabOne
    Then user validate the tabOne text
    And user click on tabTwo
    Then user validate the tabTwo text
    And user click on tabThree
    Then user validate the tabThree text
