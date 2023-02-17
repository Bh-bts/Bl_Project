package com.Blink.Obj;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blink.Browsers.AllBrowsers;

public class Retailer_Registration_Complete_Obj extends AllBrowsers{

	// First Page
	// ----------------------------------------------------------------------------------------------------------------------------
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

	// Second Page
	// ----------------------------------------------------------------------------------------------------------------------------

	public @FindBy(xpath = "//a[text()='Service Offering']") WebElement ServiceOfferingbox;

	// Element of All Services
	public @FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div[1]/input[@class='search-input form-control']") WebElement All_Services;

	// Element of Selected Services
	public @FindBy(xpath = "//div[1]/div[2]/div/div/div[1]/div[2]/input[@class='search-input form-control']") WebElement Selected_Services;

	// Element of All Regions
	public @FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[1]/input[@class='search-input form-control']") WebElement All_Regions;
	public @FindBy(xpath = "//span[(text() = 'Adelaide - Central and Hills' or . = 'Adelaide - Central and Hills')]") WebElement Reg_opt1;
	public @FindBy(xpath = "//div[1]//div[2]/ul[@class='ms-list']//li[@class='ms-optgroup-container'][2]//li[2]") WebElement Reg_opt2;
	public @FindBy(xpath = "//li[@class='ms-elem-selectable']//span[(text() = 'Melbourne - Inner' or . = 'Melbourne - Inner')]") WebElement Reg_opt3;
	public @FindBy(xpath = "//li[@class='ms-elem-selectable']//span[(text() = 'Melbourne - North West' or . = 'Melbourne - North West')]") WebElement Reg_opt4;

	// Element of Selected Regions
	public @FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[2]/input[@class='search-input form-control']") WebElement Selected_Regions;
	public @FindBy(xpath = "//div[2]/div[2]/div/div/div[1]/div[2]/ul[@class='ms-list']") WebElement Region_list;
	public @FindBy(xpath = "//div[1]//div[2]/ul[@class='ms-list']//li[@class='ms-optgroup-container'][2]//li[1]") WebElement SA;
	public @FindBy(xpath = "//div[1]//div[2]/ul[@class='ms-list']//li[@class='ms-optgroup-container'][4]//li[1]") WebElement VIC;

	// Element of Next Button
	public @FindBy(xpath = "//button[@id='step2']") WebElement Next_Page1;

	// Third Page
	// ----------------------------------------------------------------------------------------------------------------------------

	public @FindBy(xpath = "//a[text()='Contact Details']") WebElement ContactDetailsbox;

	// Element of Operational Contact Details

	public @FindBy(xpath = "//input[@id='companymaster-operational_position']") WebElement Cont_Position;
	public @FindBy(xpath = "//input[@id='companymaster-operational_first_name']") WebElement Cont_FirstName;
	public @FindBy(xpath = "//input[@id='companymaster-operational_last_name']") WebElement Cont_LastName;
	public @FindBy(xpath = "//input[@id='companymaster-operational_email']") WebElement Email;
	public @FindBy(xpath = "//input[@id='companymaster-operational_contact_number']") WebElement ContactNumber;
	public @FindBy(xpath = "//input[@id='companymaster-operational_driving_licence_no']") WebElement Driv_Lic_No;

	// Element of Operational Contact Details Attachment

	public @FindBy(xpath = "//input[@id='companymaster-operational_drivers_licence_attachment']") WebElement Cont_Driver_Lic;
	public @FindBy(xpath = "//input[@id='companymaster-operational_police_check_attachment']") WebElement Cont_Police_Check;
	public @FindBy(xpath = "//input[@id='companymaster-operational_working_with_vulnerable_people_attachment']") WebElement Work_Vul;
	public @FindBy(xpath = "//input[@id='companymaster-operational_working_with_children_attachment']") WebElement Work_Child;

	// Element of Billing Contact Details

	public @FindBy(xpath = "//input[@id='companymaster-same_as_above_operational_address']") WebElement CheckBox;
	public @FindBy(xpath = "//input[@id='companymaster-billing_position']") WebElement Bill_Position;
	public @FindBy(xpath = "//input[@id='companymaster-billing_first_name']") WebElement Bill_FirstName;
	public @FindBy(xpath = "//input[@id='companymaster-billing_last_name']") WebElement Bill_LastName;
	public @FindBy(xpath = "//input[@id='companymaster-billing_email']") WebElement Bill_Email;
	public @FindBy(xpath = "//input[@id='companymaster-billing_contact_number']") WebElement Bill_ContNum;
	public @FindBy(xpath = "//input[@id='companymaster-billing_driving_licence_no']") WebElement Bill_Driv_Lic_No;

	// Element of Billing Contact Details Attachment

	public @FindBy(xpath = "//input[@id='companymaster-billing_drivers_licence_attachment']") WebElement Bill_Driver_Lic;
	public @FindBy(xpath = "//input[@id='companymaster-billing_police_check_attachment']") WebElement Bill_Police_Check;

	// Element of Next Button

	public @FindBy(xpath = "//button[@id='step3']") WebElement Next_Page2;

	// Forth Page
	// ----------------------------------------------------------------------------------------------------------------------------

	public @FindBy(xpath = "//a[text()='Other Details']") WebElement OtherDetailsbox;

	// Element of Bank Account Details

	public @FindBy(xpath = "//input[@id='companybankdetails-bank_name']") WebElement Bank_Name;
	public @FindBy(xpath = "//input[@id='companybankdetails-account_name']") WebElement Account_Name;
	public @FindBy(xpath = "//input[@id='companybankdetails-bsb']") WebElement BSB;
	public @FindBy(xpath = "//input[@id='companybankdetails-account_number']") WebElement Account_Num;

	// Element of Business Insurance Documents

	public @FindBy(xpath = "//input[@id='companymaster-public_liabilities_insurance_attachment']") WebElement Public_Liab;
	public @FindBy(xpath = "//input[@id='companymaster-professional_indemnity_insurance_attachment']") WebElement Prof_Ind;
	public @FindBy(xpath = "//input[@id='companymaster-work_insurance_attachement']") WebElement Work_Ins;
	public @FindBy(xpath = "//input[@id='companymaster-user_additional_attachment']") WebElement Add_Attch;

	public @FindBy(xpath = "//button[@class='btn btn-primary']") WebElement submit;
	public @FindBy(xpath = "//div[@class='infoblock-content text-center']/h3[1]") WebElement submit_mess;

	public @FindBy(xpath = "//div[@class='infoblock-content text-center']") WebElement mess_box;
	
}
