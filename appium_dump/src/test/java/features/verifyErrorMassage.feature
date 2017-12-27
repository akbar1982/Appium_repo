Feature: Hotels.com android app project



  @sign_in-1
  Scenario Outline: Verify sign in error message
  Given: I open Hotels.com application
    When i press OK button from pop Up screen
    And I press corner Menu button
    And I choose sign in from menu
    And I enter "mohammad@technosoftacademy.io" into email textfield
    And I enter "Test12345" into password field
    And I press signIn button
    Then I verify displayed "<error message>" given below

     Examples:
    |error message|
    |We no longer support signing in with this version of the app. Please update to the latest version.|