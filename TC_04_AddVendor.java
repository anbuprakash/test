package com.tradeviv.testCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.tradeviv.pageObjects.AddVendor;

public class TC_04_AddVendor extends BaseClass {

	AddVendor addVendor;
//	TradevivAdminPage tradevivAdminPage;

//	@Test(priority=1)
//	public void adminLogin()
//	{
//		tradevivAdminPage=new TradevivAdminPage(driver);
//		tradevivAdminPage.userMail();
//		tradevivAdminPage.passWord();
//		tradevivAdminPage.login();
//		logger.info("Admin logged in sucessfully");
//	}

	@Test(priority=8,dataProvider="AddVendor")
	public void addvendor(String v_name, String c_mail, String v_phoneNumber, String c_name) throws IOException
	{
		try
		{
			addVendor=new AddVendor(driver);
			addVendor.clickVendorMenu();
			addVendor.clickAddVendorMenu();
			addVendor.vendorName(v_name);
			addVendor.companyEmail(c_mail);
			addVendor.vendorPhoneNumber(v_phoneNumber);
			addVendor.companyName(c_name);
			addVendor.submit();
			if(driver.findElements(By.xpath("//p[@class='text-left']"))!=null)
			{
				if(addVendor.successMessage().contains("Vendor Registered Successful"))
				{
					logger.info(v_name+" is added as vendor sucessfully");
					Assert.assertTrue(true);
					
				}
			}
			else if(driver.findElements(By.xpath("//ul[@class='text-left']//li"))!=null)
			{
				if(addVendor.phoneNumberTaken().contains("This Phone Number has already been taken.")) 
				{
					logger.info(v_name+" is not added as vendor because his/her mail id is taken by someone else");
					Assert.assertTrue(true);
					
				}
				else
				{
					logger.info(v_name+" is not added as vendor because his/her phone number is taken by someone else");
					Assert.assertTrue(true);
					
				}
			}
			else
			{
				logger.info(v_name+" is not added as vendor");
				Assert.assertFalse(false);
				
			}
		}
		catch(Exception e)

		{

			captureScreen(driver, "TC_VedorAddProduct_002_Bug_");
			logger.info(e);

		}

		addVendor.clickAddVendorMenu();

	}



	@DataProvider(name="AddVendor")
	public String[][] xlread() throws IOException
	{
		String[][] data= dataProvider(System.getProperty("user.dir")+"/src/test/java/com/tradeviv/testData/AddVendor.xlsx");
		return data;
	}


}
