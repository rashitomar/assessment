Feature: Compose Function

Scenario Outline: Compose mail to particular recepient


	Given user is on Gmail page
	When  user enters email and password
	And   user click on Next Button
	Then  user is on Gmail home page
	When  user click on Compose Button
	And   user click on TO section of compose mail
	
	When  user click on Subject section 
	And   add "Incubyte"  to subject section
	When  user click on Body of mail  
	And   add "Automation QA test for Incubyte" to Body section
	
	When user click on Send button
	
	Then Message displayed Message Sent Successfully
	
