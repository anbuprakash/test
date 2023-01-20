package com.tradeviv.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tradeviv.pageObjects.DeleteAddedProduct;
import com.tradeviv.pageObjects.TradevivAdminPage;

public class TC_31_DeleteAddedProduct extends BaseClass {

	DeleteAddedProduct deleteAddedProduct;
	TradevivAdminPage tradevivAdminPage;

//	@Test(priority=1)
//	public void adminlogin()
//	{
//		tradevivAdminPage=new TradevivAdminPage(driver);
//		tradevivAdminPage.userMail();	
//		tradevivAdminPage.passWord();
//		tradevivAdminPage.login();
//	}
	@Test (priority=28)
	public void cancel() throws IOException {

		try {
			deleteAddedProduct=new DeleteAddedProduct(driver);
			deleteAddedProduct.products();
			deleteAddedProduct.allProducts();
			deleteAddedProduct.actions();
			deleteAddedProduct.delete();
			deleteAddedProduct.cancel();
		}

		catch(Exception e)
		{

			captureScreen(driver, "TC_31_DeleteAddedProduct_Bug_");
			logger.info(e);


		}

	}
	@Test (priority=29)
	public void delete() throws IOException {

		try {
			deleteAddedProduct=new DeleteAddedProduct(driver);
			deleteAddedProduct.products();
			deleteAddedProduct.allProducts();
			deleteAddedProduct.actions();
			deleteAddedProduct.delete();
			deleteAddedProduct.delete1();
			deleteAddedProduct.comment();
		}

		catch(Exception e)
		{

			captureScreen(driver, "TC_31_DeleteAddedProduct_Bug_");
			logger.info(e);


		}

	}


}
