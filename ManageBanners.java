package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tradeviv.testCases.BaseClass;

public class ManageBanners extends BaseClass{
	WebDriver driver;

	@FindBy (xpath="//a[@href='#homepage']")   
	WebElement HomePageSetting;

	@FindBy (xpath="//a[@href='https://tradeviv.com/admin/slider']")   
	WebElement Slider;

	@FindBy (xpath="//tr[1]//i[@class='fas fa-edit']")   
	WebElement Edit;

	@FindBy (xpath="//input[@name='timing']")   
	WebElement Timing;


	@FindBy (xpath="//button[@class='addProductSubmit-btn']")   
	WebElement Save;

	@FindBy (xpath="//div[@class='alert alert-success']")   
	WebElement Message1;

	@FindBy (xpath="//tr[1]//i[@class='fas fa-trash-alt']")   
	WebElement Delete;

	@FindBy (xpath="//button[contains(text(), 'Cancel')]")   
	WebElement Cancel;

	
	@FindBy (xpath="//a[contains(text(), 'Delete')]")   
	WebElement Delete1;
	
	@FindBy (xpath="//div[@class='alert alert-success validation']//p[@class='text-left']")   
	WebElement Message2;
	


	public ManageBanners(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void homePageSetting()
	{
		HomePageSetting.click();
	}

	public void slider()
	{
		Slider.click();

	}
	public void edit()
	{
		Edit.click();

	}
	public void timing()
	{
		Timing.clear();
		Timing.sendKeys("2");
	}

	public void save()
	{
		Save.click();
	}

	public void message1() {

		String ActualTitle = Message1.getText();
		String ExpectedTitle = "Slider Updated Successfully.";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
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
	public void message2() {
		explicitWait(Message2, driver);
		String ActualTitle = Message2.getText();
		
		String ExpectedTitle = "Data Deleted Successfully.";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

}
