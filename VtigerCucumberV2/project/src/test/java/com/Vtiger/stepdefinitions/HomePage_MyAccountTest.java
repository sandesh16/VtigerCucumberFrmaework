package com.Vtiger.stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HomePage_MyAccountTest extends BaseTest{
		
		@BeforeStep
		public void beforeStep() {
			pageInitialization();			
		}
		
		@When("^User click on MyAccount$")
		public void User_click_on_MyAccount() {
			try {
				homepage.myaccount();
			} catch (Exception e) {
				util.reportCatchBlock(driver, e);
			}
		}

		@Then("^User is on MyAccount$")
		public void User_entered_in_Calendar_successfully() {
			try {
				String moduletitle = homepage.verify_myaccount();
				Assert.assertEquals(moduletitle, "User rushikesh Administrator (admin)");

			} catch (Exception e) {
				util.reportCatchBlock(driver, e);
			}
		}
		
	
 }
