package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;
	@FindBy(name="userName")
	@CacheLookup
	WebElement userNameTxt;
	
	@FindBy(name="userPwd")
	@CacheLookup
	WebElement passWordTxt;
	
	@FindBy(className="btn")
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(id="userErrMsg")
	@CacheLookup
	WebElement userErrMsg;
	
	@FindBy(id="pwdErrMsg")
	@CacheLookup
	WebElement pwdErrMsg;
	public LoginPageFactory() {
		
	}
	
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setUserName(String name) {
		userNameTxt.sendKeys(name);
	}
	
	public void setPassword(String pwd) {
		passWordTxt.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		loginBtn.click();
	
	}
	
	public String getUserNameError() {
		String error=userErrMsg.getText();
		return error;
	}
	
	public String getPasswordError() {
		String error=pwdErrMsg.getText();
		return error;
	}

}
