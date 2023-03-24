Feature: Facebook Login Feature


Scenario Outline: Test Login Functionality With Different Creadential
Given user is on Facebook Lgin page
When user fills username field with sheetname "<Sheetname>" and rownumber <Row>
And  user fills password field with sheetname "<Sheetname>" and rownumber <Row>
And user click on Facebook login button
Then user should be navigate to Facebbok Login HomePage

Examples:
|Sheetname|Row|Row|
|Login|1|1|
|Login|2|2|













