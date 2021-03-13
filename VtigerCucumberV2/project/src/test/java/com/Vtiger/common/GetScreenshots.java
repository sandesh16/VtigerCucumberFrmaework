package com.Vtiger.common;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class GetScreenshots  {
	
	public static String fileName;
	public static String filepath;

	public static void takeScreenshot(WebDriver driver) {
		try {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		filepath = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(filepath + "/screenshots/" + fileName + ".png"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
