
@all
Feature: Search fuctionality

#Below statement described the Background gherkin keword
Background:
Given User opened the application
 And  User clicks on search button
 
@Search @validproduct @smoke @regression
Scenario: Search for valid product
When User entered valid product in search field 
Then valid product should get displayed in search results

@Search @non-existing  @regression
Scenario: Search for non-existing product
When User entered invalid product in search field 
Then massage is displayed as There is no product that matches the search criteria should get displayed.

@Search @notprovidedetails  @regression
Scenario: Search without providing any text into the field
When User dont entered any text in search field 
Then massage is displayed as There is no product that matches the search criteria should get displayed.

