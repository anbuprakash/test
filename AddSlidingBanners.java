package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tradeviv.testCases.BaseClass;

public class AddSlidingBanners extends BaseClass{

	WebDriver driver;

	@FindBy (xpath="//a[@href='#homepage']")   
	WebElement HomePageSetting;

	@FindBy (xpath="//a[@href='https://tradeviv.com/admin/slider']")   
	WebElement Slider;


	@FindBy (xpath="//a[@class='add-btn']")   
	WebElement AddNewSlider;

	@FindBy (xpath="//input[@id='image-upload']")   
	WebElement UploadImage;


	@FindBy (xpath="//input[@placeholder='Link']")   
	WebElement Link;

	@FindBy (xpath="//input[@name='timing']")   
	WebElement Timing;

	@FindBy (xpath="//button[@class='addProductSubmit-btn']")   
	WebElement CreateSlider;
	
	@FindBy (xpath="//div[@class='alert alert-success']")   
	WebElement Alert;

	public AddSlidingBanners(WebDriver driver)
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

	public void addNewSlider()
	{
		AddNewSlider.click();
	}

	public void uploadImage(String img_path)
	{
		UploadImage.sendKeys(img_path);
	}
	public void link()
	{
		Link.sendKeys("http://www.tradeviv.com/category/Construction/plywood");
	}

	public void timing()
	{
		Timing.sendKeys("2");
	}

	public void createSlider()
	{
		CreateSlider.click();
	}

	public void alert() {

		String ActualTitle = Alert.getText();
		String ExpectedTitle = "New Slider Added Successfully.";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		
	}
	
	
}
