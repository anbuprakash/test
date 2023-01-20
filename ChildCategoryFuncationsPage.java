package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;


public class ChildCategoryFuncationsPage extends BaseClass {

	WebDriver driver;
	public ChildCategoryFuncationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#menu5']")WebElement managecategories;
	@FindBy (xpath="//a[contains(@href,'child')]")WebElement chilcategory;
	@FindBy (xpath="//a[@id='add-data']")WebElement addchild;
	@FindBy (id="cat") WebElement maincategory;
	@FindBy (id= "subcat") WebElement subcategory;
	@FindBy (name="name")WebElement childcatname;
	@FindBy (name="slug") WebElement slug;
	@FindBy (name="photo") WebElement childcategorypic;
	@FindBy (xpath="//input[@class='ui-widget-content ui-autocomplete-input']") WebElement childtag;
	@FindBy (xpath="//button[contains(@class,'addProductSubmit')]") WebElement childsubmit;
	@FindBy (xpath="//table[@class='table table-hover dt-responsive']//tr[2]//a[@data-target='#modal1']") WebElement edit;
	@FindBy (xpath="//table[@class='table table-hover dt-responsive']//tr[2]//a[@data-target='#confirm-delete']") WebElement delete;
	@FindBy (xpath="//a[@class='btn btn-danger btn-ok']") WebElement deleteconfirm;
	@FindBy (xpath="//button[@class='btn btn-default']") WebElement deletecancel;
	@FindBy (xpath="//*[@id=\"modal1\"]/div/div/div[4]/button") WebElement close;
	@FindBy (xpath="//button[@class='addProductSubmit-btn']") WebElement editconfirmbtn;
	@FindBy(xpath="//div[@class='alert alert-danger validation']//p[@class='text-left']")WebElement confirmationText;

	
	public void confirmationTextView()
	{
		explicitWait(confirmationText,driver);
		confirmationText.getText();
		boolean textconfirmation=confirmationText.isDisplayed();
		if (textconfirmation=true) {
			logger.info(""+confirmationText.getText());
			}
	}
	
	public void childedit() {
		explicitWait(edit,driver);
		edit.click();
	}
	
	public void editconfirm() {
		editconfirmbtn.click();
	}
	
	public void closeaddchildwindow() {
		close.click();
	}
	
	public void childdelete() throws InterruptedException {
		//explicitWait(delete,driver);
		Thread.sleep(3000);
		delete.click();
	}
	
	public void deleteconfirmbtn() {
		deleteconfirm.click();
	}
	
	public void managecategories()
	{
		explicitWait(managecategories,driver);
		managecategories.click();
	}
	public void childcategory()
	{
		chilcategory.click();
	}
	public void addchild()
	{
		explicitWait(addchild,driver);
		addchild.click();
	}
	public void maincategoryField(String mainCategoryName)
	{
		explicitWait(maincategory,driver);
		maincategory.sendKeys(mainCategoryName);
	}
	public void subcategoryField(String subCategoryName) throws InterruptedException
	{
		//explicitWait(subcategory,driver);
		Thread.sleep(3000);
		subcategory.sendKeys(subCategoryName);
	}
	public void childcatnameField(String childCategoryName)
	{
		childcatname.clear();
		childcatname.sendKeys(childCategoryName);
	}
	public void slugField(String slugname)
	{
		slug.clear();
		slug.sendKeys(slugname);
	}
	public void tagField(String tagname)
	{
		childtag.sendKeys(tagname);
	}
	public void childcategorypic(String imgpath) {
		childcategorypic.sendKeys(imgpath);
	}
	public void childsubmit() {
		childsubmit.click();
	}
	
	
	
	
	
}