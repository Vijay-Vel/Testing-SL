Feature: Create account on wiki page

Scenario: User creates account on wiki page using input from cucumber data table
Given User is on Create Account Page
Then User enters following details
| admin | admin@123 | admin@123 | admin@gmail.com |
| maya | admin@123 | admin@123 | maya@gmail.com |
| riya | admin@123 | admin@123 | riya@gmail.com |
| John | admin@123 | admin@123 | John@gmail.com |
| Marc | admin@123 | admin@123 | Marc@gmail.com |
Then Account creation is successfull


Scenario: User creates account on wiki page using input from cucumber data table
Given User is on Create Account Page
Then User enters following details using column name
| Username | Password | retype | Email ID|
| admin | admin@123 | admin@123 | admin@gmail.com |
| maya | admin@123 | admin@123 | maya@gmail.com |
| riya | admin@123 | admin@123 | riya@gmail.com |
| John | admin@123 | admin@123 | John@gmail.com |
| Marc | admin@123 | admin@123 | Marc@gmail.com |
Then Account creation is successfull