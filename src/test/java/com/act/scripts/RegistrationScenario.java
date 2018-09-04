package com.act.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.act.objectRepository.VinceElementRepo;
import com.cigniti.accelerators.ActionEngine;
import com.cigniti.utilities.Data_Provider;

public class RegistrationScenario extends ActionEngine {
	
	
	@Test(dataProvider="get_data")
	public void Form_Registration(String StudyInterested, String FirstName, String MiddleInitial, String Gender, String StreetAddress, String City, String State, String Zip, String PrimaryPhone, String Email, String Height, String Weight, String HearAbout) throws Throwable {
		
		// Assertion Variables		
	String expTitleSmokers="Smokers | Vince And Associates";
	String expTitleCurrentStudies = "Current Studies | Vince And Associates";
	String expTitleClinicalStudy = "Register for a Clinical Study | Vince And Associates";
	
	//Open the browser with test environment URL: http://vinceandassociatesdev.algopharm.com
	launchUrl(configProps.getProperty("Altasciences"));
	
	// Click on Volunteers Button 
	click(VinceElementRepo.Volunteer, "Volunteer Button");
	Thread.sleep(5000);
	asserTitle(expTitleCurrentStudies);
	 
	
	//Click on "Read More" button in Smokers Section	
	JSClick(VinceElementRepo.SmokersReadmore, "Read more"); 
	Thread.sleep(5000); 
	asserTitle(expTitleSmokers);
	
	//Click on button "Apply For This Study"	
	click(VinceElementRepo.ApplyForStudy, "Apply For This Study");
	asserTitle(expTitleClinicalStudy);
	
	//	Select "Smokers" option from "What study are you interested in" drop down
	selectBySendkeys(VinceElementRepo.SelectWhatStudyIntr, StudyInterested, "What Study Interested Dropdown");
	
	// Enter First Name
	type(VinceElementRepo.FirstName, FirstName, "First Name");
	
	// Enter Middle Initial
	type(VinceElementRepo.MiddleName, MiddleInitial, "Middle Initial");
	
	// Select No option for radio button "Is the participant under the age of 18"
	click(VinceElementRepo.AgeRadioButton, "Age Radio Button-No");
	
	//Select month of birth from Month drop down 
	selectBySendkeys(VinceElementRepo.SelectMonth, "Jan", "Date of Birth Month Dropdown");
	
	//Select date of birth from Day drop down
	selectBySendkeys(VinceElementRepo.SelectDay, "2", "Date of Birth Day Dropdown");
	
	//Select year of birth from Year drop down 
	selectBySendkeys(VinceElementRepo.SelectYear, "1980", "Date of Birth Year Dropdown");
	
	//Select "Male" option from Gender drop down
	selectBySendkeys(VinceElementRepo.SelectGender, Gender, "Select Gender Male From Dropdown");
	
	// Enter Street Address
	type(VinceElementRepo.AddressStreet, StreetAddress, "Street Address");

	// Enter City
	type(VinceElementRepo.AddressCity, City, "City");
	
	// Select state from State drop down
	selectBySendkeys(VinceElementRepo.AddressState, State, "Select State from Dropdown");
	
	//Enter Zip code
	type(VinceElementRepo.AddressZip, Zip, "Zip Code");
	
	//Enter Primary Phone Number
	type(VinceElementRepo.PrimaryPhoneNum, PrimaryPhone, "Primary PhoneNumber");
	
	// Enter Email Address
	type(VinceElementRepo.Email, Email, "Email Address");
	
	// Enter Height
	type(VinceElementRepo.Height, Height, "Height");
	
	// Enter Weight
	type(VinceElementRepo.Weight, Weight, "Weight");
	
	// Select No option from "Are you currently taking any medications" radio button
	click(VinceElementRepo.MedicationNoButton, "Medication No Button");
	
	//Select No option from "Do you currently smoke or use any form of nicotine"
	click(VinceElementRepo.SmokeNoButton, "Smoke No Button");
	
	//Select option from "How did you hear about us"  Dropdown
	selectBySendkeys(VinceElementRepo.SelectHowDoYouHear, HearAbout, "Select How do you Hear Dropdown");
	
	//Select option from "Would you like to be contacted for future study opportunities" radio button 
	click(VinceElementRepo.ContactUsYesButton, "Contact Us Yes Button");
	
	// Click on Submit button
	click(VinceElementRepo.SubmitButton, "Submit Button");
		
		
	}

@DataProvider()
public Object[][] get_data() throws Exception {
	return Data_Provider.getTableArray("VinceAndAssociates");
}

}
