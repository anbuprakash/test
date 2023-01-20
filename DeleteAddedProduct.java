package com.tradeviv.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tradeviv.testCases.BaseClass;

public class DeleteAddedProduct extends BaseClass{
	WebDriver driver;

	@FindBy (xpath="//a[@href='#menu2']")   
	WebElement Products;

	@FindBy (xpath="//span[contains(text(), 'All Products')]")   
	WebElement AllProducts;

	@FindBy (xpath="//input[@class='form-control form-control-sm']")   
	WebElement Search;

	@FindBy (xpath="//tr[1]//button[@class='go-dropdown-toggle']")   
	WebElement Actions;

	@FindBy (xpath="//tr[1]//a[@class='delete']")   
	WebElement Delete;

	@FindBy (xpath="//a[@class='btn btn-danger btn-ok']//preceding-sibling::button[@class='btn btn-default']")   
	WebElement Cancel;

	@FindBy (xpath="//a[@class='btn btn-danger btn-ok']")   
	WebElement Delete1;


	@FindBy (xpath="//p[@class='text-left']")   
	WebElement comment;



	public DeleteAddedProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void products()
	{
		Products.click();
	}

	public void allProducts()
	{
		AllProducts.click();
	}

	public void search()
	{
		Search.sendKeys("clay brick making machine-08010");
	}
	public void actions()
	{
		Actions.click();
	}


	public void delete()
	{
		Delete.click();
	}

	public void cancel() throws InterruptedException
	{

		Thread.sleep(3000);
		Cancel.click();

	}

	public void delete1() throws InterruptedException
	{
		Thread.sleep(3000);
		Delete1.click();


	}


	public void comment() {

		String ActualTitle = comment.getText();
		String ExpectedTitle = "Data Deleted Successfully.";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		
	}
}

