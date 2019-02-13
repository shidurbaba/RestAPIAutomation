#Author : Moses Peris
#Date : 02/06/2019

  Feature: I am able to post into my server
    @SmokeTest_01
    Scenario: Verify as a user, I am able to post new authors in my stand alone api server
      Given I am able to initialize header as "Content-Type" and header value as "application/json"
      Then I am able to put id as "id" and id# as "564"
      Then I am able to put author as "author" and name of the author as "Julius Verne"
      Then I am able to put title as "title" and title name as "Scifi-author"
      Then I am able to put publisher as "publisher" and publisher name as "RandomAudio"
      Then I should get a response back from the backend
