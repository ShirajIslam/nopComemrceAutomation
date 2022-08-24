package Parallel;

import com.pages.DownloadableProductPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;

public class DownloadableProductsSteps {
    WebDriver driver = DriverFactory.getDriver();

    DownloadableProductPage downloadableProductPage = new DownloadableProductPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    @Given("Goto downloadable product page {string}")
    public void gotoDownloadableProductPage(String url) {
        driver.navigate().to(url);
    }

    @Then("Check any downloadable product present there or not")
    public void checkAnyDownloadableProductPresentThereOrNot() {
        Assert.assertTrue(downloadableProductPage.checkDownloadBtn());
    }

    @Then("Click the download button")
    public void clickTheDownloadButton() throws InterruptedException {
        downloadableProductPage.clickDownloadBtn();
        Thread.sleep(2000);
    }

    @And("Check product is downloaded or not")
    public void checkProductIsDownloadedOrNot() {
        Assert.assertTrue(downloadableProductPage.checkProductIsDownloadedOrNot());
    }

}