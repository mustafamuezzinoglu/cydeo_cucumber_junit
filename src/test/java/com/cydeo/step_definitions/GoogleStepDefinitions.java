package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("User types {word} and clicks enter")
    public void user_types_and_clicks_enter2(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword+ Keys.ENTER);
    }

    @When("User types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword+ Keys.ENTER);
    }

    @Then("user sees {string}  in the google title")
    public void user_sees_in_the_google_title(String string) {

        String expectedTitle = string+ " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

//      Junit assertion accepts first arguments as expected , second arg as actual
        Assert.assertEquals("Title is not as expected! ", expectedTitle, actualTitle);
//      Assert.assertTrue(actualTitle.equals(expectedTitle));

    }

    @Then("user sees {word}  in the google title")
    public void user_sees_apple_in_the_google_title(String anything) {

        String expectedTitle = anything + " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

//      Junit assertion accepts first arguments as expected , second arg as actual
        Assert.assertEquals(expectedTitle, actualTitle);
//      Assert.assertTrue(actualTitle.equals(expectedTitle));

    }

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @Then("user should be see title is Google")
    public void user_should_be_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.closeDriver();
    }
}
