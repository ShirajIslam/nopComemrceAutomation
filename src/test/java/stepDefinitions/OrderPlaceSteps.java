package stepDefinitions;



import io.cucumber.java.en.And;
import org.junit.Assert;

import com.pages.OrderPlacePage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Then;


public class OrderPlaceSteps {
	
	private OrderPlacePage orderplacePage=new OrderPlacePage(DriverFactory.getDriver());
	@Then("user clicks on add product to cart from two products")
	public void user_clicks_on_add_product_to_cart_from_two_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		orderplacePage.ClickOnAddProduct1();
		Thread.sleep(2000);
		orderplacePage.ClickOnAddProduct2();
	}

	@Then("go to cart")
	public void go_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		orderplacePage.ClickOnShoppingCart();
	}

	@Then("products are present in cart")
	public void products_and_present_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Assert.assertTrue(orderplacePage.isProduct1LinkExist());
		Assert.assertTrue(orderplacePage.isProduct2LinkExist());
	}


	@Then("check the checkbox of terms of service")
	public void check_the_checkbox_of_terms_of_service() {
	    // Write code here that turns the phrase above into concrete actions
	
		// throw new io.cucumber.java.PendingException();
		orderplacePage.checkboxOfterms();
	}

	@Then("user clicks on checkout button")
	public void user_clicks_on_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		orderplacePage.clickOnCheckout();
	}

	@Then("user clicks on continue button of billing address")
	public void user_clicks_on_continue_button_of_billing_address() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		orderplacePage.clickOnContinueBilling();
	}

	@Then("user clicks on continue button of shipping method")
	public void user_clicks_on_continue_button_of_shipping_method() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		orderplacePage.clickOnContinueShippingMethod();
	}

	@Then("user clicks on continue button of payment method")
	public void user_clicks_on_continue_button_of_payment_method() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		orderplacePage.clickOnContinuePaymentMethod();
	}

	@Then("user clicks on continue button of payment information")
	public void user_clicks_on_continue_button_of_payment_information() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		orderplacePage.clickOnContinueButtonPaymentInfo();
	}

	@Then("user clicks on confirm button of confirm order")
	public void user_clicks_on_confirm_button_of_confirm_order() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	orderplacePage.clickOnConfirmOrder();
	}


	@And("Order confirmed message should be {string}")
	public void orderConfirmedMessageShouldBe(String msg) {
		String actualMessage = orderplacePage.orderConfirmMessage();
		Assert.assertTrue(actualMessage.contains(msg));
	}
}
