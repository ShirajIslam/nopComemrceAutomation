@download
Feature: Check Downloadable product working
  Background: Perform user login
    Given user is on login page
    When user enters username "test@mail.com"
    And user enters password "1"
    And user clicks on login button


  Scenario: Download a product and check it
    Given Goto downloadable product page "https://localhost:44369/customer/downloadableproducts"
    Then Check any downloadable product present there or not
    Then Click the download button
    And Check product is downloaded or not
