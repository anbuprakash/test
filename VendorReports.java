
/*Author: Dhinesh R
 * Description: Vendor can view customer enquiry
 */

package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VendorReports {
	
	
	WebDriver driver;

public VendorReports(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


//WebElements and method for customer enquiry
@FindBy(xpath="//a[@class='accordion-toggle wave-effect waves-effect waves-button']")WebElement product;
@FindBy(xpath="//span[contains(text(),'Enquiries')]") WebElement enquires;

    public void productEnquiry(){
	product.click();
	enquires.click();
}

}