
@all
Feature: User Registration

	Background:
Given User navigate to Registration page

 @Register @Mandatoryfields  @smoke @regression 
Scenario: Register with Mandatory fields
When User enters below details into the field 
|firstname   |Arun                  |
|lastname    |motoori               |
|email       |arun.motoori@gmail.com|
|telephone   |1234567899            |
|password    |1234567899       |


And User click yes to newsletter
And User select privacy policy field
And User click on continue button
Then User account should get sucsessfully created

 @Register @allfields  @smoke @regression 
Scenario: Register with all fields

And User click yes to newsletter
And User select privacy policy field
And User click on continue button
Then User account should get sucsessfully created

 @Register @nodetails   @regression 
Scenario: Register without providing any fields
When User dont enter details into the field 
And User click on continue button
Then User account should get proper warning massage