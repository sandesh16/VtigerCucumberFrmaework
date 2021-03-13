package com.Vtiger.stepdefinitions;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseTest {

	/*
	@Before
	public void before()
	{
		System.out.println("This is the before hooks");
	}
	
	@After
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {
			
			getScreenshot.takeScreenshot(driver);
			
			ExtentCucumberAdapter.getCurrentStep().fail("<a href="+getScreenshot.fileName+"target=\"_blank\"> Screenshot</a>");
		}
	}
	
*/
}
