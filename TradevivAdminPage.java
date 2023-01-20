package com.tradeviv.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tradeviv.testCases.BaseClass;
import com.tradeviv.utilities.ReadConfig;


public class TradevivAdminPage extends BaseClass
{
	WebDriver driver;
	ReadConfig readconfig=new ReadConfig();
	@FindBy (xpath="//input[@class='User Name']")
	private WebElement user;
	@FindBy (xpath="//input[@class='Password']")
	private WebElement password;
	@FindBy (xpath="//button[@class='submit-btn']")
	private WebElement button;


	public TradevivAdminPage(WebDriver driver)
	{ 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		logger=Logger.getLogger(TradevivAdminPage.class);
	}
	public void userMail() 
	{  

		user.sendKeys(readconfig.pro.getProperty("username"));
	}
	public void passWord () 
	{	
		password.sendKeys(readconfig.pro.getProperty("password"));

	}
	public void login()
	{	
		button.click();


	}


}
