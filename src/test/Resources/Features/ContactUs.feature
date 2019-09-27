@ContactUs
Feature: User should able send message to customer service
  Scenario:
    Given user is on home page
    When user click on contactUs
    And user select customer service
    And user enter email address
    And user enter text message
    And user click on send button
    Then user can see message has been successfully sent
