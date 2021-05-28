@AddBankInformation 
Feature: User should able to access bank features 

Background: 
	Given User should be techfios login page 
	
Scenario Outline: User should able to get into the page with correct infromation 
	When User enter the "<userName>" and "<password>" 
	And User click on SignInbutton 
	Then User land on the dashboard page 
	Then User click on Bank and Cash 
	Then User click on Add New Account 
	Then User enter the information "<accountTittle>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and "<phoneNumber>" 
	Then User click on submit button
	
	Examples: 
	|userName        |password|accountTittle|description|initialBalance|accountNumber|contactPerson|phoneNumber|
	|demo@techfios.com|abc123|Checking       |join account|250000        |15484545    |817-558-5555|800-585-5555|