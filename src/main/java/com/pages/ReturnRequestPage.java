package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReturnRequestPage {
    private WebDriver driver;
    private By myAccount = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    private By ordersButton = By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[3]/a");
    private By returnItemsButton = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/div/div[2]/button[1]");
    private By selectquantity = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/table/tbody/tr/td[3]/select");
    private By submitReturnRequestButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[3]/button");
    private By getMessage=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div");
    public ReturnRequestPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickonMyAccount() {
        driver.findElement(myAccount).click();
    }

    public void clickonOrders() {
        driver.findElement(ordersButton).click();
    }

    public void clickonReturnItems() {
        driver.findElement(returnItemsButton).click();
    }

    public void selectQuantity() {
        driver.navigate().refresh();
        Select select = new Select(driver.findElement(selectquantity));
        select.selectByIndex(1);
    }

    public void clickonSubmitReturnRequest() {
        driver.findElement(submitReturnRequestButton).click();

    }
    public String getMessage() {
    return driver.findElement(getMessage).getText();
        }

}