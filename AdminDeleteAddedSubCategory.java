package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;

public class AdminDeleteAddedSubCategory extends BaseClass{
	WebDriver driver;
	Actions action;
	public AdminDeleteAddedSubCategory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='email']")
	WebElement adminEmailAddress;
	@FindBy(xpath="//input[@name='password']")
	WebElement adminPassword;
	@FindBy(xpath="//button[@class='submit-btn']")
	WebElement adminSubmitButton;
	@FindBy(xpath="//a[@href='#menu5']") 
	WebElement manageCategories;
	@FindBy(xpath="//a[@href='https://tradeviv.com/admin/subcategory']//span[contains(text(),'Sub Category')]") 
	WebElement subCategory;
	@FindBy(xpath="//a[@id='add-data']") 
	WebElement addCategoryInSubCategory;
	@FindBy(xpath="//select[@name='category_id']//option[@value='199']") 
	WebElement selectMainCategoryName;
	@FindBy(xpath="//input[@name='name']") 
	WebElement SubCategoryName;
	@FindBy(xpath="//input[@name='slug']") 
	WebElement slugSubCategory;
	@FindBy(xpath="//input[@id='image-upload']") 
	WebElement selectImageCategoryInSubPage;
	@FindBy(xpath="//button[contains(text(),'Create')]") 
	WebElement createCategory;
	@FindBy(xpath="//div[@class='modal fade show']//div[@class='modal-header']//button[1]") 
	WebElement closeAddCategory;
	@FindBy(xpath="//ul[@class='text-left']//li[contains(text(),'This slug has already been taken.') or contains(text(),'This Category Name has already been taken.')]") 
	WebElement popUp;
	@FindBy(xpath="//input[@type='search']") 
	WebElement search;
	@FindBy(xpath="//tr[2]//a[@data-target='#confirm-delete']") 
	WebElement delete;
	@FindBy(xpath="//a[contains(text(), 'Delete')]")
	WebElement alertBoxDelete;
	@FindBy(xpath="//div[@class='modal-content']//p[contains(text(),'You are about to delete Brackets Category. Everything under this category will be deleted')]")
	WebElement alertBoxtext;
	
	@FindBy(xpath="//div[@class='alert alert-danger validation']//p[@class='text-left']")
	WebElement confirmationText;

	public void adminEmailAddressClick(String username)
	{
		adminEmailAddress.sendKeys(username);
	}
	public void adminPasswordClick(String password)
	{
		adminPassword.sendKeys(password);
	}
	public void adminSubmitButtonClick()
	{
		adminSubmitButton.click();
	}
	public void manageCategoriesClick()
	{
		manageCategories.click();
	}
	public void subCategoryClick()
	{
		subCategory.click();
	}
	public void addCategoryInSubCategoryClick()
	{
		explicitWait(addCategoryInSubCategory, driver);
		addCategoryInSubCategory.click();
	}
	public void selectMainCategoryNameClick()
	{
		selectMainCategoryName.click();
	}
	public void SubCategoryNameClick(String subCategoryName)
	{
		SubCategoryName.sendKeys(subCategoryName);
	}
	public void slugSubCategoryClick(String slugName)
	{
		slugSubCategory.sendKeys(slugName);
	}
	public void selectImageCategoryInSubPageClick(String subCategoryImage)
	{
		selectImageCategoryInSubPage.sendKeys(subCategoryImage);
	}
	public void createCategoryClick()
	{
		createCategory.click();
	}
	public void closeAddCategoryClick()
	{
		action = new Actions(driver);
		explicitWait(popUp, driver);
		action.moveToElement(closeAddCategory,2,0).click().build().perform();
	}
public void searchClick(String slugName)
{
	explicitWait(search, driver);
	search.clear();
	search.sendKeys(slugName);
}
public void deleteClick()
{
	delete.click();
}
public void alertBoxDeleteClick()
{
	explicitWait(alertBoxDelete, driver);
	alertBoxDelete.click();
	
	}
public void confirmationTextView()
{
	confirmationText.isDisplayed();
}
}
