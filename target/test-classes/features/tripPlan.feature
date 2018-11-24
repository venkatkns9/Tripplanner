#Author: venkatkns99@gmail.com
#Scenario: A trip request can be executed and results returned

Feature: As a TransportNSW user
  I want to plan a trip from NorthSydney station to Town Hall station
@smoke
  Scenario: A trip request can be executed and results returned
  Given Phileas is planning a trip
	When he executes a trip plan from "North Sydney Station" to "Town Hall Station"
	Then a list of trips should be provided
  