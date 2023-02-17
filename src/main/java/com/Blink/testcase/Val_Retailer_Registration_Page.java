package com.Blink.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import com.Blink.Obj.Retailer_Registration_Obj;
import com.github.javafaker.Faker;

/**
 * @author Bhavin.Thumar
 *
 */
public class Val_Retailer_Registration_Page extends Retailer_Registration_Obj {

	public void AllVal_CompanyDetailsPage() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			Thread.sleep(2000);
			js.executeScript("arguments[0].style.border='2px solid red'", RegisterNow_button);
			RegisterNow_button.click();
			Thread.sleep(2000);
			js.executeScript("arguments[0].style.border='2px solid red'", RetailerRegistration_button);
			RetailerRegistration_button.click();

		} catch (NoSuchElementException e1) {
			e1.printStackTrace();

		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}

		try {

			js.executeScript("arguments[0].scrollIntoView(true);", Next_Page);
			js.executeScript("arguments[0].style.border='2px solid red'", Next_Page);
			Next_Page.click();

			Thread.sleep(5000);
			System.out.println("All Validation of page1 ---------------------------------------------------------------------------------------------------- ");

			js.executeScript("arguments[0].style.border='2px solid red'", validation26);
			String error1 = validation26.getText();
			System.out.println("Validation is fired when user not uploading the Police Check attachment : " + error1);

			js.executeScript("arguments[0].style.border='2px solid red'", validation27);
			String error2 = validation27.getText();
			System.out
					.println("Validation is fired when user not uploading the Driver's License attachment : " + error2);

			js.executeScript("arguments[0].style.border='2px solid red'", validation28);
			String error3 = validation28.getText();
			System.out
					.println("Validation is fired when user not uploading the Profile Picture attachment : " + error3);

			js.executeScript("arguments[0].style.border='2px solid red'", validation1);
			String error4 = validation1.getText();
			System.out.println(
					"Validation is fired when user fill up any content in Emergency Contact Number field : " + error4);

			js.executeScript("arguments[0].style.border='2px solid red'", validation2);
			String error5 = validation2.getText();
			System.out.println(
					"Validation is fired when user fill up any content in Emergency Contact Name field : " + error5);

			js.executeScript("arguments[0].style.border='2px solid red'", validation3);
			String error6 = validation3.getText();
			System.out.println(
					"Validation is fired when user fill up any content in Driver's Licence Number field : " + error6);

			js.executeScript("arguments[0].style.border='2px solid red'", validation4);
			String error7 = validation4.getText();
			System.out.println("Validation is fired when user fill up any content in Date of Birth field : " + error7);

			js.executeScript("arguments[0].style.border='2px solid red'", validation5);
			String error8 = validation5.getText();
			System.out.println("Validation is fired when user fill up any content in Contact Number field : " + error8);

			js.executeScript("arguments[0].style.border='2px solid red'", validation6);
			String error9 = validation6.getText();
			System.out
					.println("Validation is fired when user fill up any content in Confirm Password field : " + error9);

			js.executeScript("arguments[0].style.border='2px solid red'", validation7);
			String error10 = validation7.getText();
			System.out.println("Validation is fired when user fill up any content in Password field : " + error10);

			js.executeScript("arguments[0].style.border='2px solid red'", validation8);
			String error11 = validation8.getText();
			System.out.println("Validation is fired when user fill up any content in Email field : " + error11);

			js.executeScript("arguments[0].style.border='2px solid red'", validation9);
			String error12 = validation9.getText();
			System.out.println("Validation is fired when user fill up any content in Last Name field : " + error12);

			js.executeScript("arguments[0].style.border='2px solid red'", validation10);
			String error13 = validation10.getText();
			System.out.println("Validation is fired when user fill up any content in First Name field : " + error13);

			js.executeScript("arguments[0].style.border='2px solid red'", validation11);
			String error14 = validation11.getText();
			System.out.println("Validation is fired when user fill up any content in Title field : " + error14);

			js.executeScript("arguments[0].style.border='2px solid red'", validation12);
			String error15 = validation12.getText();
			System.out.println("Validation is fired when user fill up any content in Position field : " + error15);

			js.executeScript("arguments[0].style.border='2px solid red'", validation13);
			String error16 = validation13.getText();
			System.out.println("Validation is fired when user fill up any content in Postcode field : " + error16);

			js.executeScript("arguments[0].style.border='2px solid red'", validation14);
			String error17 = validation14.getText();
			System.out.println("Validation is fired when user fill up any content in State field : " + error17);

			js.executeScript("arguments[0].style.border='2px solid red'", validation15);
			String error18 = validation15.getText();
			System.out.println("Validation is fired when user fill up any content in Suburb field : " + error18);

			js.executeScript("arguments[0].style.border='2px solid red'", validation16);
			String error19 = validation16.getText();
			System.out.println(
					"Validation is fired when user fill up any content in Company_Office_Address field : " + error19);

			js.executeScript("arguments[0].style.border='2px solid red'", validation17);
			String error20 = validation17.getText();
			System.out.println("Validation is fired when user fill up any content in Postcode field : " + error20);

			js.executeScript("arguments[0].style.border='2px solid red'", validation18);
			String error21 = validation18.getText();
			System.out.println("Validation is fired when user fill up any content in State field : " + error21);

			js.executeScript("arguments[0].style.border='2px solid red'", validation19);
			String error22 = validation19.getText();
			System.out.println("Validation is fired when user fill up any content in Subrub field : " + error22);

			js.executeScript("arguments[0].style.border='2px solid red'", validation20);
			String error23 = validation20.getText();
			System.out
					.println("Validation is fired when user fill up any content in Company_Registered_Address field : "
							+ error23);

			js.executeScript("arguments[0].style.border='2px solid red'", validation21);
			String error24 = validation21.getText();
			System.out
					.println("Validation is fired when user fill up any content in CEC Expiry Date field : " + error24);

			js.executeScript("arguments[0].style.border='2px solid red'", validation22);
			String error25 = validation22.getText();
			System.out.println(
					"Validation is fired when user not uploading the CEC Accreditation attachment : " + error25);

			js.executeScript("arguments[0].style.border='2px solid red'", validation23);
			String error26 = validation23.getText();
			System.out.println("Validation is fired when user not uploading the Company Logo attachment : " + error26);

			js.executeScript("arguments[0].style.border='2px solid red'", validation24);
			String error27 = validation24.getText();
			System.out.println("Validation is fired when user fill up any content in ABN field : " + error27);

			js.executeScript("arguments[0].style.border='2px solid red'", validation25);
			String error28 = validation25.getText();
			System.out.println("Validation is fired when user fill up any content in Company Name field : " + error28);
			js.executeScript("arguments[0].scrollIntoView(true);", validation25);
			
		} catch (NoSuchElementException e3) {
			e3.printStackTrace();

		}
	}

	public void RestVal_CompanyDetailsPage() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {

			// Company Details
			
			System.out.println("Rest of validation of Page1 is ---------------------------------------------------------------------------------------------------- ");
			Faker faker = new Faker();
			String cmpname = faker.company().name();
			CompanyName_Field.sendKeys(cmpname);
			String abn = faker.number().digits(5);
			ABN_Field.sendKeys(abn);
			String projectPath = System.getProperty("user.dir");
			Company_Logo.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			CEC_Accreditation.sendKeys(projectPath + "\\SampleData\\sample_pdf.pdf");

			CalendarExpiry_Date.click();
			String year = "2022";
			String month = "October";
			String date = "22";

			while (true) {
				String monthyearval = MonthYearVal.getText();
				String month1 = monthyearval.split(" ")[0].trim();
				String year1 = monthyearval.split(" ")[1].trim();

				if (month1.equalsIgnoreCase(month) && year1.equals(year)) {
					break;
				} else {
					js.executeScript("arguments[0].style.border='2px solid red'", Next_button);
					Next_button.click();
				}
			}

			for (WebElement ele : alldates) {
				String dt = ele.getText();

				if (dt.equals(date)) {
					ele.click();
					break;
				}
			}
			rebate_checkbox.click();

			// Company Registered Address
			
			Registered_Address1.sendKeys("fa");
			Thread.sleep(3000);
			Actions builder = new Actions(driver);
			builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
			Registered_Address1.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			String address2 = faker.address().fullAddress();
			Registered_Address2.sendKeys(address2);

			/*
			 * String subrb = faker.address().city(); Suburb.sendKeys(subrb);
			 * 
			 * String state = faker.address().state(); State.sendKeys(state);
			 * 
			 * String post = faker.number().digits(5); postcode.sendKeys(post);
			 */

			// Company Office Address
			Office_Address1.sendKeys("qa");
			Thread.sleep(3000);
			builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
			Thread.sleep(1000);
			Office_Address1.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			String offi_address2 = faker.address().fullAddress();
			Office_Address2.sendKeys(offi_address2);

			/*
			 * Suburb1.sendKeys(subrb); State1.sendKeys(state); postcode1.sendKeys(post);
			 */

			// Primary Contact Details
			String pos = faker.job().position();
			Position.sendKeys(pos);

			Select select = new Select(Title);
			select.selectByValue("Mr.");

			String fname = faker.name().firstName();
			FirstName.sendKeys(fname);

			String lname = faker.name().lastName();
			LastName.sendKeys(lname);

			String email = fname.toLowerCase() + "." + lname.toLowerCase();
			Email_ID.sendKeys(email);

			PasswordGenerator gen = new PasswordGenerator();
			CharacterData lowercasedata = EnglishCharacterData.LowerCase;
			CharacterRule lowercaserule = new CharacterRule(lowercasedata);
			lowercaserule.setNumberOfCharacters(3);

			CharacterData uppercasedata = EnglishCharacterData.UpperCase;
			CharacterRule uppercaserule = new CharacterRule(uppercasedata);
			uppercaserule.setNumberOfCharacters(1);

			CharacterData digitsdata = EnglishCharacterData.Digit;
			CharacterRule digitsrule = new CharacterRule(digitsdata);
			digitsrule.setNumberOfCharacters(2);

			CharacterData speChardata = new CharacterData() {

				@Override
				public String getErrorCode() {
					return "ERROR_CODE";
				}

				@Override
				public String getCharacters() {
					return "!@#$%^&*;:";
				}
			};

			CharacterRule speCharrule = new CharacterRule(speChardata);
			speCharrule.setNumberOfCharacters(1);

			String password = gen.generatePassword(7, uppercaserule, lowercaserule, speCharrule, digitsrule);
			Password.sendKeys(password);
			Conf_Password.sendKeys(password);

			String contact = faker.number().digits(3);
			Contact_Number.sendKeys(contact);

			DOB_Calendar.click();
			String DOB_year = "2020";
			String DOB_month = "June";
			String DOB_date = "15";

			while (true) {
				String DOB_monthyearval = DOB_MonthYearVal.getText();
				String DOB_month1 = DOB_monthyearval.split(" ")[0].trim();
				String DOB_year1 = DOB_monthyearval.split(" ")[1].trim();

				if (DOB_month1.equalsIgnoreCase(DOB_month) && DOB_year1.equals(DOB_year)) {
					break;
				} else {
					js.executeScript("arguments[0].style.border='2px solid red'", Prev_button);
					Prev_button.click();
				}
			}

			for (WebElement ele1 : DOB_alldates) {
				String DOB_dt = ele1.getText();

				if (DOB_dt.equals(DOB_date)) {
					ele1.click();
					break;
				}
			}

			String licnumber = faker.number().digits(12);
			Licence_Number.sendKeys(licnumber);

			String emgName = faker.name().firstName();
			Emergency_Name.sendKeys(emgName);

			String emgCnt = faker.number().digits(1);
			Emergency_Contact.sendKeys(emgCnt);

			Profile_Pic.sendKeys(projectPath + "\\SampleData\\Sample-PNG-Image.png");
			Driver_Lic.sendKeys(projectPath + "\\SampleData\\sample_pdf.pdf");
			Police_Check.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			Working_Vul.sendKeys(projectPath + "\\SampleData\\Sample-PNG-Image.png");
			Working_with_child.sendKeys(projectPath + "\\SampleData\\flower.jpg");
			Thread.sleep(2000);

			Next_Page.click();
			Thread.sleep(15000);

			js.executeScript("arguments[0].style.border='2px solid red'", validation1);
			String error1 = validation1.getText();
			System.out
					.println("Validation is fired when user enter the less than 9 digits in Emergency Contact Number : "
							+ error1);

			js.executeScript("arguments[0].style.border='2px solid red'", validation5);
			String error2 = validation5.getText();
			System.out.println(
					"Validation is fired when user enter the less than 9 digits in contact number : " + error2);

			js.executeScript("arguments[0].style.border='2px solid red'", validation6);
			String error3 = validation6.getText();
			System.out.println(
					"Validation is fired when user enter the less than 8 digits in Confirm password field : " + error3);

			js.executeScript("arguments[0].style.border='2px solid red'", validation7);
			String error4 = validation7.getText();
			System.out.println(
					"Validation is fired when user enter the less than 8 digits in password field : " + error4);

			js.executeScript("arguments[0].scrollIntoView(true);", validation8);
			js.executeScript("arguments[0].style.border='2px solid red'", validation8);
			String error5 = validation8.getText();
			System.out.println("Validation is fired when user enter the Invalid email in Email field : " + error5);

		} catch (NoSuchElementException e3) {
			e3.printStackTrace();
			
		} catch (StaleElementReferenceException e4) {
			e4.printStackTrace();
			
		}

	}
}