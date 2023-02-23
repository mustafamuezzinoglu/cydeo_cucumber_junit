package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinition {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
    }



    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
      Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }


    DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) {

        Select select = new Select(dropdownsPage.dropdownMonths);

        //List of all ACTUAL month <options> as a web element
        List<WebElement> actualOptionAsWebElement = select.getOptions();

        //create a list of string and pass all of the actual web element options string into that new list

        //List of all ACTUAL month <options> as a string
        List<String> actualOptionAsString = new ArrayList<>();

        for (WebElement each : actualOptionAsWebElement) {
            actualOptionAsString.add(each.getText());
        }

        Assert.assertEquals( expectedMonths,actualOptionAsString);
        //Assert will check the size  of the lists first. if it is matching it will check content 1 by 1
    }
}
