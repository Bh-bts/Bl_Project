package com.Blink.Obj;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blink.testcase.Retailer_Registration_Page2;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_Obj extends Retailer_Registration_Page2 {

	public @FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement RegisterNow_button;
	public @FindBy(linkText = "Retailer Registration") WebElement RetailerRegistration_button;
	public @FindBy(xpath = "//a[text()='Company Details']") WebElement CompanyDetailsbox;

	// Element of Company Details

	public @FindBy(id = "companymaster-company_name") WebElement CompanyName_Field;
	public @FindBy(id = "companymaster-abn") WebElement ABN_Field;
	public @FindBy(xpath = "//input[@id='companymaster-company_logo']") WebElement Company_Logo;
	public @FindBy(xpath = "//input[@id='companymaster-cec_accreditations_no_photo']") WebElement CEC_Accreditation;

	public @FindBy(id = "companymaster-cec_accreditation_expiry_date") WebElement CalendarExpiry_Date;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']") WebElement MonthYearVal;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr/th[@class='next']") WebElement Next_button;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/tbody//td") List<WebElement> alldates;

	public @FindBy(xpath = "//input[@id='companymaster-rebate_programs_eligibility']") WebElement rebate_checkbox;

	// Element of Company Registered Address

	public @FindBy(id = "companymaster-address_line_1") WebElement Registered_Address1;
	public @FindBy(id = "companymaster-address_line_2") WebElement Registered_Address2;
	public @FindBy(xpath = "//input[@id='companymaster-suburb']") WebElement Suburb;
	public @FindBy(xpath = "//input[@id='companymaster-state']") WebElement State;
	public @FindBy(xpath = "//input[@id='companymaster-post_code']") WebElement postcode;

	public @FindBy(id = "companymaster-office_address_line_1") WebElement Office_Address1;
	public @FindBy(id = "companymaster-office_address_line_2") WebElement Office_Address2;
	public @FindBy(xpath = "//input[@id='companymaster-office_suburb']") WebElement Suburb1;
	public @FindBy(xpath = "//input[@id='companymaster-office_state']") WebElement State1;
	public @FindBy(xpath = "//input[@id='companymaster-office_post_code']") WebElement postcode1;

	// Element of Primary Contact Details

	public @FindBy(id = "retaileruser-position") WebElement Position;
	public @FindBy(xpath = "//select[@id='retaileruser-title']") WebElement Title;
	public @FindBy(id = "retaileruser-first_name") WebElement FirstName;
	public @FindBy(id = "retaileruser-last_name") WebElement LastName;
	public @FindBy(id = "retaileruser-email") WebElement Email_ID;
	public @FindBy(xpath = "//div[@class='form-group field-password_validate1']/input") WebElement Password;
	public @FindBy(id = "retaileruser-confirm_password") WebElement Conf_Password;
	public @FindBy(id = "retaileruser-contact_number") WebElement Contact_Number;

	public @FindBy(id = "retaileruser-dob") WebElement DOB_Calendar;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']") WebElement DOB_MonthYearVal;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr/th[@class='prev']") WebElement Prev_button;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/tbody//td") List<WebElement> DOB_alldates;

	public @FindBy(id = "retaileruser-drivers_licence_number") WebElement Licence_Number;
	public @FindBy(id = "retaileruser-emergency_contact_name") WebElement Emergency_Name;
	public @FindBy(id = "retaileruser-emergency_contact_number") WebElement Emergency_Contact;

	public @FindBy(xpath = "//input[@id='retaileruser-profile_pic']") WebElement Profile_Pic;
	public @FindBy(xpath = "//input[@id='retaileruser-drivers_licence_attachment']") WebElement Driver_Lic;
	public @FindBy(xpath = "//input[@id='retaileruser-police_check_attachment']") WebElement Police_Check;
	public @FindBy(xpath = "//input[@id='retaileruser-working_with_vulnerable_people_attachment']") WebElement Working_Vul;
	public @FindBy(xpath = "//input[@id='retaileruser-working_with_children_attachment']") WebElement Working_with_child;

	// Element of Next Button

	public @FindBy(xpath = "//button[@id='step1']") WebElement Next_Page;

	// Element of Validation

	public @FindBy(xpath = "//div[12]/div/div[@class='input-group']/div[@class='invalid-feedback']") WebElement validation1;
	public @FindBy(xpath = "//div[11]/div/div[@class='invalid-feedback']") WebElement validation2;
	public @FindBy(xpath = "//div[10]/div/div[@class='invalid-feedback']") WebElement validation3;
	public @FindBy(xpath = "//div[9]/div/div[@class='group']/div[@class='invalid-feedback']") WebElement validation4;
	public @FindBy(xpath = "//div[8]/div/div[@class='input-group']/div[@class='invalid-feedback']") WebElement validation5;
	public @FindBy(xpath = "//div[7]/div/div[@class='invalid-feedback']") WebElement validation6;
	public @FindBy(xpath = "//div[6]/div[@class='form-group field-password_validate1']/div[@class='invalid-feedback']") WebElement validation7;
	public @FindBy(xpath = "//div[5]/div[@class='form-group field-retaileruser-email required']/div[@class='invalid-feedback']") WebElement validation8;
	public @FindBy(xpath = "//div[4]/div[@class='form-group field-retaileruser-last_name required']/div[@class='invalid-feedback']") WebElement validation9;
	public @FindBy(xpath = "//div[3]/div[@class='form-group field-retaileruser-first_name required']/div[@class='invalid-feedback']") WebElement validation10;
	public @FindBy(xpath = "//div[2]/div[@class='form-group field-retaileruser-title required']/div[@class='invalid-feedback']") WebElement validation11;
	public @FindBy(xpath = "//div[1]/div[@class='form-group field-retaileruser-position required']/div[@class='invalid-feedback']") WebElement validation12;
	public @FindBy(xpath = "//div[5]/div[@class='form-group field-companymaster-office_post_code required']/div[@class='invalid-feedback']") WebElement validation13;
	public @FindBy(xpath = "//div[4]/div[@class='form-group field-companymaster-office_state required']/div[@class='invalid-feedback']") WebElement validation14;
	public @FindBy(xpath = "//div[3]/div[@class='form-group field-companymaster-office_suburb required']/div[@class='invalid-feedback']") WebElement validation15;
	public @FindBy(xpath = "//div[1]/div[@class='form-group field-companymaster-office_address_line_1 required']/div[@class='invalid-feedback']") WebElement validation16;
	public @FindBy(xpath = "//div[5]/div[@class='form-group field-companymaster-post_code required']/div[@class='invalid-feedback']") WebElement validation17;
	public @FindBy(xpath = "//div[4]/div[@class='form-group field-companymaster-state required']/div[@class='invalid-feedback']") WebElement validation18;
	public @FindBy(xpath = "//div[3]/div[@class='form-group field-companymaster-suburb required']/div[@class='invalid-feedback']") WebElement validation19;
	public @FindBy(xpath = "//div[1]/div[@class='form-group field-companymaster-address_line_1 required']/div[@class='invalid-feedback']") WebElement validation20;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-cec_accreditation_expiry_date required']/div/div[@class='invalid-feedback']") WebElement validation21;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-cec_accreditations_no_photo required']/div/div[@class='invalid-feedback']") WebElement validation22;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-company_logo required']/div/div[@class='invalid-feedback']") WebElement validation23;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-abn required']/div[@class='invalid-feedback']") WebElement validation24;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-company_name required']/div[@class='invalid-feedback']") WebElement validation25;
	public @FindBy(xpath = "//div[15]/div[1]/div/div[@class='invalid-feedback']") WebElement validation26;
	public @FindBy(xpath = "//div[14]/div[1]/div/div[@class='invalid-feedback']") WebElement validation27;
	public @FindBy(xpath = "//div[13]/div[1]/div/div[@class='invalid-feedback']") WebElement validation28;

}
