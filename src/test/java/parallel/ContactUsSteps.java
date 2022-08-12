package parallel;
import com.pages.ContactUsPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.Index;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ContactUsSteps {
    private ContactUsPage contactUsPage=new ContactUsPage(DriverFactory.getDriver());
    @Given("user navigates to contact us page")
    public void user_navigates_to_contact_us_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        DriverFactory.getDriver().get("https://localhost:44369/contactus");
        }
    @When("user fills the form from given sheetname {string} and rownumber {int}")
    public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        ExcelReader reader=new ExcelReader();
        List<Map<String,String>> testData=reader.getData("C:\\Users\\BS969\\eclipse-workspace\\CucumberPOMSeries\\src\\test\\resources/Automation.xlsx", sheetName);
        String name= testData.get(rowNumber).get("name");
        String email=testData.get(rowNumber).get("email");
        String message=testData.get(rowNumber).get("message");
        contactUsPage.fillContactUsForm(name,email,message);
    }
    @When("user clicks on send button")
    public void user_clicks_on_send_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //Thread.sleep(2000);
        contactUsPage.clickSend();
    }
    @Then("it shows a successful message {string}")
    public void it_shows_a_successful_message(String expSuccessMessage) {
        // Write code here that turns the phrase above into concrete actions

       // throw new io.cucumber.java.PendingException();
    String actualSuccMessg= contactUsPage.getSuccessMessg();
        Assert.assertEquals(actualSuccMessg,expSuccessMessage);
    }
}
