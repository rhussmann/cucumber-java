package step_definitions;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;

public class CheckoutSteps {
    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void the_price_of_a_is_c(String arg1, int arg2) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	throw new PendingException();
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void i_checkout(int arg1, String arg2) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	throw new PendingException();
    }

    @Then("^the toal price should be (\\d+)c$")
    public void the_toal_price_should_be_c(int arg1) throws Throwable {
	// Write code here that turns the phrase above into concrete actions
	throw new PendingException();
    }
}
