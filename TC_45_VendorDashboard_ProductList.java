/*Author: Dhinesh R
 * Description: Vendor can view productlist
 */
package com.tradeviv.testCases;

import org.testng.annotations.Test;



import com.tradeviv.pageObjects.VendorLogin;
import com.tradeviv.pageObjects.VendorProductList;

public class TC_45_VendorDashboard_ProductList extends BaseClass {

	VendorLogin vl;
	//Vendor login
	@Test(priority=39)
	public void vendorLogin() throws InterruptedException {
		VendorLogin login = new VendorLogin(driver);
		driver.get("https://tradeviv.com/");
		login.newsLetterPopup();
		login.accountElement();
		login.signin();
		login.vendorLogin();
		login.vendorEmail("vendortesting117@gmail.com");
		login.vendorPassword("SwU53fuG");
		login.login();
		logger.info("Vendor Logged in success ");
		}
	
	//Productlist view
	@Test(priority=40)
	public void vendorProductList() {
	VendorProductList vpl=new VendorProductList(driver);
	vpl.addProducts();
}
}