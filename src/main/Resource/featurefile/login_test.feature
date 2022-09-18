#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
		@tag
		Feature: To validate and check features of Login Page with invalid data
		
		
		 @invalidCredentials
		Scenario Outline:Login the web application
		Given Launch the application
		When Click the login button
		And Enter the username "<username>"
		And Enter the password "<password>"
		Then Click on Continue
		
		
		Examples: 
		
		|username|password|error|
		|kanchana@gmail.com|NandithaSree@1215|invalid username or password|
		|kanchanagorle@gmail.com|admin@1234|invalid username or password|
		
		@validCredentials
		Scenario: Login the web application

		Given in login page
		When click login button
		And Enter username as "kanchanagit@gmail.com"
		And Enter password as "Kanchana@1234"
		Then Continue



		@Dashboard
		Scenario: Navigate To Dashboard
		Given home page
		Then New project 
		And Create New Project
		
		@CreateTask
		Scenario: Creating new task under the new project
		Given Project selected
		Then Start creating task
		And Verify task created
