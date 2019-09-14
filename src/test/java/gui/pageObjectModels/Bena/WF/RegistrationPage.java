package gui.pageObjectModels.Bena.WF;

import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;

import org.openqa.selenium.By;

public class RegistrationPage {

	private WebDriver browserObject;
	private String URLForNavigation = "http://benaaserver.com:8882/benaa-ui/";
	private String URLAfterRedirection1 = "http://benaaserver.com:8882/benaa-ui/#/auth/signup";
	private By BenaaLogo_image = By.className("rounded-circle centered-image");

	public RegistrationPage(WebDriver browserObject) {
		this.browserObject = browserObject;
	}
	public void navigateToURL() {
		BrowserActions.navigateToURL(browserObject, URLForNavigation, URLAfterRedirection1);
	}
	// Absher User Data Registration
	private By AbsherSignupBTN = By.id("sys-login-signup");
	private By AbsherUsername = By.id("absher-login-username");
	private By AbsherPassword = By.id("absher-login-password");
	private By AbsherLogBTN = By.id("absher-login-login-btn");
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
	
	//// Basic Area
	private By RegBasicArea = By.id("reg_basicArea");
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
	
	private By Absher    =By.id("reg_username")).click();
	private By Absher    =By.id("reg_username")).clear();
	private By Absher    =By.id("reg_username")).sendKeys("Sultan");
	private By Absher    =By.id("reg_password")).clear();
	private By Absher    =By.id("reg_password")).sendKeys("Abc@123456");
	private By Absher    =By.id("reg_confirmPassword")).click();
	private By Absher    =By.id("reg_confirmPassword")).clear();
	private By Absher    =By.id("reg_confirmPassword")).sendKeys("Abc@123456");
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='تاكيد كلمة المرور'])[1]/following::div[8]")).click();
	private By Absher    =By.id("reg_mobileNumber")).click();
	private By Absher    =By.id("reg_mobileNumber")).clear();
	private By Absher    =By.id("reg_mobileNumber")).sendKeys("0555855858");
	private By Absher    =By.id("reg_email")).click();
	private By Absher    =By.id("reg_email")).clear();
	private By Absher    =By.id("reg_email")).sendKeys("bmc@bmc.com");
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='البريد الالكترونى'])[1]/following::div[7]")).click();
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='المنطقة الاساسية'])[2]/following::label[1]")).click();
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='الرياض'])[1]/following::span[1]")).click();
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='المدينة او المحافظة'])[2]/following::label[1]")).click();
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='محافظة الكامل'])[1]/following::li[1]")).click();
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='المركز او الحى'])[1]/following::label[1]")).click();
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='البساتين'])[1]/following::li[1]")).click();
	private By Absher    =By.id("reg_street")).click();
	private By Absher    =By.id("reg_street")).clear();
	private By Absher    =By.id("reg_street")).sendKeys("الابطال");
	private By Absher    =By.id("reg_buildingNumber")).click();
	private By Absher    =By.id("reg_buildingNumber")).clear();
	private By Absher    =By.id("reg_buildingNumber")).sendKeys("5658");
	private By Absher    =By.id("reg_apartmentNumber")).click();
	private By Absher    =By.id("reg_apartmentNumber")).clear();
	private By Absher    =By.id("reg_apartmentNumber")).sendKeys("5254");
	private By Absher    =By.id("reg_additionalNumber")).click();
	private By Absher    =By.id("reg_additionalNumber")).clear();
	private By Absher    =By.id("reg_additionalNumber")).sendKeys("5857");
	private By Absher    =By.id("reg_postalCode")).click();
	private By Absher    =By.id("reg_postalCode")).clear();
	private By Absher    =By.id("reg_postalCode")).sendKeys("11567");
	private By Absher    =By.id("yourFirstCaptchaUserInput")).click();
	private By Absher    =By.id("yourFirstCaptchaUserInput")).clear();
	private By Absher    =By.id("yourFirstCaptchaUserInput")).sendKeys("ٌٌr5EM4e");
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='&nbsp;'])[1]/following::div[6]")).click();
	private By Absher    =By.id("reg_btnRegister")).click();
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='رمز التحقق'])[2]/following::span[1]")).click();
	private By Absher    =By.id("yourFirstCaptchaUserInput")).click();
	private By Absher    =By.id("yourFirstCaptchaUserInput")).clear();
	private By Absher    =By.id("yourFirstCaptchaUserInput")).sendKeys("xAHTe");
	private By Absher    =By.id("reg_btnRegister")).click();
	private By Absher    =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='تم تنفيذ العملية بنجاح'])[1]/following::span[1]")).click();
}

}
