package com.tradeviv.testCases;
/*
 * @author  Kirubakaran P
 * 
 * Administrator add the Main Categories in the application
 * 
 */
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.tradeviv.pageObjects.AddMainCategory;
public class TC_15_AddMainCategory extends BaseClass
{
//	AdminLogin al;
	AddMainCategory addCategory;
//	UpdateRecentAddedCategory urac;
	String[][] myData;
	String[][] getData;
//	@Test(priority=1)

//	public void adminLogin() throws InterruptedException
//	{
//		al= new AdminLogin(driver);
//		al.username(username);
//		al.password(password);
//		al.login();
//		logger.info("Admin Logged in success ");
//	}
	@Test(priority=17)
	void manageCategory() throws InterruptedException
	{
		addCategory = new AddMainCategory(driver);
		addCategory.manageCategories();
		addCategory.mainCategory();
	}
	
	@DataProvider(name="addMainCategory")		//Arrays of data from the Excel sheet
	public String[][] mainCategory() throws IOException
	{
		myData=dataProvider("./src/test/java/com/tradeviv/testData/AddMainCategory.xlsx");
		return myData;
	}

	@Test(priority=18,dataProvider="addMainCategory")	//passing values through DataProvider
	void addNewCategory(String categoryName,String slug,String imgPath) throws InterruptedException, IOException
	{
		try
		{
		addCategory = new AddMainCategory(driver);
		addCategory.addNewMainCategory();
		addCategory.mainCategoryNameField(categoryName);
		addCategory.slugField(slug);
		addCategory.mainCategoryImage(imgPath);
		addCategory.createButton();
		logger.info(categoryName+" Category added Successfully");
		}
		catch(Exception e)
		{
			captureScreen(driver, "TC_15_addNewCatgeory_Bug_");
		}
	}
	

	@Test(priority=19)		
	void updateMainCategory() throws InterruptedException, IOException
	{
		try
		{
		addCategory = new AddMainCategory(driver);
		explicitWait(addCategory.edit, driver);
		addCategory.edit();
		addCategory.mainCategoryNameField.clear();
		addCategory.mainCategoryNameField("Mechanical Parts and Spares");
		addCategory.slugField.clear();
		addCategory.slugField("Mechanical Parts");
		addCategory.mainCategoryImage("C:\\Users\\sugan\\eclipse-workspace\\TradeVIV\\src\\test\\java\\com\\tradeviv\\testData\\Category Image\\mechnical_parts_spares.jpg ");
		addCategory.createButton();
		logger.info("Category updated Successfully");
		}
		catch(Exception e)
		{
			captureScreen(driver, "TC_15_updateMainCategory_Bug_");
		}
		
	}
	
}
