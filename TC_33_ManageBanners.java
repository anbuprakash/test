package com.tradeviv.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tradeviv.pageObjects.ManageBanners;
import com.tradeviv.pageObjects.TradevivAdminPage;
import com.tradeviv.pageObjects.US_0002_AdminLoginPage;

public class TC_33_ManageBanners extends BaseClass{

	ManageBanners manageBanners;
	TradevivAdminPage tradevivAdminPage;
	US_0002_AdminLoginPage adminLoginPage;

//	@Test(priority=1)
//	public void adminlogin()
//	{
//		tradevivAdminPage=new TradevivAdminPage(driver);
//		tradevivAdminPage.userMail();	
//		tradevivAdminPage.passWord();
//		tradevivAdminPage.login();
//	}


	@Test (priority=31)
	public void edit() throws IOException {

		try {
			manageBanners=new ManageBanners(driver);
			manageBanners.homePageSetting();
			manageBanners.slider();
			manageBanners.edit();
			manageBanners.timing();
			manageBanners.save();
			manageBanners.message1();

		}

		catch(Exception e)
		{

			captureScreen(driver, "TC_33_ManageBanners_Bug_");
			logger.info(e);


		}
	}
	@Test (priority=32)
	public void delete() throws IOException {

		try {
			manageBanners=new ManageBanners(driver);
			manageBanners.homePageSetting();
			manageBanners.slider();
			manageBanners.delete();	
			manageBanners.cancel();


		}

		catch(Exception e)
		{

			captureScreen(driver, "TC_33_ManageBanners_Bug_");
			logger.info(e);


		}
	}
	
	@Test (priority=33)
	public void deleteslider() throws IOException {

		try {
			manageBanners=new ManageBanners(driver);
			manageBanners.homePageSetting();
			manageBanners.slider();
			manageBanners.delete();	
			manageBanners.delete1();	
			manageBanners.message2();
			adminlogout();

		}

		catch(Exception e)
		{

			captureScreen(driver, "TC_33_ManageBanners_Bug_");
			logger.info(e);


		}
	}
	
	public void adminlogout()
	{
		adminLoginPage.adminProfile();
		adminLoginPage.adminLogout();
	}
}
