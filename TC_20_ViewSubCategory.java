package com.tradeviv.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tradeviv.pageObjects.TradevivAdminPage;
import com.tradeviv.pageObjects.ViewSubCategory;

public class TC_20_ViewSubCategory extends BaseClass {

	 

		 ViewSubCategory viewSubCategory;
		TradevivAdminPage tradevivAdminPage;

		/*
		 * @Test(priority=22) public void adminlogin() { tradevivAdminPage=new
		 * TradevivAdminPage(driver); tradevivAdminPage.userMail();
		 * tradevivAdminPage.passWord(); tradevivAdminPage.login(); }
		 */


		@Test (priority=23)
		public void subcategory() throws IOException {

			try {
				viewSubCategory=new ViewSubCategory(driver);
				viewSubCategory.manageCategories();
				viewSubCategory.subcategory();
			}

			catch(Exception e)
			{

				captureScreen(driver, "TC_20_ViewSubCategory_Bug_");
				logger.info(e);


			}
		}
}
