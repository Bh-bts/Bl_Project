package com.Blink.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Blink.Browsers.AllBrowsers;

/**
 * @author Bhavin.Thumar
 *
 */
public class Retailer_Registration_Obj4 extends AllBrowsers {

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

	// Element of validations

	public @FindBy(xpath = "//div[@class='form-group field-companymaster-work_insurance_attachement']/div/div") WebElement validation1;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-professional_indemnity_insurance_attachment']/div/div") WebElement validation2;
	public @FindBy(xpath = "//div[@class='form-group field-companymaster-public_liabilities_insurance_attachment']/div/div") WebElement validation3;
	public @FindBy(xpath = "//div[@class='form-group field-companybankdetails-account_number']/div") WebElement validation4;
	public @FindBy(xpath = "//div[@class='form-group field-companybankdetails-bsb']/div") WebElement validation5;
	public @FindBy(xpath = "//div[@class='form-group field-companybankdetails-account_name']/div") WebElement validation6;
	public @FindBy(xpath = "//div[@class='form-group field-companybankdetails-bank_name']/div") WebElement validation7;

}
