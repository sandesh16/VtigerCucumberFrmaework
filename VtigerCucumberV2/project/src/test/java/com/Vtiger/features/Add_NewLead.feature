Feature:  Validate Add New Lead Functionality


Background: User logged in
   
Given User navigates to the website VTigerCRM
When  There user logs in through Login Window by using Username and Password 
Then  Login must be successful  

Scenario: Add New Lead Functionality
When  User is on New Lead page	 
And   User enters information and click on save button 
Then  Information must be save successfully
