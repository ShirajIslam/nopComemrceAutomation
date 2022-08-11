package com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

    public class ContactUsPage {

        private WebDriver driver;

        private By name1 = By.id("FullName");
        private By email = By.id("Email");
        private By messageText = By.id("Enquiry");
        private By sendButton = By.xpath("//button[contains(@class,'contact-us-button')]");
        private By successMessg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]");

        public ContactUsPage(WebDriver driver) {
            this.driver = driver;
        }

        public String getContactUsPageTitle() {
            return driver.getTitle();
        }

        public void fillContactUsForm(String name, String emailId, String message) {
            driver.findElement(name1).sendKeys(name);
            driver.findElement(email).sendKeys(emailId);
            driver.findElement(messageText).sendKeys(message);
        }

        public void clickSend() {
            driver.findElement(sendButton).click();
        }

        public String getSuccessMessg() {
            return driver.findElement(successMessg).getText();
        }





    }

