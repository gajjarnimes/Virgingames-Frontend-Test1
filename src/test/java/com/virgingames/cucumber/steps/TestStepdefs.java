package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }
    @When("^I click on accept cookies link$")
    public void iClickOnAcceptCookiesLink() {
        new HomePage().clickOnAcceptLink();
    }

    @And("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

}
