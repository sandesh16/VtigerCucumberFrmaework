package com.Vtiger.stepdefinitions;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.common.BrowserHelper;
import com.Vtiger.common.GetScreenshots;
import com.Vtiger.common.Utility;
import com.Vtiger.common.Xls_Reader;
import com.Vtiger.pages.HomePage;
import com.Vtiger.pages.LoginPage;
import com.Vtiger.pages.NewLeadPage;

import bsh.util.Util;

public class BaseTest {
	
	public static String browser ="chrome";
	public static WebDriver driver;
	public Utility util;
	public BrowserHelper browserHelper;
	public GetScreenshots getScreenshot;	
	public LoginPage loginPage;
	public HomePage homepage;
	public NewLeadPage newleadpage;
	
	//Variable for taking data from Excel
	public Map<String, Map<String, String>> inputData;
	public Xls_Reader xl;
	public int startRow=1;
	public int endRow =2;
	
	static String currentpath="C:\\Users\\RUSHI\\Project1\\Project1\\project";
	
	
	//Constructor 
	public BaseTest() {
		
	//Current project path
		currentpath =System.getProperty("user.dir");
		
	//Creating Map object for storing excel data
		inputData =new HashedMap<String, Map<String,String>>();
		
	//creating object for XLS reader
		xl=new Xls_Reader(currentpath+"//Input.xlsx");
		
	util=new Utility();
	browserHelper =new BrowserHelper();
	getScreenshot=new GetScreenshots();
	
		
		
	}
	
	/**
	 * Getting data from excel and storing into MAP i.e.input sheet
	 * @author Sandesh
	 */
	
	public void getInpuDataFromExcel(String testcaseName, String testsheetName) {
		System.out.println("----------------------------------This is "+ testcaseName+"Data Info-----");
		int rowCount =xl.getRowCount(testsheetName);
		int colCount= xl.getColumnCount(testsheetName);
		System.out.println("rowCount :"+ rowCount+ "colCount :" + colCount);
		for (int r = 0; r <= rowCount; r++) {
			
			if (xl.getCellData(testsheetName, 0, r).toString().equals(testsheetName)) {
				startRow =r+1;
				System.out.println("StartRow : "+startRow);
				break;
			}
			
		}
		
		for (int e = startRow; e <= rowCount; e++) {
			if (xl.getCellData(testsheetName, 0, e).toString().equals("End")) {
				endRow=e-1;
				System.out.println("EndRow :"+endRow);
				break;
			}
			
		}
		
		Map<String, String> testCaseValues;
		
		for (int row = startRow; row <=endRow; row++) {
			
			testCaseValues=new HashedMap<String, String>();
			
			for (int colValue = 0; colValue < colCount; colValue++) {
				if(!xl.getCellData(testsheetName, colValue, row).isEmpty()) {
					
					testCaseValues.put(xl.getCellData(testsheetName, colValue, 1), xl.getCellData(testsheetName, colValue, row));
					
				}
				
				inputData.put(xl.getCellData(testsheetName, 0, row), testCaseValues);
				
			}
			
		}
		
		System.out.println("Getting Input data from Testdata sheet is Success");
		System.out.println();
		printMap (testcaseName);
		
	}
	
	public void getinputsheetname (String inputsheet) {
		xl=new Xls_Reader(System.getProperty("user.dir") +"//" +inputsheet);
	}
	
	
	/* 
	 * This method is for displaying InputData map values
	 *  
	 */
	public void printMap(String testcaseName) {
		System.out.println("*******************"+testcaseName + "Test case INPUT DATA **********************" );

		for (Map.Entry entry : inputData.entrySet()) {
			System.out.println(entry.getKey() +" ," +entry.getValue());
			System.out.println();
		}
		
		System.out.println("***********************" + testcaseName + "test case INPUT DATA*************************");
	}
	
	
	/* 
	 * This method is  used to initialize Pages
	 *  
	 */
	
	public void pageInitialization() {
		try {
			
			loginPage=PageFactory.initElements(driver, LoginPage.class);			
			homepage=PageFactory.initElements(driver, HomePage.class);
			newleadpage=PageFactory.initElements(driver, NewLeadPage.class);
		} catch (Exception e) {
			util.reportCatchBlock (driver, e);
		}
	}
	
	public void openURL(String url) {
		try {
			driver=browserHelper.startBrowser(browser);
			
			browserHelper.setBufferTimeouts();
			
			browserHelper.navigate(url, browser);
		}catch (Exception e) {
			util.reportCatchBlock (driver, e);
			// TODO: handle exception
		}
	}

}
