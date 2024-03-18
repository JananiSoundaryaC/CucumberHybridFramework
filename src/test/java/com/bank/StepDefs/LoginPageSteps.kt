package com.bank.StepDefs

import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.And
import io.cucumber.java.en.Then

class LoginPageSteps {

    @Given("User is on the Customer login page")
    fun userIsOnTheCustomerLoginPage() {
    }

    @When("User enters valid Username")
    fun userEntersValidUsername() {
    }

    @And("User enters valid Password")
    fun userEntersValidPassword() {
    }

    @Then("User should be navigated to Accounts Services Page")
    fun userShouldBeNavigatedToAccountsServicesPage() {
    }

    @And("User enters invalid Password")
    fun userEntersInvalidPassword() {
    }

    @Then("User should be prompted with Error The username and password could not be verified")
    fun userShouldBePromptedWithErrorTheUsernameAndPasswordCouldNotBeVerified() {
    }
}