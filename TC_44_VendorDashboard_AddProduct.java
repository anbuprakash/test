/*Author: Dhinesh R
 * Description: Vendor can add products
 */
package com.tradeviv.testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.tradeviv.pageObjects.AddVendorProduct;
import com.tradeviv.pageObjects.VendorLogin;



public class TC_44_VendorDashboard_AddProduct extends BaseClass
{
	//String[][] login;
	String[][] product;
	AddVendorProduct addProductPage;
	
//For multiple login	
//	@DataProvider(name="login")
//	public String[][] getData() throws IOException
//	{
//		login= dataProvider("./src/test/java/com/tradeviv/testData/VendorLogin.xlsx");
//		return login;
//		
//	}
	
	//Using DataProvider for get the product details from excel
	@DataProvider(name="product")
	public String[][] getproducts() throws IOException
	{
		product= dataProvider("./src/test/java/com/tradeviv/testData/AddProducts.xlsx");
		return product;
	}
		
	//Using vendor login 
	@Test(priority =36)	
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
	}
	
	//Add new products from vendor dashboard 
	@Test(priority =37, dataProvider="product")
//	)	
	void addProduct(String productName)
	{
		addProductPage=new AddVendorProduct(driver);
		addProductPage.products.click();
		addProductPage.addNewProducts.click();
		addProductPage.productName.sendKeys(productName);
		Select select=new Select(addProductPage.category);
		select.selectByIndex(1);
		explicitWait(addProductPage.subCategory, driver);
		Select sub=new Select(addProductPage.subCategory);
		sub.selectByVisibleText("sand");
		explicitWait(addProductPage.childCategory, driver);
		Select child=new Select(addProductPage.childCategory);
		child.selectByVisibleText("black sand");
		explicitWait(addProductPage.location, driver);
		Select locate=new Select(addProductPage.location);
		locate.selectByVisibleText("Adyar");
		addProductPage.serialNo.sendKeys("1");
		addProductPage.specification.sendKeys("Specification");
		addProductPage.value.sendKeys("20");
		addProductPage.description.sendKeys("This is the product");
		addProductPage.pricePerQuantity.sendKeys("10");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select measurement=new Select(addProductPage.measurementDropdown);
		measurement.selectByVisibleText("Kg");
		addProductPage.p_v_Qty.sendKeys("1");
		addProductPage.p_v_price.sendKeys("10");
		addProductPage.p_v_Measurement.sendKeys("Kg");
		addProductPage.availability.sendKeys("Immediate");
		Actions action= new Actions(driver);
		action.moveToElement(addProductPage.byRoad).click().build().perform();
		addProductPage.qty.sendKeys("1000");
		addProductPage.estimateDays.sendKeys("1");
		System.out.println("estimation days added");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addProductPage.productImage.sendKeys("C:\\Users\\sugan\\eclipse-workspace\\TradeVIV\\TradeVIV\\src\\test\\java\\com\\tradeviv\\testData\\Company Details\\sand.jpg");
		logger.info("product image added");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addProductPage.packageImage.sendKeys("C:\\Users\\sugan\\eclipse-workspace\\TradeVIV\\TradeVIV\\src\\test\\java\\com\\tradeviv\\testData\\Company Details\\sand-package.jpg");
		logger.info("package image added");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addProductPage.transporationImage.sendKeys("C:\\Users\\sugan\\eclipse-workspace\\TradeVIV\\TradeVIV\\src\\test\\java\\com\\tradeviv\\testData\\Company Details\\Transport.jpg");
		logger.info("transport image added");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addProductPage.tags.sendKeys("sand001");
		action.moveToElement(addProductPage.createProduct).click().build().perform();
		logger.info("create button clicked");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(addProductPage.sucessmesg));
		
	}
	
	//vendor logout
	@Test(priority=38)
	void logout() {
		addProductPage=new AddVendorProduct(driver);
		addProductPage.logout_object.click();
				addProductPage.logout.click();
		
	}
}	
	
