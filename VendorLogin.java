/*Author: Dhinesh R
 * Description: vendor login
 */
package com.tradeviv.pageObjects;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.tradeviv.testCases.BaseClass;

//WebElements for vendor login
public class VendorLogin extends BaseClass {
	WebDriverWait wait;
	WebDriver driver;
	@FindBy(xpath="//span[@class='preload-close']") WebElement newsLetterPopUpElement;
	@FindBy(xpath="//span[contains(text(),'Accounts & Lists')]")WebElement accountElement;
	@FindBy(xpath="//a[@class='sign-in-btn']") WebElement sigin;
	@FindBy(xpath="//a[@id='nav-log-tab11']") WebElement vendorlogin;
	@FindBy(xpath="//div[@id='nav-log11']//input[@name='email']")WebElement vendorEmail;
	@FindBy(xpath="//div[@id='nav-log11']//input[@name='password']")WebElement vendorPassword;
	@FindBy(xpath="//div[@id='nav-log11']//button[@type='submit']")WebElement login;
	

	//Methods for vendor login
	public VendorLogin(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public	void newsLetterPopup() throws InterruptedException 
	{
		Thread.sleep(12000);
		Actions action = new Actions(driver);
		action.moveToElement(newsLetterPopUpElement).click().build().perform();
		
	}

	public	void accountElement() throws InterruptedException
	{
		
		//Thread.sleep(5000);
		explicitWait(accountElement, driver);
		//accountElement.click();
		Actions action = new Actions(driver);
		action.moveToElement(accountElement).click().build().perform();
		
	}
	public void signin() throws InterruptedException
	{
		//Thread.sleep(5000);
		sigin.click();
	}
	public	void vendorLogin()
	{
		vendorlogin.click();
	}
	public	String vendorEmail(String username)
	{
		vendorEmail.sendKeys(username);
		return username;
	}
	public	String vendorPassword(String password)
	{
		vendorPassword.sendKeys(password);
		return password;
	}
	public	void login()
	{
		login.click();
	}
}

