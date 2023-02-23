package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTable_StepDefinitions {

    WebTableLoginPage locators = new WebTableLoginPage();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        locators.inputUsername.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        locators.inputPassword.sendKeys(string);
    }

    @When("user click to login button")
    public void user_click_to_login_button() {
        locators.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyUrlContains("orders");
    }


    @When("user enters username {string} password {string} and logins")
    public void user_enters_username_password_and_logins(String username, String password) {
        locators.login(username, password);
    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {

//  locators.inputUsername.sendKeys(credentials.get("username"));
//  locators.inputPassword.sendKeys(credentials.get("password"));
//  locators.loginButton.click();

        //we can call our login utility method and pass values from map
        locators.login(credentials.get("username"), credentials.get("password"));

    }

}
