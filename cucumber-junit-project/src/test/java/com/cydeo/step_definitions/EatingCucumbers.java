package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumbers {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("dah is from Given");
    }
    @When("he eats cucumbers")
    public void he_eats_cucumbers() {
        System.out.println("dah is from When");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("dah is from Then");
    }


}
