package feature2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cg.model.BookingPageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookStepDefn {
	
	BookingPageFactory BookingPage;
	WebDriver driver;
	
	@Given("^User is on Hotelbooking page$")
	public void user_is_on_Hotelbooking_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("D:\\HotelBookingDemo\\hotelbooking.html");
		BookingPage=new BookingPageFactory(driver);
		System.out.println("page loaded in browser");
	    
	}

	@When("^firstname is blank$")
	public void firstname_is_blank() throws Throwable {
		
		BookingPage.setFirstName("");
		BookingPage.clickSubmitButton();
	   
	}

	@Then("^Display alertbox 'Please enter first name'$")
	public void display_alertbox_Please_enter_first_name() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please fill the First Name";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}
	
	@When("^lastname is blank$")
	public void lastname_is_blank() throws Throwable {
		BookingPage.setFirstName("Nandini");
		BookingPage.setLastName("");
		BookingPage.clickSubmitButton();
		
	    
	}

	@Then("^Display alertbox 'Please enter last name'$")
	public void display_alertbox_Please_enter_last_name() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please fill the Last Name";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	    
	}
	@When("^email is blank$")
	public void email_is_blank() throws Throwable {
		BookingPage.setFirstName("Nandini");
		BookingPage.setLastName("Guddeti");
		BookingPage.setEmail("");
		BookingPage.clickSubmitButton();
	   
	}

	@Then("^Display alertbox 'Please enter email'$")
	public void display_alertbox_Please_enter_email() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please fill the Email";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}
	@When("^email is invalid$")
	public void email_is_invalid() throws Throwable {
		BookingPage.setFirstName("Nandini");
		BookingPage.setLastName("Guddeti");
		BookingPage.setEmail("abc*gjhdg.com");
		BookingPage.clickSubmitButton();
	   
	  
	}

	@Then("^Display alertbox 'Please enter valid email id'$")
	public void display_alertbox_Please_enter_valid_email_id() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please enter valid Email Id.";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	    
	}
	@When("^mobile number is blank$")
	public void mobile_number_is_blank() throws Throwable {
		BookingPage.setFirstName("Nandini");
		BookingPage.setLastName("Guddeti");
		BookingPage.setEmail("nandu.guddeti@gmail.com");
		BookingPage.clickSubmitButton();
	   
	}

	@Then("^Display alertbox 'Please enter mobile number'$")
	public void display_alertbox_Please_enter_mobile_number() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please fill the Mobile No.";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}
	
	@When("^mobile number is invalid$")
	public void mobile_number_is_invalid() throws Throwable {
		BookingPage.setFirstName("Nandini");
		BookingPage.setLastName("Guddeti");
		BookingPage.setEmail("nandu.guddeti@gmail.com");
		BookingPage.setPhoneNo("8255456");
		BookingPage.clickSubmitButton();
	    
	}

	@Then("^Display alertbox 'Please enter valid mobile number'$")
	public void display_alertbox_Please_enter_valid_mobile_number() throws Throwable {
		String actErrMsg=driver.switchTo().alert().getText();
		String expErrMsg="Please enter valid Contact no.";
		Assert.assertEquals(expErrMsg, actErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}
	

@When("^city is not selected by user$")
public void city_is_not_selected_by_user() throws Throwable {
	BookingPage.setFirstName("Nandini");
	BookingPage.setLastName("Guddeti");
	BookingPage.setEmail("nandu.guddeti@gmail.com");
	BookingPage.setPhoneNo("9247128552");
	BookingPage.clickSubmitButton();
	
   
}

@Then("^Display alertbox 'Please select the city'$")
public void display_alertbox_Please_select_the_city() throws Throwable {
	String actErrMsg=driver.switchTo().alert().getText();
	String expErrMsg="Please select city";
	Assert.assertEquals(expErrMsg, actErrMsg);
	driver.switchTo().alert().accept();
	driver.close();
    
}
@When("^state is not selected by user$")
public void state_is_not_selected_by_user() throws Throwable {
	BookingPage.setFirstName("Nandini");
	BookingPage.setLastName("Guddeti");
	BookingPage.setEmail("nandu.guddeti@gmail.com");
	BookingPage.setPhoneNo("9247128552");
	BookingPage.setCity("Pune");
	BookingPage.clickSubmitButton();
	
}

@Then("^Display alertbox 'Please select the state'$")
public void display_alertbox_Please_select_the_state() throws Throwable {
	String actErrMsg=driver.switchTo().alert().getText();
	String expErrMsg="Please select state";
	Assert.assertEquals(expErrMsg, actErrMsg);
	driver.switchTo().alert().accept();
	driver.close();
	
   
}
@When("^card holder name is not entered by user$")
public void card_holder_name_is_not_entered_by_user() throws Throwable {
	BookingPage.setFirstName("Nandini");
	BookingPage.setLastName("Guddeti");
	BookingPage.setEmail("nandu.guddeti@gmail.com");
	BookingPage.setPhoneNo("9247128552");
	BookingPage.setCity("Pune");
	BookingPage.setState("Maharashtra");
	BookingPage.setCardHolderName("");
	BookingPage.clickSubmitButton();
	}

@Then("^Display alertbox 'Please enter cardholder name'$")
public void display_alertbox_Please_enter_cardholder_name() throws Throwable {
	String actErrMsg=driver.switchTo().alert().getText();
	String expErrMsg="Please fill the Card holder name";
	Assert.assertEquals(expErrMsg, actErrMsg);
	driver.switchTo().alert().accept();
	driver.close();
  
}

@When("^debit number is not entered$")
public void debit_number_is_not_entered() throws Throwable {
	BookingPage.setFirstName("Nandini");
	BookingPage.setLastName("Guddeti");
	BookingPage.setEmail("nandu.guddeti@gmail.com");
	BookingPage.setPhoneNo("9247128552");
	BookingPage.setCity("Pune");
	BookingPage.setState("Maharashtra");
	BookingPage.setCardHolderName("Nandini");
	BookingPage.setDebit("");
	BookingPage.clickSubmitButton();
   
}

@Then("^Display alertbox 'Please enter debit card number'$")
public void display_alertbox_Please_enter_debit_card_number() throws Throwable {
	String actErrMsg=driver.switchTo().alert().getText();
	String expErrMsg="Please fill the Debit card Number";
	Assert.assertEquals(expErrMsg, actErrMsg);
	driver.switchTo().alert().accept();
	driver.close();
   
}

@When("^cvv is not entered$")
public void cvv_is_not_entered() throws Throwable {
	BookingPage.setFirstName("Nandini");
	BookingPage.setLastName("Guddeti");
	BookingPage.setEmail("nandu.guddeti@gmail.com");
	BookingPage.setPhoneNo("9247128552");
	BookingPage.setCity("Pune");
	BookingPage.setState("Maharashtra");
	BookingPage.setCardHolderName("Nandini");
	BookingPage.setDebit("1321432143214");
	BookingPage.setCvv("");
	BookingPage.clickSubmitButton();
    
}

@Then("^Display alertbox 'Please enter cvv'$")
public void display_alertbox_Please_enter_cvv() throws Throwable {
	String actErrMsg=driver.switchTo().alert().getText();
	String expErrMsg="Please fill the CVV";
	Assert.assertEquals(expErrMsg, actErrMsg);
	driver.switchTo().alert().accept();
	driver.close();
   
}

@When("^expiry month is not entered$")
public void expiry_month_is_not_entered() throws Throwable {
	BookingPage.setFirstName("Nandini");
	BookingPage.setLastName("Guddeti");
	BookingPage.setEmail("nandu.guddeti@gmail.com");
	BookingPage.setPhoneNo("9247128552");
	BookingPage.setCity("Pune");
	BookingPage.setState("Maharashtra");
	BookingPage.setCardHolderName("Nandini");
	BookingPage.setDebit("1321432143214");
	BookingPage.setCvv("045");
	BookingPage.setMonth("");
	BookingPage.clickSubmitButton();
    
   
}

@Then("^Display alertbox 'Please enter expiry month'$")
public void display_alertbox_Please_enter_expiry_month() throws Throwable {
	String actErrMsg=driver.switchTo().alert().getText();
	String expErrMsg="Please fill expiration month";
	Assert.assertEquals(expErrMsg, actErrMsg);
	driver.switchTo().alert().accept();
	driver.close();
    
}

@When("^year is not entered$")
public void year_is_not_entered() throws Throwable {
	BookingPage.setFirstName("Nandini");
	BookingPage.setLastName("Guddeti");
	BookingPage.setEmail("nandu.guddeti@gmail.com");
	BookingPage.setPhoneNo("9247128552");
	BookingPage.setCity("Pune");
	BookingPage.setState("Maharashtra");
	BookingPage.setCardHolderName("Nandini");
	BookingPage.setDebit("1321432143214");
	BookingPage.setCvv("045");
	BookingPage.setMonth("03");
	BookingPage.setYear("");
	BookingPage.clickSubmitButton();
    
    
}

@Then("^Display alertbox 'Please enter year'$")
public void display_alertbox_Please_enter_year() throws Throwable {
	String actErrMsg=driver.switchTo().alert().getText();
	String expErrMsg="Please fill the expiration year";
	Assert.assertEquals(expErrMsg, actErrMsg);
	driver.switchTo().alert().accept();
	driver.close();
}

@When("^all values are entered$")
public void all_values_are_entered() throws Throwable {
	BookingPage.setFirstName("Nandini");
	BookingPage.setLastName("Guddeti");
	BookingPage.setEmail("nandu.guddeti@gmail.com");
	BookingPage.setPhoneNo("9247128552");
	BookingPage.setCity("Pune");
	BookingPage.setState("Maharashtra");
	BookingPage.setCardHolderName("Nandini");
	BookingPage.setDebit("1321432143214");
	BookingPage.setCvv("045");
	BookingPage.setMonth("03");
	BookingPage.setYear("2025");
	BookingPage.clickSubmitButton();
    
    
}

@Then("^navigate to success page$")
public void navigate_to_success_page() throws Throwable {
	driver.navigate().to("D:\\HotelBookingDemo\\success.html");
	
    
}










}
