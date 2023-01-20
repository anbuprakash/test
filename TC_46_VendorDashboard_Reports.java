
/*Author: Dhinesh R
 * Description: Vendor reports pageobjects
 */
package com.tradeviv.testCases;

import org.testng.annotations.Test;


import com.tradeviv.pageObjects.VendorLogin;
import com.tradeviv.pageObjects.VendorReports;

public class TC_46_VendorDashboard_Reports extends BaseClass {

	//vendor login
	@Test(priority=41)
	void vendorLogin() throws InterruptedException
	{
		
		VendorLogin login = new VendorLogin(driver);
		login.newsLetterPopup();
		login.accountElement();
		login.signin();
		login.vendorLogin();
		login.vendorEmail("vendortesting117@gmail.com");
		login.vendorPassword("SwU53fuG");
		login.login();
		logger.info("Vendor Logged in success ");
	}
	
	//vendor reports
	@Test(priority=42)
	public void vendorReports()
	{
		VendorReports vpl=new VendorReports(driver);
		vpl.productEnquiry();
	}
}
