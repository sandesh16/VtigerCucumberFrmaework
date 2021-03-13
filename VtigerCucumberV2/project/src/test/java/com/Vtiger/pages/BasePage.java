package com.Vtiger.pages;

import org.openqa.selenium.WebDriver;

import com.Vtiger.common.BrowserHelper;
import com.Vtiger.common.DBManager;
import com.Vtiger.common.DBUtilities;
import com.Vtiger.common.GetScreenshots;
import com.Vtiger.common.OracleDb;
import com.Vtiger.common.Utility;

public class BasePage {
	
	public WebDriver driver;
	
	BrowserHelper browserHelper;
	Utility util;
	GetScreenshots getScreenshots;
	OracleDb oracleDB;
	DBUtilities dbUtilities;
	DBManager dbManager;
	
	//###############################################Page Factory elements ########################################
	
	
	//Constructor
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		
		browserHelper =new BrowserHelper();
		util=new Utility();
		getScreenshots=new GetScreenshots();
		oracleDB =new OracleDb();
		dbUtilities=new DBUtilities();
		dbManager=new DBManager();
	}

}
