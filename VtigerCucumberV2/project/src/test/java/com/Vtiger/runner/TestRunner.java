package com.Vtiger.runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/com/Vtiger/features",
        glue={"com.Vtiger.stepdefinitions"},
        
       // plugin= {"json:target/cucumber-reports/Cucumber.json","html:target/cucumber-html-report", "com.aventstack.extentreports.cucumber.adaptor.ExtentCucumberAdaptor:"},
      plugin= {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-html-report"},
        //  plugin= {"pretty","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-html-report,com.aventstack.extentreports.cucumber.adaptor.ExtentCucumberAdaptor:"},
        
      tags = {"@Test"},
       
      monochrome=true )



public class TestRunner extends  AbstractTestNGCucumberTests{

}
