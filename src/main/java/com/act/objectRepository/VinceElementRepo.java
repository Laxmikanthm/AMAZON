package com.act.objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VinceElementRepo {
	
	public static By Volunteer = By.xpath("//a[contains(@href,'http://vinceandassociatesdev.algopharm.com/volunteers/current-studies')][1]");
	//public static By SmokersReadmore = By.xpath("//a[contains(@href,'/volunteers/current-studies/smokers')]");	
	public static By SmokersReadmore = By.xpath("//*[@class='views-row views-row-2 views-row-even']//a[text()='Read More']");
	public static By ApplyForStudy = By.xpath("//a[contains(text(),'Apply For This Study')]");
	public static By SelectWhatStudyIntr = By.id("edit-submitted-what-study-are-you-interested-in");
	public static By FirstName = By.id("edit-submitted-first-name");
	public static By MiddleName = By.id("edit-submitted-middle-initial"); 
	public static By AgeRadioButton = By.id("edit-submitted-is-the-participant-under-the-age-of-18-2"); 
	public static By SelectMonth = By.id("edit-submitted-date-of-birth-month");
	public static By SelectDay = By.id("edit-submitted-date-of-birth-day");
	public static By SelectYear = By.id("edit-submitted-date-of-birth-year");  
	public static By SelectGender = By.id("edit-submitted-gender");
	public static By AddressStreet = By.id("edit-submitted-street-address");
	public static By AddressCity = By.id("edit-submitted-city");
	public static By AddressState = By.id("edit-submitted-state");
	public static By AddressZip = By.id("edit-submitted-zip");
	public static By PrimaryPhoneNum = By.id("edit-submitted-primary-phone");
	public static By Email = By.id("edit-submitted-email");
	public static By Height = By.id("edit-submitted-height-feet");
	public static By Weight = By.id("edit-submitted-weight-pounds");
	public static By MedicationNoButton = By.id("edit-submitted-are-you-currently-taking-any-medications-2");
	public static By SmokeNoButton = By.id("edit-submitted-do-you-currently-smoke-or-use-any-form-of-nicotine-2");
	public static By SelectHowDoYouHear = By.id("edit-submitted-how-did-you-hear-about-us");
	public static By ContactUsYesButton = By.id("edit-submitted-would-you-like-to-be-contacted-for-future-study-opportunities-1");
	public static By SubmitButton = By.className("webform-submit");
	
	
	// Navigation to Clinical Services Locators
	
	public static By ClinicalServices = By.xpath("//a[contains(text(),'Clinical Services')]");
	public static By SpecializedPharmacy = By.xpath("//a[contains(@href,'/clinical-services/specialized-pharmacy')][1]");
	public static By QualityAssurance = By.xpath("//ul[@class='menu']/li[6]/a[contains(@href,'/clinical-services/quality-assurance')]");
	public static By Home = By.xpath("//a[contains(text(),'Home')]");
	public static By Sponsors = By.xpath("//a[contains(text(),'sponsors')]");
	
		// Navigation to Volunteers Locators
	
	public static By VolunteersNavMenu =By.xpath("//*[@class='header-top']/ul/li/a[contains(text(),'Volunteers')]");
	public static By CurrentStudies = By.xpath("//*[@class='header-top']/ul/li[6]/ul/li/a[contains(text(),'Current Studies')]");
	public static By RecreationalReadMore = By.xpath("//*[@class='views-row views-row-1 views-row-odd views-row-first']//a[text()='Read More']");
	
	

	
	
	
	// 
}
