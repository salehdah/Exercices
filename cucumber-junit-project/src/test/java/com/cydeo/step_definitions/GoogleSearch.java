package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch {
GoogleSearchPage googleSearchPage=new GoogleSearchPage();

    @Given("user on google page")
    public void user_on_google_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("he enters apple in search box")
    public void he_enters_apple_in_search_box() {
googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }
    @Then("he should be able to see the title")
    public void he_should_be_able_to_see_the_title() {
        String expectedTitle= "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
