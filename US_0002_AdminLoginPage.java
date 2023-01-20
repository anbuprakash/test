	package com.tradeviv.pageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
    import com.tradeviv.testCases.BaseClass;

    
    
    
	public class US_0002_AdminLoginPage extends BaseClass{
		WebDriver driver;
		
		public US_0002_AdminLoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@name='email']")
		public WebElement adminEmailAddress;
		@FindBy(xpath="//input[@name='password']")
		WebElement adminPassword;
		@FindBy(xpath="//button[@class='submit-btn']")
		WebElement adminSubmitButton;
		
		@FindBy(xpath="//div[@class='user-img']") WebElement adminProfile;
		
		@FindBy(xpath="//a[@href='https://tradeviv.com/admin/logout']") WebElement adminLogout;
		
		

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
		
		public void adminProfile()
		{
			adminProfile.click();
		}
		
		public void adminLogout()
		{
			adminLogout.click();
		}
	}
