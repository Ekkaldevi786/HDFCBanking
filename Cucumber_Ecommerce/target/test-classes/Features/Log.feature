Feature: Login Feature

Scenario Outline: Login Fail with Possible Combinations
Given User is on Application Login Page
When User Click on Sign In button
Then User is displayed login Screen
When user enters "<Username>" in username field
And user enters "<Password>" in password field
And user clicks sign in button
Then user get login failed error message

Examples:
|Username|Password|
|Valid   |Valid   |
|Valid   |Invalid |
|Invalid | Valid  |
|Invalid | Invalid|
|Blank   | Blank  |