package com.Vtiger.stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import oracle.jdbc.proxy.annotation.GetDelegate;

public class Login extends BaseTest {
	
	public String testDataFile="Input.xls";
	public String testcaseName ="Vtiger";
	public String testsheetName="Login";
	
	
	@BeforeStep
	public void beforeStep() {
		pageInitialization();
	}
	
	@Given("^User navigates to the website VTigerCRM$") 
	public void User_navigates_to_the_website_VTigerCRM()
	{
		try {
			getinputsheetname(testDataFile);
			System.out.println("@@@  Test Sheet Name :" + testDataFile );
			getInpuDataFromExcel(testcaseName, testsheetName);
			openURL(inputData.get("LoginDetails").get("URL"));
			
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}
	    


	@When("^There user logs in through Login Window by using Username and Password$") 
	public void There_user_logs_in_through_Login_Window_by_using_Username_and_Password()
	{
		try {
			loginPage.login(inputData.get("LoginDetails").get("Username"), inputData.get("LoginDetails").get("Password"),driver);
			util.waitForPageLoaded(driver);
			
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^Login must be successful$") 
	public void Login_must_be_successful()
	{
		try {
			String title= loginPage.verifytitle(driver);
			System.out.println("User Login Successfully");
			System.out.println("Title of the page is : "+ title);
			Assert.assertEquals(title, "vtiger CRM - Commercial Open Source CRM");
				
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
			
	}
	
}
