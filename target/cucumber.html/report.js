$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MovieDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Movie Information Validation",
  "description": "",
  "id": "movie-information-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Compare the IMDB and Wiki side information",
  "description": "",
  "id": "movie-information-validation;compare-the-imdb-and-wiki-side-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user navigate get url to \"https://www.imdb.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search for movie \"Pushpa\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "collect the country of origin details",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "release date information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Close the IMDB Browser",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user navigate get url to \"https://en.wikipedia.org/wiki/Main_Page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user search for movie in wikisite \"Pushpa\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "collect the country of origin details in wiki",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "release date information details in wiki",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Close the wiki Browser",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Compare the both information details from IMDB and Wiki Site",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.imdb.com/",
      "offset": 26
    }
  ],
  "location": "IMDBTestFile.user_navigate_get_url_to(String)"
});
formatter.result({
  "duration": 12770679400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pushpa",
      "offset": 23
    }
  ],
  "location": "IMDBTestFile.user_search_for_movie(String)"
});
formatter.result({
  "duration": 6937494700,
  "status": "passed"
});
formatter.match({
  "location": "IMDBTestFile.collect_the_country_of_origin_details()"
});
formatter.result({
  "duration": 69133600,
  "status": "passed"
});
formatter.match({
  "location": "IMDBTestFile.release_date_information()"
});
formatter.result({
  "duration": 6396799500,
  "status": "passed"
});
formatter.match({
  "location": "IMDBTestFile.close_the_IMDB_Browser()"
});
formatter.result({
  "duration": 963335400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://en.wikipedia.org/wiki/Main_Page",
      "offset": 26
    }
  ],
  "location": "IMDBTestFile.user_navigate_get_url_to(String)"
});
formatter.result({
  "duration": 4683046900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pushpa",
      "offset": 35
    }
  ],
  "location": "IMDBTestFile.user_search_for_movie_in_wikisite(String)"
});
formatter.result({
  "duration": 1724231400,
  "status": "passed"
});
formatter.match({
  "location": "IMDBTestFile.collect_the_country_of_origin_details_in_wiki()"
});
formatter.result({
  "duration": 113728900,
  "status": "passed"
});
formatter.match({
  "location": "IMDBTestFile.release_date_information_details_in_wiki()"
});
formatter.result({
  "duration": 66983600,
  "status": "passed"
});
formatter.match({
  "location": "IMDBTestFile.close_the_wiki_Browser()"
});
formatter.result({
  "duration": 853933600,
  "status": "passed"
});
formatter.match({
  "location": "IMDBTestFile.compare_the_both_information_details_from_IMDB_and_Wiki_Site()"
});
formatter.result({
  "duration": 312400,
  "status": "passed"
});
});