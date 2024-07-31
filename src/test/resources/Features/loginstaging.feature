@staging
Feature: Login Feature - Staging
  In order to perform successful login
  As a User
  I have to enter correct username and password

  Background:
    Given user navigates to the facebook website
    When user validates the homepage title
  @positive
  Scenario: Login to the Facebook Website as a Valid user on Staging
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user clicks on the sign-in button
    Then user "should be" successfully logged in

  @negative
  Scenario: Login to the Facebook Website as an Invalid user on Staging
    Then user enters "invalid" username
    And user enters "invalid" password
    And user validates captcha image
    And user clicks on the sign-in button
    Then user "should not be" successfully logged in
