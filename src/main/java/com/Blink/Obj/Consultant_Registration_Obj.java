package com.Blink.Obj;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blink.Browsers.AllBrowsers;

public class Consultant_Registration_Obj extends AllBrowsers {

	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-referral_code required']/input") WebElement RefCode;
	public @FindBy(xpath = " //select[@id='consultantuser-title']") WebElement Title;
	public @FindBy(xpath = " //div[@class='form-group field-consultantuser-first_name required']/input") WebElement FirstName;
	public @FindBy(xpath = " //div[@class='form-group field-consultantuser-last_name required']/input") WebElement LastName;

	public @FindBy(xpath = " //div[@class='form-group field-consultantuser-email required']/input") WebElement Email;
	public @FindBy(xpath = " //div[@class='form-group field-password_validate1 required']/input") WebElement Password;
	public @FindBy(xpath = " //div[@class='form-group field-consultantuser-confirm_password required']/input") WebElement Conf_Password;
	public @FindBy(xpath = " //div[@class='form-group field-consultantuser-contact_number required']/div/input") WebElement Contact_Number;

	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-dob required']/div/input") WebElement DOB_Calendar;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']") WebElement DOB_MonthYearVal;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/thead/tr/th[@class='prev']") WebElement Prev_button;
	public @FindBy(xpath = "//div[@class='datepicker-days']/table/tbody//td") List<WebElement> DOB_alldates;

	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-drivers_licence_number required']/input") WebElement Licence_Number;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-emergency_contact_name required']/input") WebElement Emergency_Name;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-emergency_contact_number required']/div/input") WebElement Emergency_Contact;
	public @FindBy(xpath = "//input[@id='consultantuser-profile_pic']") WebElement Profile_Pic;
	public @FindBy(xpath = "//input[@id='consultantuser-drivers_licence_attachment']") WebElement Driver_Lic;
	public @FindBy(xpath = "//input[@id='consultantuser-police_check_attachment']") WebElement Police_Check;
	public @FindBy(xpath = "//input[@id='consultantuser-working_with_vulnerable_people_attachment']") WebElement Working_Vul;
	public @FindBy(xpath = "//input[@id='consultantuser-working_with_children_attachment']") WebElement Working_with_child;
	public @FindBy(xpath = "//div[@class='infoblock-content text-center']/h3[1]") WebElement submit_mess;

	public @FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement RegisterNow_button;
	public @FindBy(linkText = "Consultant Registration") WebElement ConsultantRegistration_button;
	public @FindBy(xpath = "//div[@class='btns-rows']/button") WebElement submit;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-police_check_attachment required']/div/div") WebElement validation1;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-drivers_licence_attachment required']/div/div") WebElement validation2;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-profile_pic required']/div/div") WebElement validation3;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-emergency_contact_number required']/div/div[@class='invalid-feedback']") WebElement validation4;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-emergency_contact_name required']/div") WebElement validation5;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-drivers_licence_number required']/div") WebElement validation6;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-dob required']/div/div") WebElement validation7;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-contact_number required']/div/div[@class='invalid-feedback']") WebElement validation8;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-confirm_password required']/div") WebElement validation9;
	public @FindBy(xpath = "//div[@class='form-group field-password_validate1 required']/div") WebElement validation10;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-email required']/div") WebElement validation11;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-last_name required']/div") WebElement validation12;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-first_name required']/div") WebElement validation13;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-title required']/div") WebElement validation14;
	public @FindBy(xpath = "//div[@class='form-group field-consultantuser-referral_code required']/div") WebElement validation15;

}
