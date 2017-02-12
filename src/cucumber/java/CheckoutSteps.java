package step_definitions;

import static org.junit.Assert.*;

import com.rhussmann.checkout.Checkout;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;

public class CheckoutSteps {
    int bananaPrice = 0;
    Checkout checkout;

    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void the_price_of_a_is_c(String name, int price) throws Throwable {
	bananaPrice = price;
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void i_checkout(int itemCount, String itemName) throws Throwable {
	checkout = new Checkout();
	checkout.add(itemCount, bananaPrice);
    }

    @Then("^the toal price should be (\\d+)c$")
    public void the_toal_price_should_be_c(int total) throws Throwable {
	assertEquals(total, checkout.total());
    }
}
