#""" (Doc Strings)
## this is used when we have to write 2-3 lines of the text in the feature file
## instead of writting it in a single line, you can write it in multiple lines using Doc Strings

Feature: Email page Test

Scenario: New file for docString demo
When I reset my password on the email
Then I should receive an email with following content
"""
Hello Vijay,

please click on this to reset the password

Thanks
admin team  
"""