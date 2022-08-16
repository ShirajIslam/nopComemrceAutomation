package Parallel;

import com.pages.ReturnRequestPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReturnRequestSteps {
    private ReturnRequestPage returnRequestPage=new ReturnRequestPage(DriverFactory.getDriver());
    @When("user is on My account page")
    public void user_is_on_my_account_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        returnRequestPage.clickonMyAccount();
    }
    @When("user is on orders history page")
    public void user_is_on_orders_history_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        returnRequestPage.clickonOrders();
    }
    @Then("clicking on return items of a particular order user gets on submit return request page")
    public void clicking_on_return_items_of_a_particular_order_user_gets_on_submit_return_request_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        returnRequestPage.clickonReturnItems();
    }

    @Then("select a quantity")
    public void select_a_quantity() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException()
        Thread.sleep(1000);
        returnRequestPage.selectQuantity();
    }
    @Then("click on submit return request")
    public void click_on_submit_return_request() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        returnRequestPage.clickonSubmitReturnRequest();
        Thread.sleep(2000);
    }
    @Then("user should get a message {string}")
    public void user_should_get_a_message(String expectedmsg) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        String expMsg=returnRequestPage.getMessage();
        Assert.assertTrue(expMsg.contains(expectedmsg));
    }


}
