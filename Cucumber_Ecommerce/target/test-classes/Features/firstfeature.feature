Feature: Test Login Functionality of orangeHRM

Scenario: Test Valid Login Cretdntial

Given user is on loginpage
When user enters username and password
And click on login button
Then user should land on home page