Feature: Assert text for option Good in survey

Scenario: Assert text for option Good in survey
Given User is in the survey page
When he select Good option
And he click on Next button
Then he will sees "Have a nice day." text