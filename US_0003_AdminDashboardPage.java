package com.tradeviv.pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
    import com.tradeviv.testCases.BaseClass;

    
    
    
    public class US_0003_AdminDashboardPage extends BaseClass{
		WebDriver driver;
		
		public US_0003_AdminDashboardPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@name='email']")
		WebElement adminEmailAddress;
		@FindBy(xpath="//input[@name='password']")
		WebElement adminPassword;
		@FindBy(xpath="//button[@class='submit-btn']")
		WebElement adminSubmitButton;
		@FindBy(xpath="//*[@class=\"wave-effect waves-effect waves-button active\"]")
		WebElement dashBoardOption;
		@FindBy(xpath="//div[@class='col-md-12 col-lg-6 col-xl-3'][1]")
		WebElement thisWeekVendors;
		@FindBy(xpath="//div[@class='col-md-12 col-lg-6 col-xl-3'][2]")
		WebElement thisWeekCustomers;
		@FindBy(xpath="//div[@class='col-md-12 col-lg-6 col-xl-3'][3]")
		WebElement thisWeekProducts;
		@FindBy(xpath="//div[@class='col-md-12 col-lg-6 col-xl-3'][4]")
		WebElement thisMonthProducts;
		@FindBy(xpath="//div[@class='col-md-12 col-lg-6 col-xl-4'][1]")
		WebElement totalVendor;
		@FindBy(xpath="//div[@class='col-md-12 col-lg-6 col-xl-4'][2]")
		WebElement totalCustomers;
		@FindBy(xpath="//div[@class='col-md-12 col-lg-6 col-xl-4'][3]")
		WebElement totalProducts;

		@FindBy(xpath="//*[@class='accordion-toggle wave-effect waves-effect waves-button'][1]")
		WebElement products;

		@FindBy(xpath="//*[@id='vendor']")
		WebElement vendors;
		
		@FindBy(xpath="//*[@id='menu5']")
		WebElement manageCategories;
		
		@FindBy(xpath="//*[@id='general']")
		WebElement generalSettings;
		
		@FindBy(xpath="//*[@id='homepage']")
		WebElement homePageSettings;
		
		
		
//		@FindBy(xpath="//div[@class='user-img']") WebElement adminProfile;
//		@FindBy(xpath="//a[@href='https://tradeviv.com/admin/logout']") WebElement adminLogout;
		
		

		public void adminEmailAddressClick(String username)
		{
			adminEmailAddress.sendKeys(username);
		}
		public void adminPasswordClick(String password)
		{
			adminPassword.sendKeys(password);
		}
		public void adminSubmitButtonClick()
		{
			adminSubmitButton.click();
		}
		
    
		public void dashBoardOption()
		{
			dashBoardOption.click();
		}
public String thisWeekVendors()
{
	String thisWeekVendorsValue= thisWeekVendors.getText();
	return thisWeekVendorsValue;
	}
public String thisWeekCustomers()
{
	String thisWeekCustomersValue= thisWeekCustomers.getText();
	return thisWeekCustomersValue;
}
public String thisWeekProducts()
{
	String thisWeekProductsValue= thisWeekProducts.getText();
	return thisWeekProductsValue;
}
public String thisMonthProducts()
{
	String thisMonthProductsValue= thisMonthProducts.getText();
	return thisMonthProductsValue;
}
public String totalVendor()
{
	String totalVendorValue= totalVendor.getText();
	return totalVendorValue;
}
public String totalCustomers()
{
	String totalCustomersValue= totalCustomers.getText();
	return totalCustomersValue;
}
public String totalProducts()
{
	String totalProductsValue= totalProducts.getText();
	return totalProductsValue;
}
    

public String products()
{
	String productsValue= products.getText();
	return productsValue;
}
public String vendors()
{
	String vendorsValue= vendors.getText();
	return vendorsValue;
}
public String manageCategories()
{
	String manageCategoriesValue= manageCategories.getText();
	return manageCategoriesValue;
}

public String generalSettings()
{
	String generalSettingsValue= generalSettings.getText();
	return generalSettingsValue;
}
    

public String homePageSettings()
{
	String homePageSettingsValue= homePageSettings.getText();
	return homePageSettingsValue;
}
    




    }
    
    
    
