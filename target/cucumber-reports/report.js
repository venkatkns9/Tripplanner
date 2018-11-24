$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("tripPlan.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: venkatkns99@gmail.com"
    },
    {
      "line": 2,
      "value": "#Scenario: A trip request can be executed and results returned"
    }
  ],
  "line": 4,
  "name": "As a TransportNSW user",
  "description": "I want to plan a trip from NorthSydney station to Town Hall station",
  "id": "as-a-transportnsw-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3032758988,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "A trip request can be executed and results returned",
  "description": "",
  "id": "as-a-transportnsw-user;a-trip-request-can-be-executed-and-results-returned",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Phileas is planning a trip",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "he executes a trip plan from \"North Sydney Station\" to \"Town Hall Station\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "a list of trips should be provided",
  "keyword": "Then "
});
formatter.match({
  "location": "tripPlanDefinition.gotoNSWPlanner()"
});
formatter.result({
  "duration": 2067564698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "North Sydney Station",
      "offset": 30
    },
    {
      "val": "Town Hall Station",
      "offset": 56
    }
  ],
  "location": "tripPlanDefinition.he_executes_a_trip_plan_from_to(String,String)"
});
formatter.result({
  "duration": 3061513745,
  "status": "passed"
});
formatter.match({
  "location": "tripPlanDefinition.a_list_of_trips_should_be_provided()"
});
formatter.result({
  "duration": 138129016,
  "status": "passed"
});
formatter.after({
  "duration": 2692822462,
  "status": "passed"
});
});