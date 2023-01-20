package com.tradeviv.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tradeviv.pageObjects.AddSlidingBanners;

import com.tradeviv.pageObjects.TradevivAdminPage;

public class TC_32_AddSlidingBanners  extends BaseClass{

	AddSlidingBanners addSlidingBanners;
	TradevivAdminPage tradevivAdminPage;

//	@Test(priority=1)
//	public void adminlogin()
//	{
//		tradevivAdminPage=new TradevivAdminPage(driver);
//		tradevivAdminPage.userMail();	
//		tradevivAdminPage.passWord();
//		tradevivAdminPage.login();
//	}


	@Test (priority=30)
	public void addslider() throws IOException {

		try {
			addSlidingBanners=new AddSlidingBanners(driver);
			addSlidingBanners.homePageSetting();
			addSlidingBanners.slider();
			addSlidingBanners.addNewSlider();
			String img_path=System.getProperty("user.dir")+"\\src\\test\\java\\com\\tradeviv\\testData\\plywood.jpg";
			
			addSlidingBanners.uploadImage(img_path);
			addSlidingBanners.link();
			addSlidingBanners.timing();
			addSlidingBanners.createSlider();
			addSlidingBanners.alert();
		}

		catch(Exception e)
		{

			captureScreen(driver, "TC_32_AddSlidingBanners_Bug_");
			logger.info(e);


		}
	}
}

