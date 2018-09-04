package com.act.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.act.objectRepository.VinceElementRepo;
import com.cigniti.accelerators.ActionEngine;
import com.cigniti.utilities.Data_Provider;

public class NavigatingToClinicalServices extends ActionEngine {
	
	
	@Test(dataProvider="get_data")
	public void ClinicalServices_Navigation(String StudyInterested, String FirstName, String MiddleInitial, String Gender, String StreetAddress, String City, String State, String Zip, String PrimaryPhone, String Email, String Height, String Weight, String HearAbout) throws Throwable {
		
		// Assertion variables
				String expTitleSpecPharmacy="Specialized Pharmacy | Vince And Associates";
				String expTitleQualityAssurance = "Quality Assurance | Vince And Associates";
				String expTitleVolunteer = "Current Studies | Vince And Associates";
				String expTitleHomePage = "Vince And Associates";
				String expTitleSponsers = "Clinical Services | Vince And Associates";

				// Open the browser with test environment URL: http://vinceandassociatesdev.algopharm.com
				launchUrl(configProps.getProperty("Altasciences"));			

				// Hover the mouse on CLINICAL SERVICES text on navigation menu items
				mouseHoverByJavaScript(VinceElementRepo.ClinicalServices, "Clinical Services");		
				Thread.sleep(5000);

				//Hover the mouse on Specialized Pharmacy Text on the drop down and click on it.
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//WebElement element = driver.findElement(By.xpath("//a[contains(@href,'/clinical-services/specialized-pharmacy')][1]"));
				WebElement element = driver.findElement(VinceElementRepo.SpecializedPharmacy);
				js.executeScript("arguments[0].click();", element);
				Thread.sleep(5000);
				asserTitle(expTitleSpecPharmacy);

				// Click on Quality Assurance link located at the right side of the page		
				click(VinceElementRepo.QualityAssurance, "QualityAssurance Link");		
				asserTitle(expTitleQualityAssurance);

				// Click on VOLUNTEERS button
				click(VinceElementRepo.Volunteer, "Volunteer Button");
				asserTitle(expTitleVolunteer);

				// Click on Home menu
				click(VinceElementRepo.Home, "Home Menu Navigation");	
				asserTitle(expTitleHomePage);

				// Click on sponsor button
				click(VinceElementRepo.Sponsors, "Sponsors  Button");	
				asserTitle(expTitleSponsers);	
	}

@DataProvider()
public Object[][] get_data() throws Exception {
	return Data_Provider.getTableArray("VinceAndAssociates");
}

}
