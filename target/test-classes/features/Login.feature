@login
  Feature: US_01 Login
    Background: Users should be go to url
      Given user can go to url




  Scenario Outline: TC_01 User should be able to Login
    Given user fills in the username button with "<data>"
    Then user fills in the password button with right password
    And user clicks login button
    Then user displays product Text
    And user clciks button
    Then user can logout
    Then user closes driver

    Examples:
    | data |
    | standard_user |
    | problem_user  |
    | performance_glitch_user |

Scenario: TC_02 User should not able to login(Negative Test)
  Given user fills in the username button wrong data
  When user fills in the password button with right password
  Then user clicks login button
  And user displays warning message
  Then user closes driver

