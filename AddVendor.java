package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;

public class AddVendor extends BaseClass {
	WebDriver driver;
	@FindBy (xpath="//a[@href='#vendor']")   
	WebElement vendorMenu;

	@FindBy (xpath="//span[contains(text(), 'Add Vendor')]")
	WebElement addVendorMenu;

	@FindBy (xpath="//input[@name='name']")
	WebElement vendorName;

	@FindBy (xpath="//input[@name='email']")
	WebElement companyEmail;

	@FindBy (xpath="//input[@name='phone']")
	WebElement vendorPhoneNumber;

	@FindBy (xpath="//input[@name='shop_name']")
	WebElement companyName;

	@FindBy(xpath="//button[@class='addProductSubmit-btn']")
	WebElement submit;
	
	@FindBy(xpath="//p[@class='text-left']")
	WebElement successMessage;
	
	@FindBy(xpath="//ul[@class='text-left']//li")
	WebElement phoneNumberTaken;

	public AddVendor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickVendorMenu()
	{
		vendorMenu.click();
	}

	public void clickAddVendorMenu()
	{
		addVendorMenu.click();
	}
	public void vendorName(String Name)
	{
		vendorName.clear();
		vendorName.sendKeys(Name);
	}
	public void companyEmail(String email)
	{
		companyEmail.clear();
		companyEmail.sendKeys(email);
	}
	public void vendorPhoneNumber(String phoneNumber) 
	{
		vendorPhoneNumber.clear();
		vendorPhoneNumber.sendKeys(phoneNumber);
	}
	public void companyName(String CName) 
	{
		companyName.clear();
		companyName.sendKeys(CName);
	}
	public void submit()
	{
		submit.click();
	}
	public String successMessage()
	{
		String message=successMessage.getText();
		return message;
	}

	public String phoneNumberTaken()
	{
		String message=phoneNumberTaken.getText();
		return message;
	}

}
