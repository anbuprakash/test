/*Author: Dhinesh R
 * Description: Productlist pageobject
 */
package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class VendorProductList {
	
	
	WebDriver driver;

public VendorProductList(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


//WebElements and method for productlist viewing
@FindBy(xpath="//a[@class='accordion-toggle wave-effect waves-effect waves-button']") WebElement product;
@FindBy(xpath="//span[contains(text(),'All Products')]") WebElement allProducts;

    public void addProducts(){
	product.click();
	allProducts.click();
}

}