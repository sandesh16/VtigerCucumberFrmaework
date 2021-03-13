package com.Vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage  {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//#####################################--Page Factory-- #########################################################
	
	@FindBy (name="user_name")
	WebElement username;
	
	@FindBy (name="user_password")
	WebElement password;
	
	@FindBy (name="Login")
	WebElement btn_login;
	
	//##########################################--Methods--##########################################################
	
	public void login (String Name, String UserPassword , WebDriver driver)
	{try {
		
		util.setText(username, Name);
		util.setText(password, UserPassword);
		util.clickOn(btn_login);
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);
	}
}
	
	public String verifytitle(WebDriver driver) {
		try {
		return driver.getTitle();
		}catch(Exception e) {
			util.reportCatchBlock(driver, e);
		}
		return null;}
	
}

