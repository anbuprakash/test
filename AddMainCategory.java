package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;

public class AddMainCategory extends BaseClass
{
	WebDriver driver;
	@FindBy(xpath="//a[@href='#menu5']") WebElement manageCategories;
	@FindBy(xpath="//span[contains(text(),'Main Category')]") WebElement mainCategory;
	@FindBy(xpath="//a[@class='add-btn']") WebElement addNewMainCategory;
	@FindBy(xpath="//input[@placeholder='Enter Name']")public WebElement mainCategoryNameField;
	@FindBy(xpath="//input[@placeholder='Enter Slug']")public WebElement slugField;
	@FindBy(xpath="//input[@id='image-upload']") WebElement mainCategoryImage;
	@FindBy(xpath="//button[@type='submit']")WebElement createButton;
	@FindBy(xpath="//table[@class='table table-hover dt-responsive']//tr[2]//a[@class='edit']")public WebElement edit;
	@FindBy(xpath="//div[@id='modal1']//button[@class='btn btn-secondary']") WebElement close;
	@FindBy(xpath="//p[contains(text(),'New Data Added')]")	public WebElement categoryAdded;
	@FindBy(xpath="//p[contains(text(),'This slug has already been taken')]")public WebElement slugTaken;
	@FindBy(xpath="//p[contains(text(),'This Category Name has already been taken')]")public WebElement categoryTaken;
	@FindBy(xpath="//div[@class='alert alert-danger validation']//p[@class='text-left']")WebElement confirmationText;

	public AddMainCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void confirmationTextView()
	{
		explicitWait(confirmationText,driver);
		confirmationText.getText();
		boolean textconfirmation=confirmationText.isDisplayed();
		if (textconfirmation==true) 
		{
			logger.info(""+confirmationText.getText());
		}
	}
	public void manageCategories()
	{
		manageCategories.click();
	}
	public void mainCategory()
	{
		mainCategory.click();
	}
	public void edit() throws InterruptedException
	{
		edit.click();
	}
	public void addNewMainCategory()
	{
		addNewMainCategory.click();
	}
	public void mainCategoryNameField(String mainCategoryName)
	{
		mainCategoryNameField.sendKeys(mainCategoryName);
	}
	public void slugField(String slugName)
	{
	slugField.sendKeys(slugName);
	}
	public void mainCategoryImage(String mainImg)
	{
		mainCategoryImage.sendKeys(mainImg);
	}
	public void createButton()
	{
		createButton.click();
	}
	public void close()
	{
		close.click();
	}
}
