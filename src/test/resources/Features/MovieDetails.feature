Feature: Movie Information Validation

Scenario: Compare the IMDB and Wiki side information

Given user navigate get url to "https://www.imdb.com/"
When user search for movie "Pushpa"
Then collect the country of origin details
And release date information
Then Close the IMDB Browser
Given user navigate get url to "https://en.wikipedia.org/wiki/Main_Page"
When user search for movie in wikisite "Pushpa"
Then collect the country of origin details in wiki
And release date information details in wiki
Then Close the wiki Browser
Given Compare the both information details from IMDB and Wiki Site


