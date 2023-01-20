package com.tradeviv.testCases;
/*
 * @author  Kirubakaran P
 * 
 * Administrator views the added Categories in the application.
 * 
 */
import com.tradeviv.pageObjects.AddMainCategory;
import com.tradeviv.pageObjects.ViewMainCategory;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TC_14_ViewMainCategory extends BaseClass
{
	AddMainCategory addCategory;
	ViewMainCategory viewMainCategory;
	
	
	@Test(priority=15)
	void manageCategory() throws InterruptedException
	{
		addCategory = new AddMainCategory(driver);
		addCategory.manageCategories();
		addCategory.mainCategory();
	}	
	@Test(priority=16)
	void view()		// to view details of main category
	{
		viewMainCategory=new ViewMainCategory(driver);
		String sNo=viewMainCategory.sNo.getText();
		String mCat=viewMainCategory.mainCategory.getText();
		String cDate=viewMainCategory.createdDate.getText();
		String cImage=viewMainCategory.categoryImage.getText();
		if(sNo.equals("S.No") && mCat.equals("Category Date") && cDate.equals("Created Date") && sNo.equals("Category Image") && cImage.equals("Actions") )
		{
			logger.info("View Main Category success");
			Assert.assertTrue(true);
	}
		else
		{
			logger.info("View Main Category failure");
			Assert.assertTrue(false);
		}
			

	}
	
}
