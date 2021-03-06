package com.Vtiger.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserHelper {

	public WebDriver driver;

	/**
	 * This method will used to navigate to given URL
	 * 
	 * @param url
	 * @author Sandesh
	 * @throws InterruptedException 
	 * 
	 */

	public void navigate(String url, String browserName) throws InterruptedException {
	///	try {
			driver.get(url);
			Thread.sleep(3000);
	//		if ((browserName.equalsIgnoreCase("FireFox")))
	//			driver.navigate().to("javascrip:document.getElemntById('overridelink').Clcik()");

			/*
			 * } catch (TimeoutException e) { System.out.
			 * println("Faced Timeout exception, hence re-executing navigate steps");
			 * driver.get(url);
			 */

	//	} catch (Exception e) {
	//		e.printStackTrace();
	//	}
	}

	/**
	 * This method will used to to close the browser
	 * 
	 * @author Sandesh
	 * 
	 */

	public void closeBrowser() {
		try {
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will used to start the browser
	 * 
	 * @author Sandesh
	 * 
	 */
	public WebDriver startBrowser(String browserName) {

		try {

			DesiredCapabilities capability = new DesiredCapabilities();
			capability.setCapability("enableElementCacheCleanup", true);
			capability.setCapability("nativeEvents", false);
			capability.setCapability("allow-blocked-content", true);
			capability.setCapability("allowBlockedContent", true);
			capability.setCapability("unexpectedAlertBehaviour", "accept");
			capability.setCapability("disable-popup-blocking", false);

			if (browserName.equalsIgnoreCase("FireFox")) {
				System.setProperty("webdriver.gecko.driver", "E:\\Software\\geckodriver-v0.28.0-win64\\geckodriver.exe");

				capability.setCapability(FirefoxDriver.MARIONETTE, true);
		
				capability.setBrowserName("FireFox");
				FirefoxOptions op = new FirefoxOptions();
				op.merge(capability);
				driver = new FirefoxDriver(op);
			} else if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chromedriver89\\chromedriver.exe");
				capability.setBrowserName("chrome");
				ChromeOptions options = new ChromeOptions();
		//		DesiredCapabilities capabilities = new DesiredCapabilities();
		//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				options.setExperimentalOption("useAutomationExtension", false);
				options.merge(capability);
				driver=new ChromeDriver(options);
			}
		
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * This methods buffer timeouts for Page load
	 * 
	 * @author pavithran.rajendran
	 */
	public void setBufferTimeouts() {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
