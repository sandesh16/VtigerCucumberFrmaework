package com.Vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewLeadPage extends BasePage {
	public NewLeadPage(WebDriver driver) {
		super(driver);
	}
	
	//#####################################--Page Factory-- #########################################################
	@FindBy (name="salutationtype")
	WebElement personal_title;
	
	@FindBy (name="firstname")
	WebElement lead_fstname;
	
	@FindBy (name="lastname")
	WebElement lead_lstname;
	
	@FindBy (name="company")
	WebElement lead_company;
	
	@FindBy (name="button")
	WebElement lead_savebtn;
	
	@FindBy (className="moduleTitle")
	WebElement title_newlead;
	//##########################################--Methods--##########################################################
	public void enter_newlead(String firstname, String lastname, String company , WebDriver driver) {
		try {
			Select personaltitle = new Select(personal_title);
			personaltitle.selectByIndex(1);

			util.setText(lead_fstname, firstname);
			util.setText(lead_lstname, lastname);
			util.setText(lead_company, company);

			util.clickOn(lead_savebtn);
		} catch (Exception e) {
			util.reportCatchBlock(driver, e);
		}
	}
	
	public String verify_newlead() {
		try {
		return title_newlead.getText();
	}  catch (Exception e) {
		util.reportCatchBlock(driver, e);
	}
		return null;
  }
}
