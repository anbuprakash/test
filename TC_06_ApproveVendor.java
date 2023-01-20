package com.tradeviv.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tradeviv.pageObjects.ApproveVendor;

import junit.framework.Assert;

public class TC_06_ApproveVendor extends BaseClass {
//	TradevivAdminPage tradevivAdminPage;
	ApproveVendor approveVendor;
	
	
//	@Test(priority=1)
//	public void adminLogin()
//	{
//		tradevivAdminPage=new TradevivAdminPage(driver);
//		tradevivAdminPage.userMail();
//		tradevivAdminPage.passWord();
//		tradevivAdminPage.login();
//	}
//	
	@Test(priority=11)
	public void approveVendorCompanyDetails() throws IOException
	{
		
		try
		{
		approveVendor=new ApproveVendor(driver);
		approveVendor.clickVendorMenu();
		approveVendor.clickApproveVendorMenu();
		String text=approveVendor.actualRow();
		String labelText=approveVendor.label();
		if(text.contains("Action") && text.contains("Vendor Name") && text.contains("Mobile Number") && text.contains("Email ID") && labelText.equals("APPROVE VENDOR LIST"))
		{	
			logger.info("Approve Vendor List table header column and label is matched with BRS requirement");
			
		Assert.assertTrue(true);
		}
		else
		{
			logger.info("Approve Vendor List table header column and label is not matched with BRS requirement");
			Assert.assertTrue(false);	
		}
		
		}
		
		catch(Exception e)
		{
			captureScreen(driver, "TC_06_ApproveVendor_Bug_");
			logger.info(e);
		}
		
	}

}
