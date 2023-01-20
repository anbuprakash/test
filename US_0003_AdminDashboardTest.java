	package com.tradeviv.testCases;

	/*
	 * @author  Lavanya S
	 * 
	 * Administrator login to the application
	 * 
	 * Navigate to adminDashBoard and display the following board:
	 * This week Vendors!, This week Customers!, This week Products!, This Month Products!, Total Vendors!, Total Customers!, Total Products!
	 * 
	 * Display the following menu "Products, Vendors, Manage Categories, General Settings, Home Page Settings" in the Admin Page
	 * 
	 */

	
	
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import com.tradeviv.pageObjects.US_0003_AdminDashboardPage;

	public class US_0003_AdminDashboardTest extends BaseClass{		
		
		US_0003_AdminDashboardPage adminDashboardPage;
	
	
	

//	@Test(priority = 35, enabled = true)
	public void adminDashBoard() 
	{

		adminDashboardPage=new US_0003_AdminDashboardPage(driver);
		adminDashboardPage.adminEmailAddressClick(username);//admin login to application
		adminDashboardPage.adminPasswordClick(password);
		adminDashboardPage.adminSubmitButtonClick();
		adminDashboardPage.dashBoardOption();
		List<String> list=new ArrayList<String>();
		list.add(adminDashboardPage.thisWeekVendors());
		list.add(adminDashboardPage.thisWeekCustomers());
		list.add(adminDashboardPage.thisWeekProducts());
		list.add(adminDashboardPage.thisMonthProducts());
		list.add(adminDashboardPage.totalVendor());
		list.add(adminDashboardPage.totalCustomers());
		list.add(adminDashboardPage.totalProducts());
		List<String> originalValues=new ArrayList<String>();
		originalValues.add("This week Vendors!");
		originalValues.add("This week Customers!");
		originalValues.add("This week Products!");
		originalValues.add("This Month Products!");
		originalValues.add("Total Vendors!");
		originalValues.add("Total Customers!");
		originalValues.add("Total Products!");
		
		if (list.contains(originalValues)) { 
			logger.info("US_0003_AdminDashboardPage fail");//checks whether the options are displayed in the adminDashboard
		}else
		{
			try{
				for(int i=0;i<originalValues.size();i++)

				{
					String a=originalValues.get(i);
					list.contains(a);
				}
				logger.info("US_0003_AdminDashboardPage passed - This week Vendors!, This week Customers!, This week Products!, This Month Products!, Total Vendors!, Total Customers!, Total Products! options are displayed");

			}
			catch(Exception e1) {
				logger.info("US_0003_AdminDashboardPage failed - This week Vendors!, This week Customers!, This week Products!, This Month Products!, Total Vendors!, Total Customers!, Total Products! options are not displayed");
			}
	}
	


	}

	
	@Test(priority = 35, enabled = true)
	public void adminDashBoardOptions() 
	{

		adminDashboardPage=new US_0003_AdminDashboardPage(driver);
		adminDashboardPage.adminEmailAddressClick(username);
		adminDashboardPage.adminPasswordClick(password);
		adminDashboardPage.adminSubmitButtonClick();
		adminDashboardPage.dashBoardOption();
		List<String> list=new ArrayList<String>();
		list.add(adminDashboardPage.products());
		list.add(adminDashboardPage.vendors());
		list.add(adminDashboardPage.manageCategories());
		list.add(adminDashboardPage.generalSettings());
		list.add(adminDashboardPage.homePageSettings());
		List<String> originalValues=new ArrayList<String>();
		originalValues.add("Products");
		originalValues.add("Vendors");
		originalValues.add("Manage Categories");
		originalValues.add("General Settings");
		originalValues.add("Home Page Settings");


		if (list.contains(originalValues)) { 
			logger.info("US_0003_AdminDashboardPage fail");//checks whether the options are displayed
		}else
		{
			try{
				for(int i=0;i<originalValues.size();i++)

				{
					String a=originalValues.get(i);
					list.contains(a);
				}
				logger.info("US_0003_AdminDashboardPage passed - Products, Vendors, Manage Categories, General Settings, Home Page Settings options are Displayed");

			}
			catch(Exception e1) {
				logger.info("US_0003_AdminDashboardPage failed - Products, Vendors, Manage Categories, General Settings, Home Page Settings options are not Displayed");
			}
	}

	}
	
}

	