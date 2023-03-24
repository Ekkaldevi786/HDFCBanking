Feature: OLA Booking Feature



@Smoke
Scenario: Booking Auto Sadan
Given User want to select a Auto type "Sadan" from OLA Application
When User Select a Auto "Sadan" and pick up point "pune" and Drop Point "Mumbai"
Then Driver Stars a Journy
And Driver Ends the Journy
Then User Pay 1000 USD

@Regression
Scenario: Booking Auto SUV
Given User want to select a Auto type "SUV" from OLA Application
When User Select a Auto "SUV" and pick up point "Nagar" and Drop Point "Aurangabad"
Then Driver Stars a Journy
And Driver Ends the Journy
Then User Pay 500 USD

@Prod
Scenario: Booking Auto MINI
Given User want to select a Auto type "MINI" from OLA Application
When User Select a Auto "MINI" and pick up point "Nanded" and Drop Point "Himayatnagar"
Then Driver Stars a Journy
And Driver Ends the Journy
Then User Pay 11000 USD