/*Author: Dhinesh R
 * Description: Vendor can add products
 */

package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tradeviv.testCases.BaseClass;


//WebElemnets for add products fields
public class AddVendorProduct
{

	BaseClass bc=new BaseClass();
	WebDriver driver;
	@FindBy(xpath="//span[@class='preload-close']")public  WebElement newsLetterPopUpElement;
	@FindBy(xpath="//a[@href='#menu2']")public WebElement products;
	@FindBy(xpath="//span[contains(text(), 'Add New Product')]")public WebElement addNewProducts;
	@FindBy(xpath="//input[@name='name']") public WebElement productName;
	@FindBy(xpath="//input[@placeholder='S.No*']")public  WebElement serialNo;
	@FindBy(xpath="//select[@name='category_id']")public  WebElement category;
	@FindBy(xpath="//select[@id='subcat']")public  WebElement subCategory;
	@FindBy(xpath="//select[@name='childcategory_id']")public  WebElement childCategory;
	@FindBy(xpath="//select[@name='location']")public WebElement location;

	@FindBy(xpath="//input[@placeholder='Specification*']")public WebElement specification;
	@FindBy(xpath="//input[@placeholder='Values*']")public WebElement value;
	@FindBy(xpath="//a[@id='pfeature-btn']/i")public WebElement addMoreFields1;
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[1]/form/div/div[1]/div/div/div/div/div/div[10]/div[2]/div/div[2]/div")public WebElement description;
	@FindBy(xpath="//input[@placeholder='e.g 20' and @name='price']")public WebElement pricePerQuantity;
	@FindBy(xpath="//input[@name='p_v_qty[]']")public WebElement p_v_Qty;
	@FindBy(xpath="//input[@name='p_v_price[]']")public WebElement p_v_price;
	@FindBy(xpath="//input[@placeholder='Measurement']")public WebElement p_v_Measurement;
	@FindBy(xpath="//input[@placeholder='Availability']")public WebElement availability;
	@FindBy(xpath="//a[@id='pvariant-btn']/i")public WebElement addMoreFields2;
	@FindBy(xpath="//a[@id='delivery-time-btn']/i")public WebElement addMoreFields3;
	@FindBy(xpath="//input[@id=\"shipping_desc_byroad\"]")public WebElement byRoad;
	@FindBy(xpath="//input[@id='shipping_desc_bytrain']")public WebElement byTrain;
	@FindBy(xpath="//input[@id='shipping_desc_air']") public WebElement byAir;
	@FindBy(xpath="//input[@name='d_t_qty[]']")public WebElement qty;

	@FindBy(xpath="//input[@name='d_t_estimate_days[]']")public WebElement estimateDays;
	@FindBy(xpath="//input[@id='p_certificate']")public WebElement productCertification;
	@FindBy(xpath="//button[@class='addProductSubmit-btn']")public WebElement createProduct;
	@FindBy(xpath="//select[@name='measurement_system']")public  WebElement measurementDropdown;

	@FindBy(xpath="//input[@id='image-upload']")public WebElement productImage;
	@FindBy(xpath="//input[@id='image-upload-p_p_photo']")public WebElement packageImage;
	@FindBy(xpath="//input[@id='image-upload-p_t_photo']")public WebElement transporationImage;
	@FindBy(xpath="//*[contains(text(),'New Product Added Successfully')]")public WebElement sucessmesg;
	@FindBy(xpath="//*[@id=\"tags\"]/li/input")public WebElement tags;
	@FindBy(xpath="//div[@class='user-img']")
	public WebElement logout_object;

	@FindBy(xpath="//a[contains(text(), 'Logout')]")
	public WebElement logout;
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']//span/following-sibling::span")public WebElement accountElement;
	@FindBy(xpath="//div[@class='col-md-12 text-center']//a")public WebElement signInElement;

	public AddVendorProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}



