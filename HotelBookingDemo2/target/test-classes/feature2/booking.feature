Feature: Hotel Booking Page Functionality

Scenario: Firstname is blank
Given User is on Hotelbooking page
When firstname is blank
Then Display alertbox 'Please enter first name'

Scenario: Lastname is blank
Given User is on Hotelbooking page
When lastname is blank
Then Display alertbox 'Please enter last name'

Scenario: email is blank
Given User is on Hotelbooking page
When email is blank
Then Display alertbox 'Please enter email'

Scenario: email is invalid
Given User is on Hotelbooking page
When email is invalid
Then Display alertbox 'Please enter valid email id'

Scenario: mobile number is blank
Given User is on Hotelbooking page
When mobile number is blank
Then Display alertbox 'Please enter mobile number'

Scenario: mobile number is invalid
Given User is on Hotelbooking page
When mobile number is invalid
Then Display alertbox 'Please enter valid mobile number'

Scenario: City is not selected
Given User is on Hotelbooking page
When city is not selected by user
Then Display alertbox 'Please select the city' 

Scenario: State is not selected
Given User is on Hotelbooking page
When state is not selected by user
Then Display alertbox 'Please select the state' 

Scenario: Card holder name is not entered
Given User is on Hotelbooking page
When card holder name is not entered by user
Then Display alertbox 'Please enter cardholder name'

Scenario: Debit card number is not entered
Given User is on Hotelbooking page
When debit number is not entered
Then Display alertbox 'Please enter debit card number'

Scenario: cvv is not entered
Given User is on Hotelbooking page
When cvv is not entered
Then Display alertbox 'Please enter cvv'

Scenario: month is not entered
Given User is on Hotelbooking page
When expiry month is not entered
Then Display alertbox 'Please enter expiry month'

Scenario: year is not entered
Given User is on Hotelbooking page
When year is not entered
Then Display alertbox 'Please enter year'

Scenario: when all values are entered
Given User is on Hotelbooking page
When all values are entered
Then navigate to success page

