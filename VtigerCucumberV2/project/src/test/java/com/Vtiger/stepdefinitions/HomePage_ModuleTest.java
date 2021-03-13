package com.Vtiger.stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_ModuleTest extends BaseTest {

	@BeforeStep
	public void beforeStep() {
		pageInitialization();
	}

	@After
	public void teardown() {
		try {
			Thread.sleep(3000);
			driver.close();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

/////////////	
	@When("^User click on Calendar$")
	public void User_click_on_Calendar() {
		try {
			homepage.Click_Calendar();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Calendar successfully$")
	public void User_entered_in_Calendar_successfully() {
		try {
			String moduletitle = homepage.verify_Calendar();
			System.out.println("User entered in " + moduletitle + " successfully");
			Assert.assertEquals(moduletitle, " Calendar");

		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

//////////////////////
	@When("^User click on Activities$")
	public void User_click_on_Activities() {
		try {
			homepage.Click_Activities();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Activities successfully$")
	public void User_entered_in_Activities_successfully() {
		try {
			String moduletitle = homepage.verify_Activities();
			Assert.assertEquals(moduletitle, " Activities: Home");
			System.out.println("User entered in " + moduletitle + " successfully");

		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

////////////////////////
	@When("^User click on Leads$")
	public void User_click_on_Leads() {
		try {
			homepage.Click_Leads();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Leads successfully$")
	public void User_entered_in_Leads_successfully() {
		try {
			String moduletitle = homepage.verify_Leads();
			Assert.assertEquals(moduletitle, " Leads: Home");
			System.out.println("User entered in " + moduletitle + " successfully");

		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

////////////////////////	
	@When("^User click on Accounts$")
	public void User_click_on_Accounts() {
		try {
			homepage.Click_Accounts();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Accounts successfully$")
	public void User_entered_in_Accounts_successfully() {
		try {
			String moduletitle = homepage.verify_Accounts();
			Assert.assertEquals(moduletitle, " Accounts: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

////////////////////////	
	@When("^User click on Contacts$")
	public void User_click_on_Contacts() {
		try {
			homepage.Click_Contacts();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Contacts successfully$")
	public void User_entered_in_Contacts_successfully() {
		try {
			String moduletitle = homepage.verify_Contacts();
			Assert.assertEquals(moduletitle, " Contacts: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

////////////////////////	
	@When("^User click on Potentials$")
	public void User_click_on_Potentials() {
		try {
			homepage.Click_Potentials();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Potentials successfully$")
	public void User_entered_in_Potentials_successfully() {
		try {
			String moduletitle = homepage.verify_Potentials();
			Assert.assertEquals(moduletitle, " Potentials: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	////////////////////////
	@When("^User click on Products$")
	public void User_click_on_Products() {
		try {
			homepage.Click_Products();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Products successfully$")
	public void User_entered_in_Products_successfully() {
		try {
			String moduletitle = homepage.verify_Products();
			Assert.assertEquals(moduletitle, " Products: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	////////////////////////
	@When("^User click on Notes$")
	public void User_click_on_Notes() {
		try {
			homepage.Click_Notes();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Notes successfully$")
	public void User_entered_in_Notes_successfully() {
		try {
			String moduletitle = homepage.verify_Notes();
			Assert.assertEquals(moduletitle, " Notes: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	////////////////////////
	@When("^User click on Emails$")
	public void User_click_on_Emails() {
		try {
			homepage.Click_Emails();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Emails successfully$")
	public void User_entered_in_Emails_successfully() {
		try {
			String moduletitle = homepage.verify_Emails();
			Assert.assertEquals(moduletitle, " Emails: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	////////////////////////
	@When("^User click on HelpDesk$")
	public void User_click_on_HelpDesk() {
		try {
			homepage.Click_HelpDesk();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in HelpDesk successfully$")
	public void User_entered_in_HelpDesk_successfully() {
		try {
			String moduletitle = homepage.verify_HelpDesk();
			Assert.assertEquals(moduletitle, " Tickets: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	////////////////////////
	@When("^User click on Dashboard$")
	public void User_click_on_Dashboard() {
		try {
			homepage.Click_Dashboard();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Dashboard successfully$")
	public void User_entered_in_Dashboard_successfully() {
		try {

		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	////////////////////////
	@When("^User click on Quotes$")
	public void User_click_on_Quotes() {
		try {
			homepage.Click_Quotes();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Quotes successfully$")
	public void User_entered_in_Quotes_successfully() {
		try {
			String moduletitle = homepage.verify_Quotes();
			Assert.assertEquals(moduletitle, " Quotes: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	////////////////////////
	@When("^User click on Orders$")
	public void User_click_on_Orders() {
		try {
			homepage.Click_Orders();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Orders successfully$")
	public void User_entered_in_Orders_successfully() {
		try {
			String moduletitle = homepage.verify_Orders();
			Assert.assertEquals(moduletitle, " Orders: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	////////////////////////
	@When("^User click on Invoice$")
	public void User_click_on_Invoice() {
		try {
			homepage.Click_Invoice();
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}

	@Then("^User entered in Invoice successfully$")
	public void User_entered_in_Invoice_successfully() {
		try {
			String moduletitle = homepage.verify_Invoice();
			Assert.assertEquals(moduletitle, " Invoice: Home");
			System.out.println("User entered in " + moduletitle + " successfully");
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}
}
