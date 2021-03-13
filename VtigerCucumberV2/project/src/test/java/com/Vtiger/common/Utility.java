package com.Vtiger.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class Utility extends GetScreenshots {

	// public JavascriptExecutor executor
	/**
	 * 
	 */

	public void reportCatchBlock(WebDriver driver, Exception e) {

		e.printStackTrace();
		takeScreenshot(driver);
		ExtentCucumberAdapter.getCurrentStep()
				.fail("<a>" + "Failed </b> due to <b>" + e.getClass() + "<br>" + e.getMessage() + "</a>");
		ExtentCucumberAdapter.getCurrentStep().fail("<a href =" + fileName + "target=\"_blank\">Screenshot </a>");
		ExtentCucumberAdapter.getCurrentStep().fail(
				"<a href =" + fileName + "target=\"_blank\"><img src=" + fileName + " height=200 width =200></a>");

	}

	public void clearText(WebElement we) {
		try {
			we.clear();
		} catch (Exception e) {
			e.printStackTrace();
			ExtentCucumberAdapter.getCurrentStep()
					.fail("<a>" + "Failed </b> due to <b>" + e.getClass() + "<br>" + e.getMessage() + "</a>");
		}
	}
	
	/**
	* This method will be used to enter text in filed
	* @author Sandesh
	* @param
	*/

	public void setText(WebElement we, String text) {
		try {
			we.clear();
			we.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			ExtentCucumberAdapter.getCurrentStep()
					.fail("<a>" + "Failed </b> due to <b>" + e.getClass() + "<br>" + e.getMessage() + "</a>");
		}
	}
	
	/**
	* This method will be used to click on element
	* @author Sandesh
	* @param
	*/

	public void clickOn(WebElement we) {
		try {
			we.click();
			
		} catch (Exception e) {
			e.printStackTrace();
			ExtentCucumberAdapter.getCurrentStep()
					.fail("<a>" + "Failed </b> due to <b>" + e.getClass() + "<br>" + e.getMessage() + "</a>");
		}
	}
	
	/**
	* This method will be wait for page to load completly
	* @author Sandesh
	* @param Webdriver
	*/

	public void waitForPageLoaded(WebDriver driver) {
		 ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
	                    }
	                };
		
		try {
			Thread.sleep(1000);
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(expectation);
			
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for page Load Request to complete");
		}
	}
	
}
