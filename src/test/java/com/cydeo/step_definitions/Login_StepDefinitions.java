package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {


    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");
    }

    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("user enters librarian password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("User should see the dashboard");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters student username");
    }

    @When("user enter student password")
    public void user_enter_student_password() {
        System.out.println("user enters student password");
    }

    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("User enters admin username");
    }
    @When("user enter admin password")
    public void user_enter_admin_password() {
        System.out.println("user enters admin password");
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user is on login page");
    }
}
