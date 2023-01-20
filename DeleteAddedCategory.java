package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;

public class DeleteAddedCategory extends BaseClass{

	WebDriver driver;
	@FindBy(xpath="//a[@href='#menu5']")
	WebElement manageCategories;
	@FindBy(xpath="//span[contains(text(), 'Main Category')]")
	WebElement mainCategory;
	@FindBy (xpath="//input[@type='search']")
	WebElement search;
	@FindBy(xpath="//table[@id='geniustable']//tr[1]//a[@class='delete']")
	WebElement deleteButton;
	@FindBy(xpath="//a[@class='btn btn-danger btn-ok']")
	WebElement delete;
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement cancel;


	public DeleteAddedCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickManageCategories()
	{
		manageCategories.click();
	}
	public void clickMainCategory()
	{
		mainCategory.click();
	}
	public void search(String catagory)
	{
		search.clear();
		search.sendKeys(catagory);
	}
	public void deleteButton()
	{
		deleteButton.click();
	}
	public void delete() throws InterruptedException
	{
		Thread.sleep(1000);
		delete.click();
	}
	public void cancel() throws InterruptedException
	{
		Thread.sleep(1000);
		cancel.click();
	}
}
