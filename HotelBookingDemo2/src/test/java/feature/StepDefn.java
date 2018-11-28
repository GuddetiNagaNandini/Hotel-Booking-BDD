package feature;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.cg.model.LoginPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefn {
	
	
	LoginPageFactory loginPage;
	WebDriver driver;
	

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("D:\\HotelBookingDemo\\login.html");
		
		loginPage=new LoginPageFactory(driver); 
		System.out.println("page loaded in browser");
	}
	@When("^username password are blank$")
	public void username_password_are_blank() throws Throwable {
		loginPage.setUserName("");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
	}

	@Then("^Display error message'Please enter Username'$")
	public void display_error_message_Please_enter_Username() throws Throwable {
		
		String actualErrmsg=loginPage.getUserNameError();
		String expErrorMsg="* Please enter userName.";
		Assert.assertEquals(expErrorMsg, actualErrmsg);
		
		
		
	}
	
	@When("^username is given but password is blank$")
	public void username_is_given_but_password_is_blank() throws Throwable {
		loginPage.setUserName("Nandini");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
	    
	}

	@Then("^Display error Message 'Please enter password'$")
	public void display_error_Message_Please_enter_password() throws Throwable {
		
		
		String actErrMsg=loginPage.getPasswordError();
		String expErrmsg="* Please enter password.";
		Assert.assertEquals(expErrmsg, actErrMsg);
		driver.close();
	}
	
	@When("^Invalid username password are entered$")
	public void invalid_username_password_are_entered() throws Throwable {
		loginPage.setUserName("Nandini");
		loginPage.setPassword("nandini123");
		loginPage.clickLoginButton();
	    
	   
	}

	@Then("^Display alert box 'Invalid login! Please try again!'$")
	public void display_alert_box_Invalid_login_Please_try_again() throws Throwable {
		String actualErrorMsg=driver.switchTo().alert().getText();
		String expErrorMsg="Invalid login! Please try again!";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	    
	}
	@When("^Valid username and password are given$")
	public void valid_username_and_password_are_given() throws Throwable {
		loginPage.setUserName("Capgemini");
		loginPage.setPassword("capgemini123");
		loginPage.clickLoginButton();
	    
		
	   
	}

	@Then("^Navigate to booking page$")
	public void navigate_to_booking_page() throws Throwable {
		driver.navigate().to("D:\\HotelBookingDemo\\hotelbooking.html");
		driver.close();
	    
	}

}