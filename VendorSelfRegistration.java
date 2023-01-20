package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;

public class VendorSelfRegistration extends BaseClass{

	WebDriver driver;
	@FindBy(xpath="//a[@href='#vendor']")
	WebElement vendorMenu;
	@FindBy(xpath="//span[contains(text(), 'VENDOR SELF REGISTRATION')]")
	WebElement vendorSelfRegistration;
	@FindBy(xpath="//input[@type='search']")
	WebElement search;
	@FindBy(xpath="//input[@name='slt_vendor[]']")
	WebElement checkBox;
	@FindBy(xpath="//select[@id='bulk_action_is_vendor']")
	WebElement status;
	@FindBy(xpath="//select[@id='bulk_action_is_vendor']//option[@value='2']")
	WebElement activated;
	@FindBy(xpath="//select[@id='bulk_action_is_vendor']//option[@value='1']")
	WebElement deactivated;
	@FindBy(xpath="//div[@class='alert alert-success']")
	WebElement message;
	@FindBy(xpath="//td[@class='dataTables_empty']")
	WebElement emptyTable;
	

	public VendorSelfRegistration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickVendorMenu()
	{
		vendorMenu.click();
	}
	public void clickVendorSelfRegistration()
	{
		vendorSelfRegistration.click();
	}
	public void search(String c_mail)
	{
		explicitWait(search, driver);
		search.sendKeys(c_mail);
	}
	public void clickCheckBox()
	{
		checkBox.click();
	}
	public void clickStatus()
	{
		status.click();
	}
	public void clickActivated()
	{
		activated.click();
	}
	public void clickDeactivated() 
	{
		deactivated.click();
	}
	public String message()
	{
		String s_message= message.getText();
		return s_message;
	}
//	public String emptyTable()
//	{
//		String emptyTableText = null;
//		if(driver.findElements(By.xpath("//td[@class='dataTables_empty']"))!=null)
//		{
//		emptyTableText=emptyTable.getText();
//		}
//		return emptyTableText;
//	}
}
