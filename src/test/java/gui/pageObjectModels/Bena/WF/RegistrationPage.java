package gui.pageObjectModels.Bena.WF;

import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RegistrationPage {

	private WebDriver browserObject;
	private String URLForNavigation = "http://benaaserver.com:8882/benaa-ui/";
	private String URLAfterRedirection1 = "http://benaaserver.com:8882/benaa-ui/#/auth/signup";
	//private String pageTitle = "Benaa";
	// Absher User Data Registration
	
	private By AbsherSignupBTN = By.id("sys-login-signup");
	private By AbsherUsername = By.id("absher-login-username");
	private By AbsherPassword = By.id("absher-login-password");
	private By AbsherLoginBTN = By.id("absher-login-login-btn");
	private By AbsherTempPass = By.id("absher-login-temp-password");
	private By AbsherContinueBTN = By.id("absher-login-continue-btn");
	private By AbsherCompleteBTN = By.id("absher-login-complete-reg-btn");
	public By AbsherRegistrationMessage = By.xpath("/html/body/app-root/div/abshr-login/div/div/div/div[2]/div[2]/div/div/aw-wizard/div/aw-wizard-step[3]/form/div/div/div[1]/div[2]/h2");

	// Registration WorkFllow
	private By RegPersonTitle = By.id("reg_personTitle");
	//private By RegPersonTitle = By.className("ng-tns-c16-41 ng-star-inserted ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder");	
	//private By RegPersonTitle = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='اللقب'])[1]/preceding::div[2]");
	//private By RegPersonTitle = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='اللقب'])[1]/following::label[1]");

	//private By RegPersonTitleName = By.className("ng-tns-c16-41 ui-dropdown ui-widget ui-state-default ui-corner-all ui-helper-clearfix");
	//private By RegPersonTitleName = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='صاحب السمو الملكي الأمير'])[1]/following::li[1]")).click();

	////NationalID
	private By RegTypeOfIdentity = By.id("reg_typeOfIdentity");
	//private By RegNIDType = By.className("ng-tns-c16-42 ng-star-inserted ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder");
	//private By RegNIDType = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='نوع الهوية'])[1]/following::label[1]");

	//private By RegNIDSelect = By.className("ng-tns-c16-42 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted");"
	//private By RegNIDSelect = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='اختر'])[1]/following::li[1]");

	private By RegNIDNumber = By.id("reg_idNumber");

	//// Birth Date
	private By RegBirthDate    = By.id("hijri-cal-input-birthDate");

	private By RegBirthPlace = By.id("reg_birthPlace");
	//private By RegBirthPlace = By.className("ng-tns-c16-43 ng-star-inserted ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder");
	//private By RegBirthPlace = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='مكان الميلاد'])[1]/following::label[1]");

	//private By RegBirthPlaceSelect = By.className("ng-tns-c16-43 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted");
	//private By RegBirthPlaceSelect    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='اختر'])[1]/following::span[3]");

	//// Main Area
	private By RegMainArea = By.id("reg_basicArea");
	//private By RegMainArea = By.className("ng-tns-c16-54 ng-star-inserted ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder");
	//private By RegMainArea = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='المنطقة الاساسية'])[1]/following::label[1]");

	//private By RegMainAreaSelect = By.className("ng-tns-c16-54 ui-dropdown ui-widget ui-state-default ui-corner-all ui-helper-clearfix");
	//private By RegMainAreaSelect = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='الرياض'])[1]/following::li[1]");


	private By RegCity = By.id("reg_cityOrGov");
	//private By RegCity = By.className("ng-tns-c16-55 ng-star-inserted ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder");
	//private By RegCity = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='المدينة او المحافظة'])[1]/following::label[1]");

	//private By RegCitySelect = By.className("ng-tns-c16-55 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted");
	//private By RegCitySelect = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='محافظة الكامل'])[1]/following::li[1]");

	//// Education
	private By RegEducatinalGrade = By.id("reg_scientificQualification");

	//// Work
	private By RegWorkPlace = By.id("reg_workPlace");
	private By RegEmployer = By.id("reg_employer");

	//// ID 
	private By RegIssuanceIdentityPlace = By.id("reg_issuanceIdentityPlace");

	//// Gender - Sex
	private By RegGender = By.id("reg_gender");
	//private By RegSex = By.className("ng-tns-c16-45 ng-star-inserted ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder");
	//private By RegSex = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='الجنس'])[1]/following::label[1]");
	//private By RegSexSelectMale = By.className("ng-tns-c16-45 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted");
	//private By RegSexSelectFemale = By.className("");
	//private By RegSexSelect = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='اختر'])[2]/following::li[1]");

	//// Nationality 
	private By RegNationality = By.id("reg_nationality");
	//private By RegNationality = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='الجنسية'])[1]/following::label[1]");
	//private By RegNationalitySelect = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='اختر'])[2]/following::span[3]");

	//// ID Issuing
	private By RegIssuanceIdentityDate    =By.id("hijri-cal-input-issuanceIdentityDate");
	private By RegIdentityEndDate    =By.id("hijri-cal-input-identityEndDate");

	//// Communication 
	private By RegMethodOfCommunication = By.id("reg_methodOfCommunication");
	//private By RegMethodOfCommunication    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='طريقة التواصل'])[1]/following::label[1]");
	//private By RegMethodOfCommunicationSelect    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='الكل'])[1]/following::div[7]");

	//// User Credential
	private By RegUsername = By.id("reg_username");
	private By Regpassword = By.id("reg_password");
	private By RegConfirmPassword = By.id("reg_confirmPassword");

	//// Contact Info
	private By RegMobileNumber = By.id("reg_mobileNumber");
	private By RegEmail    =By.id("reg_email");

	//// Official Address
	private By RegBasicArea = By.id("reg_basicArea2");
	//private By RegBasicArea = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='المنطقة الاساسية'])[2]/following::label[1]");
	//private By RegBasicAreaSelect = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='الرياض'])[1]/following::span[1]");

	private By RegBasicCity = By.id("reg_cityOrGov2");
	//private By RegBasicCity = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='المدينة او المحافظة'])[2]/following::label[1]");
	//private By RegBasicCitySelect = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='محافظة الكامل'])[1]/following::li[1]");

	private By RegCenterOrDistrict = By.id("reg_centerOrDistrict");
	//private By RegCenterOrDistrict = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='المركز او الحى'])[1]/following::label[1]");
	//private By RegCenterOrDistrictSelect = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='البساتين'])[1]/following::li[1]");

	private By RegStreet    =By.id("reg_street");
	private By RegBuildingNumber = By.id("reg_buildingNumber");
	private By RegApartmentNumber = By.id("reg_apartmentNumber");
	private By RegAdditionalNumber = By.id("reg_additionalNumber");
	private By RegPostalCode = By.id("reg_postalCode");

	private By UserAgrement = By.className("ui-chkbox-box ui-widget ui-corner-all ui-state-default");
	//private By UserAgrement = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='&nbsp;'])[1]/following::div[6]");

	private By RegRegisterBTN = By.id("reg_btnRegister");

	private By CloseRegistration = By.className("ui-button-secondary ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only");
	//private By CloseRegistration = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='تم تنفيذ العملية بنجاح'])[1]/following::span[1]");

	public RegistrationPage(WebDriver browserObject) {
		this.browserObject = browserObject;
	}
	public void navigateToURL() {
		BrowserActions.navigateToURL(browserObject, URLForNavigation, URLAfterRedirection1);
	}
	
	public void LoginwithAbsheruser() {
		ElementActions.keyPress(browserObject, AbsherSignupBTN, Keys.ENTER);
		ElementActions.type(browserObject, AbsherUsername, "nagy001");
		ElementActions.type(browserObject, AbsherPassword, "123456");
		ElementActions.keyPress(browserObject, AbsherLoginBTN, Keys.ENTER);
		ElementActions.type(browserObject, AbsherTempPass, "123456");
		ElementActions.keyPress(browserObject, AbsherContinueBTN, Keys.ENTER);
		ElementActions.keyPress(browserObject, AbsherCompleteBTN, Keys.ENTER);
	}

	public void AssertAbsherSuccssMessage () {
		Assertions.assertBrowserAttribute(browserObject, URLAfterRedirection1, URLAfterRedirection1, AssertionComparisonType.EQUALS,
				AssertionType.POSITIVE);
	}
}



