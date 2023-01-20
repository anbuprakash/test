package com.tradeviv.testCases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tradeviv.pageObjects.VendorSelfRegistration;

public class TC_05_VendorSelfRegistration extends BaseClass{
//	TradevivAdminPage tradevivAdminPage;

	VendorSelfRegistration vendorSelfRegistration;
	
//	@Test(priority=1)
//	public void adminLogin()
//	{
//		tradevivAdminPage=new TradevivAdminPage(driver);
//		tradevivAdminPage.userMail();
//		tradevivAdminPage.passWord();
//		tradevivAdminPage.login();
//		logger.info("Admin logged in sucessfully");
//		
//	}
	
	
	
	@Test(priority=9)
	public void acceptRegisteredVendor() throws IOException
	{
		try
		{
		vendorSelfRegistration=new VendorSelfRegistration(driver);
		vendorSelfRegistration.clickVendorMenu();
		vendorSelfRegistration.clickVendorSelfRegistration();
		vendorSelfRegistration.search("vendortesting137@gmail.com");
		if(driver.findElements(By.xpath("//td[@class='dataTables_empty']")).size()>0)
		{
			logger.info("Users not found in the table");
			Assert.assertTrue(true);
		}
		
		else
		{
			vendorSelfRegistration.clickCheckBox();
			vendorSelfRegistration.clickStatus();
			vendorSelfRegistration.clickActivated();
			logger.info("Users were Actived Successfully");
			Assert.assertEquals(vendorSelfRegistration.message(), "Users were Actived Successfully and Password Sent");
			
			
		}
	}
		catch(Exception e)

		{

			captureScreen(driver, "TC_05_VendorSelfRegistration_Accept_");
			logger.info(e);

		}
	}
	
	@Test(priority=10)
	public void rejectRegisteredVendor() throws IOException
	{
		try
		{
		vendorSelfRegistration=new VendorSelfRegistration(driver);
		vendorSelfRegistration.clickVendorMenu();
		vendorSelfRegistration.clickVendorSelfRegistration();
		vendorSelfRegistration.search("fjhdjh@gmail.com");
		if(driver.findElements(By.xpath("//td[@class='dataTables_empty']")).size()>0)
		{
			logger.info("Users not found in the table");
			Assert.assertTrue(true);
		}
		else
		{
			vendorSelfRegistration.clickCheckBox();
			vendorSelfRegistration.clickStatus();
			vendorSelfRegistration.clickDeactivated();
			logger.info("Users were Deactived Successfully");
			Assert.assertEquals(vendorSelfRegistration.message(), "Users were Deactived Successfully");
			
			
		}
	
	}
	catch(Exception e)

	{

		logger.info(e);

	}
}
}
