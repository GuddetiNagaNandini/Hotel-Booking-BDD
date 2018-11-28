package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPageFactory {
	WebDriver driver;
	
	@FindBy(id="txtFirstName")
	@CacheLookup
	WebElement txtFirstName;
	@FindBy(id="txtLastName")
	@CacheLookup
	WebElement txtLastName;
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txtEmail;
	@FindBy(id="txtPhone")
	@CacheLookup
	WebElement txtPhone;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement state;
	@FindBy(id="txtCardholderName")
	@CacheLookup
	WebElement txtCardholderName;
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[17]/td[2]/input")
	@CacheLookup
	WebElement txtDebit;
	@FindBy(id="txtCvv")
	@CacheLookup
	WebElement txtCvv;
	@FindBy(id="txtMonth")
	@CacheLookup
	WebElement txtMonth;
	@FindBy(id="txtYear")
	@CacheLookup
	WebElement txtYear;
	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement btnPayment;
public BookingPageFactory() {
		
	}
	
	public BookingPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setFirstName(String FN) {
		txtFirstName.sendKeys(FN);
		
	}
	public void setLastName(String LN) {
		txtLastName.sendKeys(LN);
		
	}
	public void setEmail(String eMail) {
		txtEmail.sendKeys(eMail);
		
	}
	public void setPhoneNo(String mobNo) {
		txtPhone.sendKeys(mobNo);
		
	}
	
	
	public void setCity(String city1) {
		city.sendKeys(city1);
	}
	
	public void setState(String state1) {
		state.sendKeys(state1);
	}
	
	public void setCardHolderName(String cardHldr) {
		txtCardholderName.sendKeys(cardHldr);
	}
	
	public void setDebit(String dbt) {
		txtDebit.sendKeys(dbt);
		
	}
	
	public void setCvv(String cvv) {
		txtCvv.sendKeys(cvv);
	}
	
	public void setMonth(String mon) {
		txtMonth.sendKeys(mon);
	}
	public void setYear(String year1) {
		txtYear.sendKeys(year1);
	}
	public void clickSubmitButton() {
		btnPayment.click();
	
	}
	
	
	
	

}
