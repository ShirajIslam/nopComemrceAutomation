Feature: Return request feature

  Background:
    Given user is on login page
    When user enters username "test1@mail.com"
    And user enters password "1"
    And user clicks on login button
    And user is on My account page
    And user is on orders history page

#    Scenario: Return requests page showing products link
#      When clicking on return items of a particular order
#      Then user is on submit return request page
#      And products links are shown in submit return request page


  Scenario: Submit return request with selecting a quantity
      Then clicking on return items of a particular order user gets on submit return request page
      And user gets the title of the page
      And page title should be "Your store. Return Item(s)"
      And select a quantity
      And click on submit return request
      And user should get a message "Your return request has been submitted successfully."

  Scenario: Submit return request without selecting a quantity
        Then clicking on return items of a particular order user gets on submit return request page
        And user gets the title of the page
        And page title should be "Your store. Return Item(s)"
        And click on submit return request
        And user should get a message "Your return request has not been submitted because you haven't chosen any items."