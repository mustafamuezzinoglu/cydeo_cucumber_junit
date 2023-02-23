
  Feature: User should be able to login using correct credentials

    Scenario:  Positive Login scenario

      Given user is on the login page of web table app
      When user enters username "Test"
      And user enters password "Tester"
      And user click to login button
      Then user should see url contains orders


    Scenario:  Positive Login scenario

      Given user is on the login page of web table app
      When user enters username "Test" password "Tester" and logins
      Then user should see url contains orders