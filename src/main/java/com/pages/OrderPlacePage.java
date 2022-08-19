package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPlacePage {
private WebDriver driver;
private By ShoppingCartButton=By.xpath("/html/body/div[6]/div[5]/div[1]/div[3]/ul/li[4]/a");
private By DiscountCodeBox=By.id("discountcouponcode");
private By applyCoupon=By.id("applydiscountcouponcode");
private By CouponMessage=By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[1]/div/div[1]/div[5]/span");
private By GiftCardBox=By.id("giftcardcouponcode");
private By applyGiftCardButton=By.id("applygiftcardcouponcode");
private By GiftCardMsg=By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[1]/div/div[2]/div[4]");
private By Product1AddButton=By.xpath("/html/body/div[6]/div[4]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]");
private By Product2AddButton=By.xpath("/html/body/div[6]/div[4]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]");
private By product1Link=By.linkText("Apple MacBook Pro 13-inch");
private By product2Link=By.linkText("HTC One M8 Android L 5.0 Lollipop");
private By checkboxOfterms=By.xpath("//*[@id=\"termsofservice\"]");
private By checkOutButton=By.xpath("//*[@id=\"checkout\"]");
private By continueButtonBilling=By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
private By continueButtonShippingMethod=By.xpath("/html/body/div[6]/div[4]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button");
private By continueButtonPaymentMethod=By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
private By TotalValue=By.xpath("//*[@id=\"shopping-cart-form\"]/div[3]/div[2]/div[1]/table/tbody/tr[5]/td[2]/span/strong");
private By continueButtonPaymentInfo=By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
private By ButtonConfirmOrder=By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
private final By ConfirmMsg = By.xpath("//*[text()='Your order has been successfully processed!']");
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
	//String s= driver.findElement(TotalValue).getText();
	driver.findElement(checkOutButton).click();
}
public void clickOnContinueBilling()  {
	driver.findElement(continueButtonBilling).click();

}
public void clickOnContinueShippingMethod() {
	driver.findElement(continueButtonShippingMethod).click();

}
public void clickOnContinuePaymentMethod(){
	
	driver.findElement(continueButtonPaymentMethod).click();


}
public String totalValueOfPayment(){
	return driver.findElement(TotalValue).getText();
}
public void clickOnContinueButtonPaymentInfo()  {
	driver.findElement(continueButtonPaymentInfo).click();

}
public void clickOnConfirmOrder(){
	driver.findElement(ButtonConfirmOrder).click();

}

public String orderConfirmMessage(){
	return driver.findElement(ConfirmMsg).getText();
}
public void EnterCouponCode(){
	driver.findElement(DiscountCodeBox).sendKeys("123");
	driver.findElement(applyCoupon).click();
}
public String couponConfirmMsg(){
	return driver.findElement(CouponMessage).getText();
}
public void EnterGiftCard(){
	driver.findElement(GiftCardBox).sendKeys("789");
	driver.findElement(applyGiftCardButton).click();

}
public String GiftCardMessage(){
	return driver.findElement(GiftCardMsg).getText();
}
}
