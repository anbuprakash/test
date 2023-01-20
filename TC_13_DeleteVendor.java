package com.tradeviv.testCases;
/*
 * @author  Kirubakaran P

 * 
 * Administrator deletes the registered vendor details in the application.
 * 
 */
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.tradeviv.pageObjects.DeleteVendor;

public class TC_13_DeleteVendor extends BaseClass
{
	DeleteVendor dv;
	String myData[][];		

//	@Test(priority=1)
//	public void adminLogin() throws InterruptedException
//	{
//		al= new AdminLogin(driver);
//		al.username(username);
//		al.password(password);
//		al.login();
//		logger.info("Admin Logged in success ");
//	}
	@Test(priority=12)
	void manageVendorPage() throws IOException
	{
		dv= new DeleteVendor(driver); 
		dv.vendorDropdown();
		dv.manageVendor(); 
	}



	@Test(priority=13,dataProvider="delete")	//passing values through DataProvider
	void DeleteVendor(String LoginID) throws InterruptedException, IOException
	{ 
		try
		{
			dv= new DeleteVendor(driver);
			dv.vendorSearchTextbox.clear();
			dv.vendorSearchTextbox(LoginID);
			Thread.sleep(3000);
			if(driver.findElements(By.xpath("//td[@class='dataTables_empty']")).size()>0)
			{
				logger.info("No Vendor Found");
				Assert.assertTrue(true);
			}
			else
			{
				dv.actions();
				dv.delete();
				dv.deleteConfirmation();
				logger.info(LoginID+" Vendor Removed Succesfully");
			}
		}

		catch(Exception e)
		{
			captureScreen(driver,"TC_31_DeleteVendor_Bug_");
		}
	}
	@Test(priority=14,dataProvider="cancel")	//passing values through DataProvider
	void cancel(String LoginID) throws InterruptedException, IOException
	{
		try
		{
			dv= new DeleteVendor(driver); 
			dv.vendorSearchTextbox.clear();
			dv.vendorSearchTextbox(LoginID);
			Thread.sleep(3000);
			if(driver.findElements(By.xpath("//td[@class='dataTables_empty']")).size()>0)
			{
				logger.info("No Vendor Found");
				Assert.assertTrue(true);
			}
			else
			{
				dv.actions();
				dv.delete();		
				explicitWait(dv.cancel, driver);
				dv.cancel();
				logger.info(LoginID+" Vendor Removal Cancelled");
			}
		}
		catch(Exception e)
		{
			captureScreen(driver,"TC_31_VendorDeleteCancellation_Bug_");

		}
	}

	@DataProvider(name="cancel")			//Arrays of data from the Excel sheet
	public String[][] DataProvider() throws IOException
	{
		myData=dataProvider("./src/test/java/com/tradeviv/testData/DeleteVendor.xlsx");
		return myData;
	}


	@DataProvider(name="delete")			//Arrays of data from the Excel sheet
	public String[][] DataProvide() throws IOException
	{
		myData=dataProvider("./src/test/java/com/tradeviv/testData/DeleteVendor.xlsx");
		return myData;
	}
}
