package com.tradeviv.testCases;

/*
 * @author  Lavanya S
 * 
 * Administrator login to the application
 * 
 */



import org.testng.annotations.Test;
import com.tradeviv.pageObjects.US_0002_AdminLoginPage;

public class US_0002_AdminLoginTest extends BaseClass
	{
		US_0002_AdminLoginPage adminLoginPage;
		
	
		

		@Test(priority = 34)
		public void adminLogin() 
		{

			adminLoginPage=new US_0002_AdminLoginPage(driver);
			driver.get("https://tradeviv.com/admin/login");
			explicitWait(adminLoginPage.adminEmailAddress,driver);
			adminLoginPage.adminEmailAddressClick(username);//admin login using UserName and password
			adminLoginPage.adminPasswordClick(password);
			adminLoginPage.adminSubmitButtonClick();
			adminLoginPage.adminProfile();
			adminLoginPage.adminLogout();
		}
		
		




}
