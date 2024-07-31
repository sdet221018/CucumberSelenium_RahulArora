@test
Feature: Login Feature
  In order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario Outline: Login to the Facebook Website as a user
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the sign-in button
    Then user "<loginornot>" successfully logged in
Examples:
  | username | password | loginornot    |
  | valid    | valid    | should be     |
  | valid    | invalid  | should not be |
  | invalid  | invalid  | should not be |
  | invalid  | valid    | should not be |

#  Scenario: Login to the Facebook Website as an Invalid user
#    Given user navigates to the facebook website
#    When user validates the homepage title
#    Then user enters "invalid" username
#    And user enters "invalid" password
#    And user clicks on the sign-in button


