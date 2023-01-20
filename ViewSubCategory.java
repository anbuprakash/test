package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;

public class ViewSubCategory extends BaseClass{
		WebDriver driver;

		@FindBy (xpath="//a[@href='#menu5']")   
		WebElement ManageCategories;

		
		@FindBy (xpath="//*[@id=\"menu5\"]/li[2]/a")   
		WebElement Subcategory;
		
		
		public ViewSubCategory(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}


		public void manageCategories()
		{
			ManageCategories.click();
		}

		public void subcategory()
		{
			Subcategory.click();
		}


}
