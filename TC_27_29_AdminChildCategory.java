package com.tradeviv.testCases;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tradeviv.pageObjects.ChildCategoryFuncationsPage;

public class TC_27_29_AdminChildCategory extends BaseClass{

//	AdminLogin al;
	ChildCategoryFuncationsPage childfunc;
	String[][] addData;
	String[][] updateData;

//	@Test(priority=0)
//
//	public void adminLogin() throws InterruptedException
//	{
//		al= new AdminLogin(driver);
//		al.username(username);
//		al.password(password);
//		al.login();
//		logger.info("Admin Logged in success ");
//	}
	@Test(priority=24,dataProvider="AddChildCategory")
	public void addchildcatgeory(String mainCategoryname, String subCatgoryName, String productName, String slug , String tag, String imgpath) throws InterruptedException, IOException
	{
		try
		{
		childfunc= new ChildCategoryFuncationsPage(driver);
		childfunc.managecategories();
		childfunc.childcategory();
		childfunc.addchild();
		childfunc.maincategoryField(mainCategoryname);
		childfunc.subcategoryField(subCatgoryName);
		childfunc.childcatnameField(productName);
		childfunc.slugField(slug);
		childfunc.tagField(tag);
		childfunc.childcategorypic(imgpath);
		childfunc.childsubmit();	
//		childfunc.confirmationTextView();
		}
		catch(Exception e)
		{
			captureScreen(driver, "TC_27_addchildcatgeory_Bug_");
			logger.info(e);
		}
	}




	@Test  (priority=25)
	public void updatechildcategory() throws IOException
	{
		try
		{
		childfunc= new ChildCategoryFuncationsPage(driver);
		childfunc.childedit();
		childfunc.maincategoryField("Groceries");
		childfunc.subcategoryField("Pulses");
		childfunc.childcatnameField("Moong Dal");
		childfunc.slugField("Moong Dal");
		childfunc.tagField("Moong,Dal");
		childfunc.editconfirm();
		childfunc.confirmationTextView();
		}
		catch(Exception e)
		{
			captureScreen(driver, "TC_28_updatechildcategory_Bug_");
			logger.info(e);
		}
	}
	

	@Test (priority=26)
	public void deleteChildCategory() throws IOException
	{
		try
		{
		childfunc= new ChildCategoryFuncationsPage(driver);
		childfunc.addchild();
		childfunc.maincategoryField("Groceries");
		childfunc.subcategoryField("Pulses");
		childfunc.childcatnameField("Urad Dal");
		childfunc.slugField("Urad Dal");
		childfunc.tagField("Urad,Dal");
		childfunc.childcategorypic("C:\\Users\\sugan\\eclipse-workspace\\TradeVIV\\src\\test\\java\\com\\tradeviv\\testData\\urad dal.jpg");
		childfunc.childsubmit();	
		
		childfunc.childdelete();
		childfunc.deleteconfirmbtn();
		childfunc.confirmationTextView();
		}
		catch(Exception e)
		{
			captureScreen(driver, "TC_29_deletechildcategory_Bug_");
			logger.info(e);
		}
	}



	@DataProvider(name="AddChildCategory")		//Arrays of data from the Excel sheet
	public String [][] addchild() throws IOException
	{
		addData= dataProvider("./src/test/java/com/tradeviv/testData/AddChildCategory.xlsx");
		return addData;
	}

}



