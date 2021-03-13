package com.Vtiger.stepdefinitions;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewLeadTest extends BaseTest{
	
	public String testDataFile="Input.xls";
	public String testcaseName ="Vtiger";
	public String testsheetName="New Lead";
	
	@BeforeStep
	public void beforeStep() {
		pageInitialization();
	}
	
	@When("^User is on New Lead page$")
	public void User_is_on_New_Lead_page() {
		try {
			homepage.add_newlead();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@And("User enters information and click on save button")  
	public void User_enters_information_and_click_on_save_button() {
		try {
			getinputsheetname(testDataFile);
			System.out.println("@@@  Test Sheet Name :" + testDataFile );
			getInpuDataFromExcel(testcaseName, testsheetName);
			inputData.get("Details");
			
		   newleadpage.enter_newlead(inputData.get("Details").get("firstname"), inputData.get("Details").get("lastname"), inputData.get("Details").get("company"), driver);
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
		
		
	}

	@Then("Information must be save successfully") 
	public void Information_must_be_save_successfully() 	{
		try {
			String leadtitle=newleadpage.verify_newlead();
			System.out.println(leadtitle + " added successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}


}
