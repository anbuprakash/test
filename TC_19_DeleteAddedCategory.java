package com.tradeviv.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tradeviv.pageObjects.DeleteAddedCategory;

import junit.framework.Assert;

public class TC_19_DeleteAddedCategory extends BaseClass {
	DeleteAddedCategory deleteAddedCategory;
//	TradevivAdminPage tradevivAdminPage;
	
//	@Test(priority=1)
//	public void adminLogin()
//	{
//		tradevivAdminPage=new TradevivAdminPage(driver);
//		tradevivAdminPage.userMail();
//		tradevivAdminPage.passWord();
//		tradevivAdminPage.login();
//		
//	}
	
	@Test(priority=20)
	public void deleteOptionInPopupMessageOfDeleteAddedCategory() throws IOException
	{
		deleteAddedCategory=new DeleteAddedCategory(driver);
		try
		{
		deleteAddedCategory.clickManageCategories();
		deleteAddedCategory.clickMainCategory();
		deleteAddedCategory.search("food3");
		
		if(driver.findElements(By.xpath("//td[@class='dataTables_empty']")).size()>0)
		{
			logger.info("Entered catagory is not present");
		}
		else
		{
			deleteAddedCategory.deleteButton();
			deleteAddedCategory.delete();
			deleteAddedCategory.search("food3");
			if(driver.findElements(By.xpath("//td[@class='dataTables_empty']")).size()>0)
			{
				Assert.assertTrue(true);
				logger.info("Delete check passed!!!");
			}
			else
			{
				Assert.assertTrue(false);
				logger.info("Delete check failed!!!");
			}
			
		}
		
		
		}
		catch(Exception e)
		{

			captureScreen(driver, "TC_19_DeleteAddedProduct_delete_option_Bug_");
			logger.info(e);
		}
		
		
	}
	@Test(priority=21)
	public void cancelOptionInPopupMessageOfDeleteAddedcategory() throws IOException
	{
		deleteAddedCategory=new DeleteAddedCategory(driver);
		try
		{
		deleteAddedCategory.clickManageCategories();
		deleteAddedCategory.clickMainCategory();
		deleteAddedCategory.search("foood3");
		
		if(driver.findElements(By.xpath("//td[@class='dataTables_empty']")).size()>0)
		{
			logger.info("Entered catagory is not present");
		}
		else
		{
			deleteAddedCategory.deleteButton();
			deleteAddedCategory.cancel();
			Thread.sleep(3000);
			deleteAddedCategory.search("foood3");
			if(driver.findElements(By.xpath("//td[@class='dataTables_empty']")).size()>0)
			{
				Assert.assertTrue(false);
				logger.info("Cancel check failed!!!");
			}
			else
			{
				
				Assert.assertTrue(true);
				logger.info("Cancel check passed!!!");
			}
			
		}
		}
		catch(Exception e)
		{
			captureScreen(driver, "TC_19_DeleteAddedProduct_cancel_option_Bug_");
			logger.info(e);
		}
	}
	

}
