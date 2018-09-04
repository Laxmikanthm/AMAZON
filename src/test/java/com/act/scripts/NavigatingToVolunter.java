package com.act.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.act.objectRepository.VinceElementRepo;
import com.cigniti.accelerators.ActionEngine;
import com.cigniti.utilities.Data_Provider;

public class NavigatingToVolunter extends ActionEngine {
	
	
	@Test
	public void Volunteers_Navigation() throws Throwable {
		
		//Assertion Variables
		String expTitleCurrentStudies = "Current Studies | Vince And Associates";
		String expTitleRecreational = "Recreational Opioid Users | Vince And Associates";
		String expTitleRegClinicalStudies = "Register for a Clinical Study | Vince And Associate";
		String expTitleSponsers = "Clinical Services | Vince And Associatess";
		
		// Open the browser with test environment URL: http://vinceandassociatesdev.algopharm.com
		launchUrl(configProps.getProperty("Altasciences"));			
		
		// Hover the mouse on VOLUNTEERS text on navigation menu items
		mouseHoverByJavaScript(VinceElementRepo.VolunteersNavMenu, "Volunteers Navigation Menu");		
		Thread.sleep(5000);	
		
		//Hover the mouse on CURRENT STUDIES Text on the drop down and click on it.
		JavascriptExecutor js = (JavascriptExecutor)driver;				
		WebElement element = driver.findElement(VinceElementRepo.CurrentStudies);
		js.executeScript("arguments[0].click();", element);			
		Thread.sleep(5000);
		asserTitle(expTitleCurrentStudies);				
		
		//Click on "Read More" button in "Recreational Opioid Users" section
		JSClick(VinceElementRepo.RecreationalReadMore, "Read more");		
		Thread.sleep(5000); 
		asserTitle(expTitleRecreational);
		
		//Click on Button "Apply For This Study"
		click(VinceElementRepo.ApplyForStudy, "Apply For This Study");
		asserTitle(expTitleRegClinicalStudies);	
		
	}

@DataProvider()
public Object[][] get_data() throws Exception {
	return Data_Provider.getTableArray("VinceAndAssociates");
}

}
