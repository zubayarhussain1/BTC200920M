Feature: login validation
Background:
Given open broswer
And nevigate to url

Scenario: as a user  using valid credatial should be logged in


When user type userid in usertext box
And user type password in password box
And user click on login button
Then user should be in his profile page  


Scenario Outline: as a user  using valid credatial should  not be logged in

 
When user type <"userid"> in usertext box
And user type <"password"> in password box
And user click on login button
Then user should be in his profile page  

Examples:

|userid|password|
|user1|agshshg12|
|user2|gshghsfg| 
 