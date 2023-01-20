package com.tradeviv.pageObjects;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.tradeviv.testCases.BaseClass;

import junit.framework.Assert;

public class UpdateAddedProduct extends BaseClass{

	WebDriver driver;
	@FindBy (xpath="//a[@href='#menu2']")   
	WebElement Products;

	@FindBy (xpath="//span[contains(text(), 'Add New Product')]")   
	WebElement AddNewProduct;

	@FindBy (xpath="//h5[contains(text(), 'Physical')]")   
	WebElement Physical;

	@FindBy (xpath="//input[@placeholder='Enter Product Name']")   
	WebElement ProductName;

	@FindBy (xpath="//input[@id='conditionCheck']")   
	WebElement AllowProductCondition;

	@FindBy (xpath="//select[@name='product_condition']")   
	WebElement ProductCondition;

	@FindBy (xpath="//select[@id='cat']")   
	WebElement Category;


	@FindBy (xpath="//select[@id='subcat']")   
	WebElement SubCategory;


	@FindBy (xpath="//select[@id='childcat']")   
	WebElement ChildCategory;

	@FindBy (xpath="//input[@id='check1']")   
	WebElement AllowEstimatedShippingTime;

	@FindBy (xpath="//input[@placeholder='Estimated Shipping Time']")   
	WebElement EstimatedShippingTime;

	@FindBy (xpath="//input[@name='stock']")   
	WebElement ProductStock;

	@FindBy (xpath="//following-sibling::textarea[@name='details']//parent::div//div[@contenteditable='true']")   
	WebElement ProductDescription;

	@FindBy (xpath="//following-sibling::textarea[@name='policy']//parent::div//div[@contenteditable='true']")   
	WebElement ProductBuyReturnPolicy;

	@FindBy (xpath="//a[@id='crop-image']//i[@class='icofont-upload-alt']")   
	WebElement FeatureImage;

	@FindBy (xpath="//input[@name='price']")   
	WebElement ProductCurrentPrice;

	@FindBy (xpath="//ul[@id='tags']//input[@type='text']")   
	WebElement Tags;

	@FindBy (xpath="//button[@class='addProductSubmit-btn']")   
	WebElement CreateProduct;
	@FindBy (xpath="//div[@class='ok']")
	WebElement ok;
	
	@FindBy (xpath="//p[@class='text-left']")
	WebElement textMessage;

	public UpdateAddedProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void products()
	{
		Products.click();
	}

	public void addNewProduct()
	{
		AddNewProduct.click();
	}

	public void physical()
	{
		Physical.click();
	}

	public void productName(String p_name)
	{
		ProductName.sendKeys(p_name);
	}

	public void allowProductCondition()
	{
		AllowProductCondition.click();
	}

	public void productCondition()
	{
		Select drop=new Select(ProductCondition);
		drop.selectByIndex(0);
	}


	public void category(String index)
	{

		Select drop=new Select(Category);
		drop.selectByVisibleText(index);
	}

	public void subCategory(String sub_index)
	{

		Select drop1=new Select(SubCategory);
		drop1.selectByVisibleText(sub_index);
	}

	public void childCategory(String childcat)
	{
		Select drop2=new Select(ChildCategory);
		drop2.selectByVisibleText(childcat);
	}

	public void allowEstimatedShippingTime()
	{
		AllowEstimatedShippingTime.click();
	}

	public void estimatedShippingTime()
	{
		EstimatedShippingTime.sendKeys("2 Days");
	}

	public void productStock()
	{
		ProductStock.sendKeys("100");
	}
	public void productDescription()
	{
		ProductDescription.sendKeys("This is our product");
	}

	public void productBuyReturnPolicy()
	{
		ProductBuyReturnPolicy.sendKeys("Exchange within 2 days");
	}
	public void featureImage(String img_path) throws AWTException
	{
		Actions action=new Actions(driver);
		action.moveToElement(FeatureImage).click().perform();
//		explicitWait(FeatureImage, driver);
		Robot rb=new Robot();
		StringSelection ss=new StringSelection(img_path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.delay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		explicitWait(ok, driver);
		ok.click();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//		js.executeScript("arguments[0].style.display='block';",FeatureImage);
		
//		
//	FeatureImage.sendKeys(img_path);
//		explicitWait(driver.findElement(By.xpath("//div[@class='ok']")), driver);
//	driver.findElement(By.xpath("//div[@class='ok']")).click();
	
		System.out.println("image click");
	}

	public void productCurrentPrice()
	{
		ProductCurrentPrice.sendKeys("200");
	}
	public void tags()
	{
		
		Tags.sendKeys("cement");
		System.out.println("tag click");
		
	}

	public void createProduct()
	{
//		explicitWait(CreateProduct, driver);
		
		CreateProduct.click();
		System.out.println("CreateProduct click");
	}
	
	public void message()
	{
		explicitWait(textMessage, driver);
		String text=textMessage.getText();
		System.out.println(text);
		Assert.assertEquals("New Product Added Successfully.View Product Lists.", text);
		
	}

}





