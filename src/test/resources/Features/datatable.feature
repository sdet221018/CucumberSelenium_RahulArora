@datatable
Feature: Login Feature - Production
  In order to perform successful login
  As a User
  I have to enter correct username and password

@positive
  Scenario: Login to the Facebook Website as a valid user on Production
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters firstname and lastname
      | Dawood   | Nabee   |
      | Suleman  | Emporer |
    And user clicks on the sign-in button
    Then user "should be" successfully logged in

@negative
  Scenario: Login to the Facebook Website as an Invalid user on Production
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "invalid" password
    And user validates captcha image
    And user enters title, firstname and lastname
      | Title | FirstName | LastName |
      | Mr.   | David     | Warner   |
      | Mr.   | Solomon   | Emporer  |
      | Miss. | Asia      | Pharow   |
    And user clicks on the sign-in button
    Then user "should not be" successfully logged in