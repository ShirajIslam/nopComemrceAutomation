package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPlacePage {
private WebDriver driver;
private By ShoppingCartButton=By.xpath("/html/body/div[6]/div[5]/div[1]/div[3]/ul/li[4]/a");
private By Product1AddButton=By.xpath("/html/body/div[6]/div[4]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]");
private By Product2AddButton=By.xpath("/html/body/div[6]/div[4]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]");
private By product1Link=By.linkText("Apple MacBook Pro 13-inch");
private By product2Link=By.linkText("HTC One M8 Android L 5.0 Lollipop");
private By checkboxOfterms=By.xpath("//*[@id=\"termsofservice\"]");
private By checkOutButton=By.xpath("//*[@id=\"checkout\"]");
private By continueButtonBilling=By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
private By continueButtonShippingMethod=By.xpath("/html/body/div[6]/div[4]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button");
private By continueButtonPaymentMethod=By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
private By continueButtonPaymentInfo=By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
private By ButtonConfirmOrder=By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
private By ComfirmMsg = By.xpath("//*[text()='Your order has been successfully processed!']");
public OrderPlacePage(WebDriver driver) {
	this.driver=driver;
}
public boolean isProduct1LinkExist() {
	return driver.findElement(product1Link).isDisplayed();
	}
public boolean isProduct2LinkExist() {
	return driver.findElement(product2Link).isDisplayed();
}
public void ClickOnShoppingCart() {
	driver.findElement(ShoppingCartButton).click();
	
}
public void ClickOnAddProduct1() {
	driver.findElement(Product1AddButton).click();
	
}

public void ClickOnAddProduct2() {
	driver.findElement(Product2AddButton).click();
}
public void checkboxOfterms(){
	driver.findElement(checkboxOfterms).click();
}
public void clickOnCheckout() {
	driver.findElement(checkOutButton).click();
}
public void clickOnContinueBilling() throws InterruptedException {
	driver.findElement(continueButtonBilling).click();
	Thread.sleep(2000);
}
public void clickOnContinueShippingMethod() throws InterruptedException {
	driver.findElement(continueButtonShippingMethod).click();
	Thread.sleep(2000);
}
public void clickOnContinuePaymentMethod() throws InterruptedException {
	
	driver.findElement(continueButtonPaymentMethod).click();
	Thread.sleep(2000);
}
public void clickOnContinueButtonPaymentInfo() throws InterruptedException {
	driver.findElement(continueButtonPaymentInfo).click();
	Thread.sleep(2000);
}
public void clickOnConfirmOrder() throws InterruptedException {
	driver.findElement(ButtonConfirmOrder).click();
	Thread.sleep(2000);
}

public String orderConfirmMessage(){
	return driver.findElement(ComfirmMsg).getText();
}

}
