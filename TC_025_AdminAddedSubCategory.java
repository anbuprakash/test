package com.tradeviv.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tradeviv.pageObjects.AdminDeleteAddedSubCategory;

public class TC_025_AdminAddedSubCategory extends BaseClass{
	AdminDeleteAddedSubCategory adminDeleteAddedSubCategory;
	String subCategoryExcel="C:\\Users\\Prashanthi\\Downloads\\tradeVIV_V1\\src\\test\\java\\com\\tradeviv\\testData\\subCategory.xlsx";
	String subCategoryImage="C:\\Users\\Prashanthi\\Downloads\\tradeVIV_V1\\src\\test\\java\\com\\tradeviv\\testData\\Plywood.jpg";
	String[][] data;
	String slugName="";
	
	@Test
	public void adminLogin()
	{
		adminDeleteAddedSubCategory=new AdminDeleteAddedSubCategory(driver);
		adminDeleteAddedSubCategory.manageCategoriesClick();
		adminDeleteAddedSubCategory.subCategoryClick();
		
	}
	@Test(priority=1, dataProvider = "product", dependsOnMethods = "adminLogin")
	public void addedSubCategory(String subCategoryName, String slugName)
	{
//		String current=driver.getCurrentUrl();
	
	
		adminDeleteAddedSubCategory.addCategoryInSubCategoryClick();
		adminDeleteAddedSubCategory.selectMainCategoryNameClick();
		adminDeleteAddedSubCategory.SubCategoryNameClick(subCategoryName);
		adminDeleteAddedSubCategory.slugSubCategoryClick(slugName);
		adminDeleteAddedSubCategory.selectImageCategoryInSubPageClick(subCategoryImage);
		adminDeleteAddedSubCategory.createCategoryClick();
		adminDeleteAddedSubCategory.closeAddCategoryClick();
//		driver.get(current);
	}
	@Test(priority=2)
	public void deleteSubCategory() {
//		adminDeleteAddedSubCategory.searchClick(slugName);
		adminDeleteAddedSubCategory.deleteClick();
		adminDeleteAddedSubCategory.alertBoxDeleteClick();
		adminDeleteAddedSubCategory.confirmationTextView();
	}
  @DataProvider(name="product")
		     public String[][] loginDataProvider() throws IOException
		     {
		     data=dataProvider(subCategoryExcel);
		
		     return data;
		     	}	
}
