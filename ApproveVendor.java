package com.tradeviv.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;

public class ApproveVendor extends BaseClass
{
	WebDriver driver;

	public ApproveVendor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//thead//tr[@role='row']")
WebElement headerRow;
@FindBy(xpath="//a[@href='#vendor']")
WebElement vendorMenu;
@FindBy(xpath="//span[contains(text(), 'Approve VENDOR')]")
WebElement approveVendorMenu;
@FindBy(xpath="//h4[@class='title']")
WebElement label;


public void clickVendorMenu()
{
	vendorMenu.click();
}
public void clickApproveVendorMenu()
{
	approveVendorMenu.click();
}
public String actualRow()
{
	String rowHead=headerRow.getText();
	return rowHead;
}

public String label()
{
	String labelText=label.getText();
return labelText;
}
}
