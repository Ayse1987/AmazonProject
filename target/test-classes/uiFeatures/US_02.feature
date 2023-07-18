
Feature: US_02 Sign in
  Background:
    Given go to the Amazon url
    And navigate to sign in page
  @readStates2
  @TC_02
  Scenario: User should be able to sign in with valid credentials

    Then enter valid email address to the email box
    And click continue button
    And enter valid password to the password box
    And click sign-in button
    Then verify sign in is successful
    And close driver

  @readStates2
    @TC_03
    Scenario: User should not be able to sign in with invalid credentials

      And enter invalid email address to the email box
      And click continue button
      And verify failure message is displayed
      And clear email box
      And enter valid email address to the email box
      And click continue button
     And enter invalid password to password box
     And click sign-in button
     Then verify failure message is displayed
     And close driver

  @TC_04
  Scenario Outline: User should not be able to sign in with invalid email

    And enter "<invalid email>" addresses to the email box
    And click continue button
    Then verify failure message is displayed
    And wait some
    And close driver
    Examples:
      | invalid email |
      #| @gmail.com |
      | 12345 |
      #| gmail.com |

  Scenario Outline: User should not be able to sign in with invalid password
    And enter valid email address to the email box
    And click continue button
    And enter "<invalid_password>" into password box
    And click sign-in button
    Then verify important message is displayed
    And close driver
    Examples:
      | invalid_password |
      | 123 |
      | abc |
      | *// |









