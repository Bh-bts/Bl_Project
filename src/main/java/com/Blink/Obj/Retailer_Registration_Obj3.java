package com.Blink.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blink.testcase.Retailer_Registration_Page4;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_Obj3 extends Retailer_Registration_Page4 {
	
	public @FindBy(xpath = "//a[text()='Contact Details']") WebElement ContactDetailsbox;
	
	// Element of Operational Contact Details

	public @FindBy(xpath = "//input[@id='companymaster-operational_position']") WebElement Position;
	public @FindBy(xpath = "//input[@id='companymaster-operational_first_name']") WebElement FirstName;
	public @FindBy(xpath = "//input[@id='companymaster-operational_last_name']") WebElement LastName;
	public @FindBy(xpath = "//input[@id='companymaster-operational_email']") WebElement Email;
	public @FindBy(xpath = "//input[@id='companymaster-operational_contact_number']") WebElement ContactNumber;
	public @FindBy(xpath = "//input[@id='companymaster-operational_driving_licence_no']") WebElement Driv_Lic_No;

	// Element of Operational Contact Details Attachment

	public @FindBy(xpath = "//input[@id='companymaster-operational_drivers_licence_attachment']") WebElement Driver_Lic;
	public @FindBy(xpath = "//input[@id='companymaster-operational_police_check_attachment']") WebElement Police_Check;
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
	
	// Element of validations
	
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-billing_police_check_attachment']/div/div") WebElement validation1;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-billing_drivers_licence_attachment']/div/div") WebElement validation2;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-billing_driving_licence_no']/div") WebElement validation3;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-billing_contact_number']/div") WebElement validation4;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-billing_email']/div") WebElement validation5;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-billing_last_name']/div") WebElement validation6;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-billing_first_name']/div") WebElement validation7;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-billing_position']/div") WebElement validation8;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-operational_police_check_attachment']/div/div") WebElement validation9;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-operational_drivers_licence_attachment']/div/div") WebElement validation10;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-operational_driving_licence_no']/div") WebElement validation11;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-operational_contact_number']/div") WebElement validation12;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-operational_email']/div") WebElement validation13;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-operational_last_name']/div") WebElement validation14;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-operational_first_name']/div") WebElement validation15;
	public @FindBy(xpath = "//div[@class='form-group required field-companymaster-operational_position']/div") WebElement validation16;
	

}
