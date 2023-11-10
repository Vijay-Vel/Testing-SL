@all
Feature: Test the Wiki page on chrome Browser

@create @functional
Scenario: Test Create account on Wiki Page
Given User is on Main page 
Then User Enters username
And User enters Password

@login @functional
Scenario: Test Login link on Wiki Page
Given User is on Main page 
When User clicks on Login link
Then User clicks on checkbox on login Page
Then User clicks on Forgot your password? link