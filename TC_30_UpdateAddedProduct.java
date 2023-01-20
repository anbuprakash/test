package com.tradeviv.testCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.tradeviv.pageObjects.TradevivAdminPage;
import com.tradeviv.pageObjects.UpdateAddedProduct;

public class TC_30_UpdateAddedProduct extends BaseClass {
	String [][] data;

	UpdateAddedProduct updateAddedProduct;
//	TradevivAdminPage tradevivAdminPage;

//	@Test(priority=1)
//	public void adminlogin()
//	{
//		tradevivAdminPage=new TradevivAdminPage(driver);
//		tradevivAdminPage.userMail();	
//		tradevivAdminPage.passWord();
//		tradevivAdminPage.login();
//	}

	@Test (priority=27, dataProvider="product")
	public void updateAddedProduct(String category, String subcatagory, String childcat) throws IOException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
		updateAddedProduct=new UpdateAddedProduct(driver);
		updateAddedProduct.products();
		updateAddedProduct.addNewProduct();
		updateAddedProduct.physical();
		updateAddedProduct.productName(childcat+"-"+randomNumber());
		updateAddedProduct.allowProductCondition();
		updateAddedProduct.productCondition();
		wait.until(ExpectedConditions
			    .presenceOfNestedElementsLocatedBy
			         (By.xpath("//select[@name='category_id']"), By.tagName("option")));
		updateAddedProduct.category(category);
		wait.until(ExpectedConditions
			    .presenceOfNestedElementsLocatedBy
			         (By.xpath("//select[@name='subcategory_id']"), By.tagName("option")));
		updateAddedProduct.subCategory(subcatagory);
		wait.until(ExpectedConditions
			    .presenceOfNestedElementsLocatedBy
			         (By.xpath("//select[@name='childcategory_id']"), By.tagName("option")));
		updateAddedProduct.childCategory(childcat);
		updateAddedProduct.allowEstimatedShippingTime();
		updateAddedProduct.estimatedShippingTime();
		updateAddedProduct.productStock();
		updateAddedProduct.productDescription();
		updateAddedProduct.productBuyReturnPolicy();
	
		
//		String img_path=System.getProperty("user.dir")+"/src/test/java/com/tradeviv/testData/Company Details/cement.jpg";
		updateAddedProduct.featureImage("C:\\Users\\sugan\\eclipse-workspace\\TradeVIV\\src\\test\\java\\com\\tradeviv\\testData\\AddProduct.xlsx");
		updateAddedProduct.productCurrentPrice();
		updateAddedProduct.tags();
		updateAddedProduct.createProduct();
		updateAddedProduct.message();
		driver.navigate().refresh();
		}
		catch(Exception e)
		{
			
			captureScreen(driver, "TC_30_UpdateAddedProduct_Bug_");
			logger.info(e);
			
			
		}
	}
	
	

	@DataProvider(name="product")
	public String[][] loginDataProvider() throws IOException
	{
		data=dataProvider(System.getProperty("user.dir")+"/src/test/java/com/tradeviv/testData/TestData.xlsx");

		return data;
	}

	/*public String[][] getexceldate() throws IOException 
{
FileInputStream excel=new FileInputStream("D:\\raji\\TestData (2).xlsx");

XSSFWorkbook workbook1= new XSSFWorkbook(excel);
XSSFSheet sheet= workbook1.getSheetAt(0);



int rowCount=sheet.getLastRowNum();
int columnCount=2;

String testData[][]=new String[rowCount][columnCount];
for(int i=1;i<rowCount;i++)
{
for(int j=0;j<columnCount;j++)
{
	testData[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
testData[i-1][j]=sheet.getroe(j,i).getContents();
System.out.println("["+(i-1)+","+ j+"]"+" "+testData[i-1][j]);

}


}

return testData;
}*/

	public String randomNumber()
	{
		String genratenumber=RandomStringUtils.randomNumeric(5);
		return genratenumber;
	}



}

