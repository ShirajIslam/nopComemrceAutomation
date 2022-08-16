Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Your store. Login"

Scenario: Forgot Password link
Given user is on login page
Then forgot password link should be displayed

#  @Skip
Scenario: Login with correct credentials
Given user is on login page
When user enters username "test@mail.com"
And user enters password "1"
And user clicks on login button
Then user gets the title of the page
And page title should be "Your store. Home page title"