Feature: User Registration

Scenario: User Registration With Different Data
Given User is on Registration page
When User Enters Following User Details
|Uttam|Ekkaldevi|purushottam.gmail.com|9422549123|Ahmednagr|
|Nikita| Guddetwar|nikita@gmail.com|7517046124|Pune|
|Trisha|Soni|soni@gmail.com|454545678|Mumbai|
Then User Registration Should Be Successful