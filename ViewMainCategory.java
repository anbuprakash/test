package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMainCategory
{
	WebDriver driver;
	@FindBy(xpath="//table/thead/tr/th[1]")public WebElement sNo;
	@FindBy(xpath="//table//th[2]")public WebElement mainCategory;
	@FindBy(xpath="//table//th[3]")public WebElement createdDate;
	@FindBy(xpath="//table//th[4]")public WebElement categoryImage;
	@FindBy(xpath="//table//th[5]")public WebElement status;
	@FindBy(xpath="//table//th[6]")public WebElement options;
	@FindBy(xpath="//a[contains(text(),'Edit')]")public WebElement edit;
	@FindBy(xpath="//a[contains(text(),'Previous')]")public WebElement previous;
	@FindBy(xpath="//a[contains(text(),'Next')]")public WebElement next;
	@FindBy(xpath="//a[@class='page-link'][contains(text(),'2')]")public WebElement pagination2;
	public ViewMainCategory(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
}
