package com.Vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
  
	//#####################################--Page Factory-- #########################################################
	@FindBy(xpath="//a[text()='My Account']")
	WebElement tab_myaccount;
	
	@FindBy(xpath="//td[@class='moduleTitle']")
	WebElement title_account;
	
	@FindBy(linkText="Home")
	WebElement tab_home;
	
	@FindBy(linkText="New Lead")
	WebElement add_newlead;
	
	@FindBy(linkText="Calendar")
	WebElement tab_Calendar;
	
	@FindBy(linkText="Activities")
	WebElement tab_Activities;
	
	@FindBy(linkText="Leads")
	WebElement tab_Leads;
	
	@FindBy(linkText="Accounts")
	WebElement tab_Accounts;
	
	@FindBy(linkText="Contacts")
	WebElement tab_Contacts;
	
	@FindBy(linkText="Potentials")
	WebElement tab_Potentials;
	
	@FindBy(linkText="Products")
	WebElement tab_Products;
	
	@FindBy(linkText="Notes")
	WebElement tab_Notes;
	
	@FindBy(linkText="Emails")
	WebElement tab_Emails;
	
	@FindBy(linkText="HelpDesk")
	WebElement tab_HelpDesk;
	
	@FindBy(linkText="Dashboard")
	WebElement tab_Dashboard;
	
	@FindBy(linkText="Quotes")
	WebElement tab_Quotes;
	
	@FindBy(linkText="Orders")
	WebElement tab_Orders;           
	
	@FindBy(linkText="Invoice")
	WebElement tab_Invoice;  
	//##########################################--Methods--##########################################################
	
	public void myaccount() {
		try {
		util.clickOn(tab_myaccount);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_myaccount() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
///////////	
	public void add_newlead() {
		try {
			util.clickOn(add_newlead);	
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
	}
///////////	
	public void Click_Calendar() {
		try {
		util.clickOn(tab_Calendar);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Calendar() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
//////////	
	public void Click_Activities() {
		try {
		util.clickOn(tab_Activities);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Activities() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
////////////	
	public void Click_Leads() {
		try {
		util.clickOn(tab_Leads);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Leads() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
////////////
	public void Click_Accounts() {
		try {
		util.clickOn(tab_Accounts);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Accounts() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
////////////
	public void Click_Contacts() {
		try {
		util.clickOn(tab_Contacts);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Contacts() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
///////////
	public void Click_Potentials() {
		try {
		util.clickOn(tab_Potentials);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Potentials() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
///////////
	public void Click_Products() {
		try {
		util.clickOn(tab_Products);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Products() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
////////////
	public void Click_Notes() {
		try {
		util.clickOn(tab_Notes);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Notes() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
////////////
	public void Click_Emails() {
		try {
		util.clickOn(tab_Emails);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Emails() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
/////////////
	public void Click_HelpDesk() {
		try {
		util.clickOn(tab_HelpDesk);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_HelpDesk() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
////////////
	public void Click_Dashboard() {
		try {
		util.clickOn(tab_Dashboard);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Dashboard() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
//////////////
	public void Click_Quotes() {
		try {
		util.clickOn(tab_Quotes);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Quotes() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
//////////////	
	public void Click_Orders() {
		try {
		util.clickOn(tab_Orders);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Orders() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}
//////////////	
	public void Click_Invoice() {
		try {
		util.clickOn(tab_Invoice);	
	}catch (Exception e) {
		util.reportCatchBlock(driver, e);  }
	}
	
	public String verify_Invoice() {
		try {
		return title_account.getText();
		}catch (Exception e) {
			util.reportCatchBlock(driver, e);  }
		return null;
	}

}

