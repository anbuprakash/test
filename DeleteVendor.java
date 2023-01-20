package com.tradeviv.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DeleteVendor
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='preload-close']") WebElement newsLetterPopUpElement;
	@FindBy(xpath="//a[@href='#vendor']") WebElement vendorDropdown;
	@FindBy(xpath="//span[contains(text(),'Manage VENDOR')]") WebElement manageVendor;
	@FindBy(xpath="//input[@type='search']") public WebElement vendorSearchTextbox;
	@FindBy(xpath="//table//tr[@class='odd']")public WebElement tableRow;
	@FindBy(xpath="//table//td[contains(text(),'No matching records found')]")public WebElement noVendorFound;
	@FindBy(xpath="//table//th[2]") WebElement companyEmail;
	@FindBy(xpath="//table//th[3]") WebElement companyName;
	@FindBy(xpath="//table//th[4]") WebElement vendorPhoneNumber;
	@FindBy(xpath="//table//th[5]") WebElement options;
	@FindBy(xpath="//button[contains(text(),'Actions')]")public  WebElement actions;
	@FindBy(xpath="//a[contains(text(),' Delete')]") WebElement delete;
	@FindBy(xpath="//a[@class='btn btn-danger btn-ok']") WebElement deleteConfirmation;
	@FindBy(xpath="//a[@class='btn btn-danger btn-ok']//preceding-sibling::button") public WebElement cancel;
	public DeleteVendor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public	void newsLetterPopup() 
	{
		newsLetterPopUpElement.click();
	}
	public void vendorDropdown()
	{
		vendorDropdown.click();
	}
	public void manageVendor()
	{
		manageVendor.click();
	}
	public void vendorSearchTextbox(String email) throws InterruptedException
	{
		vendorSearchTextbox.sendKeys(email);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
	}
	public void actions()
	{
		actions.click();
	}
	public void delete()
	{
		delete.click();
	}
	public void deleteConfirmation()
	{
		deleteConfirmation.click();
	}
	public void cancel()
	{
		cancel.click();
	}
	
}
