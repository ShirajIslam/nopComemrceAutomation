package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;

	private By emailId= By.id("Email");
	private By password= By.id("Password");
	private By signInButton= By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
	private By forgotPwdLink=By.linkText("Forgot password?");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public String getLoginPageTitle() {
		return driver.getTitle();
		
	}
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
		
	}
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}
	
	
}
