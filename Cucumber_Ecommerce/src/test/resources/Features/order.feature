@All
Feature: Amazon order page
In order to check my order details 
As a Register User
I want to Specify the features of order details page

Background: 
Given A registered user exists
Given user is on amazon login Page
When user enters username
And user enters password
And user clicks on login button
Then user navigate to order page

@Smoke
Scenario: Check The Privious Order Details
When user clicks on Privious order Link
Then user checks the prievious order details
Then user check Details

@Regression
Scenario: Check open Order Details
When user clicks on open order Link
Then user checks the open order details

@Prod
Scenario: Check Cancelled Order Details
When user clicks on Cancelled order Link
Then user checks the cancelled order details


